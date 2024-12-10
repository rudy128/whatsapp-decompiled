package X;

/* renamed from: X.Cm8  reason: case insensitive filesystem */
public final class C25796Cm8 {
    public final AnonymousClass9IB A00;
    public final AnonymousClass9I3 A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25796Cm8) {
                C25796Cm8 cm8 = (C25796Cm8) obj;
                if (!C18070vi.A18(this.A03, cm8.A03) || !C18070vi.A18(this.A02, cm8.A02) || this.A00 != cm8.A00 || this.A01 != cm8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, (C17880vN.A03(this.A03) + C17900vP.A00(this.A02)) * 31));
    }

    public C25796Cm8(AnonymousClass9IB r2, AnonymousClass9I3 r3, String str, String str2) {
        C72473Md.A1I(str, r2);
        C18070vi.A0d(r3, 4);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r2;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsernameSetViewState(username=");
        A10.append(this.A03);
        A10.append(", errorMessage=");
        A10.append(this.A02);
        A10.append(", usernameAvailabilityState=");
        A10.append(this.A00);
        A10.append(", usernameCtaState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C25796Cm8() {
        this(AnonymousClass9IB.NONE, AnonymousClass9I3.DISABLED, "", (String) null);
    }
}
