package X;

/* renamed from: X.8m5  reason: invalid class name */
public final class AnonymousClass8m5 extends AnonymousClass9XE {
    public final AnonymousClass9MB A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8m5) && C18070vi.A18(this.A00, ((AnonymousClass8m5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8m5(AnonymousClass9MB r2) {
        super(C18460wS.A00);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FailedContinueSearch(failureType=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
