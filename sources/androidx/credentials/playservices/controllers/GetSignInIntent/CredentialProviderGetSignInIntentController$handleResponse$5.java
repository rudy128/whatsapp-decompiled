package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C24398C1t;

public final class CredentialProviderGetSignInIntentController$handleResponse$5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24398C1t $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C24398C1t c1t) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = c1t;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$5$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C24398C1t c1t) {
        C18070vi.A0h(credentialProviderGetSignInIntentController, c1t);
        credentialProviderGetSignInIntentController.getCallback().Bsz(c1t);
    }
}
