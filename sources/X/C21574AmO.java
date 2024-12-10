package X;

import java.text.ParseException;

/* renamed from: X.AmO  reason: case insensitive filesystem */
public class C21574AmO implements C72333Ln {
    public final int A00;
    public final int A01;
    public final byte[] A02;
    public final byte[] A03;

    public int getType() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void A00(C21344AiX aiX) {
        try {
            byte[] bArr = this.A03;
            byte[][] A012 = C20011A3b.A01(bArr, bArr.length - 64, 64);
            if (!C19945A0c.A00().A01(aiX.A00, A012[0], A012[1])) {
                throw new AnonymousClass1P5("Invalid signature!");
            }
        } catch (AnonymousClass1P8 e) {
            throw new AnonymousClass1P5((Throwable) e);
        }
    }

    public C21574AmO(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A022 = C20011A3b.A02(bArr, 1, (bArr.length - 1) - 64, 64);
            byte b = A022[0][0];
            byte[] bArr2 = A022[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                th = new AnonymousClass1P4(AnonymousClass001.A1I("Legacy message: ", AnonymousClass000.A10(), i));
            } else if (i <= 3) {
                C165108ab r2 = (C165108ab) C23577Bm6.A07(C165108ab.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0) {
                    th = new AnonymousClass1P5("Incomplete message.");
                } else {
                    this.A03 = bArr;
                    this.A01 = r2.id_;
                    this.A00 = r2.iteration_;
                    this.A02 = r2.ciphertext_.A06();
                    return;
                }
            } else {
                th = new AnonymousClass1P5(AnonymousClass001.A1I("Unknown version: ", AnonymousClass000.A10(), i));
            }
            throw th;
        } catch (AnonymousClass1PN | ParseException e) {
            throw new AnonymousClass1P5(e);
        }
    }

    public byte[] CHg() {
        return this.A03;
    }

    public C21574AmO(AnonymousClass9ZN r12, byte[] bArr, int i, int i2) {
        byte[] bArr2 = {51};
        C23624Bmt A08 = AnonymousClass8BS.A08(C165108ab.DEFAULT_INSTANCE);
        C165108ab r1 = (C165108ab) A08.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        C165108ab r13 = (C165108ab) C17880vN.A0G(A08);
        r13.bitField0_ |= 2;
        r13.iteration_ = i2;
        C23581BmB A0A = AnonymousClass8BU.A0A(A08, bArr, 0);
        C165108ab r14 = (C165108ab) A08.A00;
        r14.bitField0_ |= 4;
        r14.ciphertext_ = A0A;
        byte[] A1Z = AnonymousClass8BT.A1Z(A08);
        byte[] A002 = C20011A3b.A00(bArr2, A1Z);
        try {
            C19945A0c A003 = C19945A0c.A00();
            byte[] bArr3 = r12.A00;
            if (bArr3 == null || bArr3.length != 32) {
                throw AnonymousClass000.A0k("Invalid private key length!");
            }
            C22562BCv bCv = A003.A00;
            this.A03 = C20011A3b.A00(bArr2, A1Z, bCv.calculateSignature(bCv.BXp(), bArr3, A002));
            this.A01 = i;
            this.A00 = i2;
            this.A02 = bArr;
        } catch (AnonymousClass1P8 e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
