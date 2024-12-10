package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Td;
import X.C04400Nd;
import X.C15450qe;
import X.C15460qf;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;

public class OnClickDelegateImpl implements C15450qe {
    public final boolean mIsParkedOnly = false;
    public final IOnClickListener mListener = null;

    public class OnClickListenerStub extends IOnClickListener.Stub {
        public final C15460qf mOnClickListener;

        public void onClick(IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Td(this, 5), "onClick");
        }

        /* renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub  reason: not valid java name */
        public /* synthetic */ Object m13lambda$onClick$0$androidxcarappmodelOnClickDelegateImpl$OnClickListenerStub() {
            throw AnonymousClass000.A0s("onClick");
        }

        public OnClickListenerStub(C15460qf r1) {
            this.mOnClickListener = r1;
        }
    }
}
