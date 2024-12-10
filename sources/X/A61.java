package X;

public abstract class A61 {
    public static final int[] A00 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
    public static final int[] A01 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    public static boolean A00(String str) {
        int[] iArr;
        int i;
        String replaceAll = str.replaceAll("[^\\d]", "");
        int length = replaceAll.length();
        if (length == 11) {
            iArr = A01;
        } else {
            if (length == 14) {
                iArr = A00;
            }
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = length - 2;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            i3 += iArr[i4] * AnonymousClass8BU.A04(replaceAll, i2);
            i2 = i4;
        }
        int i5 = 11 - (i3 % 11);
        if (i5 > 9) {
            i5 = 0;
        }
        if (AnonymousClass8BU.A04(replaceAll, i) == i5) {
            int i6 = 0;
            for (int i7 = 0; i7 < length - 1; i7++) {
                i6 += iArr[i7] * AnonymousClass8BU.A04(replaceAll, i7);
            }
            int i8 = 11 - (i6 % 11);
            if (i8 > 9) {
                i8 = 0;
            }
            if (AnonymousClass8BU.A04(replaceAll, length - 1) == i8) {
                int i9 = 1;
                while (replaceAll.charAt(i9 - 1) == replaceAll.charAt(i9)) {
                    i9++;
                    if (i9 >= length) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean A01(String str) {
        String replaceAll = str.replaceAll("\\s", "");
        int i = 0;
        boolean z = false;
        for (int length = replaceAll.length() - 1; length >= 0; length--) {
            int parseInt = Integer.parseInt(replaceAll.substring(length, length + 1));
            if (z && (parseInt = parseInt * 2) > 9) {
                parseInt = (parseInt % 10) + 1;
            }
            i += parseInt;
            z = !z;
        }
        if (i % 10 != 0) {
            return false;
        }
        return true;
    }

    public static boolean A02(String str) {
        int length = str.length();
        int[] iArr = new int[length];
        int i = 9;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int A04 = AnonymousClass8BU.A04(str, i3);
            iArr[i3] = A04;
            i = Math.min(i, A04);
            i2 = Math.max(i2, A04);
        }
        if (i != i2) {
            boolean z = true;
            boolean z2 = true;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = iArr[i4];
                z &= AnonymousClass000.A1T(i5, i + i4);
                z2 &= AnonymousClass000.A1T(i5, i2 - i4);
                if (!z2 && !z) {
                    return true;
                }
            }
        }
        return false;
    }
}
