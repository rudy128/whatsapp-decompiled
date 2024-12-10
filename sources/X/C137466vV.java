package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.ArrayList;

/* renamed from: X.6vV  reason: invalid class name and case insensitive filesystem */
public abstract class C137466vV {
    public static final boolean A01(AudioDeviceInfo audioDeviceInfo) {
        C18070vi.A0d(audioDeviceInfo, 0);
        int type = audioDeviceInfo.getType();
        if (type == 7 || type == 26) {
            return true;
        }
        return false;
    }

    public static final ArrayList A00(AudioManager audioManager) {
        ArrayList A13 = AnonymousClass000.A13();
        if (audioManager != null) {
            ArrayList A132 = AnonymousClass000.A13();
            C99014s7 A00 = AnonymousClass4I0.A00(audioManager.getDevices(2));
            while (A00.hasNext()) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) A00.next();
                C18070vi.A0b(audioDeviceInfo);
                if (A01(audioDeviceInfo)) {
                    A13.add(audioDeviceInfo);
                }
                C17890vO.A1D(A132, audioDeviceInfo.getType());
            }
            C17900vP.A0Y(A132, "BluetoothHeadsetDetector/getConnectedBluetoothHeadsets output device types: ", AnonymousClass000.A10());
        }
        return A13;
    }
}
