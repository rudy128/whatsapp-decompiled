package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* renamed from: X.70b  reason: invalid class name and case insensitive filesystem */
public abstract class C1401470b {
    public static Notification.Action.Builder A00(PendingIntent pendingIntent, Icon icon, CharSequence charSequence) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static void A02(Notification.Builder builder, Object obj) {
        builder.setSmallIcon((Icon) obj);
    }

    public static void A01(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }
}
