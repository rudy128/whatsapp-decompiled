package X;

/* renamed from: X.6HY  reason: invalid class name */
public final class AnonymousClass6HY extends C123246Tr {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6HY) && this.A00 == ((AnonymousClass6HY) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public AnonymousClass6HY(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoveOption(fromFavorites=");
        return C17900vP.A0F(A10, this.A00);
    }
}
