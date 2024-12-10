package X;

/* renamed from: X.DYq  reason: case insensitive filesystem */
public class C27192DYq implements C28600E9r {
    public int A00;
    public C28599E9q A01;
    public byte[] A02;
    public byte[] A03;

    public void BJ5(byte[] bArr, int i) {
        int i2 = this.A00;
        byte[] bArr2 = new byte[i2];
        C28599E9q e9q = this.A01;
        e9q.BJ6(bArr2, 0);
        e9q.update(this.A03, 0, 64);
        e9q.update(bArr2, 0, i2);
        e9q.BJ6(bArr, i);
        reset();
    }

    public int BUJ() {
        return this.A00;
    }

    public void CQK(byte b) {
        this.A01.CQK(b);
    }

    public void reset() {
        C28599E9q e9q = this.A01;
        e9q.reset();
        e9q.update(this.A02, 0, 64);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A01.update(bArr, i, i2);
    }

    public void BdA(E3O e3o) {
        byte[] bArr;
        int i;
        C28599E9q e9q = this.A01;
        e9q.reset();
        byte[] bArr2 = ((C27190DYo) e3o).A00;
        int length = bArr2.length;
        if (length <= 64) {
            bArr = this.A02;
            System.arraycopy(bArr2, 0, bArr, 0, length);
            while (true) {
                i = 64;
                if (length >= 64) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            e9q.update(bArr2, 0, length);
            bArr = this.A02;
            e9q.BJ6(bArr, 0);
            int i2 = this.A00;
            while (true) {
                i = 64;
                if (i2 >= 64) {
                    break;
                }
                bArr[i2] = 0;
                i2++;
            }
        }
        byte[] bArr3 = new byte[64];
        this.A03 = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, 64);
        int i3 = 0;
        do {
            bArr[i3] = (byte) (bArr[i3] ^ 54);
            i3++;
        } while (i3 < i);
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.A03;
            if (i4 < i) {
                bArr4[i4] = (byte) (bArr4[i4] ^ 92);
                i4++;
            } else {
                e9q.update(bArr, 0, i);
                return;
            }
        }
    }
}
