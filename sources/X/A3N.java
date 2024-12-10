package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

public abstract class A3N {
    public static C185849dF A00(byte[] bArr) {
        int length = bArr.length;
        if (length == 80) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 16, bArr3, 0, 32);
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 48, bArr4, 0, 32);
            return new C185849dF(bArr3, bArr4, bArr2);
        }
        throw AnonymousClass8BR.A0v(AnonymousClass001.A1I("Invalid length of derived secret; length=", AnonymousClass000.A10(), length));
    }

    public static Cipher A01(byte[] bArr, byte[] bArr2, int i) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, AnonymousClass8BS.A0v(bArr2), AnonymousClass8BR.A19(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public static Mac A02(byte[] bArr, byte[] bArr2) {
        try {
            Mac A0p = AnonymousClass8BX.A0p(DefaultCrypto.HMAC_SHA256, bArr2);
            A0p.update(bArr);
            return A0p;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
