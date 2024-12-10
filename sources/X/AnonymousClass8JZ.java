package X;

import android.os.Build;

/* renamed from: X.8JZ  reason: invalid class name */
public final class AnonymousClass8JZ extends C199079zO {
    public static final AnonymousClass8JZ A00 = new AnonymousClass8JZ();

    public AnonymousClass8JZ() {
        super(3, 4);
    }

    public void A01(BE3 be3) {
        if (Build.VERSION.SDK_INT >= 23) {
            be3.BKj("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
