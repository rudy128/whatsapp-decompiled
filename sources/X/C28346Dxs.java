package X;

import java.util.Arrays;

/* renamed from: X.Dxs  reason: case insensitive filesystem */
public class C28346Dxs extends AnonymousClass1Bz implements E74 {
    public final char[] A00;

    public int A0D() {
        int length = this.A00.length * 2;
        return C26084Cs1.A00(length) + 1 + length;
    }

    public boolean A0H() {
        return false;
    }

    public String BZl() {
        return new String(this.A00);
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        char[] cArr = this.A00;
        int length = cArr.length;
        if (z) {
            C26039Cr0.A01(cr0, 30);
        }
        cr0.A03(length * 2);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> 8);
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> 8);
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> 8);
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> 8);
            bArr[7] = (byte) c4;
            cr0.A00.write(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                i3 = BE6.A0A(c5 >> 8, bArr, i3, i4);
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            cr0.A00.write(bArr, 0, i3);
        }
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28346Dxs)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28346Dxs) r3).A00);
    }

    public int hashCode() {
        char[] cArr = this.A00;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public String toString() {
        return new String(this.A00);
    }

    public C28346Dxs(char[] cArr) {
        this.A00 = cArr;
    }
}
