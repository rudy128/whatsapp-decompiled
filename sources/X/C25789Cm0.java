package X;

/* renamed from: X.Cm0  reason: case insensitive filesystem */
public final class C25789Cm0 {
    public final C82804Cd A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25789Cm0) {
                C25789Cm0 cm0 = (C25789Cm0) obj;
                if (!C18070vi.A18(this.A02, cm0.A02) || this.A00 != cm0.A00 || !C18070vi.A18(this.A01, cm0.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A02)));
    }

    public C25789Cm0(C82804Cd r1, String str, String str2) {
        C18070vi.A0o(str, r1, str2);
        this.A02 = str;
        this.A00 = r1;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsernameSettingsViewState(username=");
        A10.append(this.A02);
        A10.append(", privacyMode=");
        A10.append(this.A00);
        A10.append(", pin=");
        return C17900vP.A0B(this.A01, A10);
    }

    public C25789Cm0() {
        this(C82804Cd.USERNAME, "", "");
    }
}
