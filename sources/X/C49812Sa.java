package X;

import java.util.Arrays;
import java.util.Queue;

/* renamed from: X.2Sa  reason: invalid class name and case insensitive filesystem */
public abstract class C49812Sa {
    public static byte[] A00(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length != i) {
            int i2 = i - length;
            bArr = Arrays.copyOf(bArr, i);
            while (i2 > 0) {
                byte[] bArr2 = (byte[]) queue.remove();
                int min = Math.min(i2, bArr2.length);
                System.arraycopy(bArr2, 0, bArr, i - i2, min);
                i2 -= min;
            }
        }
        return bArr;
    }
}
