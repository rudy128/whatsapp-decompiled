package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C24398C1t;

public final class CredentialProviderBeginSignInController$handleResponse$5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24398C1t $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C24398C1t c1t) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = c1t;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$5$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C24398C1t c1t) {
        C18070vi.A0h(credentialProviderBeginSignInController, c1t);
        credentialProviderBeginSignInController.getCallback().Bsz(c1t);
    }
}
