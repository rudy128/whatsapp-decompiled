package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0PO  reason: invalid class name */
public class AnonymousClass0PO {
    public final C16570se A00;
    public final BiometricManager A01;
    public final A7q A02;

    private int A00() {
        A7q a7q = this.A02;
        if (a7q == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        } else if (!a7q.A07()) {
            return 12;
        } else {
            if (!a7q.A06()) {
                return 11;
            }
            return 0;
        }
    }

    private int A01() {
        BiometricPrompt.CryptoObject A002;
        Method A022 = C04390Nb.A02();
        if (!(A022 == null || (A002 = C03820Kt.A00(C03820Kt.A01())) == null)) {
            try {
                Object invoke = A022.invoke(this.A01, AnonymousClass000.A1b(A002, 1));
                if (invoke instanceof Integer) {
                    return AnonymousClass000.A0M(invoke);
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int A023 = A02();
        Context context = ((AnonymousClass0SN) this.A00).A00;
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String equals : context.getResources().getStringArray(2130903041)) {
                if (str.equals(equals)) {
                    return A023;
                }
            }
        }
        if (A023 != 0) {
            return A023;
        }
        boolean A012 = C03840Kv.A01(context);
        int A003 = A00();
        if (!A012) {
            return A003;
        }
        if (A003 == 0) {
            return 0;
        }
        return -1;
    }

    private int A02() {
        BiometricManager biometricManager = this.A01;
        if (biometricManager != null) {
            return C04390Nb.A00(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public int A03(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.A01;
            if (biometricManager != null) {
                return AnonymousClass0DL.A00(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        } else if (!AnonymousClass0DJ.A00(i)) {
            return -2;
        } else {
            Context context = ((AnonymousClass0SN) this.A00).A00;
            if (C03840Kv.A00(context) == null) {
                return 12;
            }
            if ((32768 & i) != 0) {
                if (C03840Kv.A01(context)) {
                    return 0;
                }
                return 11;
            } else if (i2 == 29) {
                if ((i & 255) == 255) {
                    return A02();
                }
                return A01();
            } else if (i2 != 28) {
                return A00();
            } else {
                if (!AnonymousClass0DO.A00(context)) {
                    return 12;
                }
                boolean A012 = C03840Kv.A01(context);
                int A002 = A00();
                if (!A012) {
                    return A002;
                }
                if (A002 == 0) {
                    return 0;
                }
                return -1;
            }
        }
    }

    public AnonymousClass0PO(C16570se r4) {
        BiometricManager biometricManager;
        this.A00 = r4;
        A7q a7q = null;
        if (Build.VERSION.SDK_INT >= 29) {
            biometricManager = r4.BNO();
        } else {
            biometricManager = null;
        }
        this.A01 = biometricManager;
        this.A02 = Build.VERSION.SDK_INT <= 29 ? r4.BRi() : a7q;
    }
}
