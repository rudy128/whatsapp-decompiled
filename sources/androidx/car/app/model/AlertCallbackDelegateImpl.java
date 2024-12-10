package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0Td;
import X.AnonymousClass0Tg;
import X.C04400Nd;
import X.C15380qX;
import X.C15390qY;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IAlertCallback;

public class AlertCallbackDelegateImpl implements C15390qY {
    public final IAlertCallback mCallback = null;

    public class AlertCallbackStub extends IAlertCallback.Stub {
        public final C15380qX mCallback;

        public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Tg(this, i, 0), "onCancel");
        }

        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Td(this, 4), "onDismiss");
        }

        /* renamed from: lambda$onAlertCancelled$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m8lambda$onAlertCancelled$0$androidxcarappmodelAlertCallbackDelegateImpl$AlertCallbackStub(int i) {
            throw AnonymousClass000.A0s("onCancel");
        }

        /* renamed from: lambda$onAlertDismissed$1$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub  reason: not valid java name */
        public /* synthetic */ Object m9lambda$onAlertDismissed$1$androidxcarappmodelAlertCallbackDelegateImpl$AlertCallbackStub() {
            throw AnonymousClass000.A0s("onDismiss");
        }

        public AlertCallbackStub(C15380qX r1) {
            this.mCallback = r1;
        }
    }
}
