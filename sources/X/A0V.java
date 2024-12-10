package X;

import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class A0V {
    public String A02(C129006h6 r7, PrivateKey privateKey) {
        byte[] bArr = r7.A01;
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPPadding");
        instance.init(2, privateKey);
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr2 = r7.A00;
        byte[] bArr3 = r7.A03;
        int length = bArr2.length;
        int length2 = bArr3.length;
        byte[] copyOf = Arrays.copyOf(bArr2, length + length2);
        System.arraycopy(bArr3, 0, copyOf, length, length2);
        SecretKeySpec A0v = AnonymousClass8BS.A0v(doFinal);
        Cipher A18 = AnonymousClass8BR.A18();
        AnonymousClass8BW.A1O(A0v, A18, r7.A02);
        return new String(A18.doFinal(copyOf), C19620yd.A0A);
    }

    public static String A00(Integer num, String str, String str2, PublicKey publicKey) {
        SecretKey A0r = AnonymousClass8BX.A0r();
        IvParameterSpec A19 = AnonymousClass8BR.A19(AnonymousClass8BV.A1a(12));
        byte[] bytes = str.getBytes();
        Cipher A18 = AnonymousClass8BR.A18();
        A18.init(1, A0r, A19);
        if (str2 != null && !str2.isEmpty()) {
            A18.updateAAD(str2.getBytes());
        }
        byte[] iv = A18.getIV();
        byte[] doFinal = A18.doFinal(bytes);
        int length = doFinal.length;
        int i = length - 16;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, i, length);
        byte byteValue = num.byteValue();
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, publicKey);
        byte[] doFinal2 = instance.doFinal(A0r.getEncoded());
        short length2 = (short) doFinal2.length;
        byte[] bArr = {(byte) (length2 & 255), (byte) ((length2 >> 8) & 255)};
        ByteArrayOutputStream A15 = C108945cZ.A15();
        A15.write(1);
        A15.write(byteValue);
        A15.write(iv);
        A15.write(bArr);
        A15.write(doFinal2);
        A15.write(copyOfRange2);
        A15.write(copyOfRange);
        byte[] byteArray = A15.toByteArray();
        A15.close();
        return AnonymousClass8BT.A0x(byteArray);
    }

    public C129006h6 A01(String str, X509Certificate x509Certificate) {
        SecretKey A0r = AnonymousClass8BX.A0r();
        IvParameterSpec A19 = AnonymousClass8BR.A19(AnonymousClass8BV.A1a(12));
        byte[] bytes = str.getBytes();
        Cipher A18 = AnonymousClass8BR.A18();
        A18.init(1, A0r, A19);
        byte[] iv = A18.getIV();
        byte[] doFinal = A18.doFinal(bytes);
        int length = doFinal.length;
        int i = length - 16;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, i, length);
        PublicKey publicKey = x509Certificate.getPublicKey();
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPPadding");
        instance.init(1, publicKey);
        return new C129006h6(instance.doFinal(A0r.getEncoded()), copyOfRange, copyOfRange2, iv);
    }
}
