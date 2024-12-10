package X;

/* renamed from: X.Dyd  reason: case insensitive filesystem */
public class C28393Dyd extends DZO {
    public static final int[] A04;
    public int A00;
    public int[] A01 = new int[8];
    public int[] A02 = new int[68];
    public int[] A03 = new int[16];

    static {
        int i;
        int[] iArr = new int[64];
        A04 = iArr;
        int i2 = 0;
        do {
            iArr[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
            i = 16;
        } while (i2 < 16);
        do {
            int i3 = i % 32;
            iArr[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
            i++;
        } while (i < 64);
    }

    public C28393Dyd() {
        reset();
    }

    public String BMl() {
        return "SM3";
    }

    public int BQf() {
        return 32;
    }

    public void reset() {
        super.reset();
        int[] iArr = this.A01;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.A00 = 0;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Dyd, X.E8N, X.DZO] */
    public E8N BFx() {
        ? dzo = new DZO(this);
        int[] iArr = new int[8];
        dzo.A01 = iArr;
        dzo.A03 = new int[16];
        dzo.A02 = new int[68];
        System.arraycopy(this.A01, 0, iArr, 0, 8);
        int[] iArr2 = this.A03;
        int[] iArr3 = dzo.A03;
        System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        dzo.A00 = this.A00;
        return dzo;
    }

    public void CFg(E8N e8n) {
        C28393Dyd dyd = (C28393Dyd) e8n;
        super.A0R(dyd);
        int[] iArr = dyd.A01;
        int[] iArr2 = this.A01;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = dyd.A03;
        int[] iArr4 = this.A03;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.A00 = dyd.A00;
    }

    public void BJ6(byte[] bArr, int i) {
        A0Q();
        int[] iArr = this.A01;
        for (int A022 : iArr) {
            C26210Cuo.A02(bArr, A022, i);
            i += 4;
        }
        reset();
    }
}
