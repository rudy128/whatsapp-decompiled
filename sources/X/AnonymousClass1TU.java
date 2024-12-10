package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1TU  reason: invalid class name */
public class AnonymousClass1TU implements AnonymousClass1TT {
    public final AnonymousClass00H A00;

    public byte[] BDu(C59062lh r4, String str, byte[] bArr, byte[] bArr2, long j) {
        C18070vi.A0d(bArr2, 4);
        byte[] A0A = C200310o.A0A(C200310o.A0A(bArr2, bArr), A00(j));
        byte[] bytes = str.getBytes(C26571Sq.A05);
        C18070vi.A0X(bytes);
        return A01(DefaultCrypto.HMAC_SHA256, C200310o.A0A(A0A, bytes), ((C56822i5) this.A00.get()).A00(r4.A00).A01);
    }

    public A6U BIA(C55322fa r12, C59062lh r13) {
        C18070vi.A0d(r13, 0);
        byte[] bArr = r12.A02;
        int length = bArr.length;
        if (length >= 48) {
            int i = length - 32;
            byte[] A09 = C200310o.A09(bArr, i, length);
            byte[][] bArr2 = {C200310o.A09(bArr, 0, 16), C200310o.A09(bArr, 16, i), A09};
            byte[] bArr3 = bArr2[0];
            byte[] bArr4 = bArr2[1];
            C55252fT A002 = ((C56822i5) this.A00.get()).A00(r13.A00);
            byte[] A0A = C200310o.A0A(bArr3, bArr4);
            C62382rJ r5 = r12.A00;
            byte[] bArr5 = r5.A01;
            C19999A2n a2n = r13.A01;
            byte[] bArr6 = A002.A04;
            byte[] A0A2 = C200310o.A0A(bArr5, a2n.A00);
            if (Arrays.equals(A09, C200310o.A09(A01("HmacSHA512", C200310o.A0A(C200310o.A0A(A0A2, A0A), A00((long) A0A2.length)), bArr6), 0, 32))) {
                A6U A02 = A6U.A07.A02(r5, r12.A01, A02(bArr3, bArr4, A002.A03, 2), r12.A04);
                byte[] bytes = A02.A04.getBytes(C26571Sq.A05);
                C18070vi.A0X(bytes);
                if (Arrays.equals(r12.A03, A01(DefaultCrypto.HMAC_SHA256, bytes, A002.A00))) {
                    return A02;
                }
                throw new AnonymousClass2DW("Index hash corrupt");
            }
            throw new AnonymousClass2DW("Data mac corrupt");
        }
        throw new ParseException("Cipher text too short", 0);
    }

    public C55322fa BK7(A6U a6u, C59062lh r11) {
        byte[] bArr;
        C18070vi.A0d(r11, 0);
        C55252fT A002 = ((C56822i5) this.A00.get()).A00(r11.A00);
        byte[] bytes = a6u.A04.getBytes(C26571Sq.A05);
        C18070vi.A0X(bytes);
        C166378cn r0 = a6u.A03;
        if (r0 != null) {
            bArr = r0.A0M();
        } else {
            bArr = new byte[0];
        }
        byte[] A0I = C17970vW.A0I(16);
        byte[] A0M = a6u.A00(C17970vW.A0I(Math.max(0, (-bytes.length) - bArr.length))).A0M();
        C18070vi.A0b(A0M);
        byte[] A0A = C200310o.A0A(A0I, A02(A0I, A0M, A002.A03, 1));
        C19999A2n a2n = r11.A01;
        C62382rJ r3 = a6u.A01;
        byte[] bArr2 = r3.A01;
        byte[] bArr3 = A002.A04;
        byte[] A0A2 = C200310o.A0A(bArr2, a2n.A00);
        return new C55322fa(r3, a2n, A01(DefaultCrypto.HMAC_SHA256, bytes, A002.A00), C200310o.A0A(A0A, C200310o.A09(A01("HmacSHA512", C200310o.A0A(C200310o.A0A(A0A2, A0A), A00((long) A0A2.length)), bArr3), 0, 32)));
    }

    public static final byte[] A00(long j) {
        return new byte[]{(byte) ((int) ((j >> 56) & 255)), (byte) ((int) ((j >> 48) & 255)), (byte) ((int) ((j >> 40) & 255)), (byte) ((int) ((j >> 32) & 255)), (byte) ((int) ((j >> 24) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) (j & 255))};
    }

    public static final byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, secretKeySpec, ivParameterSpec);
            byte[] doFinal = instance.doFinal(bArr2);
            C18070vi.A0b(doFinal);
            return doFinal;
        } catch (NoSuchAlgorithmException e) {
            throw new AnonymousClass2E3((Throwable) e);
        } catch (NoSuchPaddingException e2) {
            throw new AnonymousClass2E3((Throwable) e2);
        } catch (InvalidKeyException e3) {
            throw new AnonymousClass2E3((Throwable) e3);
        } catch (InvalidAlgorithmParameterException e4) {
            throw new AnonymousClass2E3((Throwable) e4);
        } catch (IllegalBlockSizeException e5) {
            throw new AnonymousClass2E3((Throwable) e5);
        } catch (BadPaddingException e6) {
            throw new AnonymousClass2E3((Throwable) e6);
        }
    }

    public AnonymousClass1TU(AnonymousClass00H r1) {
        this.A00 = r1;
    }

    public static final byte[] A01(String str, byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(bArr2, str));
            byte[] doFinal = instance.doFinal(bArr);
            C18070vi.A0b(doFinal);
            return doFinal;
        } catch (NoSuchAlgorithmException e) {
            throw new AnonymousClass2E3((Throwable) e);
        } catch (InvalidKeyException e2) {
            throw new AnonymousClass2E3((Throwable) e2);
        }
    }

    public byte[] BDz(C59062lh r4, String str, byte[] bArr, long j) {
        byte[] A0A = C200310o.A0A(bArr, A00(j));
        byte[] bytes = str.getBytes(C26571Sq.A05);
        C18070vi.A0X(bytes);
        return A01(DefaultCrypto.HMAC_SHA256, C200310o.A0A(A0A, bytes), ((C56822i5) this.A00.get()).A00(r4.A00).A02);
    }
}
