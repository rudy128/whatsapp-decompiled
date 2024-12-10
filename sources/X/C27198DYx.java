package X;

import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: X.DYx  reason: case insensitive filesystem */
public class C27198DYx implements E9M {
    public DYb A00;
    public SecureRandom A01;
    public DYm A02;
    public boolean A03;

    public byte[] CQG(byte[] bArr, int i) {
        int i2;
        if (!this.A03) {
            DYb dYb = this.A00;
            int BNR = dYb.A01.BNR();
            if (i >= BNR * 2) {
                byte[] bArr2 = new byte[i];
                byte[] bArr3 = new byte[BNR];
                boolean z = false;
                System.arraycopy(bArr, 0, bArr2, 0, i);
                System.arraycopy(bArr, 0, bArr3, 0, BNR);
                dYb.BdC(new DYm(this.A02.A00, bArr3), false);
                for (int i3 = BNR; i3 < i; i3 += BNR) {
                    dYb.CCe(bArr2, bArr2, i3, i3);
                }
                System.arraycopy(bArr2, i - BNR, bArr3, 0, BNR);
                dYb.BdC(new DYm(this.A02.A00, bArr3), false);
                dYb.CCe(bArr2, bArr2, 0, 0);
                dYb.BdC(this.A02, false);
                for (int i4 = 0; i4 < i; i4 += BNR) {
                    dYb.CCe(bArr2, bArr2, i4, i4);
                }
                byte b = bArr2[0] & 255;
                int i5 = i - 4;
                boolean z2 = true;
                if (b <= i5) {
                    z2 = false;
                    i5 = b;
                }
                byte[] bArr4 = new byte[i5];
                System.arraycopy(bArr2, 4, bArr4, 0, i5);
                int i6 = 0;
                byte b2 = 0;
                do {
                    i2 = i6 + 1;
                    b2 |= ((byte) (bArr2[i2] ^ -1)) ^ bArr2[i6 + 4];
                    i6 = i2;
                } while (i2 != 3);
                Arrays.fill(bArr2, (byte) 0);
                if (b2 != 0) {
                    z = true;
                }
                if (!z2 && !z) {
                    return bArr4;
                }
                throw new C28379DyP("wrapped key corrupted");
            }
            throw new C28379DyP("input too short");
        }
        throw AnonymousClass000.A0n("not set for unwrapping");
    }

    public byte[] CSI(byte[] bArr, int i) {
        if (!this.A03) {
            throw AnonymousClass000.A0n("not set for wrapping");
        } else if (i > 255 || i < 0) {
            throw AnonymousClass000.A0k("input must be from 0 to 255 bytes");
        } else {
            DYb dYb = this.A00;
            dYb.BdC(this.A02, true);
            int BNR = dYb.A01.BNR();
            int i2 = i + 4;
            int i3 = BNR * 2;
            if (i2 >= i3) {
                if (i2 % BNR == 0) {
                    i3 = i2;
                } else {
                    i3 = ((i2 / BNR) + 1) * BNR;
                }
            }
            byte[] bArr2 = new byte[i3];
            bArr2[0] = (byte) i;
            System.arraycopy(bArr, 0, bArr2, 4, i);
            int i4 = i3 - i2;
            byte[] bArr3 = new byte[i4];
            this.A01.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2, i4);
            bArr2[1] = (byte) (bArr2[4] ^ -1);
            bArr2[2] = (byte) (bArr2[5] ^ -1);
            bArr2[3] = (byte) (bArr2[6] ^ -1);
            for (int i5 = 0; i5 < i3; i5 += BNR) {
                dYb.CCe(bArr2, bArr2, i5, i5);
            }
            for (int i6 = 0; i6 < i3; i6 += BNR) {
                dYb.CCe(bArr2, bArr2, i6, i6);
            }
            return bArr2;
        }
    }

    public void BdC(E3O e3o, boolean z) {
        this.A03 = z;
        if (e3o instanceof DYi) {
            DYi dYi = (DYi) e3o;
            this.A01 = dYi.A00;
            E3O e3o2 = dYi.A01;
            if (e3o2 instanceof DYm) {
                this.A02 = (DYm) e3o2;
                return;
            }
            throw AnonymousClass000.A0k("RFC3211Wrap requires an IV");
        }
        if (z) {
            this.A01 = C26181Cu4.A00();
        }
        if (e3o instanceof DYm) {
            this.A02 = (DYm) e3o;
            return;
        }
        throw AnonymousClass000.A0k("RFC3211Wrap requires an IV");
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A00.A01);
        return AnonymousClass000.A0y("/RFC3211Wrap", A10);
    }
}
