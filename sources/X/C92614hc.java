package X;

/* renamed from: X.4hc  reason: invalid class name and case insensitive filesystem */
public final class C92614hc implements C106575Wj {
    public final C106545Wg A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92614hc) && C18070vi.A18(this.A00, ((C92614hc) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C92614hc() {
        this(C92534hU.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Disabled(reason=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C92614hc(C106545Wg r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }
}
