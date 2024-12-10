package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass11G;
import X.BKH;
import X.C18070vi;
import X.C18090vk;
import X.E7A;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$invokePlayServices$1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$invokePlayServices$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        C18070vi.A0d(credentialProviderCreatePasswordController, 0);
        E7A e7a = credentialProviderCreatePasswordController.callback;
        if (e7a == null) {
            C18070vi.A11("callback");
            throw null;
        } else {
            e7a.Bsz(new BKH(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }
    }

    public final void invoke() {
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C18070vi.A11("executor");
            throw null;
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$invokePlayServices$1$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController));
        }
    }
}
