package X;

/* renamed from: X.Dya  reason: case insensitive filesystem */
public class C28390Dya extends DYf {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03 = true;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public final int A07;
    public final E9Y A08;

    public int BNR() {
        return this.A07;
    }

    public void BdC(E3O e3o, boolean z) {
        this.A03 = true;
        this.A00 = 0;
        this.A01 = 0;
        if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            byte[] bArr = dYm.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A06;
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
            this.A08.BdC(e3o, true);
        }
    }

    public int CCe(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A07;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void reset() {
        this.A03 = true;
        this.A00 = 0;
        this.A01 = 0;
        byte[] bArr = this.A06;
        System.arraycopy(bArr, 0, this.A05, 0, bArr.length);
        this.A02 = 0;
        this.A08.reset();
    }

    public C28390Dya(E9Y e9y) {
        super(e9y);
        this.A08 = e9y;
        int BNR = e9y.BNR();
        this.A07 = BNR;
        if (BNR == 8) {
            int BNR2 = e9y.BNR();
            this.A06 = new byte[BNR2];
            this.A05 = new byte[BNR2];
            this.A04 = new byte[BNR2];
            return;
        }
        throw AnonymousClass000.A0k("GCTR only for 64 bit block ciphers");
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A08);
        return AnonymousClass000.A0y("/GCTR", A10);
    }
}
