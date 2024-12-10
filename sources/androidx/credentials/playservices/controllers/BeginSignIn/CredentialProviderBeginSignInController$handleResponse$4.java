package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C98494rF;

public final class CredentialProviderBeginSignInController$handleResponse$4 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98494rF $exception;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C98494rF r3) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$exception = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$4$$ExternalSyntheticLambda0(this.this$0, this.$exception));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C98494rF r2) {
        C18070vi.A0h(credentialProviderBeginSignInController, r2);
        credentialProviderBeginSignInController.getCallback().Bsz(r2.element);
    }
}
