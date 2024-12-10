package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass11G;
import X.BKL;
import X.C18070vi;
import X.C18090vk;

public final class CredentialProviderGetSignInIntentController$handleResponse$6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BKL $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$6(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, BKL bkl) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = bkl;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$6$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, BKL bkl) {
        C18070vi.A0h(credentialProviderGetSignInIntentController, bkl);
        credentialProviderGetSignInIntentController.getCallback().Bsz(bkl);
    }
}
