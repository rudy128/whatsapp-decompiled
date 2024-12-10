package X;

/* renamed from: X.9s6  reason: invalid class name and case insensitive filesystem */
public final class C194669s6 {
    public final AnonymousClass99E A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194669s6) {
                C194669s6 r5 = (C194669s6) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
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

    public C194669s6(AnonymousClass99E r1, String str, String str2) {
        C18070vi.A0k(r1, str2);
        this.A02 = str;
        this.A00 = r1;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifyPasskeyParams(screenType=");
        A10.append(this.A02);
        A10.append(", clientMetrics=");
        A10.append(this.A00);
        A10.append(", passkeySolvedJsonChallenge=");
        return C17900vP.A0B(this.A01, A10);
    }
}
