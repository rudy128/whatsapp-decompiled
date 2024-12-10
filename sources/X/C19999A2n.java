package X;

import java.util.Arrays;

/* renamed from: X.A2n  reason: case insensitive filesystem */
public final class C19999A2n {
    public final byte[] A00;

    public final int A00() {
        byte[] bArr = this.A00;
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public final AnonymousClass8XX A01() {
        C23624Bmt A0N = AnonymousClass8XX.DEFAULT_INSTANCE.A0N();
        C23581BmB A03 = C17900vP.A03(A0N, this.A00);
        AnonymousClass8XX r1 = (AnonymousClass8XX) A0N.A00;
        r1.bitField0_ |= 1;
        r1.keyId_ = A03;
        return (AnonymousClass8XX) A0N.A0C();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19999A2n)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C19999A2n) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C19999A2n(int i, int i2) {
        byte[] bArr = new byte[6];
        this.A00 = bArr;
        bArr[1] = (byte) i;
        bArr[0] = (byte) (i >> 8);
        bArr[5] = (byte) i2;
        bArr[4] = (byte) (i2 >> 8);
        bArr[3] = (byte) (i2 >> 16);
        bArr[2] = (byte) (i2 >> 24);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdKeyId{deviceId=");
        byte[] bArr = this.A00;
        A10.append((bArr[1] & 255) | ((bArr[0] & 255) << 8));
        A10.append(", epoch=");
        A10.append(A8G.A01(bArr, 2));
        return C17890vO.A0b(A10);
    }

    public C19999A2n(byte[] bArr) {
        this.A00 = bArr;
    }
}
