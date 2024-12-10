package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.A7y  reason: case insensitive filesystem */
public abstract class C20115A7y {
    public static FingerprintManager.CryptoObject A00(A52 a52) {
        if (a52 == null) {
            return null;
        }
        Cipher cipher = a52.A01;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        Signature signature = a52.A00;
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        Mac mac = a52.A02;
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }

    public static void A04(CancellationSignal cancellationSignal, Object obj, Object obj2, Object obj3) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, (FingerprintManager.AuthenticationCallback) obj3, (Handler) null);
    }

    public static FingerprintManager.CryptoObject A01(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager A02(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23 || (i > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static A52 A03(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new A52(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new A52(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new A52(cryptoObject.getMac());
        }
        return null;
    }

    public static boolean A05(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean A06(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }
}
