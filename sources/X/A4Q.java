package X;

import com.whatsapp.util.Log;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

public final class A4Q {
    public byte[] A00;
    public byte[] A01;

    public static final byte[] A01(PublicKey publicKey, SecretKey secretKey) {
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        instance.init(1, publicKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        byte[] doFinal = instance.doFinal(secretKey.getEncoded());
        C18070vi.A0X(doFinal);
        return doFinal;
    }

    public final String A02(byte[] bArr) {
        try {
            byte[] bArr2 = this.A00;
            if (bArr2 != null) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, 0, bArr2.length, "AES");
                byte[] bArr3 = this.A01;
                if (bArr3 != null) {
                    byte[] A1Q = AnonymousClass8BS.A1Q(secretKeySpec, AnonymousClass8BR.A19(bArr3), AnonymousClass8BR.A18(), bArr, 2);
                    C18070vi.A0b(A1Q);
                    String A13 = C108955ca.A13(A1Q);
                    this.A00 = null;
                    this.A01 = null;
                    return A13;
                }
            }
        } catch (GeneralSecurityException e) {
            Log.e(e.getMessage());
        }
        return null;
    }

    public static final C185469cd A00(String str) {
        SecretKey A0q = AnonymousClass8BX.A0q();
        IvParameterSpec A19 = AnonymousClass8BR.A19(AnonymousClass8BV.A1a(16));
        byte[] A1O = C108975cc.A1O(str);
        C18070vi.A0b(A0q);
        Cipher A18 = AnonymousClass8BR.A18();
        A18.init(1, A0q, A19);
        byte[] iv = A18.getIV();
        byte[] doFinal = A18.doFinal(A1O);
        C18070vi.A0b(doFinal);
        C18070vi.A0b(iv);
        return new C185469cd(A0q, doFinal, iv);
    }
}
