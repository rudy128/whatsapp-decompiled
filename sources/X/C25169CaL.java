package X;

/* renamed from: X.CaL  reason: case insensitive filesystem */
public final class C25169CaL {
    public final String A00;
    public final AnonymousClass1E7 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25169CaL) {
                C25169CaL caL = (C25169CaL) obj;
                if (!C18070vi.A18(this.A01, caL.A01) || !C18070vi.A18(this.A00, caL.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + C17900vP.A00(this.A00);
    }

    public C25169CaL(AnonymousClass1E7 r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DialogUiState(groupChat=");
        A10.append(this.A01);
        A10.append(", groupChatDefaultName=");
        return C17900vP.A0B(this.A00, A10);
    }
}
