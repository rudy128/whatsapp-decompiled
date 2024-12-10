package X;

/* renamed from: X.0JC  reason: invalid class name */
public final class AnonymousClass0JC {
    public final C17190uG A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0JC) {
                AnonymousClass0JC r5 = (AnonymousClass0JC) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A05(0.0f));
    }

    public AnonymousClass0JC(C17190uG r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1H(A10, "Fade(alpha=");
        A10.append(", animationSpec=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
