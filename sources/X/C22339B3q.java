package X;

/* renamed from: X.B3q  reason: case insensitive filesystem */
public final class C22339B3q extends C180479Ms {
    public static final long A03(float f) {
        return A02((double) f);
    }

    public static final int A00(double d) {
        if (Double.isNaN(d)) {
            throw AnonymousClass000.A0k("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    public static final int A01(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw AnonymousClass000.A0k("Cannot round NaN value.");
    }

    public static final long A02(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw AnonymousClass000.A0k("Cannot round NaN value.");
    }
}
