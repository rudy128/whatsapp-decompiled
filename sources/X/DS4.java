package X;

import java.util.Arrays;

public final class DS4 implements Cloneable {
    public int A00 = 0;
    public int[] A01 = BE6.A1X();

    public static void A00(DS4 ds4, int i) {
        int[] iArr = ds4.A01;
        int length = iArr.length;
        if (i > (length << 5)) {
            int[] iArr2 = new int[((i + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            ds4.A01 = iArr2;
        }
    }

    public void A01(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw AnonymousClass000.A0k("Num bits must be between 0 and 32");
        }
        A00(this, this.A00 + i2);
        while (i2 > 0) {
            i2--;
            A02(BE9.A1Q(i >> i2));
        }
    }

    public void A02(boolean z) {
        A00(this, this.A00 + 1);
        if (z) {
            int[] iArr = this.A01;
            int i = this.A00;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.A00++;
    }

    public boolean A03(int i) {
        if (((1 << (i & 31)) & this.A01[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.DS4, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object clone() {
        int i = this.A00;
        ? obj = new Object();
        obj.A01 = (int[]) this.A01.clone();
        obj.A00 = i;
        return obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DS4) {
            DS4 ds4 = (DS4) obj;
            if (this.A00 != ds4.A00 || !Arrays.equals(this.A01, ds4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        int i = this.A00;
        StringBuilder A0t = BE6.A0t((i / 8) + i + 1);
        for (int i2 = 0; i2 < i; i2++) {
            if ((i2 & 7) == 0) {
                A0t.append(' ');
            }
            char c = '.';
            if (A03(i2)) {
                c = 'X';
            }
            A0t.append(c);
        }
        return A0t.toString();
    }
}
