package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass11G;
import X.BKL;
import X.C18070vi;
import X.C18090vk;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderGetSignInIntentController$invokePlayServices$2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        C18070vi.A0d(credentialProviderGetSignInIntentController, 0);
        credentialProviderGetSignInIntentController.getCallback().Bsz(new BKL(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$invokePlayServices$2$$ExternalSyntheticLambda0(this.this$0));
    }
}
