package X;

/* renamed from: X.9OK  reason: invalid class name */
public abstract class AnonymousClass9OK {
    public static final long A00(Integer num, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        long j7;
        long scalb;
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j8 = 900000 + j2;
                if (j6 < j8) {
                    return j8;
                }
            }
            return j6;
        } else if (z) {
            if (num == AnonymousClass00R.A01) {
                scalb = ((long) i) * j;
            } else {
                scalb = (long) Math.scalb((float) j, i - 1);
            }
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        } else if (z2) {
            if (i2 == 0) {
                j7 = j2 + j3;
            } else {
                j7 = j2 + j5;
            }
            if (j4 == j5 || i2 != 0) {
                return j7;
            }
            return j7 + (j5 - j4);
        } else if (j2 != -1) {
            return j2 + j3;
        } else {
            return Long.MAX_VALUE;
        }
    }
}
