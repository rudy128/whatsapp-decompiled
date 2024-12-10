package X;

public final class D9U implements E90 {
    public boolean A00;
    public final E90 A01;
    public final /* synthetic */ D9K A02;

    public D9U(D9K d9k, E90 e90) {
        this.A02 = d9k;
        this.A01 = e90;
    }

    public boolean Bg8() {
        if (AnonymousClass000.A1O((this.A02.A01 > -9223372036854775807L ? 1 : (this.A02.A01 == -9223372036854775807L ? 0 : -1))) || !this.A01.Bg8()) {
            return false;
        }
        return true;
    }

    public void BjU() {
        this.A01.BjU();
    }

    public int CDP(C24756CIt cIt, C22765BOc bOc, int i) {
        D9K d9k = this.A02;
        if (AnonymousClass000.A1O((d9k.A01 > -9223372036854775807L ? 1 : (d9k.A01 == -9223372036854775807L ? 0 : -1)))) {
            return -3;
        }
        if (this.A00) {
            bOc.A00 = 4;
            return -4;
        }
        int CDP = this.A01.CDP(cIt, bOc, i);
        if (CDP == -5) {
            D48 d48 = cIt.A00;
            C26056CrS.A01(d48);
            int i2 = d48.A07;
            if (!(i2 == 0 && d48.A08 == 0)) {
                int i3 = 0;
                if (d9k.A00 == Long.MIN_VALUE) {
                    i3 = d48.A08;
                }
                C25702CkX ckX = new C25702CkX(d48);
                ckX.A06 = i2;
                ckX.A07 = i3;
                cIt.A00 = new D48(ckX);
            }
            return -5;
        }
        long j = d9k.A00;
        if (j == Long.MIN_VALUE || (CDP != -4 ? !(CDP == -3 && d9k.BNq() == Long.MIN_VALUE) : bOc.A00 < j)) {
            return CDP;
        }
        bOc.clear();
        bOc.A00 = 4;
        this.A00 = true;
        return -4;
    }

    public int CNQ(long j) {
        if (AnonymousClass000.A1O((this.A02.A01 > -9223372036854775807L ? 1 : (this.A02.A01 == -9223372036854775807L ? 0 : -1)))) {
            return -3;
        }
        return this.A01.CNQ(j);
    }
}
