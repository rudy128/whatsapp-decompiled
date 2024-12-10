package androidx.credentials.playservices;

import X.AnonymousClass11G;
import X.C18070vi;
import X.C18090vk;
import X.C22821Di;
import X.C27621Wu;
import X.E7A;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl$onClearCredential$1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ E7A $callback;
    public final /* synthetic */ CancellationSignal $cancellationSignal;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$1(CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = e7a;
    }

    public final void invoke(Void voidR) {
        CredentialProviderPlayServicesImpl.Companion companion = CredentialProviderPlayServicesImpl.Companion;
        CancellationSignal cancellationSignal = this.$cancellationSignal;
        final Executor executor = this.$executor;
        final E7A e7a = this.$callback;
        companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new C18090vk() {
            public static final void invoke$lambda$0(E7A e7a) {
                C18070vi.A0d(e7a, 0);
                e7a.onResult((Object) null);
            }

            public final void invoke() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
                executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0(e7a));
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Void) null);
        return C27621Wu.A00;
    }
}
