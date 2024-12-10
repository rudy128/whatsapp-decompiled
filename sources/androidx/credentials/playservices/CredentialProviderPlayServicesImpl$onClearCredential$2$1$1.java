package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass11G;
import X.BKD;
import X.C17890vO;
import X.C18070vi;
import X.C18090vk;
import X.E7A;
import android.util.Log;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ E7A $callback;
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, E7A e7a) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = e7a;
    }

    public static final void invoke$lambda$0(E7A e7a, Exception exc) {
        C18070vi.A0h(e7a, exc);
        e7a.Bsz(new BKD(exc.getMessage()));
    }

    public final void invoke() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("During clear credential sign out failed with ");
        Log.w(CredentialProviderPlayServicesImpl.TAG, C17890vO.A0V(this.$e, A10));
        this.$executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0(this.$callback, this.$e));
    }
}
