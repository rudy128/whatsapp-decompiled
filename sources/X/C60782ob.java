package X;

import java.util.Arrays;
import java.util.Random;

/* renamed from: X.2ob  reason: invalid class name and case insensitive filesystem */
public abstract class C60782ob {
    public static final Random A00 = new Random();

    public static final byte[] A00(byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        int nextInt = A00.nextInt(16) + 1;
        int length = bArr.length;
        int i = length + nextInt;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        Arrays.fill(bArr2, length, i, (byte) nextInt);
        return bArr2;
    }
}
