package X;

import java.util.Comparator;

/* renamed from: X.Akj  reason: case insensitive filesystem */
public class C21478Akj implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        int i;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr.length;
            if (i2 < length && i3 < bArr2.length) {
                length = bArr[i2] & 255;
                i = bArr2[i3] & 255;
                if (length != i) {
                    break;
                }
                i2++;
                i3++;
            } else {
                i = bArr2.length;
            }
        }
        i = bArr2.length;
        return length - i;
    }
}
