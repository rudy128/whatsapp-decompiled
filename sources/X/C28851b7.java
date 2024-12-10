package X;

import java.util.NoSuchElementException;

/* renamed from: X.1b7  reason: invalid class name and case insensitive filesystem */
public abstract class C28851b7 extends AnonymousClass1b6 {
    public static final int A04(AnonymousClass1JU r3, C25411Oc r4) {
        C18070vi.A0d(r3, 1);
        try {
            if (!r4.A04()) {
                int i = r4.A01;
                int i2 = r4.A00;
                if (i < Integer.MAX_VALUE) {
                    return r3.A03(i2, i + 1);
                }
                if (i2 > Integer.MIN_VALUE) {
                    return r3.A03(i2 - 1, i) + 1;
                }
                return r3.A00();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot get random in empty range: ");
            sb.append(r4);
            throw new IllegalArgumentException(sb.toString());
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final C25391Oa A07(C25391Oa r4) {
        int i = 2;
        int i2 = r4.A00;
        int i3 = r4.A01;
        if (r4.A02 <= 0) {
            i = -2;
        }
        return new C25391Oa(i2, i3, i);
    }

    public static final double A01(double d, double d2, double d3) {
        if (d2 > d3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(d3);
            sb.append(" is less than minimum ");
            sb.append(d2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (d < d2) {
            return d2;
        } else {
            if (d > d3) {
                return d3;
            }
            return d;
        }
    }

    public static final float A02(float f, float f2, float f3) {
        if (f2 > f3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(f3);
            sb.append(" is less than minimum ");
            sb.append(f2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }

    public static final int A03(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(i3);
            sb.append(" is less than minimum ");
            sb.append(i2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static final long A05(long j, long j2, long j3) {
        if (j2 > j3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(j3);
            sb.append(" is less than minimum ");
            sb.append(j2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }

    public static final C25411Oc A08(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C25411Oc.A00;
        }
        return new C25411Oc(i, i2 - 1);
    }

    public static final Comparable A06(Comparable comparable, AnonymousClass3MT r2) {
        if (r2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: ");
            sb.append(r2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (r2.BhW(comparable, r2.BZX()) && !r2.BhW(r2.BZX(), comparable)) {
            return r2.BZX();
        } else {
            if (!r2.BhW(r2.BRH(), comparable) || r2.BhW(comparable, r2.BRH())) {
                return comparable;
            }
            return r2.BRH();
        }
    }
}
