package X;

/* renamed from: X.8mH  reason: invalid class name */
public final class AnonymousClass8mH extends C186649eX {
    public final boolean A00;

    public AnonymousClass8mH(boolean z) {
        super(AnonymousClass8mD.A00, z, false, false);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8mH) && this.A00 == ((AnonymousClass8mH) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CategoryList(isCategoriesEnabled=");
        return C17900vP.A0F(A10, this.A00);
    }
}
