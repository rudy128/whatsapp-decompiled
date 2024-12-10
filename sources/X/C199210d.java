package X;

/* renamed from: X.10d  reason: invalid class name and case insensitive filesystem */
public final class C199210d {
    public C199710i A00;
    public final C199110c A01;
    public final AnonymousClass10b A02;

    public C199210d(C199110c r2, AnonymousClass10b r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public final C199710i A00() {
        C199710i r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C199710i A002 = this.A01.A00(this.A02.A00());
        this.A00 = A002;
        return A002;
    }
}
