package X;

import java.security.SecureRandom;

public class DZ7 implements C28584E8w {
    public void BBb(byte[] bArr, int i) {
        int length = bArr.length;
        while (i < length) {
            bArr[i] = 0;
            i++;
        }
    }

    public void Bd9(SecureRandom secureRandom) {
    }

    public int CB3(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return i - length;
    }
}
