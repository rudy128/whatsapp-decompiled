package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2qs  reason: invalid class name and case insensitive filesystem */
public final class C62152qs {
    public final AnonymousClass11S A00;
    public final AnonymousClass1VW A01;
    public final C27201Vd A02;
    public final AnonymousClass118 A03;
    public final C27301Vn A04;
    public final AnonymousClass1PQ A05;
    public final AnonymousClass00H A06;
    public final C18100vl A07 = new C18110vm(new AnonymousClass7S3((Object) this, 14));
    public final AnonymousClass1M9 A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass1CJ A0A;
    public final AnonymousClass1Nb A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    public final void A01(C445823z r16) {
        C29691ci A002;
        AnonymousClass1E7 A0E;
        String A0K;
        String str;
        Integer num;
        Context context = this.A03.A00;
        C18070vi.A0X(context);
        C445823z r10 = r16;
        AnonymousClass205 r8 = r10.A0v;
        AnonymousClass1BI r2 = r8.A00;
        if (r2 != null && (A002 = AnonymousClass1CJ.A00(this.A0A, r2)) != null) {
            C42551yM A0a = this.A0B.A0a(r2);
            if (A0a.A0B() && !A002.A0l && (A0E = this.A08.A0E(r2)) != null && (A0K = A0E.A0K()) != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    str = ((C43551zz) A0a).A0E();
                    if (str == null) {
                        str = "other_notifications@1";
                    }
                } else {
                    str = "";
                }
                int currentTimeMillis = (int) System.currentTimeMillis();
                Intent A1w = ((AnonymousClass1LU) this.A0D.get()).A1w(context, r2, 0);
                Bundle A0D2 = C17880vN.A0D();
                AnonymousClass4aU.A0A(A0D2, r8);
                A1w.putExtra("show_event_message_on_create_bundle", A0D2);
                PendingIntent A072 = C17880vN.A07(context, A1w, currentTimeMillis);
                boolean z = r10.A08;
                C42351y2 r82 = (C42351y2) this.A0C.get();
                AnonymousClass1BI A0H = r10.A0H();
                if (z) {
                    num = AnonymousClass00R.A0C;
                } else {
                    num = AnonymousClass00R.A01;
                }
                SpannableStringBuilder A003 = r82.A00((TextView) null, r10, A0H, num, AnonymousClass00R.A00, (Integer) null);
                C1409673t A032 = C217217d.A03(context);
                A032.A0E(A0K);
                A032.A0L = "event";
                A032.A0G(true);
                A032.A0M = str;
                A032.A0A = A072;
                A032.A0D(A003);
                C17880vN.A1G(A032);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
                Bitmap A033 = this.A02.A03(context, A0E, dimensionPixelSize, dimensionPixelSize);
                if (A033 == null) {
                    A033 = this.A01.A07(A0E, context.getResources().getDimension(2131168737), dimensionPixelSize);
                }
                AnonymousClass70v.A00(A033, A032);
                Notification A052 = A032.A05();
                C18070vi.A0X(A052);
                this.A04.BkS(A00(r10), 85, A052);
            }
        }
    }

    public C62152qs(AnonymousClass11S r3, AnonymousClass1VW r4, AnonymousClass1M9 r5, C27201Vd r6, AnonymousClass11P r7, AnonymousClass118 r8, C27301Vn r9, AnonymousClass1CJ r10, AnonymousClass1PQ r11, AnonymousClass1Nb r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r7, r3, r8, r13, r10);
        C18070vi.A0x(r5, r4, r6, r12, r14);
        C18070vi.A0r(r11, r9, r15);
        this.A09 = r7;
        this.A00 = r3;
        this.A03 = r8;
        this.A0D = r13;
        this.A0A = r10;
        this.A08 = r5;
        this.A01 = r4;
        this.A02 = r6;
        this.A0B = r12;
        this.A06 = r14;
        this.A05 = r11;
        this.A04 = r9;
        this.A0C = r15;
    }

    public static final String A00(C445823z r2) {
        String str;
        C691536c A002 = C60492o7.A00(r2);
        if (!(A002 == null || (str = A002.A02.A01) == null)) {
            try {
                String encodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(C18070vi.A1A(str, C26571Sq.A05)), 0);
                C18070vi.A0X(encodeToString);
                return encodeToString;
            } catch (NoSuchAlgorithmException unused) {
                Log.e("EventNotificationHelper SHA-256 not supported");
            }
        }
        return "";
    }
}
