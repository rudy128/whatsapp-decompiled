package X;

/* renamed from: X.2rI  reason: invalid class name and case insensitive filesystem */
public final class C62372rI {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C62372rI) && C18070vi.A18(this.A00, ((C62372rI) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C62372rI(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PhoenixFlowInfo(config=");
        return C17900vP.A0B(this.A00, A10);
    }

    public C62372rI() {
        this("");
    }
}
