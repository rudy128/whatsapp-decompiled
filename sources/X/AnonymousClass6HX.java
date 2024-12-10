package X;

/* renamed from: X.6HX  reason: invalid class name */
public final class AnonymousClass6HX extends C123246Tr {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6HX) && this.A00 == ((AnonymousClass6HX) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass6HX(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CreateAvatarOption(iconRes=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
