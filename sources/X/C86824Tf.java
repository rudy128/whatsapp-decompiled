package X;

/* renamed from: X.4Tf  reason: invalid class name and case insensitive filesystem */
public final class C86824Tf {
    public final C42751yg A00;
    public final AnonymousClass1E7 A01;

    public C86824Tf(C42751yg r2, AnonymousClass1E7 r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86824Tf) {
                C86824Tf r5 = (C86824Tf) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
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
        A10.append("GroupParticipantContactAndName(contact=");
        A10.append(this.A01);
        A10.append(", displayNameAndType=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
