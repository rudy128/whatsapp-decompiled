package X;

import javax.crypto.SecretKey;

public class DWG implements SecretKey {
    public final E3N converter;
    public final char[] password;

    public DWG(E3N e3n, char[] cArr) {
        this.password = AnonymousClass1C2.A03(cArr);
        this.converter = e3n;
    }

    public String getAlgorithm() {
        return "PBKDF2";
    }

    public byte[] getEncoded() {
        E3N e3n = this.converter;
        char[] cArr = this.password;
        if (((C28385DyV) e3n).A00 == 0) {
            if (cArr == null) {
                return new byte[0];
            }
            int length = cArr.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr[i] = (byte) cArr[i];
            }
            return bArr;
        } else if (cArr != null) {
            return AnonymousClass1Bo.A04(cArr);
        } else {
            return new byte[0];
        }
    }

    public String getFormat() {
        if (((C28385DyV) this.converter).A00 != 0) {
            return "UTF8";
        }
        return "ASCII";
    }
}
