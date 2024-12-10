package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

public class AZ0 implements C22457B8p {
    public final byte[] A00;

    public AZ0(byte[] bArr) {
        this.A00 = bArr;
    }

    public byte[] BK6(byte[] bArr, byte[] bArr2) {
        C21523AlW A002 = C21523AlW.A00();
        byte[] bArr3 = A002.A02.A01;
        C21521AlU alU = new C21521AlU(this.A00);
        C21520AlT alT = A002.A01;
        C18070vi.A0W(alT);
        byte[][] A03 = C20058A5h.A03(C181939Sk.A00(alT, alU), bArr3);
        byte[] bArr4 = A03[0];
        byte[] bArr5 = A03[1];
        try {
            byte[] A1Q = AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(bArr4), AnonymousClass8BR.A19(bArr2), Cipher.getInstance("AES/CBC/PKCS5Padding"), bArr, 1);
            try {
                Mac A0p = AnonymousClass8BX.A0p(DefaultCrypto.HMAC_SHA256, bArr5);
                A0p.update(bArr2);
                byte[] doFinal = A0p.doFinal(A1Q);
                byte[][] bArr6 = new byte[4][];
                bArr6[0] = bArr2;
                bArr6[1] = bArr3;
                AnonymousClass001.A1R(doFinal, A1Q, bArr6);
                byte[] A05 = A8G.A05(bArr6);
                A002.destroy();
                return A05;
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw AnonymousClass8BR.A0v(e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            throw AnonymousClass8BR.A0v(e2);
        }
    }
}
