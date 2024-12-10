package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9vq  reason: invalid class name and case insensitive filesystem */
public abstract class C196909vq {
    public static final String A00(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i == 1) {
            return "CONNECTING";
        }
        if (i == 2) {
            return "CONNECTED";
        }
        if (i != 3) {
            return "UNKNOWN BLUETOOTH CONNECTION STATE";
        }
        return "DISCONNECTING";
    }

    public static final List A01(AudioManager audioManager) {
        ArrayList A00 = C137466vV.A00(audioManager);
        ArrayList A0D = C29351c6.A0D(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            A0D.add(((AudioDeviceInfo) it.next()).getAddress());
        }
        return A0D;
    }
}
