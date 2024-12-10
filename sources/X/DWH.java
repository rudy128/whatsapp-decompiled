package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;

public class DWH implements PBEKey, Destroyable {
    public String algorithm;
    public int digest;
    public final AtomicBoolean hasBeenDestroyed = BE6.A16(false);
    public final int iterationCount;
    public int ivSize;
    public int keySize;
    public AnonymousClass1C0 oid;
    public final E3O param;
    public final char[] password;
    public final byte[] salt;
    public boolean tryWrong = false;
    public int type;

    public String getAlgorithm() {
        A00(this);
        return this.algorithm;
    }

    public String getFormat() {
        return "RAW";
    }

    public int getIterationCount() {
        A00(this);
        return this.iterationCount;
    }

    public byte[] getSalt() {
        A00(this);
        return AnonymousClass1C2.A02(this.salt);
    }

    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public void destroy() {
        if (!this.hasBeenDestroyed.getAndSet(true)) {
            char[] cArr = this.password;
            if (cArr != null) {
                Arrays.fill(cArr, 0);
            }
            byte[] bArr = this.salt;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
        }
    }

    public DWH(String str, PBEKeySpec pBEKeySpec, AnonymousClass1C0 r5, E3O e3o, int i, int i2, int i3, int i4) {
        this.algorithm = str;
        this.oid = r5;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = e3o;
    }

    public static void A00(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw AnonymousClass000.A0n("key has been destroyed");
        }
    }

    public byte[] getEncoded() {
        int length;
        A00(this);
        E3O e3o = this.param;
        if (e3o != null) {
            if (e3o instanceof DYm) {
                e3o = ((DYm) e3o).A00;
            }
            return ((C27190DYo) e3o).A00;
        }
        int i = this.type;
        if (i == 2) {
            char[] cArr = this.password;
            int i2 = 0;
            if (cArr == null || (length = cArr.length) <= 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[((length + 1) * 2)];
            do {
                char c = cArr[i2];
                BE7.A12(c >>> 8, bArr, i2 * 2, c);
                i2++;
            } while (i2 != length);
            return bArr;
        }
        char[] cArr2 = this.password;
        if (i != 5) {
            if (cArr2 == null) {
                return new byte[0];
            }
            int length2 = cArr2.length;
            byte[] bArr2 = new byte[length2];
            for (int i3 = 0; i3 != length2; i3++) {
                bArr2[i3] = (byte) cArr2[i3];
            }
            return bArr2;
        } else if (cArr2 != null) {
            return AnonymousClass1Bo.A04(cArr2);
        } else {
            return new byte[0];
        }
    }

    public char[] getPassword() {
        A00(this);
        char[] cArr = this.password;
        if (cArr != null) {
            return AnonymousClass1C2.A03(cArr);
        }
        throw AnonymousClass000.A0n("no password available");
    }
}
