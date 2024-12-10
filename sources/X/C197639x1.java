package X;

/* renamed from: X.9x1  reason: invalid class name and case insensitive filesystem */
public final class C197639x1 {
    public final AnonymousClass1XN A00;

    public C197639x1(AnonymousClass1XN r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final boolean A00(C20079A6f a6f) {
        String str;
        if (a6f == null || (str = a6f.A08) == null) {
            return false;
        }
        if (str.equals("device") || str.equals("pin_on_map")) {
            return true;
        }
        return false;
    }
}
