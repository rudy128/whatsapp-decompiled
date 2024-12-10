package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.MessageDigest;
import javax.crypto.Cipher;

/* renamed from: X.9x9  reason: invalid class name and case insensitive filesystem */
public class C197719x9 {
    public Cipher A00 = Cipher.getInstance("AES/CBC/PKCS5Padding");

    public static byte[] A00(String str, String str2) {
        byte[] A01 = C196979vx.A01(str2.getBytes());
        MessageDigest A1I = C108945cZ.A1I();
        A1I.update(A01);
        return A1I.digest(str.getBytes(DefaultCrypto.UTF_8));
    }
}
