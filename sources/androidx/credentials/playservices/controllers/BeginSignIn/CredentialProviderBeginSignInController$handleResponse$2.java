package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C22821Di;
import X.C24398C1t;
import X.C27621Wu;

public final class CredentialProviderBeginSignInController$handleResponse$2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(1);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public final void invoke(C24398C1t c1t) {
        C18070vi.A0d(c1t, 0);
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$2$$ExternalSyntheticLambda0(this.this$0, c1t));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C24398C1t c1t) {
        C18070vi.A0h(credentialProviderBeginSignInController, c1t);
        credentialProviderBeginSignInController.getCallback().Bsz(c1t);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C24398C1t) obj);
        return C27621Wu.A00;
    }
}
