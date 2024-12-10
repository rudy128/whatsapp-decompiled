package X;

/* renamed from: X.1eM  reason: invalid class name and case insensitive filesystem */
public abstract class C30691eM {
    public static final AnonymousClass1IU A00(Throwable th) {
        C18070vi.A0d(th, 0);
        return new AnonymousClass1IU(th);
    }

    public static final void A01(Object obj) {
        if (obj instanceof AnonymousClass1IU) {
            throw ((AnonymousClass1IU) obj).exception;
        }
    }
}
