package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;

public final class CredentialProviderGetSignInIntentController$invokePlayServices$1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$1(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = exc;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$invokePlayServices$1$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        C18070vi.A0h(credentialProviderGetSignInIntentController, exc);
        credentialProviderGetSignInIntentController.getCallback().Bsz(exc);
    }
}
