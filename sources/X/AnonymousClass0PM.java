package X;

/* renamed from: X.0PM  reason: invalid class name */
public final class AnonymousClass0PM {
    public int A00;
    public int A01;
    public int[] A02;
    public int[] A03 = new int[16];
    public int[] A04 = new int[16];

    public static final int A00(AnonymousClass0PM r5) {
        int[] iArr = r5.A02;
        int length = iArr.length;
        if (r5.A00 >= length) {
            int i = length * 2;
            int[] iArr2 = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr2[i2] = i3;
                i2 = i3;
            }
            C200310o.A04(0, 14, iArr, iArr2);
            r5.A02 = iArr2;
            iArr = iArr2;
        }
        int i4 = r5.A00;
        r5.A00 = iArr[i4];
        return i4;
    }

    public static final void A01(AnonymousClass0PM r6, int i) {
        int[] iArr = r6.A04;
        int length = iArr.length;
        if (i > length) {
            int i2 = length * 2;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            C200310o.A04(0, 14, iArr, iArr2);
            C200310o.A04(0, 14, r6.A03, iArr3);
            r6.A04 = iArr2;
            r6.A03 = iArr3;
        }
    }

    public static final void A02(AnonymousClass0PM r3, int i, int i2) {
        int[] iArr = r3.A04;
        int[] iArr2 = r3.A03;
        int[] iArr3 = r3.A02;
        AnonymousClass000.A1K(iArr, i, i2);
        AnonymousClass000.A1K(iArr2, i, i2);
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    public AnonymousClass0PM() {
        int i;
        int[] iArr = new int[16];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 16);
        this.A02 = iArr;
    }
}
