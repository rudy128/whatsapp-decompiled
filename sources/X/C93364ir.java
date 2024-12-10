package X;

/* renamed from: X.4ir  reason: invalid class name and case insensitive filesystem */
public final class C93364ir implements C106725Wy {
    public final AnonymousClass1E7 A00;
    public final String A01;

    public C93364ir(AnonymousClass1E7 r2, String str) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93364ir) {
                C93364ir r5 = (C93364ir) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, AnonymousClass000.A0L(this.A00)) + 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLogParticipantItem(contact=");
        A10.append(this.A00);
        A10.append(", name=");
        A10.append(this.A01);
        A10.append(", hideVideoCallButton=");
        return C17900vP.A0F(A10, false);
    }
}
