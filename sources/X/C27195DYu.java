package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.DYu  reason: case insensitive filesystem */
public class C27195DYu implements C28600E9r {
    public int A00;
    public int A01;
    public E9Y A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public byte[] A08;

    private byte[] A00(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = length;
        int i2 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                byte b = bArr[i] & 255;
                BE6.A1N(bArr2, i2, b << 1, i);
                i2 = (b >>> 7) & 1;
            } else {
                byte b2 = (-i2) & 255;
                int i3 = length - 3;
                byte b3 = bArr2[i3];
                byte[] bArr3 = this.A06;
                BE6.A1O(bArr2, b3, bArr3[1] & b2, i3);
                int i4 = length - 2;
                BE6.A1O(bArr2, bArr3[2] & b2, bArr2[i4], i4);
                int i5 = length - 1;
                BE6.A1O(bArr2, b2 & bArr3[3], bArr2[i5], i5);
                return bArr2;
            }
        }
    }

    public int BUJ() {
        return this.A01;
    }

    public void CQK(byte b) {
        int i = this.A00;
        byte[] bArr = this.A04;
        if (i == bArr.length) {
            this.A02.CCe(bArr, this.A05, 0, 0);
            this.A00 = 0;
            i = 0;
        }
        this.A00 = i + 1;
        bArr[i] = b;
    }

    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A04;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.A00 = 0;
                this.A02.reset();
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DZ4, java.lang.Object] */
    public void BJ5(byte[] bArr, int i) {
        byte[] bArr2;
        E9Y e9y = this.A02;
        int BNR = e9y.BNR();
        int i2 = this.A00;
        if (i2 == BNR) {
            bArr2 = this.A07;
        } else {
            new Object().BBb(this.A04, i2);
            bArr2 = this.A08;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.A05;
            int length = bArr3.length;
            byte[] bArr4 = this.A04;
            if (i3 < length) {
                BE8.A1I(bArr4, bArr2, i3);
                i3++;
            } else {
                e9y.CCe(bArr4, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i, this.A01);
                reset();
                return;
            }
        }
    }

    public void BdA(E3O e3o) {
        if (e3o == null || (e3o instanceof C27190DYo)) {
            E9Y e9y = this.A02;
            e9y.BdC(e3o, true);
            byte[] bArr = this.A03;
            byte[] bArr2 = new byte[bArr.length];
            e9y.CCe(bArr, bArr2, 0, 0);
            byte[] A002 = A00(bArr2);
            this.A07 = A002;
            this.A08 = A00(A002);
            reset();
            return;
        }
        throw AnonymousClass000.A0k("CMac mode only permits key to be set.");
    }

    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            E9Y e9y = this.A02;
            int BNR = e9y.BNR();
            int i3 = this.A00;
            int i4 = BNR - i3;
            if (i2 > i4) {
                byte[] bArr2 = this.A04;
                System.arraycopy(bArr, i, bArr2, i3, i4);
                byte[] bArr3 = this.A05;
                e9y.CCe(bArr2, bArr3, 0, 0);
                this.A00 = 0;
                i2 -= i4;
                i += i4;
                while (i2 > BNR) {
                    e9y.CCe(bArr, bArr3, i, 0);
                    i2 -= BNR;
                    i += BNR;
                }
            }
            System.arraycopy(bArr, i, this.A04, this.A00, i2);
            this.A00 += i2;
            return;
        }
        throw AnonymousClass000.A0k("Can't have a negative input length!");
    }

    public C27195DYu(E9Y e9y) {
        int BNR = e9y.BNR();
        int i = BNR * 8;
        if (i % 8 != 0) {
            throw AnonymousClass000.A0k("MAC size must be multiple of 8");
        } else if (i <= i) {
            this.A02 = new DYb(e9y);
            this.A01 = i / 8;
            int i2 = 135;
            switch (i) {
                case 64:
                case 320:
                    i2 = 27;
                    break;
                case 128:
                case 192:
                    break;
                case 160:
                    i2 = 45;
                    break;
                case 224:
                    i2 = 777;
                    break;
                case 256:
                    i2 = 1061;
                    break;
                case 384:
                    i2 = 4109;
                    break;
                case 448:
                    i2 = 2129;
                    break;
                case 512:
                    i2 = 293;
                    break;
                case 768:
                    i2 = 655377;
                    break;
                case EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH /*1024*/:
                    i2 = 524355;
                    break;
                case EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH /*2048*/:
                    i2 = 548865;
                    break;
                default:
                    throw AnonymousClass001.A13("Unknown block size for CMAC: ", AnonymousClass000.A10(), i);
            }
            byte[] bArr = new byte[4];
            C26210Cuo.A02(bArr, i2, 0);
            this.A06 = bArr;
            this.A05 = new byte[BNR];
            this.A04 = new byte[BNR];
            this.A03 = new byte[BNR];
            this.A00 = 0;
        } else {
            throw AnonymousClass001.A13("MAC size must be less or equal to ", AnonymousClass000.A10(), i);
        }
    }
}
