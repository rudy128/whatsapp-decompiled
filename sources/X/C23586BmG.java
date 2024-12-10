package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.BmG  reason: case insensitive filesystem */
public class C23586BmG extends CodedOutputStream {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public C23586BmG(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A02 = bArr;
            this.A00 = 0;
            this.A01 = i;
            return;
        }
        Object[] A1a = AnonymousClass8BR.A1a();
        C17880vN.A1T(A1a, length, 0);
        C17880vN.A1T(A1a, 0, 1);
        BE8.A1M(A1a, i);
        throw BE8.A0X("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1a);
    }

    public final void A0M(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A02, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.A00);
            AnonymousClass000.A1M(A1a, this.A01);
            BE8.A1M(A1a, i2);
            throw new C24212BxP(String.format("Pos: %d, limit: %d, len: %d", A1a), e);
        }
    }
}
