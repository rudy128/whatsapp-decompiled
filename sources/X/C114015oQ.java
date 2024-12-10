package X;

/* renamed from: X.5oQ  reason: invalid class name and case insensitive filesystem */
public final class C114015oQ extends C122986Sr {
    public final AnonymousClass6VQ A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114015oQ) && C18070vi.A18(this.A00, ((C114015oQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C114015oQ(AnonymousClass6VQ r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
