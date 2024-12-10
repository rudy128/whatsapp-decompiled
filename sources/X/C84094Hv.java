package X;

import android.content.ContentResolver;
import android.os.Vibrator;
import android.provider.Settings;
import com.whatsapp.util.Log;

/* renamed from: X.4Hv  reason: invalid class name and case insensitive filesystem */
public abstract class C84094Hv {
    public static final void A00(AnonymousClass11C r2) {
        ContentResolver contentResolver;
        C18070vi.A0d(r2, 0);
        try {
            AnonymousClass11B A0O = r2.A0O();
            if (A0O != null) {
                contentResolver = A0O.A00;
            } else {
                contentResolver = null;
            }
            if (Settings.System.getInt(contentResolver, "haptic_feedback_enabled") != 0) {
                Vibrator A0H = r2.A0H();
                if (A0H != null) {
                    A0H.vibrate(75);
                    return;
                }
                throw C17880vN.A0g();
            }
        } catch (Settings.SettingNotFoundException e) {
            Log.e("voicerecorderutils/vibrate", e);
        }
    }
}
