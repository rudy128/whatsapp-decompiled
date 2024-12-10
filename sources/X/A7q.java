package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;

@Deprecated
public class A7q {
    public final Context A00;

    public static AnonymousClass8CL A02(C195869u2 r1) {
        return new AnonymousClass8CL(r1);
    }

    public static A7q A04(Context context) {
        return new A7q(context);
    }

    public boolean A06() {
        FingerprintManager A01;
        if (Build.VERSION.SDK_INT < 23 || (A01 = A01(this.A00)) == null || !C20115A7y.A05(A01)) {
            return false;
        }
        return true;
    }

    public boolean A07() {
        FingerprintManager A01;
        if (Build.VERSION.SDK_INT < 23 || (A01 = A01(this.A00)) == null || !C20115A7y.A06(A01)) {
            return false;
        }
        return true;
    }

    public A7q(Context context) {
        this.A00 = context;
    }

    public static FingerprintManager.CryptoObject A00(A52 a52) {
        return C20115A7y.A00(a52);
    }

    public static FingerprintManager A01(Context context) {
        return C20115A7y.A02(context);
    }

    public static A52 A03(FingerprintManager.CryptoObject cryptoObject) {
        return C20115A7y.A03(cryptoObject);
    }

    @Deprecated
    public void A05(C195869u2 r5, A52 a52, C42621yT r7) {
        FingerprintManager A01;
        CancellationSignal cancellationSignal = (CancellationSignal) r7.A00();
        if (Build.VERSION.SDK_INT >= 23 && (A01 = A01(this.A00)) != null) {
            C20115A7y.A04(cancellationSignal, A01, A00(a52), A02(r5));
        }
    }
}
