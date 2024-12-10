package X;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.6WY  reason: invalid class name */
public abstract class AnonymousClass6WY {
    public static final void A00(C1409673t r9, AnonymousClass1E7 r10, C217217d r11, String str, String str2, long j) {
        IconCompat iconCompat;
        Bitmap A0F = r11.A0F(r10);
        if (A0F != null) {
            iconCompat = IconCompat.A03(A0F);
        } else {
            iconCompat = null;
        }
        C136826uT r2 = new C136826uT(iconCompat, str2, (String) null, (String) null, false, false);
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r11.A0G());
        notificationCompat$MessagingStyle.A07(new C139156yJ(r2, str, j));
        r9.A0B(notificationCompat$MessagingStyle);
    }
}
