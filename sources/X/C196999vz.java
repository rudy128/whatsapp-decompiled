package X;

/* renamed from: X.9vz  reason: invalid class name and case insensitive filesystem */
public abstract class C196999vz {
    public static final long A00(C179589Io r4, int i) {
        long j = (long) i;
        if (r4.compareTo(C179589Io.SECONDS) <= 0) {
            return C179589Io.NANOSECONDS.timeUnit.convert(j, r4.timeUnit) << 1;
        }
        return A01(r4, j);
    }

    public static final long A01(C179589Io r6, long j) {
        C179589Io r5 = C179589Io.NANOSECONDS;
        long convert = r6.timeUnit.convert(4611686018426999999L, r5.timeUnit);
        if ((-convert) > j || j > convert) {
            return AnonymousClass8BY.A06(C179589Io.MILLISECONDS.timeUnit.convert(j, r6.timeUnit));
        }
        return r5.timeUnit.convert(j, r6.timeUnit) << 1;
    }
}
