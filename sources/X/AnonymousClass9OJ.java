package X;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.9OJ  reason: invalid class name */
public abstract class AnonymousClass9OJ {
    public static void A00(Notification notification, Service service, int i, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException | SecurityException e) {
            A5Z.A00().A0A(SystemForegroundService.A05, "Unable to start foreground service", e);
        }
    }
}
