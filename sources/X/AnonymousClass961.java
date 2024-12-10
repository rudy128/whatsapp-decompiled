package X;

/* renamed from: X.961  reason: invalid class name */
public final class AnonymousClass961 extends AnonymousClass9MX {
    public final C188449hR A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass961) && C18070vi.A18(this.A00, ((AnonymousClass961) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass961(C188449hR r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(vpaData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
