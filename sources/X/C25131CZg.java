package X;

/* renamed from: X.CZg  reason: case insensitive filesystem */
public final class C25131CZg {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25131CZg) && C18070vi.A18(this.A00, ((C25131CZg) obj).A00));
    }

    public C25131CZg(Integer num) {
        this.A00 = num;
    }

    public int hashCode() {
        return -1400004710 + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QplLoggingPayload(markerId=");
        A10.append(231933222);
        A10.append(", qplInstanceKey=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
