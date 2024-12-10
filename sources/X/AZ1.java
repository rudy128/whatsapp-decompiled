package X;

import java.security.PublicKey;
import javax.crypto.Cipher;

public class AZ1 implements C22457B8p {
    public final byte[] A00;

    public byte[] BK6(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A00;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length >= length2) {
            try {
                PublicKey A0h = AnonymousClass8BX.A0h(bArr3);
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, A0h);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                throw AnonymousClass8BR.A0x(e);
            }
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PAY: RsaKey encrypt: payload length is ");
            A10.append(length2);
            A10.append(" bytes while key can encrypt at most ");
            A10.append(length);
            throw AnonymousClass8BR.A0v(AnonymousClass1QE.A01("RsaKey", AnonymousClass000.A0y(" bytes", A10)));
        }
    }

    public AZ1(byte[] bArr) {
        this.A00 = bArr;
    }
}
