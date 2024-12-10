package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.Iterator;

/* renamed from: X.9Pq  reason: invalid class name and case insensitive filesystem */
public abstract class C181229Pq {
    public static final AudioDeviceInfo A00(AudioManager audioManager) {
        Object obj;
        Iterator A0r = AnonymousClass8BS.A0r(audioManager.getAvailableCommunicationDevices());
        while (true) {
            if (!A0r.hasNext()) {
                obj = null;
                break;
            }
            obj = A0r.next();
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            if (audioDeviceInfo.getType() != 3) {
                if (audioDeviceInfo.getType() != 4) {
                    if (audioDeviceInfo.getType() == 22) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return (AudioDeviceInfo) obj;
    }
}
