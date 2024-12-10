package X;

/* renamed from: X.4Te  reason: invalid class name and case insensitive filesystem */
public final class C86814Te {
    public final Boolean A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86814Te) {
                C86814Te r5 = (C86814Te) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C86814Te(String str, Boolean bool) {
        this.A01 = str;
        this.A00 = bool;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Session(funnelId=");
        A10.append(this.A01);
        A10.append(", captionAdded=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
