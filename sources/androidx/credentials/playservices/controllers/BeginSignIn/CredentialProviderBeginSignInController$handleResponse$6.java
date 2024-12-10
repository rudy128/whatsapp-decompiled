package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass11G;
import X.BKL;
import X.C18070vi;
import X.C18090vk;

public final class CredentialProviderBeginSignInController$handleResponse$6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BKL $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$6(CredentialProviderBeginSignInController credentialProviderBeginSignInController, BKL bkl) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = bkl;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$6$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, BKL bkl) {
        C18070vi.A0h(credentialProviderBeginSignInController, bkl);
        credentialProviderBeginSignInController.getCallback().Bsz(bkl);
    }
}
