package X;

/* renamed from: X.0Vs  reason: invalid class name and case insensitive filesystem */
public final class C05790Vs implements C16300s2 {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C05790Vs) && C18070vi.A18(this.A00, ((C05790Vs) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C05790Vs(Object obj) {
        this.A00 = obj;
    }

    public Object getValue() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StaticValueHolder(value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
