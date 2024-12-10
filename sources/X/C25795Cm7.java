package X;

/* renamed from: X.Cm7  reason: case insensitive filesystem */
public final class C25795Cm7 {
    public final C82804Cd A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25795Cm7) {
                C25795Cm7 cm7 = (C25795Cm7) obj;
                if (!C18070vi.A18(this.A01, cm7.A01) || this.A00 != cm7.A00 || !C18070vi.A18(this.A03, cm7.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A03, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A01)));
    }

    public C25795Cm7(C82804Cd r4, String str, String str2) {
        C18070vi.A0o(str, r4, str2);
        this.A01 = str;
        this.A00 = r4;
        this.A03 = str2;
        this.A02 = (str2.length() <= 0 || str2.charAt(0) != '@') ? C17890vO.A0Z(str2, AnonymousClass000.A10(), '@') : str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StartConversationWithSettingsViewState(phoneNumber=");
        A10.append(this.A01);
        A10.append(", privacyMode=");
        A10.append(this.A00);
        A10.append(", rawUsername=");
        return C17900vP.A0B(this.A03, A10);
    }

    public C25795Cm7() {
        this(C82804Cd.USERNAME, "", "");
    }
}
