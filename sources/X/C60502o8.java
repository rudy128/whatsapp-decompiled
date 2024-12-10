package X;

/* renamed from: X.2o8  reason: invalid class name and case insensitive filesystem */
public abstract class C60502o8 {
    public static final void A01(AnonymousClass206 r2, C693536w r3) {
        C18070vi.A0d(r2, 0);
        AnonymousClass206.A05(r2, r3, C693536w.class);
        if (r3 == null) {
            r2.A0c(2048);
        } else {
            r2.A0b(2048);
        }
    }

    public static final synchronized C693536w A00(AnonymousClass206 r2) {
        C693536w r0;
        synchronized (C60502o8.class) {
            C18070vi.A0d(r2, 0);
            r0 = (C693536w) AnonymousClass206.A01(r2, C693536w.class);
        }
        return r0;
    }
}
