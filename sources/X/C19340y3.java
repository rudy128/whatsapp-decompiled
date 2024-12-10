package X;

/* renamed from: X.0y3  reason: invalid class name and case insensitive filesystem */
public abstract class C19340y3 {
    public long A00(C19300xz r10, int i, long j) {
        C19350y4 r2 = (C19350y4) this;
        long BaO = j - r2.A00.BaO();
        long j2 = ((C19320y1) ((C19310y0) r2.A01.get(r10))).A00;
        long j3 = j2;
        int i2 = i - 1;
        if (j2 <= 1) {
            j3 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) j2) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j3 * ((long) i2))))), BaO), 86400000);
    }
}
