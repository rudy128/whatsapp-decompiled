package X;

/* renamed from: X.9ny  reason: invalid class name and case insensitive filesystem */
public final class C192199ny {
    public final AP6 A00;
    public final AnonymousClass8nD A01;

    public C192199ny(AP6 ap6, AnonymousClass8nD r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = ap6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj) || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((C192199ny) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
