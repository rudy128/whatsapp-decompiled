package androidx.car.app.media;

import X.AnonymousClass000;
import X.C15370qW;
import androidx.car.app.media.ICarAudioCallback;

public class CarAudioCallbackDelegate {
    public final ICarAudioCallback mCallback = null;

    public class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        public final C15370qW mCarAudioCallback;

        public void onStopRecording() {
            Object obj = null;
            obj.getClass();
            throw AnonymousClass000.A0s("onStopRecording");
        }

        public CarAudioCallbackStub(C15370qW r1) {
            this.mCarAudioCallback = r1;
        }

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }
    }
}
