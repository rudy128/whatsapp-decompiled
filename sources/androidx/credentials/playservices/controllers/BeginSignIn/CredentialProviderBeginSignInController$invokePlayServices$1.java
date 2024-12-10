package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass11G;
import X.BKL;
import X.C18070vi;
import X.C18090vk;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderBeginSignInController$invokePlayServices$1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$invokePlayServices$1(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        C18070vi.A0d(credentialProviderBeginSignInController, 0);
        credentialProviderBeginSignInController.getCallback().Bsz(new BKL(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$invokePlayServices$1$$ExternalSyntheticLambda0(this.this$0));
    }
}
