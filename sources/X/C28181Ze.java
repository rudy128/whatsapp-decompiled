package X;

import android.view.WindowInsets;

/* renamed from: X.1Ze  reason: invalid class name and case insensitive filesystem */
public abstract class C28181Ze {
    public C33321id[] A00;
    public final AnonymousClass1HO A01;

    public AnonymousClass1HO A00() {
        AnonymousClass27d r4 = (AnonymousClass27d) this;
        r4.A01();
        WindowInsets windowInsets = r4.A00;
        AnonymousClass1HO r0 = AnonymousClass1HO.A01;
        C28111Yx.A02(windowInsets);
        AnonymousClass1HO r3 = new AnonymousClass1HO(windowInsets);
        C33321id[] r2 = r4.A00;
        AnonymousClass1ZX r1 = r3.A00;
        if (r1 instanceof AnonymousClass1ZY) {
            ((AnonymousClass1ZY) r1).A03 = r2;
        }
        r1.A0B(r4.A01);
        return r3;
    }

    public void A02(C33321id r1) {
    }

    public void A03(C33321id r2) {
        ((AnonymousClass27d) this).A01 = r2;
    }

    public void A04(C33321id r1) {
    }

    public void A05(C33321id r7) {
        AnonymousClass27d r5 = (AnonymousClass27d) this;
        WindowInsets windowInsets = r5.A00;
        if (windowInsets != null) {
            r5.A00 = windowInsets.replaceSystemWindowInsets(r7.A01, r7.A03, r7.A02, r7.A00);
        }
    }

    public void A06(C33321id r1) {
    }

    public final void A01() {
        C33321id[] r1 = this.A00;
        if (r1 != null) {
            C33321id r2 = r1[0];
            C33321id r12 = r1[1];
            if (r12 == null) {
                r12 = this.A01.A00.A05(2);
            }
            if (r2 == null) {
                r2 = this.A01.A00.A05(1);
            }
            A05(C33321id.A02(r2, r12));
            C33321id r0 = this.A00[4];
            if (r0 != null) {
                A04(r0);
            }
            C33321id r02 = this.A00[5];
            if (r02 != null) {
                A02(r02);
            }
            C33321id r03 = this.A00[6];
            if (r03 != null) {
                A06(r03);
            }
        }
    }

    public void A07(C33321id r6, int i) {
        C33321id[] r4 = this.A00;
        if (r4 == null) {
            r4 = new C33321id[9];
            this.A00 = r4;
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                char c = 1;
                char c2 = 0;
                if (i2 != 1) {
                    c2 = 2;
                    if (i2 != 2) {
                        c = 4;
                        if (i2 != 4) {
                            c2 = 8;
                            if (i2 == 8) {
                                c2 = 3;
                            } else if (i2 != 16) {
                                if (i2 == 32) {
                                    c2 = 5;
                                } else if (i2 == 64) {
                                    c2 = 6;
                                } else if (i2 == 128) {
                                    c2 = 7;
                                } else if (i2 != 256) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("type needs to be >= FIRST and <= LAST, type=");
                                    sb.append(i2);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    }
                    c2 = c;
                }
                r4[c2] = r6;
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public C28181Ze(AnonymousClass1HO r1) {
        this.A01 = r1;
    }

    public C28181Ze() {
        this(new AnonymousClass1HO());
    }
}
