package X;

/* renamed from: X.3xQ  reason: invalid class name and case insensitive filesystem */
public final class C80573xQ extends C86334Rf {
    public final String A00;

    public C80573xQ(String str) {
        super(1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj) || !super.equals(obj)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((C80573xQ) obj).A00);
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, super.hashCode());
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }
}
