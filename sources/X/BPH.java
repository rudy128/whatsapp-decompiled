package X;

import android.net.Uri;

public final class BPH extends C26688D9l implements E9Q {
    public int A00;
    public int A01;
    public Uri A02;
    public boolean A03;
    public final byte[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BPH(byte[] bArr) {
        super(false);
        boolean z = false;
        C26056CrS.A01(bArr);
        C26056CrS.A02(bArr.length > 0 ? true : z);
        this.A04 = bArr;
    }

    public Uri Bb3() {
        return this.A02;
    }

    public long CAj(C26115Csd csd) {
        this.A02 = csd.A04;
        A02();
        long j = csd.A03;
        int i = (int) j;
        this.A01 = i;
        long j2 = csd.A02;
        long j3 = j2;
        if (j2 == -1) {
            j2 = ((long) this.A04.length) - j;
        }
        int i2 = (int) j2;
        this.A00 = i2;
        if (i2 <= 0 || i + i2 > this.A04.length) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unsatisfiable range: [");
            BE8.A1D(A10, i);
            A10.append(j3);
            A10.append("], length: ");
            throw C17880vN.A0f(C17880vN.A0t(A10, this.A04.length));
        }
        this.A03 = true;
        A04(csd);
        return (long) this.A00;
    }

    public void close() {
        if (this.A03) {
            this.A03 = false;
            A01();
        }
        this.A02 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.A04, this.A01, bArr, i, min);
        this.A01 += min;
        this.A00 -= min;
        A03(min);
        return min;
    }
}
