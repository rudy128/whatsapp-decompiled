package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass11G;
import X.BKH;
import X.C18070vi;
import X.C18090vk;
import X.E7A;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        C18070vi.A0d(credentialProviderCreatePublicKeyCredentialController, 0);
        E7A e7a = credentialProviderCreatePublicKeyCredentialController.callback;
        if (e7a == null) {
            C18070vi.A11("callback");
            throw null;
        } else {
            e7a.Bsz(new BKH(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C18070vi.A11("executor");
            throw null;
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController));
        }
    }
}
