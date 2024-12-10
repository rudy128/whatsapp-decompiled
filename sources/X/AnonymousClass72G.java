package X;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.core.app.NotificationCompat$DecoratedCustomViewStyle;
import androidx.core.app.NotificationCompat$InboxStyle;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;

/* renamed from: X.72G  reason: invalid class name */
public abstract class AnonymousClass72G {
    public C1409673t A00;
    public CharSequence A01;
    public boolean A02 = false;

    public RemoteViews A03() {
        return null;
    }

    public RemoteViews A04() {
        return null;
    }

    public static Bitmap A01(AnonymousClass72G r6, int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Context context = r6.A00.A0C;
        if (context != null) {
            Bitmap A022 = A02(r6, IconCompat.A02(context.getResources(), context.getPackageName(), 2131232747), i4, i2);
            Canvas A0I = C108945cZ.A0I(A022);
            Drawable mutate = r6.A00.A0C.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i5 = (i2 - i3) / 2;
            int i6 = i3 + i5;
            mutate.setBounds(i5, i5, i6, i6);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(A0I);
            return A022;
        }
        throw new NullPointerException();
    }

    public static Bitmap A02(AnonymousClass72G r3, IconCompat iconCompat, int i, int i2) {
        int i3;
        Drawable A08 = iconCompat.A08(r3.A00.A0C);
        if (i2 == 0) {
            i3 = A08.getIntrinsicWidth();
            i2 = A08.getIntrinsicHeight();
        } else {
            i3 = i2;
        }
        Bitmap A0H = C108945cZ.A0H(i3, i2);
        A08.setBounds(0, 0, i3, i2);
        if (i != 0) {
            A08.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        A08.draw(C108945cZ.A0I(A0H));
        return A0H;
    }

    public void A05(Bundle bundle) {
        String str;
        if (this.A02) {
            bundle.putCharSequence("android.summaryText", this.A01);
        }
        if (this instanceof NotificationCompat$MessagingStyle) {
            str = "androidx.core.app.NotificationCompat$MessagingStyle";
        } else if (this instanceof NotificationCompat$InboxStyle) {
            str = "androidx.core.app.NotificationCompat$InboxStyle";
        } else if (this instanceof NotificationCompat$DecoratedCustomViewStyle) {
            str = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        } else if (this instanceof NotificationCompat$BigTextStyle) {
            str = "androidx.core.app.NotificationCompat$BigTextStyle";
        } else {
            str = "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", str);
    }

    public void A06(AnonymousClass84Y r5) {
        if (this instanceof NotificationCompat$InboxStyle) {
            NotificationCompat$InboxStyle notificationCompat$InboxStyle = (NotificationCompat$InboxStyle) this;
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((C1425179t) r5).A02).setBigContentTitle((CharSequence) null);
            if (notificationCompat$InboxStyle.A02) {
                bigContentTitle.setSummaryText(notificationCompat$InboxStyle.A01);
            }
            Iterator it = notificationCompat$InboxStyle.A00.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
            return;
        }
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = (NotificationCompat$BigTextStyle) this;
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((C1425179t) r5).A02).setBigContentTitle((CharSequence) null).bigText(notificationCompat$BigTextStyle.A00);
        if (notificationCompat$BigTextStyle.A02) {
            bigText.setSummaryText(notificationCompat$BigTextStyle.A01);
        }
    }
}
