package androidx.credentials.playservices;

import X.E7A;
import android.os.CancellationSignal;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

public final /* synthetic */ class CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1 implements OnFailureListener {
    public final /* synthetic */ CredentialProviderPlayServicesImpl f$0;
    public final /* synthetic */ CancellationSignal f$1;
    public final /* synthetic */ Executor f$2;
    public final /* synthetic */ E7A f$3;

    public final void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(this.f$0, this.f$1, this.f$2, this.f$3, exc);
    }

    public /* synthetic */ CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, E7A e7a) {
        this.f$0 = credentialProviderPlayServicesImpl;
        this.f$1 = cancellationSignal;
        this.f$2 = executor;
        this.f$3 = e7a;
    }
}
