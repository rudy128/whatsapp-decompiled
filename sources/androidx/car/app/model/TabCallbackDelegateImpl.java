package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Th;
import X.C04400Nd;
import X.C15530qm;
import X.C15540qn;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;

public class TabCallbackDelegateImpl implements C15530qm {
    public final ITabCallback mStubCallback = null;

    public class TabCallbackStub extends ITabCallback.Stub {
        public final C15540qn mCallback;

        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Th(4, str, this), "onTabSelected");
        }

        /* renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m19lambda$onTabSelected$0$androidxcarappmodelTabCallbackDelegateImpl$TabCallbackStub(String str) {
            throw AnonymousClass000.A0s("onTabSelected");
        }

        public TabCallbackStub(C15540qn r1) {
            this.mCallback = r1;
        }
    }
}
