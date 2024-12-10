package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C22821Di;
import X.C27621Wu;
import X.C2O;
import X.E7A;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$handleResponse$2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public final void invoke(C2O c2o) {
        C18070vi.A0d(c2o, 0);
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C18070vi.A11("executor");
            throw null;
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController, c2o));
        }
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, C2O c2o) {
        C18070vi.A0h(credentialProviderCreatePasswordController, c2o);
        E7A e7a = credentialProviderCreatePasswordController.callback;
        if (e7a == null) {
            C18070vi.A11("callback");
            throw null;
        } else {
            e7a.Bsz(c2o);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2O) obj);
        return C27621Wu.A00;
    }
}
