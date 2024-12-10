package X;

import android.util.Log;
import androidx.biometric.BiometricFragment;
import java.util.concurrent.Executor;

/* renamed from: X.0Q0  reason: invalid class name */
public class AnonymousClass0Q0 {
    public AnonymousClass1GP A00;

    public static BiometricFragment A00(AnonymousClass1GP r1) {
        return (BiometricFragment) r1.A0Q("androidx.biometric.BiometricFragment");
    }

    public static AnonymousClass0Bs A02(AnonymousClass1FL r2) {
        return (AnonymousClass0Bs) new C24071It(r2).A00(AnonymousClass0Bs.class);
    }

    private void A03(C02120Cu r1, AnonymousClass0Bs r2, AnonymousClass1GP r3, Executor executor) {
        this.A00 = r3;
        if (r2 != null) {
            r2.A0z(executor);
            r2.A0s(r1);
        }
    }

    public static void A04(C03320Hp r3, AnonymousClass0Q0 r4) {
        String str;
        AnonymousClass1GP r2 = r4.A00;
        if (r2 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else if (r2.A0z()) {
            str = "Unable to start authentication. Called after onSaveInstanceState().";
        } else {
            A01(r2).A2F(r3);
            return;
        }
        Log.e("BiometricPromptCompat", str);
    }

    public void A05() {
        String str;
        AnonymousClass1GP r0 = this.A00;
        if (r0 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else {
            BiometricFragment A002 = A00(r0);
            if (A002 == null) {
                str = "Unable to cancel authentication. BiometricFragment not found.";
            } else {
                A002.A2A(3);
                return;
            }
        }
        Log.e("BiometricPromptCompat", str);
    }

    public AnonymousClass0Q0(C02120Cu r3, AnonymousClass1FL r4, Executor executor) {
        if (executor == null) {
            throw AnonymousClass000.A0k("Executor must not be null.");
        } else if (r3 != null) {
            A03(r3, A02(r4), r4.getSupportFragmentManager(), executor);
        } else {
            throw AnonymousClass000.A0k("AuthenticationCallback must not be null.");
        }
    }

    public static BiometricFragment A01(AnonymousClass1GP r3) {
        BiometricFragment A002 = A00(r3);
        if (A002 != null) {
            return A002;
        }
        BiometricFragment A02 = BiometricFragment.A02();
        C34001jj A0M = r3.A0M();
        A0M.A0B(A02, "androidx.biometric.BiometricFragment");
        A0M.A02();
        r3.A0Z();
        return A02;
    }
}
