package X;

import android.os.Build;
import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class A1R {
    public static final A1R A00 = new Object();

    public C189439jF A00(Integer num, byte[] bArr, byte[] bArr2) {
        String str;
        C18070vi.A0d(bArr, 1);
        try {
            if (num.intValue() != 0) {
                str = "HmacSHA512";
            } else {
                str = DefaultCrypto.HMAC_SHA256;
            }
            byte[] doFinal = AnonymousClass8BX.A0p(str, bArr2).doFinal(bArr);
            C18070vi.A0X(doFinal);
            return new C189439jF(doFinal);
        } catch (Exception e) {
            if (e instanceof NoSuchAlgorithmException) {
                throw new AnonymousClass9LX((String) null, e);
            } else if (e instanceof InvalidKeyException) {
                throw new AnonymousClass9LX((String) null, e);
            } else {
                throw e;
            }
        }
    }

    public C189439jF A01(Integer num, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec A19 = AnonymousClass8BR.A19(bArr);
            SecretKeySpec A0v = AnonymousClass8BS.A0v(bArr3);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            int i = 1;
            if (num.intValue() != 0) {
                i = 2;
            }
            byte[] A1Q = AnonymousClass8BS.A1Q(A0v, A19, instance, bArr2, i);
            C18070vi.A0X(A1Q);
            return new C189439jF(A1Q);
        } catch (Exception e) {
            if (e instanceof NoSuchAlgorithmException) {
                throw new AnonymousClass9LX((String) null, e);
            } else if (e instanceof NoSuchPaddingException) {
                throw new AnonymousClass9LX((String) null, e);
            } else if (e instanceof InvalidKeyException) {
                throw new AnonymousClass9LX((String) null, e);
            } else if (e instanceof InvalidAlgorithmParameterException) {
                throw new AnonymousClass9LX((String) null, e);
            } else if (e instanceof IllegalBlockSizeException) {
                throw new AnonymousClass9LX((String) null, e);
            } else if (e instanceof BadPaddingException) {
                throw new AnonymousClass9LX((String) null, e);
            } else {
                throw e;
            }
        }
    }

    public byte[] A02(int i) {
        SecureRandom secureRandom;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                secureRandom = SecureRandom.getInstanceStrong();
            } catch (NoSuchAlgorithmException unused) {
                secureRandom = new SecureRandom();
            }
        } else {
            secureRandom = new SecureRandom();
        }
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
