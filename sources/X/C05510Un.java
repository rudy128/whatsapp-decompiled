package X;

/* renamed from: X.0Un  reason: invalid class name and case insensitive filesystem */
public class C05510Un implements C16120rk {
    public final int A00;

    public C05510Un(int i) {
        this.A00 = i;
    }

    public void BCc(C24246By4 by4, int[] iArr, int[] iArr2, int i) {
        int i2 = this.A00;
        C24246By4 by42 = C24246By4.Ltr;
        if (i2 != 0) {
            if (by4 == by42) {
                int i3 = 0;
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = iArr[i3];
                    iArr2[i4] = i5;
                    i5 += i6;
                    i3++;
                    i4++;
                }
                return;
            }
            int i7 = 0;
            for (int i8 : iArr) {
                i7 += i8;
            }
            int i9 = i - i7;
            for (int i10 = r3 - 1; -1 < i10; i10--) {
                int i11 = iArr[i10];
                iArr2[i10] = i9;
                i9 += i11;
            }
        } else if (by4 == by42) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 : iArr) {
                i13 += i14;
            }
            int i15 = i - i13;
            int i16 = 0;
            while (i12 < r4) {
                int i17 = iArr[i12];
                iArr2[i16] = i15;
                i15 += i17;
                i12++;
                i16++;
            }
        } else {
            int i18 = 0;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (-1 < length2) {
                    int i19 = iArr[length2];
                    iArr2[length2] = i18;
                    i18 += i19;
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        if (this.A00 != 0) {
            return "Arrangement#Start";
        }
        return "Arrangement#End";
    }
}
