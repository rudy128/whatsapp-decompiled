package X;

/* renamed from: X.93p  reason: invalid class name */
public final class AnonymousClass93p extends AnonymousClass9MV {
    public final AEP A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass93p) && C18070vi.A18(this.A00, ((AnonymousClass93p) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass93p(AEP aep) {
        this.A00 = aep;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NavigateToSendPaymentScreen(metaData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
