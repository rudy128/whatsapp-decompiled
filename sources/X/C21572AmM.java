package X;

/* renamed from: X.AmM  reason: case insensitive filesystem */
public class C21572AmM implements C72333Ln {
    public final int A00;
    public final int A01;
    public final C21344AiX A02;
    public final byte[] A03;
    public final byte[] A04;

    public int getType() {
        throw AnonymousClass04E.createAndThrow();
    }

    public C21572AmM(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A012 = C20011A3b.A01(bArr, 1, bArr.length - 1);
            byte b = A012[0][0];
            byte[] bArr2 = A012[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                th = new AnonymousClass1P4(AnonymousClass001.A1I("Legacy message: ", AnonymousClass000.A10(), i));
            } else if (i <= 3) {
                C165368b1 r2 = (C165368b1) C23577Bm6.A07(C165368b1.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0 || (i2 & 8) == 0) {
                    th = new AnonymousClass1P5("Incomplete message.");
                } else {
                    this.A04 = bArr;
                    this.A00 = r2.id_;
                    this.A01 = r2.iteration_;
                    this.A03 = r2.chainKey_.A06();
                    this.A02 = C20065A5o.A00(r2.signingKey_);
                    return;
                }
            } else {
                th = new AnonymousClass1P5(AnonymousClass001.A1I("Unknown version: ", AnonymousClass000.A10(), i));
            }
            throw th;
        } catch (AnonymousClass1P8 | AnonymousClass1PN e) {
            throw new AnonymousClass1P5(e);
        }
    }

    public byte[] CHg() {
        return this.A04;
    }

    public C21572AmM(C21344AiX aiX, byte[] bArr, int i, int i2) {
        C23624Bmt A08 = AnonymousClass8BS.A08(C165368b1.DEFAULT_INSTANCE);
        C165368b1 r1 = (C165368b1) A08.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        C165368b1 r12 = (C165368b1) C17880vN.A0G(A08);
        r12.bitField0_ |= 2;
        r12.iteration_ = i2;
        C23581BmB A0A = AnonymousClass8BU.A0A(A08, bArr, 0);
        C165368b1 r13 = (C165368b1) A08.A00;
        r13.bitField0_ |= 4;
        r13.chainKey_ = A0A;
        C23581BmB A0A2 = AnonymousClass8BU.A0A(A08, aiX.A00(), 0);
        C165368b1 r14 = (C165368b1) A08.A00;
        r14.bitField0_ |= 8;
        r14.signingKey_ = A0A2;
        byte[] A1Z = AnonymousClass8BT.A1Z(A08);
        this.A00 = i;
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = aiX;
        this.A04 = C20011A3b.A00(new byte[]{51}, A1Z);
    }
}
