package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass11G;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C18090vk;
import X.C27621Wu;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderBeginSignInController$handleResponse$1 extends AnonymousClass11G implements AnonymousClass1OS {
    public static final CredentialProviderBeginSignInController$handleResponse$1 INSTANCE = new CredentialProviderBeginSignInController$handleResponse$1();

    public CredentialProviderBeginSignInController$handleResponse$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (C18090vk) obj2);
        return C27621Wu.A00;
    }

    public final void invoke(CancellationSignal cancellationSignal, C18090vk r3) {
        C18070vi.A0d(r3, 1);
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, r3);
    }
}
