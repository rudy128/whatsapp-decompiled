package X;

/* renamed from: X.CaH  reason: case insensitive filesystem */
public final class C25166CaH {
    public final C25138CZo A00;
    public final C25138CZo A01;

    public C25166CaH(C25138CZo cZo, C25138CZo cZo2) {
        C18070vi.A0d(cZo, 1);
        this.A00 = cZo;
        this.A01 = cZo2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25166CaH) {
                C25166CaH caH = (C25166CaH) obj;
                if (!C18070vi.A18(this.A00, caH.A00) || !C18070vi.A18(this.A01, caH.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Snapshot(sessionCacheSnapshot=");
        A10.append(this.A00);
        A10.append(", sessionlessCacheSnapshot=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
