package X;

import android.app.Notification;
import android.app.PendingIntent;

/* renamed from: X.6V0  reason: invalid class name */
public abstract class AnonymousClass6V0 {
    public static Notification.BubbleMetadata A00(C128226fe r3) {
        PendingIntent pendingIntent = r3.A01;
        if (pendingIntent == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(r3.A02.A09()).setIntent(pendingIntent).setDeleteIntent((PendingIntent) null).setAutoExpandBubble(false).setSuppressNotification(false);
        int i = r3.A00;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        return suppressNotification.build();
    }
}
