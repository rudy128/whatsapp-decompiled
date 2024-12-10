package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.8CN  reason: invalid class name */
public final class AnonymousClass8CN extends AudioDeviceCallback {
    public final /* synthetic */ AnonymousClass8CB A00;

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C18070vi.A0d(audioDeviceInfoArr, 0);
        for (AudioDeviceInfo A01 : audioDeviceInfoArr) {
            if (C137466vV.A01(A01)) {
                AnonymousClass8CB.A01(this.A00, 2);
                return;
            }
        }
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C18070vi.A0d(audioDeviceInfoArr, 0);
        for (AudioDeviceInfo A01 : audioDeviceInfoArr) {
            if (C137466vV.A01(A01)) {
                AnonymousClass8CB.A01(this.A00, 0);
                return;
            }
        }
    }

    public AnonymousClass8CN(AnonymousClass8CB r1) {
        this.A00 = r1;
    }
}
