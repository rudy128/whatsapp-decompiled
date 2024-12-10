package X;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: X.0Ik  reason: invalid class name and case insensitive filesystem */
public class C03480Ik {
    public BiometricPrompt.AuthenticationCallback A00;
    public C195869u2 A01;
    public final C02160Cy A02;

    public BiometricPrompt.AuthenticationCallback A00() {
        BiometricPrompt.AuthenticationCallback authenticationCallback = this.A00;
        if (authenticationCallback != null) {
            return authenticationCallback;
        }
        AnonymousClass04X A002 = AnonymousClass0DH.A00(this.A02);
        this.A00 = A002;
        return A002;
    }

    public C195869u2 A01() {
        C195869u2 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0Bf r02 = new AnonymousClass0Bf(this);
        this.A01 = r02;
        return r02;
    }

    public C03480Ik(C02160Cy r1) {
        this.A02 = r1;
    }
}
