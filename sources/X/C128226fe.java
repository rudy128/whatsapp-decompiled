package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.6fe  reason: invalid class name and case insensitive filesystem */
public final class C128226fe {
    public int A00;
    public PendingIntent A01;
    public IconCompat A02;

    public static Notification.BubbleMetadata A00(C128226fe r3) {
        if (r3 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return AnonymousClass6V1.A00(r3);
            }
            if (i == 29) {
                return AnonymousClass6V0.A00(r3);
            }
        }
        return null;
    }
}
