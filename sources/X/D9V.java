package X;

import java.io.IOException;

public final class D9V implements E90 {
    public int A00;
    public boolean A01;
    public final /* synthetic */ D9N A02;

    public D9V(D9N d9n) {
        this.A02 = d9n;
    }

    public boolean Bg8() {
        return this.A02.A01;
    }

    public void BjU() {
        C25667Cjx cjx = this.A02.A08;
        IOException iOException = cjx.A01;
        if (iOException == null) {
            BG8 bg8 = cjx.A00;
            if (bg8 != null) {
                int i = bg8.A04;
                IOException iOException2 = bg8.A01;
                if (iOException2 != null && bg8.A00 > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public int CDP(C24756CIt cIt, C22765BOc bOc, int i) {
        int i2 = this.A00;
        if (i2 == 2) {
            bOc.A00 = 4 | bOc.A00;
            return -4;
        } else if ((i & 2) == 2 || i2 == 0) {
            cIt.A00 = this.A02.A06;
            this.A00 = 1;
            return -5;
        } else {
            D9N d9n = this.A02;
            if (!d9n.A01) {
                return -3;
            }
            if (d9n.A02) {
                bOc.A00 = 0;
                bOc.A00 = 1 | bOc.A00;
                bOc.A00(d9n.A00);
                bOc.A01.put(d9n.A04, 0, d9n.A00);
                if (!this.A01) {
                    C26154CtM ctM = d9n.A07;
                    D48 d48 = d9n.A06;
                    ctM.A05(d48, C26233CvQ.A01(d48.A0S), 0);
                    this.A01 = true;
                }
            } else {
                bOc.A00 = 4 | bOc.A00;
            }
            this.A00 = 2;
            return -4;
        }
    }

    public int CNQ(long j) {
        if (j <= 0 || this.A00 == 2) {
            return 0;
        }
        this.A00 = 2;
        if (this.A01) {
            return 1;
        }
        D9N d9n = this.A02;
        C26154CtM ctM = d9n.A07;
        D48 d48 = d9n.A06;
        ctM.A05(d48, C26233CvQ.A01(d48.A0S), 0);
        this.A01 = true;
        return 1;
    }
}
