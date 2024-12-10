package X;

/* renamed from: X.0MD  reason: invalid class name */
public final class AnonymousClass0MD {
    public static volatile AnonymousClass0sQ A00;

    /* JADX WARNING: type inference failed for: r0v9, types: [X.0sQ, java.lang.Object] */
    public static final void A00(AnonymousClass0CT r2, String str, String str2, Throwable th) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(str, 1);
        C18070vi.A0d(str2, 2);
        if (A00 == null) {
            synchronized (AnonymousClass0MD.class) {
                if (A00 == null) {
                    A00 = new Object();
                }
            }
        }
        AnonymousClass0sQ r0 = A00;
        if (r0 != null) {
            r0.CFK(r2, str, str2, th);
            return;
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }
}
