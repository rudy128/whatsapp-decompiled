package X;

/* renamed from: X.DyU  reason: case insensitive filesystem */
public class C28384DyU extends C24485C6c {
    public C28600E9r A00;
    public byte[] A01;

    public C28384DyU() {
        C27194DYt dYt = new C27194DYt(new C28397Dyh());
        this.A00 = dYt;
        this.A01 = new byte[dYt.A01];
    }

    public static byte[] A00(C28384DyU dyU, int i) {
        int i2 = i;
        C28600E9r e9r = dyU.A00;
        int BUJ = e9r.BUJ();
        int i3 = ((i2 + BUJ) - 1) / BUJ;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i3 * BUJ)];
        e9r.BdA(new C27190DYo(dyU.A01));
        int i4 = 0;
        int i5 = 1;
        while (i5 <= i3) {
            int i6 = 3;
            while (true) {
                byte b = (byte) (bArr[i6] + 1);
                bArr[i6] = b;
                if (b != 0) {
                    break;
                }
                i6--;
            }
            byte[] bArr3 = dyU.A02;
            int i7 = dyU.A00;
            if (i7 != 0) {
                if (bArr3 != null) {
                    dyU.A00.update(bArr3, 0, bArr3.length);
                }
                C28600E9r e9r2 = dyU.A00;
                e9r2.update(bArr, 0, 4);
                byte[] bArr4 = dyU.A01;
                e9r2.BJ5(bArr4, 0);
                int length = bArr4.length;
                System.arraycopy(bArr4, 0, bArr2, i4, length);
                for (int i8 = 1; i8 < i7; i8++) {
                    e9r2.update(bArr4, 0, length);
                    e9r2.BJ5(bArr4, 0);
                    for (int i9 = 0; i9 != length; i9++) {
                        int i10 = i4 + i9;
                        BE6.A1O(bArr2, bArr4[i9], bArr2[i10], i10);
                    }
                }
                i4 += BUJ;
                i5++;
            } else {
                throw AnonymousClass000.A0k("iteration count must be at least 1.");
            }
        }
        return bArr2;
    }
}
