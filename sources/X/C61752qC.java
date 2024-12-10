package X;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.2qC  reason: invalid class name and case insensitive filesystem */
public class C61752qC {
    public final AnonymousClass11S A00;
    public final AnonymousClass118 A01;
    public final C22621Co A02;
    public final AnonymousClass1CJ A03;
    public final C217217d A04;
    public final AnonymousClass1Nb A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass1M9 A07;
    public final AnonymousClass11P A08;
    public final C27301Vn A09;
    public final AnonymousClass1LU A0A;

    public static void A00(PendingIntent pendingIntent, Context context, GroupJid groupJid, C61752qC r20, CharSequence charSequence, String str, int i) {
        C61752qC r5 = r20;
        C27301Vn r3 = r5.A09;
        GroupJid groupJid2 = groupJid;
        String BHf = r3.BHf(groupJid2);
        if (BHf != null) {
            Bitmap A0F = r5.A04.A0F(r5.A07.A0H(groupJid2));
            String str2 = str;
            C136826uT r10 = new C136826uT(IconCompat.A03(A0F), str2, (String) null, (String) null, false, false);
            NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r10);
            notificationCompat$MessagingStyle.A07(new C139156yJ(r10, charSequence, System.currentTimeMillis()));
            notificationCompat$MessagingStyle.A00 = false;
            C17960vV.A07(groupJid2);
            String rawString = groupJid2.getRawString();
            Context context2 = context;
            C1409673t r6 = new C1409673t(context2, (String) null);
            r6.A00 = C19740yt.A00(context2, 2131102224);
            r6.A0F(str2);
            r6.A09(System.currentTimeMillis());
            r6.A06(3);
            r6.A0G(true);
            r6.A0B(notificationCompat$MessagingStyle);
            r6.A0O = rawString;
            r6.A0A = pendingIntent;
            C17880vN.A1G(r6);
            AnonymousClass70v.A00(A0F, r6);
            if (Build.VERSION.SDK_INT >= 26) {
                String A0E = ((C43551zz) r5.A05.A0a(groupJid2)).A0E();
                if (A0E != null) {
                    r6.A0M = A0E;
                } else {
                    return;
                }
            }
            r3.BkS(BHf, i, r6.A05());
        }
    }

    public C61752qC(AnonymousClass11S r1, AnonymousClass1M9 r2, AnonymousClass11P r3, AnonymousClass118 r4, C27301Vn r5, C22621Co r6, AnonymousClass1CJ r7, AnonymousClass1LU r8, C217217d r9, AnonymousClass1Nb r10, AnonymousClass00H r11) {
        this.A08 = r3;
        this.A00 = r1;
        this.A01 = r4;
        this.A0A = r8;
        this.A03 = r7;
        this.A02 = r6;
        this.A07 = r2;
        this.A05 = r10;
        this.A04 = r9;
        this.A06 = r11;
        this.A09 = r5;
    }
}
