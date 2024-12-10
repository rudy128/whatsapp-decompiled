package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C22821Di;
import X.C24398C1t;
import X.C27621Wu;

public final class CredentialProviderGetSignInIntentController$handleResponse$2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(1);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public final void invoke(C24398C1t c1t) {
        C18070vi.A0d(c1t, 0);
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$2$$ExternalSyntheticLambda0(this.this$0, c1t));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C24398C1t c1t) {
        C18070vi.A0h(credentialProviderGetSignInIntentController, c1t);
        credentialProviderGetSignInIntentController.getCallback().Bsz(c1t);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C24398C1t) obj);
        return C27621Wu.A00;
    }
}
