package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* renamed from: X.6V5  reason: invalid class name */
public abstract class AnonymousClass6V5 {
    public static Notification.Action.Builder A00(PendingIntent pendingIntent, Icon icon, CharSequence charSequence) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }
}
