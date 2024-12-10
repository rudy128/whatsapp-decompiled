package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C24738CIa;
import X.E7A;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24738CIa $response;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C24738CIa cIa) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$response = cIa;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C18070vi.A11("executor");
            throw null;
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$response));
        }
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C24738CIa cIa) {
        C18070vi.A0h(credentialProviderCreatePublicKeyCredentialController, cIa);
        E7A e7a = credentialProviderCreatePublicKeyCredentialController.callback;
        if (e7a == null) {
            C18070vi.A11("callback");
            throw null;
        } else {
            e7a.onResult(cIa);
        }
    }
}
