package X;

/* renamed from: X.93o  reason: invalid class name */
public final class AnonymousClass93o extends AnonymousClass9MU {
    public final C20270AEd A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass93o) && C18070vi.A18(this.A00, ((AnonymousClass93o) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass93o(C20270AEd aEd) {
        this.A00 = aEd;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NavigateToNextScreen(paymentDetailsViewState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
