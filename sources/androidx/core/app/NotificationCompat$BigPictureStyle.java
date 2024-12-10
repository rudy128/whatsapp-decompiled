package androidx.core.app;

import X.AnonymousClass70Z;
import X.AnonymousClass72G;
import X.AnonymousClass84Y;
import X.C1425179t;
import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

public class NotificationCompat$BigPictureStyle extends AnonymousClass72G {
    public IconCompat A00;
    public boolean A01;

    public void A06(AnonymousClass84Y r7) {
        C1425179t r72 = (C1425179t) r7;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(r72.A02).setBigContentTitle((CharSequence) null);
        IconCompat iconCompat = this.A00;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AnonymousClass70Z.A02(bigContentTitle, iconCompat.A0A(r72.A03));
            } else if (iconCompat.A06() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.A00.A07());
            }
        }
        if (this.A01) {
            bigContentTitle.bigLargeIcon((Bitmap) null);
        }
        if (this.A02) {
            bigContentTitle.setSummaryText(this.A01);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AnonymousClass70Z.A01(bigContentTitle);
            AnonymousClass70Z.A00(bigContentTitle);
        }
    }
}
