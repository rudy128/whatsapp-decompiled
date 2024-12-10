package X;

/* renamed from: X.6ra  reason: invalid class name and case insensitive filesystem */
public abstract class C135056ra {
    public int A00;
    public final int A01;

    public void A00() {
        C136746uK r0;
        if (this instanceof C122016Ml) {
            C122016Ml r1 = (C122016Ml) this;
            r1.A02 = true;
            r0 = r1.A09;
        } else {
            C122026Mm r2 = (C122026Mm) this;
            if (!r2.A05) {
                r2.A05 = true;
                AnonymousClass70W r02 = r2.A04;
                if (r02 != null) {
                    r2.A02 = r02.A06();
                }
                r0 = r2.A0B;
            } else {
                return;
            }
        }
        r0.A02();
    }

    public void A01(Integer num) {
        if (this instanceof C122016Ml) {
            ((C122016Ml) this).A01 = num;
        } else {
            ((C122026Mm) this).A0A.A00();
        }
    }

    public void A02(boolean z, int i) {
        C136746uK r0;
        int i2;
        if (this instanceof C122016Ml) {
            C122016Ml r1 = (C122016Ml) this;
            if (i == 3) {
                if (z) {
                    r1.A09.A00();
                    r1.A0A.A02();
                    return;
                }
            } else if (!(i == 1 || i == 4 || i == 2)) {
                return;
            }
            r0 = r1.A0A;
        } else {
            C122026Mm r2 = (C122026Mm) this;
            if (i == 3) {
                C136746uK r3 = r2.A0B;
                if (r3.A01) {
                    r3.A00();
                    r2.A06 = true;
                }
                C136746uK r02 = r2.A0D;
                if (z) {
                    r02.A02();
                    r2.A0C.A00();
                    r2.A00 = 1;
                } else {
                    r02.A00();
                    r2.A0C.A02();
                    r2.A00 = 2;
                }
                r0 = r2.A0A;
            } else {
                if (i == 4) {
                    r2.A0D.A00();
                    r2.A0A.A00();
                    r2.A0C.A00();
                    i2 = 5;
                } else if (i == 2) {
                    r2.A0D.A00();
                    if (r2.A06) {
                        C136746uK r12 = r2.A0A;
                        if (!r12.A01 && z) {
                            r12.A02();
                            synchronized (r2) {
                                r2.A01++;
                            }
                        }
                    }
                    r2.A0C.A00();
                    i2 = 3;
                } else {
                    return;
                }
                r2.A00 = i2;
                return;
            }
        }
        r0.A00();
    }

    public C135056ra(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
