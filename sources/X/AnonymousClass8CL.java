package X;

import android.hardware.fingerprint.FingerprintManager;

/* renamed from: X.8CL  reason: invalid class name */
public class AnonymousClass8CL extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ C195869u2 A00;

    public AnonymousClass8CL(C195869u2 r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A02(i, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A01();
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        this.A00.A03(i, charSequence);
    }

    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.A00.A04(new C189159ic(A7q.A03(C20115A7y.A01(authenticationResult))));
    }
}
