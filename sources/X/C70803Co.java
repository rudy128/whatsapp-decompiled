package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Co  reason: invalid class name and case insensitive filesystem */
public final class C70803Co implements Runnable {
    public static final long A0C = TimeUnit.MINUTES.toMillis(11);
    public final C88124Yk A00;
    public final Context A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass11P A03;
    public final C27301Vn A04;
    public final AnonymousClass1CJ A05;
    public final C42351y2 A06;
    public final AnonymousClass1LU A07;
    public final C217217d A08;
    public final AnonymousClass205 A09;
    public final AnonymousClass1Nb A0A;
    public final AnonymousClass1W6 A0B;

    public void run() {
        String str;
        C29691ci A002;
        String str2;
        AnonymousClass1W6 r0 = this.A0B;
        AnonymousClass206 A052 = r0.A01.A05(this.A09);
        if (A052 == null || !(A052 instanceof C445823z)) {
            str = "EventStartNotificationRunnable skip notification/ event message not found";
        } else {
            C445823z r7 = (C445823z) A052;
            AnonymousClass205 r5 = r7.A0v;
            AnonymousClass1BI r9 = r5.A00;
            if (r9 != null && (A002 = AnonymousClass1CJ.A00(this.A05, r9)) != null) {
                if (r7.A08) {
                    str = "EventStartNotificationRunnable skip notification / event cancelled";
                } else if (Math.abs(r7.A00 - AnonymousClass11P.A01(this.A03)) > A0C) {
                    str = "EventStartNotificationRunnable skip notification / trigger time beyond tolerance limit";
                } else {
                    C42551yM A0a = this.A0A.A0a(r9);
                    if (!A0a.A0B()) {
                        str = "EventStartNotificationRunnable skip notification / muted notifications";
                    } else if (A002.A0l) {
                        str = "EventStartNotificationRunnable skip notification / chat archived";
                    } else {
                        if (Build.VERSION.SDK_INT >= 26) {
                            str2 = ((C43551zz) A0a).A0E();
                            if (str2 == null) {
                                str2 = "other_notifications@1";
                            }
                        } else {
                            str2 = "";
                        }
                        boolean z = r5.A02;
                        Context context = this.A01;
                        if (z) {
                            A00(context, r7, this, r9, str2);
                            return;
                        } else {
                            this.A00.A01(r7, "EventStartNotificationRunnable", new C71083Ds(context, r7, this, r9, str2));
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        Log.i(str);
    }

    public static final void A00(Context context, C445823z r16, C70803Co r17, AnonymousClass1BI r18, String str) {
        String A0K;
        String str2;
        C70803Co r3 = r17;
        AnonymousClass1BI r11 = r18;
        AnonymousClass1E7 A0E = r3.A02.A0E(r11);
        if (A0E != null && (A0K = A0E.A0K()) != null) {
            AnonymousClass1LU r0 = r3.A07;
            C445823z r10 = r16;
            AnonymousClass205 r1 = r10.A0v;
            Intent A1w = r0.A1w(context, r11, 0);
            Bundle A0D = C17880vN.A0D();
            AnonymousClass4aU.A0A(A0D, r1);
            A1w.putExtra("show_event_message_on_create_bundle", A0D);
            PendingIntent A002 = C1408573i.A00(context, 0, A1w, 67108864);
            SpannableStringBuilder A003 = r3.A06.A00((TextView) null, r10, r11, AnonymousClass00R.A15, AnonymousClass00R.A00, (Integer) null);
            C1409673t A032 = C217217d.A03(context);
            A032.A0E(A0K);
            A032.A0L = "event";
            A032.A0G(true);
            A032.A0M = str;
            A032.A0A = A002;
            A032.A0D(A003);
            C17880vN.A1G(A032);
            AnonymousClass70v.A00(r3.A08.A0F(A0E), A032);
            Notification A052 = A032.A05();
            C18070vi.A0X(A052);
            Log.i("EventStartNotificationRunnable showing event start notification");
            C27301Vn r4 = r3.A04;
            String str3 = r1.A01;
            C18070vi.A0X(str3);
            try {
                str2 = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(C18070vi.A1A(str3, C26571Sq.A05)), 0);
                C18070vi.A0X(str2);
            } catch (NoSuchAlgorithmException unused) {
                Log.e("EventNotificationHelper SHA-256 not supported");
                str2 = "";
            }
            r4.BkS(str2, 84, A052);
        }
    }

    public C70803Co(Context context, AnonymousClass1M9 r2, AnonymousClass11P r3, C27301Vn r4, AnonymousClass1CJ r5, C42351y2 r6, C88124Yk r7, AnonymousClass1LU r8, C217217d r9, AnonymousClass205 r10, AnonymousClass1Nb r11, AnonymousClass1W6 r12) {
        C18070vi.A0w(r3, r5, r8, r7, r2);
        C18070vi.A0x(r12, r11, r9, r4, r6);
        this.A03 = r3;
        this.A05 = r5;
        this.A07 = r8;
        this.A00 = r7;
        this.A02 = r2;
        this.A0B = r12;
        this.A0A = r11;
        this.A08 = r9;
        this.A04 = r4;
        this.A06 = r6;
        this.A01 = context;
        this.A09 = r10;
    }
}
