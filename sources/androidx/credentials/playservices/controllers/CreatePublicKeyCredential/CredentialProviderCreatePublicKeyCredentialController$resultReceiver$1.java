package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.C18070vi;
import X.E7A;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        C18070vi.A0d(bundle, 1);
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            str = "executor";
        } else {
            E7A e7a = credentialProviderCreatePublicKeyCredentialController.callback;
            if (e7a == null) {
                str = "callback";
            } else if (!credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle2, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, e7a, credentialProviderCreatePublicKeyCredentialController.cancellationSignal)) {
                this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
                return;
            } else {
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }
}
