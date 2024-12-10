package X;

/* renamed from: X.6DS  reason: invalid class name */
public final class AnonymousClass6DS extends AnonymousClass6SM {
    public final C180039Kw error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DS) && C18070vi.A18(this.error, ((AnonymousClass6DS) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public AnonymousClass6DS(C180039Kw r1) {
        this.error = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NetworkError(error=");
        return AnonymousClass001.A1F(this.error, A10);
    }
}
