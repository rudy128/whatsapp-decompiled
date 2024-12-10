package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Td;
import X.C04400Nd;
import X.C15470qg;
import X.C15480qh;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;

public class OnContentRefreshDelegateImpl implements C15470qg {
    public final IOnContentRefreshListener mListener = null;

    public class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        public final C15480qh mOnContentRefreshListener;

        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Td(this, 6), "onClick");
        }

        /* renamed from: lambda$onContentRefreshRequested$0$androidx-car-app-model-OnContentRefreshDelegateImpl$OnContentRefreshListenerStub  reason: not valid java name */
        public /* synthetic */ Object m14lambda$onContentRefreshRequested$0$androidxcarappmodelOnContentRefreshDelegateImpl$OnContentRefreshListenerStub() {
            throw AnonymousClass000.A0s("onContentRefreshRequested");
        }

        public OnContentRefreshListenerStub(C15480qh r1) {
            this.mOnContentRefreshListener = r1;
        }
    }
}
