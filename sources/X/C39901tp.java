package X;

/* renamed from: X.1tp  reason: invalid class name and case insensitive filesystem */
public final class C39901tp {
    public static long A00;
    public static C39911tq A01;
    public static final C39901tp A02 = new Object();

    public static final void A01(C39911tq r7) {
        if (r7.A02 != null || r7.A03 != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!r7.A05) {
            synchronized (A02) {
                long j = 8192 + A00;
                if (j <= 65536) {
                    A00 = j;
                    r7.A02 = A01;
                    r7.A00 = 0;
                    r7.A01 = 0;
                    A01 = r7;
                }
            }
        }
    }

    public static final C39911tq A00() {
        synchronized (A02) {
            C39911tq r4 = A01;
            if (r4 == null) {
                return new C39911tq();
            }
            A01 = r4.A02;
            r4.A02 = null;
            A00 -= 8192;
            return r4;
        }
    }
}
