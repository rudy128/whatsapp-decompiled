package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.04X  reason: invalid class name */
public class AnonymousClass04X extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ C02160Cy A00;

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public AnonymousClass04X(C02160Cy r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A00();
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        AnonymousClass0PP r3;
        IdentityCredential A01;
        if (authenticationResult != null) {
            BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            r3 = null;
            if (cryptoObject != null) {
                Cipher cipher = cryptoObject.getCipher();
                if (cipher != null) {
                    r3 = new AnonymousClass0PP(cipher);
                } else {
                    Signature signature = cryptoObject.getSignature();
                    if (signature != null) {
                        r3 = new AnonymousClass0PP(signature);
                    } else {
                        Mac mac = cryptoObject.getMac();
                        if (mac != null) {
                            r3 = new AnonymousClass0PP(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && (A01 = C03810Ks.A01(cryptoObject)) != null) {
                            r3 = new AnonymousClass0PP(A01);
                        }
                    }
                }
            }
        } else {
            r3 = null;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = AnonymousClass0DI.A00(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.A00.A02(new AnonymousClass0HL(r3, i2));
    }
}
