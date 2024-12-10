package X;

/* renamed from: X.AUi  reason: case insensitive filesystem */
public final class C20676AUi implements B89 {
    public final C29621ca A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20676AUi) && C18070vi.A18(this.A00, ((C20676AUi) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C20676AUi(C29621ca r1) {
        this.A00 = r1;
    }

    public C29621ca BXr() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("JsonRawResponse(rawNode=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
