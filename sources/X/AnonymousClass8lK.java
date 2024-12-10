package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;

/* renamed from: X.8lK  reason: invalid class name */
public class AnonymousClass8lK extends AnonymousClass9O5 {
    public final AudioDeviceCallback A00 = new AnonymousClass8CM(this);
    public final AnonymousClass11C A01;

    public void A00() {
        AudioManager A0D = this.A01.A0D();
        if (A0D != null) {
            A0D.registerAudioDeviceCallback(this.A00, (Handler) null);
        }
    }

    public void A01() {
        AudioManager A0D = this.A01.A0D();
        if (A0D != null) {
            A0D.unregisterAudioDeviceCallback(this.A00);
        }
    }

    public boolean A03() {
        AudioManager A0D = this.A01.A0D();
        if (A0D != null) {
            for (AudioDeviceInfo type : A0D.getDevices(2)) {
                int type2 = type.getType();
                if (type2 == 4 || type2 == 3 || type2 == 11) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 26 && type2 == 22) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ AnonymousClass8lK(AnonymousClass11C r2) {
        this.A01 = r2;
    }
}
