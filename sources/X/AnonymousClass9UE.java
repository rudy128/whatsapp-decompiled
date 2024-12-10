package X;

import android.util.Base64;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9UE  reason: invalid class name */
public abstract class AnonymousClass9UE {
    public static Key A00;
    public static Cipher A01 = Cipher.getInstance("AES/CBC/PKCS5Padding");
    public static byte[] A02;
    public static byte[] A03 = new byte[16];
    public static byte[] A04;

    static {
        try {
            byte[] decode = Base64.decode(C197569wu.A0B, 0);
            A04 = decode;
            A00 = new SecretKeySpec(decode, 0, decode.length, "AES");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            e.printStackTrace();
            throw AnonymousClass8BR.A0x(e);
        }
    }
}
