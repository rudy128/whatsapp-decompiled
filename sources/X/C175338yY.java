package X;

/* renamed from: X.8yY  reason: invalid class name and case insensitive filesystem */
public final class C175338yY extends AnonymousClass9MT {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C175338yY) && C18070vi.A18(this.A00, ((C175338yY) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C175338yY(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Err(error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
