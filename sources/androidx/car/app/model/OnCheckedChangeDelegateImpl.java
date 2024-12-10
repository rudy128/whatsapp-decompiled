package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Ti;
import X.C04400Nd;
import X.C15440qd;
import X.C15560qp;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;

public class OnCheckedChangeDelegateImpl implements C15440qd {
    public final IOnCheckedChangeListener mStub = null;

    public class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        public final C15560qp mListener;

        public void onCheckedChange(boolean z, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Ti(0, this, z), "onCheckedChange");
        }

        /* renamed from: lambda$onCheckedChange$0$androidx-car-app-model-OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub  reason: not valid java name */
        public /* synthetic */ Object m12lambda$onCheckedChange$0$androidxcarappmodelOnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub(boolean z) {
            throw AnonymousClass000.A0s("onCheckedChange");
        }

        public OnCheckedChangeListenerStub(C15560qp r1) {
            this.mListener = r1;
        }
    }
}
