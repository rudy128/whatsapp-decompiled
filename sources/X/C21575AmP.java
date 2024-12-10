package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AmP  reason: case insensitive filesystem */
public class C21575AmP implements C72333Ln {
    public final int A00;
    public final int A01;
    public final C21344AiX A02;
    public final byte[] A03;
    public final byte[] A04;

    public int getType() {
        return 2;
    }

    public static byte[] A00(SecretKeySpec secretKeySpec, C62202r0 r3, C62202r0 r4, byte[] bArr, int i) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(secretKeySpec);
            if (i >= 3) {
                instance.update(r3.A00.A00());
                instance.update(r4.A00.A00());
            }
            byte[] doFinal = instance.doFinal(bArr);
            byte[] bArr2 = new byte[8];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            return bArr2;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public C21575AmP(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A022 = C20011A3b.A02(bArr, 1, (bArr.length - 1) - 8, 8);
            byte b = A022[0][0];
            byte[] bArr2 = A022[1];
            int i = (b & 255) >> 4;
            if (i <= 1) {
                th = new AnonymousClass1P4(AnonymousClass001.A1I("Legacy message: ", AnonymousClass000.A10(), i));
            } else if (i <= 3) {
                C165378b2 r2 = (C165378b2) C23577Bm6.A07(C165378b2.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 8) == 0 || (i2 & 2) == 0 || (i2 & 1) == 0) {
                    th = new AnonymousClass1P5("Incomplete message.");
                } else {
                    this.A04 = bArr;
                    this.A02 = C20065A5o.A00(r2.ratchetKey_);
                    this.A01 = (b & 255) >> 4;
                    this.A00 = r2.counter_;
                    this.A03 = r2.ciphertext_.A06();
                    return;
                }
            } else {
                th = new AnonymousClass1P5(AnonymousClass001.A1I("Unknown version: ", AnonymousClass000.A10(), i));
            }
            throw th;
        } catch (AnonymousClass1P8 | AnonymousClass1PN | ParseException e) {
            throw new AnonymousClass1P5(e);
        }
    }

    public byte[] CHg() {
        return this.A04;
    }

    public C21575AmP(SecretKeySpec secretKeySpec, C62202r0 r10, C62202r0 r11, C21344AiX aiX, byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = {(byte) (((i << 4) | 3) & 255)};
        C23624Bmt A0N = C165378b2.DEFAULT_INSTANCE.A0N();
        C23581BmB A0A = AnonymousClass8BU.A0A(A0N, aiX.A00(), 0);
        C165378b2 r1 = (C165378b2) A0N.A00;
        r1.bitField0_ |= 1;
        r1.ratchetKey_ = A0A;
        C165378b2 r12 = (C165378b2) C17880vN.A0G(A0N);
        r12.bitField0_ |= 2;
        r12.counter_ = i2;
        C165378b2 r13 = (C165378b2) C17880vN.A0G(A0N);
        r13.bitField0_ |= 4;
        r13.previousCounter_ = i3;
        C23581BmB A0A2 = AnonymousClass8BU.A0A(A0N, bArr, 0);
        C165378b2 r14 = (C165378b2) A0N.A00;
        r14.bitField0_ |= 8;
        r14.ciphertext_ = A0A2;
        byte[] A1Z = AnonymousClass8BT.A1Z(A0N);
        this.A04 = C20011A3b.A00(bArr2, A1Z, A00(secretKeySpec, r10, r11, C20011A3b.A00(bArr2, A1Z), i));
        this.A02 = aiX;
        this.A00 = i2;
        this.A03 = bArr;
        this.A01 = i;
    }
}
