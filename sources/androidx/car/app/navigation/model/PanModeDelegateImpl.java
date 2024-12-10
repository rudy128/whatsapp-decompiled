package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass0Ti;
import X.C04400Nd;
import X.C15590qs;
import X.C15600qt;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;

public class PanModeDelegateImpl implements C15590qs {
    public final IPanModeListener mStub = null;

    public class PanModeListenerStub extends IPanModeListener.Stub {
        public final C15600qt mListener;

        public void onPanModeChanged(boolean z, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Ti(1, this, z), "onPanModeChanged");
        }

        /* renamed from: lambda$onPanModeChanged$0$androidx-car-app-navigation-model-PanModeDelegateImpl$PanModeListenerStub  reason: not valid java name */
        public /* synthetic */ Object m21lambda$onPanModeChanged$0$androidxcarappnavigationmodelPanModeDelegateImpl$PanModeListenerStub(boolean z) {
            throw AnonymousClass000.A0s("onPanModeChanged");
        }

        public PanModeListenerStub(C15600qt r1) {
            this.mListener = r1;
        }
    }
}
