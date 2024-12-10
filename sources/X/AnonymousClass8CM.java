package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.8CM  reason: invalid class name */
public class AnonymousClass8CM extends AudioDeviceCallback {
    public final /* synthetic */ AnonymousClass8lK A00;

    public AnonymousClass8CM(AnonymousClass8lK r1) {
        this.A00 = r1;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A02();
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A02();
    }
}
