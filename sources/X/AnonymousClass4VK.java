package X;

/* renamed from: X.4VK  reason: invalid class name */
public final class AnonymousClass4VK {
    public final AnonymousClass210 A00;

    public AnonymousClass4VK(AnonymousClass210 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4VK) && C18070vi.A18(this.A00, ((AnonymousClass4VK) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public final Integer A00() {
        C692136i A002 = AnonymousClass2UX.A00(this.A00);
        if (A002 != null) {
            return A002.A02;
        }
        return null;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Item(message=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
