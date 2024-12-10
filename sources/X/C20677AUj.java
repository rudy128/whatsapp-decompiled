package X;

/* renamed from: X.AUj  reason: case insensitive filesystem */
public final class C20677AUj implements B89 {
    public final C28473E2o A00;
    public final C29621ca A01;

    public C20677AUj(C28473E2o e2o, C29621ca r3) {
        C18070vi.A0d(e2o, 2);
        this.A01 = r3;
        this.A00 = e2o;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20677AUj) {
                C20677AUj aUj = (C20677AUj) obj;
                if (!C18070vi.A18(this.A01, aUj.A01) || !C18070vi.A18(this.A00, aUj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C29621ca BXr() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoRawResponse(rawNode=");
        A10.append(this.A01);
        A10.append(", wireType=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
