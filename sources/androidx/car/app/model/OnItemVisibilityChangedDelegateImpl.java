package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Te;
import X.C04400Nd;
import X.C15420qb;
import X.C15490qi;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;

public class OnItemVisibilityChangedDelegateImpl implements C15490qi {
    public final IOnItemVisibilityChangedListener mStub = null;

    public class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        public final C15420qb mListener;

        /* renamed from: lambda$onItemVisibilityChanged$0$androidx-car-app-model-OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub  reason: not valid java name */
        public /* synthetic */ Object m15lambda$onItemVisibilityChanged$0$androidxcarappmodelOnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub(int i, int i2) {
            throw AnonymousClass000.A0s("onItemVisibilityChanged");
        }

        public void onItemVisibilityChanged(int i, int i2, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Te(this, i, i2), "onItemVisibilityChanged");
        }

        public OnItemVisibilityChangedListenerStub(C15420qb r1) {
            this.mListener = r1;
        }
    }
}
