package X;

/* renamed from: X.24j  reason: invalid class name and case insensitive filesystem */
public abstract class C446824j {
    public static final int[] A00 = {14, 0, 1, 2, 20, 21, 3, 4, 15, 5, 11, 12, 13, 8, 18, 17, 16, 9, 10, 7, 6};

    public static int A00(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int[] iArr = A00;
            if (i3 < 21) {
                int i6 = iArr[i3];
                if (i6 == i) {
                    i4 = i3;
                }
                if (i6 == i2) {
                    i5 = i3;
                }
                if (i4 != -1 && i5 != -1) {
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        return 0;
    }

    public static boolean A01(int i) {
        return i == 15 || i == 5 || i == 13 || i == 17 || i == 18 || i == 8;
    }

    public static boolean A02(int i, int i2) {
        if (A00(i, i2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean A03(int i, int i2) {
        if (A00(i, i2) < 0) {
            return true;
        }
        return false;
    }
}
