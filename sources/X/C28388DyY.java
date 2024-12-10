package X;

/* renamed from: X.DyY  reason: case insensitive filesystem */
public class C28388DyY extends DYf {
    public int A00;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final E9Y A05;

    public int BNR() {
        return this.A04;
    }

    public int CCe(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A04;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void reset() {
        byte[] bArr = this.A03;
        System.arraycopy(bArr, 0, this.A02, 0, bArr.length);
        this.A00 = 0;
        this.A05.reset();
    }

    public void BdC(E3O e3o, boolean z) {
        if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            byte[] bArr = dYm.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A03;
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
            this.A05.BdC(e3o, true);
        }
    }

    public C28388DyY(E9Y e9y, int i) {
        super(e9y);
        if (i > e9y.BNR() * 8 || i < 8 || i % 8 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("0FB");
            A10.append(i);
            throw AnonymousClass001.A12(" not supported", A10);
        }
        this.A05 = e9y;
        this.A04 = i / 8;
        int BNR = e9y.BNR();
        this.A03 = new byte[BNR];
        this.A02 = new byte[BNR];
        this.A01 = new byte[BNR];
    }

    public String BMl() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1O(A10, this.A05);
        A10.append("/OFB");
        return C17880vN.A0t(A10, this.A04 * 8);
    }
}
