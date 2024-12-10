package X;

import java.util.Arrays;

public final class CWS {
    public int A00;
    public boolean A01;
    public final CZF A02 = new CZF();
    public final C26207Cui A03;

    public boolean A00(C26036Cqw cqw) {
        CZF czf;
        int i;
        int i2;
        if (this.A01) {
            this.A01 = false;
            this.A03.A0G(0);
        }
        while (!this.A01) {
            int i3 = this.A00;
            if (i3 < 0) {
                CZF czf2 = this.A02;
                if (!czf2.A01(cqw, true)) {
                    return false;
                }
                int i4 = czf2.A01;
                if ((czf2.A03 & 1) == 1 && this.A03.A00 == 0) {
                    int i5 = 0;
                    i3 = 0;
                    do {
                        int i6 = i3;
                        if (i3 >= czf2.A02) {
                            break;
                        }
                        i3++;
                        i2 = czf2.A05[i6];
                        i5 += i2;
                    } while (i2 == 255);
                    i4 += i5;
                } else {
                    i3 = 0;
                }
                cqw.A02(i4);
                this.A00 = i3;
            }
            int i7 = 0;
            int i8 = 0;
            do {
                int i9 = i8 + i3;
                czf = this.A02;
                if (i9 >= czf.A02) {
                    break;
                }
                int i10 = i8;
                i8++;
                i = czf.A05[i10 + i3];
                i7 += i;
            } while (i == 255);
            int i11 = i3 + i8;
            if (i7 > 0) {
                C26207Cui cui = this.A03;
                byte[] bArr = cui.A02;
                int length = bArr.length;
                int i12 = cui.A00 + i7;
                if (length < i12) {
                    bArr = Arrays.copyOf(bArr, i12);
                    cui.A02 = bArr;
                }
                cqw.A05(bArr, cui.A00, i7, false);
                cui.A0H(cui.A00 + i7);
                this.A01 = AnonymousClass000.A1S(czf.A05[i11 - 1], 255);
            }
            if (i11 == czf.A02) {
                i11 = -1;
            }
            this.A00 = i11;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Cui] */
    public CWS() {
        ? obj = new Object();
        obj.A02 = new byte[65025];
        obj.A00 = 0;
        this.A03 = obj;
        this.A00 = -1;
    }
}
