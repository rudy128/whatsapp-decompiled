package X;

/* renamed from: X.7Lk  reason: invalid class name and case insensitive filesystem */
public final class C145477Lk implements C1596485i {
    public final ADN A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C145477Lk) && C18070vi.A18(this.A00, ((C145477Lk) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C145477Lk(ADN adn) {
        this.A00 = adn;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnSendSmsToWaRequestFailed(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
