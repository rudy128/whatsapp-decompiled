package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C24741CId;

public final class CredentialProviderBeginSignInController$handleResponse$3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24741CId $response;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C24741CId cId) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = cId;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$3$$ExternalSyntheticLambda0(this.this$0, this.$response));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C24741CId cId) {
        C18070vi.A0h(credentialProviderBeginSignInController, cId);
        credentialProviderBeginSignInController.getCallback().onResult(cId);
    }
}
