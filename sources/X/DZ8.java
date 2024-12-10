package X;

import java.security.Permission;
import java.security.SecureRandom;

public class DZ8 implements C28584E8w {
    public SecureRandom A00;

    public void BBb(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = (byte) (length - i);
        while (i < length - 1) {
            bArr[i] = (byte) this.A00.nextInt();
            i++;
        }
        bArr[i] = b;
    }

    public int CB3(byte[] bArr) {
        int length = bArr.length;
        byte b = bArr[length - 1] & 255;
        if (b <= length) {
            return b;
        }
        throw new C28379DyP("pad block corrupted");
    }

    public void Bd9(SecureRandom secureRandom) {
        Permission permission = C26181Cu4.A03;
        if (secureRandom == null) {
            secureRandom = C26181Cu4.A00();
        }
        this.A00 = secureRandom;
    }
}
