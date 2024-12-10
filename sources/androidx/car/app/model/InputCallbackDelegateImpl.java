package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Th;
import X.C04400Nd;
import X.C15400qZ;
import X.C15410qa;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;

public class InputCallbackDelegateImpl implements C15410qa {
    public final IInputCallback mCallback = null;

    public class OnInputCallbackStub extends IInputCallback.Stub {
        public final C15400qZ mCallback;

        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Th(1, str, this), "onInputSubmitted");
        }

        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Th(0, str, this), "onInputTextChanged");
        }

        /* renamed from: lambda$onInputSubmitted$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m10lambda$onInputSubmitted$0$androidxcarappmodelInputCallbackDelegateImpl$OnInputCallbackStub(String str) {
            throw AnonymousClass000.A0s("onInputSubmitted");
        }

        /* renamed from: lambda$onInputTextChanged$1$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m11lambda$onInputTextChanged$1$androidxcarappmodelInputCallbackDelegateImpl$OnInputCallbackStub(String str) {
            throw AnonymousClass000.A0s("onInputTextChanged");
        }

        public OnInputCallbackStub(C15400qZ r1) {
            this.mCallback = r1;
        }
    }
}
