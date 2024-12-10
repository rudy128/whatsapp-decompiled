package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.util.Log;

/* renamed from: X.2jy  reason: invalid class name and case insensitive filesystem */
public class C57992jy {
    public final Context A00;
    public final AnonymousClass1VW A01;
    public final AnonymousClass1M9 A02;
    public final C27201Vd A03;
    public final C27301Vn A04;
    public final C18000vb A05;
    public final AnonymousClass1Nb A06;

    public void A00(C59822mw r14, boolean z) {
        String string;
        String A0E;
        AnonymousClass1BI r1 = r14.A04;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(r1);
        if (A002 == null) {
            Log.w("ScheduledCallStartNotificationImpl group jid is null");
            return;
        }
        AnonymousClass1E7 A0H = this.A02.A0H(A002);
        Context context = this.A00;
        long j = r14.A02;
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
        A0A.setAction(AnonymousClass6Z8.A05);
        A0A.putExtra("scheduled_call_row_id", j);
        A0A.putExtra("group_jid", A002.getRawString());
        PendingIntent A07 = C17880vN.A07(context, A0A, 7);
        C1409673t r4 = new C1409673t(context, "critical_app_alerts@1");
        r4.A03 = 1;
        C17880vN.A1G(r4);
        r4.A00 = C19740yt.A00(context, 2131102224);
        r4.A0A = A07;
        r4.A0G(true);
        if (Build.VERSION.SDK_INT >= 26) {
            C42551yM A0a = this.A06.A0a(A002);
            C43551zz r12 = (C43551zz) A0a;
            if (A0a.A0A()) {
                A0E = r12.A0F();
            } else {
                A0E = r12.A0E();
            }
            if (!TextUtils.isEmpty(A0E)) {
                r4.A0M = A0E;
            }
        }
        Bitmap A012 = AnonymousClass74H.A01(context, this.A01, this.A03, A0H);
        C136826uT r6 = new C136826uT(IconCompat.A03(A012), r14.A00(), (String) null, (String) null, false, false);
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r6);
        boolean A1T = AnonymousClass000.A1T(r14.A00, 2);
        if (z) {
            string = context.getResources().getString(2131895407);
        } else {
            int i = 2131895434;
            if (A1T) {
                i = 2131895435;
            }
            string = context.getString(i);
        }
        notificationCompat$MessagingStyle.A07(new C139156yJ(r6, string, r14.A03));
        notificationCompat$MessagingStyle.A00 = false;
        r4.A0B(notificationCompat$MessagingStyle);
        this.A04.BkR(55, r4.A05());
    }

    public C57992jy(AnonymousClass1VW r2, AnonymousClass1M9 r3, C27201Vd r4, AnonymousClass118 r5, C27301Vn r6, C18000vb r7, AnonymousClass1Nb r8) {
        this.A00 = r5.A00;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
    }
}
