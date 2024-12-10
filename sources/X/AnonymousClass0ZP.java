package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0ZP  reason: invalid class name */
public class AnonymousClass0ZP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public AnonymousClass0ZP(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    public void run() {
        this.A01.A01.A0Z().A02(this.A00, this.A02);
    }
}
