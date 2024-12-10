package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: X.6Xj  reason: invalid class name and case insensitive filesystem */
public abstract class C124186Xj {
    public static final boolean A00(AudioManager audioManager) {
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        if (communicationDevice == null) {
            return false;
        }
        int type = communicationDevice.getType();
        if (Integer.valueOf(type) == null) {
            return false;
        }
        if (type == 26 || type == 8 || type == 7) {
            return true;
        }
        return false;
    }
}
