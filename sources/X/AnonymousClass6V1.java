package X;

import android.app.Notification;
import android.app.PendingIntent;

/* renamed from: X.6V1  reason: invalid class name */
public abstract class AnonymousClass6V1 {
    public static Notification.BubbleMetadata A00(C128226fe r3) {
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(r3.A01, r3.A02.A09());
        builder.setDeleteIntent((PendingIntent) null).setAutoExpandBubble(false).setSuppressNotification(false);
        int i = r3.A00;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        return builder.build();
    }
}
