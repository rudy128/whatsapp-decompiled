package X;

import java.security.SecureRandom;

public class DZ6 implements C28584E8w {
    public void BBb(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = 255;
        int i3 = length - 1;
        if (i > 0) {
            i3 = i - 1;
        }
        if ((bArr[i3] & 1) != 0) {
            i2 = 0;
        }
        byte b = (byte) i2;
        while (i < length) {
            bArr[i] = b;
            i++;
        }
    }

    public void Bd9(SecureRandom secureRandom) {
    }

    public int CB3(byte[] bArr) {
        int length = bArr.length;
        int i = length - 1;
        byte b = bArr[i];
        while (i > 0 && bArr[i - 1] == b) {
            i--;
        }
        return length - i;
    }
}
