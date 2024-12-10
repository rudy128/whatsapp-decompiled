package X;

import java.util.Arrays;

public class DZ2 implements EEQ {
    public int A00;
    public int A01;
    public int A02;
    public C28600E9r A03;
    public C28392Dyc A04;
    public boolean A05;
    public byte[] A06;
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;
    public boolean A0A;
    public byte[] A0B;

    private void A01() {
        if (!this.A0A) {
            this.A0A = true;
            C28600E9r e9r = this.A03;
            e9r.BJ5(this.A06, 0);
            int i = this.A00;
            byte[] bArr = new byte[i];
            bArr[i - 1] = 2;
            e9r.update(bArr, 0, i);
        }
    }

    public byte[] BUI() {
        int i = this.A02;
        byte[] bArr = new byte[i];
        System.arraycopy(this.A08, 0, bArr, 0, i);
        return bArr;
    }

    public int BVw(int i) {
        int i2 = i + this.A01;
        boolean z = this.A05;
        int i3 = this.A02;
        if (z) {
            return i2 + i3;
        }
        int i4 = i2;
        int i5 = i2 - i3;
        if (i4 < i3) {
            return 0;
        }
        return i5;
    }

    public int Bb2(int i) {
        int i2 = i + this.A01;
        if (!this.A05) {
            int i3 = this.A02;
            int i4 = i2;
            i2 -= i3;
            if (i4 < i3) {
                return 0;
            }
        }
        return i2 - (i2 % this.A00);
    }

    private void A00() {
        byte[] bArr = new byte[this.A00];
        int i = 0;
        this.A03.BJ5(bArr, 0);
        while (true) {
            byte[] bArr2 = this.A08;
            if (i < bArr2.length) {
                BE6.A1O(bArr2, this.A09[i] ^ this.A06[i], bArr[i], i);
                i++;
            } else {
                return;
            }
        }
    }

    private void A02(boolean z) {
        this.A04.reset();
        C28600E9r e9r = this.A03;
        e9r.reset();
        this.A01 = 0;
        Arrays.fill(this.A07, (byte) 0);
        if (z) {
            Arrays.fill(this.A08, (byte) 0);
        }
        int i = this.A00;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        e9r.update(bArr, 0, i);
        this.A0A = false;
        byte[] bArr2 = this.A0B;
        if (bArr2 != null) {
            CCd(bArr2, 0, bArr2.length);
        }
    }

    public E9Y Bax() {
        return this.A04.A00;
    }

    public void BdC(E3O e3o, boolean z) {
        byte[] bArr;
        int BUJ;
        E3O e3o2;
        this.A05 = z;
        if (e3o instanceof DYn) {
            DYn dYn = (DYn) e3o;
            bArr = AnonymousClass1C2.A02(dYn.A03);
            this.A0B = AnonymousClass1C2.A02(dYn.A02);
            BUJ = dYn.A00 / 8;
            this.A02 = BUJ;
            e3o2 = dYn.A01;
        } else if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            bArr = dYm.A01;
            this.A0B = null;
            BUJ = this.A03.BUJ() / 2;
            this.A02 = BUJ;
            e3o2 = dYm.A00;
        } else {
            throw AnonymousClass000.A0k("invalid parameters passed to EAX");
        }
        int i = this.A00;
        int i2 = i;
        if (!z) {
            i += BUJ;
        }
        this.A07 = new byte[i];
        byte[] bArr2 = new byte[i2];
        C28600E9r e9r = this.A03;
        e9r.BdA(e3o2);
        bArr2[i2 - 1] = 0;
        e9r.update(bArr2, 0, i2);
        e9r.update(bArr, 0, bArr.length);
        byte[] bArr3 = this.A09;
        e9r.BJ5(bArr3, 0);
        this.A04.BdC(new DYm((E3O) null, bArr3), true);
        A02(true);
    }

    public void CCd(byte[] bArr, int i, int i2) {
        if (!this.A0A) {
            this.A03.update(bArr, i, i2);
            return;
        }
        throw AnonymousClass000.A0n("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    public int BJ4(byte[] bArr, int i) {
        A01();
        int i2 = this.A01;
        byte[] bArr2 = this.A07;
        byte[] bArr3 = new byte[bArr2.length];
        this.A01 = 0;
        if (this.A05) {
            int i3 = i + i2;
            if (bArr.length >= this.A02 + i3) {
                this.A04.CCe(bArr2, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2);
                this.A03.update(bArr3, 0, i2);
                A00();
                System.arraycopy(this.A08, 0, bArr, i3, this.A02);
                A02(false);
                return i2 + this.A02;
            }
            throw new C28380DyQ("Output buffer too short");
        }
        int i4 = this.A02;
        if (i2 < i4) {
            throw new C28379DyP("data too short");
        } else if (bArr.length >= (i + i2) - i4) {
            if (i2 > i4) {
                this.A03.update(bArr2, 0, i2 - i4);
                this.A04.CCe(this.A07, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2 - this.A02);
            }
            A00();
            byte[] bArr4 = this.A07;
            int i5 = this.A02;
            int i6 = i2 - i5;
            byte b = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                b |= this.A08[i7] ^ bArr4[i6 + i7];
            }
            if (b == 0) {
                A02(false);
                return i2 - this.A02;
            }
            throw new C28379DyP("mac check in EAX failed");
        } else {
            throw new C28380DyQ("Output buffer too short");
        }
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A04.A00);
        return AnonymousClass000.A0y("/EAX", A10);
    }

    public int CCg(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        A01();
        if (bArr.length >= i + i2) {
            int i5 = 0;
            for (int i6 = 0; i6 != i2; i6++) {
                byte b = bArr[i + i6];
                int i7 = i3 + i5;
                byte[] bArr3 = this.A07;
                int i8 = this.A01;
                int i9 = i8 + 1;
                this.A01 = i9;
                bArr3[i8] = b;
                if (i9 == bArr3.length) {
                    int length = bArr2.length;
                    int i10 = this.A00;
                    if (length >= i7 + i10) {
                        if (this.A05) {
                            i4 = this.A04.CCe(bArr3, bArr2, 0, i7);
                            this.A03.update(bArr2, i7, i10);
                        } else {
                            this.A03.update(bArr3, 0, i10);
                            i4 = this.A04.CCe(this.A07, bArr2, 0, i7);
                        }
                        this.A01 = 0;
                        if (!this.A05) {
                            byte[] bArr4 = this.A07;
                            System.arraycopy(bArr4, i10, bArr4, 0, this.A02);
                            this.A01 = this.A02;
                        }
                    } else {
                        throw new C28380DyQ("Output buffer is too short");
                    }
                } else {
                    i4 = 0;
                }
                i5 += i4;
            }
            return i5;
        }
        throw new C28387DyX("Input buffer too short");
    }
}
