package X;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.4a5  reason: invalid class name */
public abstract class AnonymousClass4a5 {
    public static void A00(Vibrator vibrator, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(30, i));
            } else {
                vibrator.vibrate(30);
            }
        } catch (Exception e) {
            Log.w("vibrationutils/vibrate-failed", e);
        }
    }

    public static void A01(View view, AnonymousClass11C r2) {
        if (AnonymousClass112.A07()) {
            view.performHapticFeedback(16);
        } else {
            A03(r2);
        }
    }

    public static void A02(View view, AnonymousClass11C r2) {
        if (AnonymousClass112.A07()) {
            view.performHapticFeedback(17);
        } else {
            A03(r2);
        }
    }

    public static void A03(AnonymousClass11C r1) {
        Vibrator A0H = r1.A0H();
        if (A0H != null) {
            A00(A0H, 48);
        }
    }

    public static void A04(AnonymousClass11C r1) {
        Vibrator A0H = r1.A0H();
        if (A0H != null) {
            A00(A0H, 80);
        }
    }
}
