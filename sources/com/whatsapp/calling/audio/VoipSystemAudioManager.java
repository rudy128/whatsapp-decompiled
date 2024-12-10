package com.whatsapp.calling.audio;

import X.A1P;
import X.AnonymousClass00H;
import X.AnonymousClass1DC;
import X.C18070vi;
import X.C217517g;
import android.os.Build;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;

public final class VoipSystemAudioManager {
    public final AnonymousClass00H screenShareLoggingHelper;
    public final AnonymousClass00H screenShareResourceManager = C217517g.A00(49153);
    public final AnonymousClass1DC systemFeatures;

    public final synchronized VoipSystemAudioDeviceFactory createSystemAudioDevice(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Log.w("createSystemAudioDevice: unsupported API level");
            return null;
        }
        Log.i("createSystemAudioDevice: creating system audio device");
        return new ScreenShareAudioCapturer(this.systemFeatures, i, (A1P) C18070vi.A0E(this.screenShareLoggingHelper), (ScreenShareResourceManager) C18070vi.A0E(this.screenShareResourceManager));
    }

    public VoipSystemAudioManager(AnonymousClass1DC r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.systemFeatures = r2;
        this.screenShareLoggingHelper = r3;
    }
}
