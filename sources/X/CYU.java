package X;

import java.security.Permission;
import java.security.SecureRandom;

public class CYU {
    public int A00;
    public SecureRandom A01;

    public byte[] A01() {
        byte[] bArr = new byte[this.A00];
        this.A01.nextBytes(bArr);
        return bArr;
    }

    public void A00(C5M c5m) {
        int i;
        boolean z = this instanceof C28378DyO;
        SecureRandom secureRandom = c5m.A01;
        if (z) {
            Permission permission = C26181Cu4.A03;
            if (secureRandom == null) {
                secureRandom = C26181Cu4.A00();
            }
            this.A01 = secureRandom;
            i = 32;
        } else {
            this.A01 = secureRandom;
            i = (c5m.A00 + 7) / 8;
        }
        this.A00 = i;
    }
}
