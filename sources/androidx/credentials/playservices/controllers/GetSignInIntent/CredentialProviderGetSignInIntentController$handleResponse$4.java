package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C98494rF;

public final class CredentialProviderGetSignInIntentController$handleResponse$4 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98494rF $exception;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$4(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C98494rF r3) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$exception = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$4$$ExternalSyntheticLambda0(this.this$0, this.$exception));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C98494rF r2) {
        C18070vi.A0h(credentialProviderGetSignInIntentController, r2);
        credentialProviderGetSignInIntentController.getCallback().Bsz(r2.element);
    }
}
