package X;

/* renamed from: X.CaE  reason: case insensitive filesystem */
public final class C25163CaE {
    public final CO8 A00;
    public final C25233CbU A01;

    public C25163CaE(CO8 co8, C25233CbU cbU) {
        C18070vi.A0d(co8, 2);
        this.A01 = cbU;
        this.A00 = co8;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25163CaE) {
                C25163CaE caE = (C25163CaE) obj;
                if (!C18070vi.A18(this.A01, caE.A01) || !C18070vi.A18(this.A00, caE.A00)) {
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PendingResponse(queryDefinition=");
        A10.append(this.A01);
        A10.append(", response=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
