package X;

/* renamed from: X.1Lh  reason: invalid class name and case insensitive filesystem */
public final class C24691Lh {
    public C24701Li A00;

    public final synchronized void A00() {
        C24701Li r6 = this.A00;
        long j = ((long) r6.A00) + 1;
        int i = (int) j;
        if (j != ((long) i)) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException unused) {
                i = Integer.MAX_VALUE;
            }
        }
        r6.A00 = i;
    }

    public final synchronized void A01() {
        C24701Li r6 = this.A00;
        long j = ((long) r6.A02) + 1;
        int i = (int) j;
        if (j != ((long) i)) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException unused) {
                i = Integer.MAX_VALUE;
            }
        }
        r6.A02 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1Li, java.lang.Object] */
    public C24691Lh() {
        ? obj = new Object();
        obj.A01 = 0;
        obj.A00 = 0;
        obj.A02 = 0;
        this.A00 = obj;
    }
}
