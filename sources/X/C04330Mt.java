package X;

import java.util.Arrays;

/* renamed from: X.0Mt  reason: invalid class name and case insensitive filesystem */
public final class C04330Mt {
    public int A00;
    public int[] A01 = new int[10];

    public static int A00(C04330Mt r2) {
        int[] iArr = r2.A01;
        int i = r2.A00 - 1;
        r2.A00 = i;
        return iArr[i];
    }

    public final void A01(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 >= length) {
            iArr = Arrays.copyOf(iArr, length * 2);
            C18070vi.A0X(iArr);
            this.A01 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }
}
