package X;

import android.service.notification.StatusBarNotification;

/* renamed from: X.2UI  reason: invalid class name */
public abstract class AnonymousClass2UI {
    public static /* synthetic */ long A00(C217217d r4) {
        int i = 0;
        for (StatusBarNotification notification : r4.A0Q()) {
            i += notification.getNotification().number;
        }
        return (long) i;
    }
}
