package X;

import java.util.Arrays;

/* renamed from: X.DyZ  reason: case insensitive filesystem */
public class C28389DyZ extends DYf {
    public int A00;
    public int A01;
    public E9Y A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;

    public int BNR() {
        return this.A00;
    }

    public int CCe(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A00;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void BdC(E3O e3o, boolean z) {
        this.A03 = z;
        if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            byte[] bArr = dYm.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A07;
            int length2 = bArr2.length;
            if (length < length2) {
                int i = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i, length);
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            e3o = dYm.A00;
        } else {
            reset();
        }
        if (e3o != null) {
            this.A02.BdC(e3o, true);
        }
    }

    public void reset() {
        byte[] bArr = this.A07;
        System.arraycopy(bArr, 0, this.A05, 0, bArr.length);
        Arrays.fill(this.A06, (byte) 0);
        this.A01 = 0;
        this.A02.reset();
    }

    public C28389DyZ(E9Y e9y, int i) {
        super(e9y);
        if (i > e9y.BNR() * 8 || i < 8 || i % 8 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CFB");
            A10.append(i);
            throw AnonymousClass001.A12(" not supported", A10);
        }
        this.A02 = e9y;
        int i2 = i / 8;
        this.A00 = i2;
        int BNR = e9y.BNR();
        this.A07 = new byte[BNR];
        this.A05 = new byte[BNR];
        this.A04 = new byte[BNR];
        this.A06 = new byte[i2];
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A02);
        A10.append("/CFB");
        return C17880vN.A0t(A10, this.A00 * 8);
    }
}
