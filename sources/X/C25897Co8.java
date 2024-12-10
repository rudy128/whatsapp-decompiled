package X;

/* renamed from: X.Co8  reason: case insensitive filesystem */
public abstract class C25897Co8 {
    public static void A00(int[] iArr, int[] iArr2, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            if (i4 < Math.min(30, i)) {
                j |= BE7.A0C(iArr[i2]) << i4;
                i4 += 32;
                i2++;
            }
            iArr2[i3] = ((int) j) & 1073741823;
            j >>>= 30;
            i4 -= 30;
            i -= 30;
            i3++;
        }
    }

    public static void A01(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        int i2 = i;
        int i3 = iArr3[0];
        int i4 = iArr3[1];
        int i5 = iArr3[2];
        int i6 = iArr3[3];
        long j = (long) iArr[0];
        long j2 = (long) iArr2[0];
        long j3 = ((((long) i3) * j) + (((long) i4) * j2)) >> 30;
        long j4 = ((((long) i5) * j) + (((long) i6) * j2)) >> 30;
        for (int i7 = 1; i7 < i2; i7++) {
            long j5 = (long) iArr[i7];
            long j6 = (long) iArr2[i7];
            long j7 = j3 + (((long) i3) * j5) + (((long) i4) * j6);
            long j8 = j4 + (((long) i5) * j5) + (((long) i6) * j6);
            int i8 = i7 - 1;
            iArr[i8] = ((int) j7) & 1073741823;
            j3 = j7 >> 30;
            iArr2[i8] = 1073741823 & ((int) j8);
            j4 = j8 >> 30;
        }
        iArr[i - 1] = (int) j3;
        iArr2[i - 1] = (int) j4;
    }

    public static void A02(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2) {
        int i3 = iArr3[0];
        int i4 = iArr3[1];
        int i5 = iArr3[2];
        int i6 = iArr3[3];
        int i7 = i;
        int i8 = i - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i3 & i9) + (i4 & i10);
        int i12 = (i9 & i5) + (i10 & i6);
        int i13 = iArr4[0];
        long j = (long) iArr[0];
        long j2 = (long) iArr2[0];
        long j3 = (((long) i3) * j) + (((long) i4) * j2);
        long j4 = (((long) i5) * j) + (((long) i6) * j2);
        int i14 = i11 - (((((int) j3) * i2) + i11) & 1073741823);
        int i15 = i12 - (((((int) j4) * i2) + i12) & 1073741823);
        long j5 = (long) i13;
        long j6 = (j3 + (j5 * ((long) i14))) >> 30;
        long j7 = (j4 + (j5 * ((long) i15))) >> 30;
        for (int i16 = 1; i16 < i7; i16++) {
            int i17 = iArr4[i16];
            long j8 = (long) iArr[i16];
            long j9 = (long) iArr2[i16];
            long j10 = (long) i17;
            long j11 = j6 + (((long) i3) * j8) + (((long) i4) * j9) + (j10 * ((long) i14));
            long j12 = j7 + (((long) i5) * j8) + (((long) i6) * j9) + (j10 * ((long) i15));
            int i18 = i16 - 1;
            iArr[i18] = ((int) j11) & 1073741823;
            j6 = j11 >> 30;
            iArr2[i18] = ((int) j12) & 1073741823;
            j7 = j12 >> 30;
        }
        iArr[i8] = (int) j6;
        iArr2[i8] = (int) j7;
    }
}
