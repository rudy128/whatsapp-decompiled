package androidx.credentials.playservices.controllers.CreatePassword;

import X.C18070vi;
import X.E7A;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        C18070vi.A0d(bundle, 1);
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            str = "executor";
        } else {
            E7A e7a = credentialProviderCreatePasswordController.callback;
            if (e7a == null) {
                str = "callback";
            } else if (!credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(bundle2, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, e7a, credentialProviderCreatePasswordController.cancellationSignal)) {
                this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i);
                return;
            } else {
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$resultReceiver$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderCreatePasswordController;
    }
}
