package X;

/* renamed from: X.6sf  reason: invalid class name and case insensitive filesystem */
public final class C135726sf {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135726sf) {
                C135726sf r8 = (C135726sf) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00 || this.A01 != r8.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass001.A0K(this.A00, ((C17900vP.A00(this.A03) * 31) + C108955ca.A06(this.A02)) * 31));
    }

    public C135726sf(long j, String str, long j2, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EvolvedAbout(textStatus=");
        A10.append(this.A03);
        A10.append(", emoji=");
        A10.append(this.A02);
        A10.append(", duration=");
        A10.append(this.A00);
        A10.append(", timestamp=");
        return C17900vP.A0E(A10, this.A01);
    }
}
