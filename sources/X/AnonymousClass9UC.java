package X;

import java.util.Arrays;

/* renamed from: X.9UC  reason: invalid class name */
public abstract class AnonymousClass9UC {
    public static final byte[] A00;
    public static final byte[] A01;
    public static final int[] A02;
    public static final int[] A03;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        A00 = bArr;
        int[] iArr = new int[256];
        int i = 0;
        Arrays.fill(iArr, 0, 256, -1);
        iArr[61] = -2;
        int i2 = 0;
        int i3 = 0;
        do {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        } while (i2 < 64);
        A02 = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        A01 = bArr2;
        int[] iArr2 = new int[256];
        Arrays.fill(iArr2, 0, 256, -1);
        iArr2[61] = -2;
        int i4 = 0;
        do {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        } while (i < 64);
        A03 = iArr2;
    }
}
