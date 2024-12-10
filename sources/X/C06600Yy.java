package X;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.0Yy  reason: invalid class name and case insensitive filesystem */
public class C06600Yy implements Runnable {
    public final WeakReference A00;

    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((BiometricFragment) weakReference.get()).A29();
        }
    }

    public C06600Yy(BiometricFragment biometricFragment) {
        this.A00 = new WeakReference(biometricFragment);
    }
}
