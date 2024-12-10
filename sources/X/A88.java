package X;

public class A88 {
    public final int A00;
    public final BCG A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public A88(BCG bcg, boolean z) {
        this.A02 = null;
        this.A05 = false;
        this.A04 = z;
        this.A00 = 1;
        this.A03 = true;
        this.A01 = bcg;
    }

    public static A88 A00(Object obj) {
        return new A88(obj, -1, false, false, true);
    }

    public static A88 A01(Object obj) {
        return new A88(obj, -1, false, false, false);
    }

    public static A88 A02(Object obj) {
        return new A88(obj, -1, true, true, false);
    }

    public static A88 A03(Object obj, int i) {
        boolean z;
        int i2 = i;
        if (i < 400 || !(i < 500 || i == 505 || i == 507)) {
            z = true;
        } else {
            z = false;
        }
        return new A88(obj, i2, false, false, z);
    }

    public static A88 A04(Object obj, int i, boolean z) {
        boolean z2;
        int i2 = i;
        if (i < 400 || !(i < 500 || i == 505 || i == 507)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new A88(obj, i2, false, z, z2);
    }

    public A88(Object obj, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = obj;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
        this.A03 = z3;
        this.A01 = null;
    }
}
