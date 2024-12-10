package X;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.A4q  reason: case insensitive filesystem */
public class C20047A4q {
    public final AnonymousClass1HY A00;

    private synchronized byte[] A00(C60012nF r8) {
        String A0r;
        AnonymousClass1HY r4 = this.A00;
        String str = r8.A01;
        A0r = C17880vN.A0r(AnonymousClass1HY.A00(r4), AnonymousClass1HY.A01(str, "auth/encryption_key"));
        if (A0r == null) {
            try {
                Set set = A62.A00;
                KeyGenerator instance = KeyGenerator.getInstance("AES");
                KeyGenerator keyGenerator = (KeyGenerator) A62.A00(instance, "AES", instance.getProvider().getName());
                SecureRandom A01 = A62.A01();
                byte[] encoded = keyGenerator.generateKey().getEncoded();
                keyGenerator.init(256, A01);
                A0r = AnonymousClass8BT.A0x(encoded);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                A0r = null;
            }
            C17880vN.A1E(AnonymousClass1HY.A00(r4).edit(), AnonymousClass1HY.A01(str, "auth/encryption_key"), A0r);
        }
        return Base64.decode(A0r, 11);
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2) {
        boolean z = true;
        byte[] A0M = C17970vW.A0M(bArr, bArr2);
        if (A0M.length < 20) {
            z = false;
        }
        C17960vV.A0C(z);
        return A8G.A04(A0M, 20);
    }

    public String A02(C60012nF r9, String str) {
        if (r9.A03) {
            byte[] decode = Base64.decode(str, 11);
            try {
                byte[][] A07 = A8G.A07(decode, 20, 16, (decode.length - 20) - 16);
                byte[] bArr = A07[0];
                byte[] bArr2 = A07[1];
                byte[] bArr3 = A07[2];
                byte[] A002 = A00(r9);
                if (Arrays.equals(bArr, A01(A002, A8G.A05(bArr2, bArr3)))) {
                    try {
                        return new String(AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(A002), AnonymousClass8BR.A19(bArr2), A62.A02("AES/CBC/PKCS5Padding"), bArr3, 2));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                        throw new SecurityException(e);
                    }
                } else {
                    throw new SecurityException("Data mac corrupt");
                }
            } catch (ParseException e2) {
                throw new SecurityException(e2);
            }
        } else {
            throw new SecurityException("Caller isn't trusted");
        }
    }

    public String A03(C60012nF r9, String str) {
        if (r9.A03) {
            byte[] A002 = A00(r9);
            byte[] A01 = A01(A002, str.getBytes());
            C17960vV.A0C(C108975cc.A1C(A01.length, 16));
            byte[] A04 = A8G.A04(A01, 16);
            byte[] bytes = str.getBytes();
            try {
                byte[] A05 = A8G.A05(A04, AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(A002), AnonymousClass8BR.A19(A04), A62.A02("AES/CBC/PKCS5Padding"), bytes, 1));
                return AnonymousClass8BT.A0x(A8G.A05(A01(A002, A05), A05));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                throw new SecurityException(e);
            }
        } else {
            throw new SecurityException("Caller isn't trusted");
        }
    }

    public C20047A4q(AnonymousClass1HY r1) {
        this.A00 = r1;
    }
}
