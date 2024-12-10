package X;

import java.security.SecureRandom;

public class DZ9 implements C28584E8w {
    public SecureRandom A00 = null;

    public void BBb(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = (byte) (length - i);
        while (i < length - 1) {
            SecureRandom secureRandom = this.A00;
            bArr[i] = secureRandom == null ? 0 : (byte) secureRandom.nextInt();
            i++;
        }
        bArr[i] = b;
    }

    public void Bd9(SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }

    public int CB3(byte[] bArr) {
        int length = bArr.length;
        byte b = bArr[length - 1] & 255;
        if (b <= length) {
            return b;
        }
        throw new C28379DyP("pad block corrupted");
    }
}
