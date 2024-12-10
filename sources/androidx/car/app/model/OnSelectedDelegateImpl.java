package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Tg;
import X.C04400Nd;
import X.C15430qc;
import X.C15500qj;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;

public class OnSelectedDelegateImpl implements C15500qj {
    public final IOnSelectedListener mStub = null;

    public class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        public final C15430qc mListener;

        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Tg(this, i, 1), "onSelectedListener");
        }

        /* renamed from: lambda$onSelected$0$androidx-car-app-model-OnSelectedDelegateImpl$OnSelectedListenerStub  reason: not valid java name */
        public /* synthetic */ Object m16lambda$onSelected$0$androidxcarappmodelOnSelectedDelegateImpl$OnSelectedListenerStub(int i) {
            throw AnonymousClass000.A0s("onSelected");
        }

        public OnSelectedListenerStub(C15430qc r1) {
            this.mListener = r1;
        }
    }
}
