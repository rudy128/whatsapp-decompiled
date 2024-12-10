package X;

import java.util.Arrays;

public class DYb implements E9Y {
    public int A00;
    public E9Y A01;
    public byte[] A02;
    public byte[] A03;
    public boolean A04;
    public byte[] A05;

    public DYb(E9Y e9y) {
        this.A01 = e9y;
        int BNR = e9y.BNR();
        this.A00 = BNR;
        this.A05 = new byte[BNR];
        this.A03 = new byte[BNR];
        this.A02 = new byte[BNR];
    }

    public int BNR() {
        return this.A01.BNR();
    }

    public void BdC(E3O e3o, boolean z) {
        boolean z2 = this.A04;
        this.A04 = z;
        if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            byte[] bArr = dYm.A01;
            int length = bArr.length;
            if (length == this.A00) {
                System.arraycopy(bArr, 0, this.A05, 0, length);
                reset();
                e3o = dYm.A00;
                if (e3o == null) {
                    if (z2 != z) {
                        throw AnonymousClass000.A0k("cannot change encrypting state without providing key.");
                    }
                    return;
                }
            } else {
                throw AnonymousClass000.A0k("initialisation vector must be the same length as block size");
            }
        } else {
            reset();
            if (e3o == null) {
                if (z2 != z) {
                    throw AnonymousClass000.A0k("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        this.A01.BdC(e3o, z);
    }

    public int CCe(byte[] bArr, byte[] bArr2, int i, int i2) {
        boolean z = this.A04;
        int i3 = this.A00;
        if (z) {
            if (i3 + i <= bArr.length) {
                for (int i4 = 0; i4 < i3; i4++) {
                    byte[] bArr3 = this.A03;
                    BE6.A1Q(bArr, bArr3, i + i4, bArr3[i4], i4);
                }
                int CCe = this.A01.CCe(this.A03, bArr2, 0, i2);
                byte[] bArr4 = this.A03;
                System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
                return CCe;
            }
            throw C28387DyX.A01();
        } else if (i + i3 <= bArr.length) {
            System.arraycopy(bArr, i, this.A02, 0, i3);
            int CCe2 = this.A01.CCe(bArr, bArr2, i, i2);
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = i2 + i5;
                BE6.A1Q(this.A03, bArr2, i5, bArr2[i6], i6);
            }
            byte[] bArr5 = this.A03;
            this.A03 = this.A02;
            this.A02 = bArr5;
            return CCe2;
        } else {
            throw C28387DyX.A01();
        }
    }

    public void reset() {
        byte[] bArr = this.A05;
        System.arraycopy(bArr, 0, this.A03, 0, bArr.length);
        Arrays.fill(this.A02, (byte) 0);
        this.A01.reset();
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A01);
        return AnonymousClass000.A0y("/CBC", A10);
    }
}
