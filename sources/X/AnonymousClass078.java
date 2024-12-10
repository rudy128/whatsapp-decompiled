package X;

/* renamed from: X.078  reason: invalid class name */
public final class AnonymousClass078 extends AnonymousClass0I9 {
    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass078) {
            AnonymousClass0I9 r3 = (AnonymousClass0I9) obj;
            if (!C18070vi.A18(r3.A01, this.A01) || !C18070vi.A18(r3.A00, this.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }
}
