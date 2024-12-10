package X;

/* renamed from: X.AmL  reason: case insensitive filesystem */
public class C21571AmL implements C72333Ln {
    public final C21344AiX A00;
    public final byte[] A01;
    public final byte[][] A02;

    public int getType() {
        throw AnonymousClass04E.createAndThrow();
    }

    public C21571AmL(C21344AiX aiX, byte[][] bArr, int i, int i2) {
        byte[] bArr2 = {51};
        C23624Bmt A08 = AnonymousClass8BS.A08(C165358b0.DEFAULT_INSTANCE);
        C165358b0 r1 = (C165358b0) A08.A00;
        r1.bitField0_ |= 1;
        r1.id_ = i;
        C165358b0 r12 = (C165358b0) C17880vN.A0G(A08);
        r12.bitField0_ |= 2;
        r12.iteration_ = i2;
        C23581BmB A0A = AnonymousClass8BU.A0A(A08, aiX.A00(), 0);
        C165358b0 r13 = (C165358b0) A08.A00;
        r13.bitField0_ |= 4;
        r13.signingKey_ = A0A;
        for (byte[] A0A2 : bArr) {
            C23581BmB A0A3 = AnonymousClass8BU.A0A(A08, A0A2, 0);
            C165358b0 r2 = (C165358b0) A08.A00;
            EE9 ee9 = r2.chainKeys_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r2.chainKeys_ = ee9;
            }
            ee9.add(A0A3);
        }
        byte[] A1Z = AnonymousClass8BT.A1Z(A08);
        this.A02 = bArr;
        this.A00 = aiX;
        this.A01 = C20011A3b.A00(bArr2, A1Z);
    }

    public byte[] CHg() {
        return this.A01;
    }
}
