package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C24738CIa;
import X.E7A;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$handleResponse$3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24738CIa $response;
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, C24738CIa cIa) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = cIa;
    }

    public final void invoke() {
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C18070vi.A11("executor");
            throw null;
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$handleResponse$3$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController, this.$response));
        }
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, C24738CIa cIa) {
        C18070vi.A0h(credentialProviderCreatePasswordController, cIa);
        E7A e7a = credentialProviderCreatePasswordController.callback;
        if (e7a == null) {
            C18070vi.A11("callback");
            throw null;
        } else {
            e7a.onResult(cIa);
        }
    }
}
