package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Th;
import X.C04400Nd;
import X.C15510qk;
import X.C15520ql;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;

public class SearchCallbackDelegateImpl implements C15510qk {
    public final ISearchCallback mStubCallback = null;

    public class SearchCallbackStub extends ISearchCallback.Stub {
        public final C15520ql mCallback;

        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Th(2, str, this), "onSearchSubmitted");
        }

        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Th(3, str, this), "onSearchTextChanged");
        }

        /* renamed from: lambda$onSearchSubmitted$1$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m17lambda$onSearchSubmitted$1$androidxcarappmodelSearchCallbackDelegateImpl$SearchCallbackStub(String str) {
            throw AnonymousClass000.A0s("onSearchSubmitted");
        }

        /* renamed from: lambda$onSearchTextChanged$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m18lambda$onSearchTextChanged$0$androidxcarappmodelSearchCallbackDelegateImpl$SearchCallbackStub(String str) {
            throw AnonymousClass000.A0s("onSearchTextChanged");
        }

        public SearchCallbackStub(C15520ql r1) {
            this.mCallback = r1;
        }
    }
}
