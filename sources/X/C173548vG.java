package X;

/* renamed from: X.8vG  reason: invalid class name and case insensitive filesystem */
public final class C173548vG extends AnonymousClass9MQ {
    public final C29621ca A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C173548vG) && C18070vi.A18(this.A00, ((C173548vG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C173548vG(C29621ca r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(protocolTreeNode=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
