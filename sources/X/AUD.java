package X;

public final class AUD implements B5E {
    public final C179659Iv A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AUD) && this.A00 == ((AUD) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AUD(C179659Iv r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndividualError(error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
