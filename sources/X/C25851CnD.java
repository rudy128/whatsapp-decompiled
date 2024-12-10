package X;

import sun.misc.Unsafe;

/* renamed from: X.CnD  reason: case insensitive filesystem */
public abstract class C25851CnD {
    public Unsafe A00;

    public static int A00(Object obj, long j) {
        return C26277CwW.A00.A00.getInt(obj, -4 & j);
    }

    public byte A01(Object obj, long j) {
        int A06;
        boolean z = this instanceof C23489Bht;
        boolean z2 = C26277CwW.A03;
        if (z) {
            if (z2) {
                A06 = BEA.A06(j ^ -1, A00(obj, j));
            } else {
                A06 = BEA.A06(j, A00(obj, j));
            }
        } else if (z2) {
            A06 = BEA.A06(j ^ -1, A00(obj, j));
        } else {
            A06 = BEA.A06(j, A00(obj, j));
        }
        return (byte) A06;
    }

    public double A02(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    public float A03(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public final int A04(Object obj, long j) {
        return this.A00.getInt(obj, j);
    }

    public final long A05(Object obj, long j) {
        return this.A00.getLong(obj, j);
    }

    public void A06(Object obj, long j, byte b) {
        boolean z = C26277CwW.A03;
        long j2 = j & -4;
        C25851CnD cnD = C26277CwW.A00;
        int A04 = cnD.A04(obj, j2);
        int i = (int) j;
        if (z) {
            cnD.A09(obj, j2, BEB.A03(i ^ -1, A04, b));
        } else {
            cnD.A09(obj, j2, BEB.A03(i, A04, b));
        }
    }

    public final void A09(Object obj, long j, int i) {
        this.A00.putInt(obj, j, i);
    }

    public final void A0A(Object obj, long j, long j2) {
        this.A00.putLong(obj, j, j2);
    }

    public void A0B(Object obj, long j, boolean z) {
        boolean z2 = C26277CwW.A03;
        byte b = z ? (byte) 1 : 0;
        long j2 = j & -4;
        C25851CnD cnD = C26277CwW.A00;
        int A04 = cnD.A04(obj, j2);
        int i = (int) j;
        if (z2) {
            cnD.A09(obj, j2, BEB.A03(i ^ -1, A04, b));
        } else {
            cnD.A09(obj, j2, BEB.A03(i, A04, b));
        }
    }

    public boolean A0C(Object obj, long j) {
        int A06;
        int A062;
        boolean z = this instanceof C23489Bht;
        boolean z2 = C26277CwW.A03;
        if (z) {
            if (z2) {
                A062 = BEA.A06(j ^ -1, A00(obj, j));
            } else {
                A062 = BEA.A06(j, A00(obj, j));
            }
            return AnonymousClass000.A1O((byte) A062);
        }
        if (z2) {
            A06 = BEA.A06(j ^ -1, A00(obj, j));
        } else {
            A06 = BEA.A06(j, A00(obj, j));
        }
        return AnonymousClass000.A1O((byte) A06);
    }

    public C25851CnD(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public void A07(Object obj, long j, double d) {
        A0A(obj, j, Double.doubleToLongBits(d));
    }

    public void A08(Object obj, long j, float f) {
        A09(obj, j, Float.floatToIntBits(f));
    }
}
