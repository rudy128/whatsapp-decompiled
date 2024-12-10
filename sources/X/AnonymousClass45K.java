package X;

/* renamed from: X.45K  reason: invalid class name */
public final class AnonymousClass45K extends C83364Ev {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass45K) && this.A00 == ((AnonymousClass45K) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass45K(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NoResponse(toastMessage=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
