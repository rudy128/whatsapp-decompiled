package X;

import java.io.IOException;

/* renamed from: X.DyD  reason: case insensitive filesystem */
public abstract class C28367DyD extends AnonymousClass1Bz implements E74 {
    public static final char[] A02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final int A00;
    public final byte[] A01;

    public boolean A0I(AnonymousClass1Bz r9) {
        if (!(r9 instanceof C28367DyD)) {
            return false;
        }
        C28367DyD dyD = (C28367DyD) r9;
        int i = this.A00;
        if (i != dyD.A00) {
            return false;
        }
        byte[] bArr = this.A01;
        byte[] bArr2 = dyD.A01;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = length - 1;
        if (i2 < 0) {
            return true;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                return false;
            }
        }
        int i4 = 255 << i;
        return ((byte) (bArr[i2] & i4)) == ((byte) (bArr2[i2] & i4));
    }

    public byte[] A0K() {
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (length == 0) {
            return bArr;
        }
        byte[] A022 = AnonymousClass1C2.A02(bArr);
        int i = length - 1;
        A022[i] = (byte) (A022[i] & (255 << this.A00));
        return A022;
    }

    public String toString() {
        return BZl();
    }

    public AnonymousClass1Bz A0E() {
        return new C28367DyD(this.A01, this.A00);
    }

    public String BZl() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] A0B = A0B();
            for (int i = 0; i != A0B.length; i++) {
                char[] cArr = A02;
                stringBuffer.append(cArr[(A0B[i] >>> 4) & 15]);
                stringBuffer.append(cArr[A0B[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C24415C2o(C17900vP.A0C("Internal error encoding BitString: ", AnonymousClass000.A10(), e), e);
        }
    }

    public int hashCode() {
        byte[] bArr = this.A01;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b = bArr[length];
        int i = this.A00;
        byte b2 = (byte) (b & (255 << i));
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return ((i2 * 257) ^ b2) ^ i;
            }
            i2 = (i2 * 257) ^ bArr[length];
        }
    }

    public C28367DyD(byte[] bArr, int i) {
        if (bArr != null) {
            if (bArr.length == 0) {
                if (i != 0) {
                    throw AnonymousClass000.A0k("zero length data with non-zero pad bits");
                }
            } else if (i > 7 || i < 0) {
                throw AnonymousClass000.A0k("pad bits cannot be greater than 7 or less than 0");
            }
            this.A01 = AnonymousClass1C2.A02(bArr);
            this.A00 = i;
            return;
        }
        throw AnonymousClass000.A0s("'data' cannot be null");
    }
}
