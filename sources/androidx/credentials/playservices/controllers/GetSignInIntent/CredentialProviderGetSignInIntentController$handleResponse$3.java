package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C24741CId;

public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24741CId $response;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C24741CId cId) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = cId;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$3$$ExternalSyntheticLambda0(this.this$0, this.$response));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C24741CId cId) {
        C18070vi.A0h(credentialProviderGetSignInIntentController, cId);
        credentialProviderGetSignInIntentController.getCallback().onResult(cId);
    }
}
