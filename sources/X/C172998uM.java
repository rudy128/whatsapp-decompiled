package X;

/* renamed from: X.8uM  reason: invalid class name and case insensitive filesystem */
public final class C172998uM extends C180759Nu {
    public final Number A00;

    public C172998uM(Number number) {
        C18070vi.A0d(number, 1);
        this.A00 = number;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C172998uM) && C18070vi.A18(this.A00, ((C172998uM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Number(value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
