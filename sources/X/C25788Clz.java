package X;

/* renamed from: X.Clz  reason: case insensitive filesystem */
public final class C25788Clz {
    public final AnonymousClass9I3 A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25788Clz) {
                C25788Clz clz = (C25788Clz) obj;
                if (!C18070vi.A18(this.A02, clz.A02) || this.A00 != clz.A00 || !C18070vi.A18(this.A01, clz.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A02)) + C17900vP.A00(this.A01);
    }

    public C25788Clz(AnonymousClass9I3 r1, String str, String str2) {
        C18070vi.A0j(str, r1);
        this.A02 = str;
        this.A00 = r1;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsernamePinSetViewState(usernamePin=");
        A10.append(this.A02);
        A10.append(", usernamePinCtaState=");
        A10.append(this.A00);
        A10.append(", errorMessage=");
        return C17900vP.A0B(this.A01, A10);
    }

    public C25788Clz() {
        this(AnonymousClass9I3.ENABLED, "", (String) null);
    }
}
