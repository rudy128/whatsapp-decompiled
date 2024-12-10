package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

/* renamed from: X.A5i  reason: case insensitive filesystem */
public abstract class C20059A5i {
    public static String A00() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder A10 = AnonymousClass000.A10();
        int i = 0;
        do {
            A10.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}".charAt(secureRandom.nextInt(76)));
            i++;
        } while (i < 50);
        return A10.toString();
    }

    public static KeyPair A02() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
        instance.initialize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        return instance.generateKeyPair();
    }

    public static PublicKey A03(String str) {
        if (str.startsWith("-----BEGIN PUBLIC KEY-----\n") && str.endsWith("\n-----END PUBLIC KEY-----\n")) {
            return AnonymousClass8BX.A0h(AnonymousClass8BT.A1a(str.substring(26, str.length() - 26)));
        }
        throw new InvalidKeySpecException("malformed string");
    }

    public static String A01(PublicKey publicKey) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("-----BEGIN PUBLIC KEY-----\n");
        A10.append(C108955ca.A14(publicKey.getEncoded()));
        return AnonymousClass000.A0y("\n-----END PUBLIC KEY-----\n", A10);
    }
}
