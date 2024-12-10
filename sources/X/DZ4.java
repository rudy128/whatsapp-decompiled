package X;

import java.security.SecureRandom;

public class DZ4 implements C28584E8w {
    public void BBb(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = Byte.MIN_VALUE;
        while (true) {
            bArr[i] = b;
            i++;
            if (i < length) {
                b = 0;
            } else {
                return;
            }
        }
    }

    public void Bd9(SecureRandom secureRandom) {
    }

    public int CB3(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        do {
            length--;
            if (length <= 0 || bArr[length] != 0) {
            }
            length--;
            break;
        } while (bArr[length] != 0);
        if (bArr[length] == Byte.MIN_VALUE) {
            return i - length;
        }
        throw new C28379DyP("pad block corrupted");
    }
}
