package X;

/* renamed from: X.4VD  reason: invalid class name */
public final class AnonymousClass4VD {
    public final long A00;
    public final C179509Ig A01;
    public final AnonymousClass1E7 A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VD) {
                AnonymousClass4VD r8 = (AnonymousClass4VD) obj;
                if (!(C18070vi.A18(this.A02, r8.A02) && C18070vi.A18(this.A04, r8.A04) && C18070vi.A18(this.A03, r8.A03) && this.A05 == r8.A05 && this.A01 == r8.A01 && this.A07 == r8.A07 && this.A06 == r8.A06 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0L = (AnonymousClass000.A0L(this.A02) + C17900vP.A00(this.A04)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return AnonymousClass001.A0J(this.A00, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass0DV.A00((A0L + i) * 31, this.A05)), this.A07), this.A06));
    }

    public AnonymousClass4VD(C179509Ig r1, AnonymousClass1E7 r2, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        this.A02 = r2;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A01 = r1;
        this.A07 = z2;
        this.A06 = z3;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterUiState(contact=");
        A10.append(this.A02);
        A10.append(", title=");
        A10.append(this.A04);
        A10.append(", description=");
        A10.append(this.A03);
        A10.append(", isMuted=");
        A10.append(this.A05);
        A10.append(", membership=");
        A10.append(this.A01);
        A10.append(", isVerified=");
        A10.append(this.A07);
        A10.append(", isSuspended=");
        A10.append(this.A06);
        A10.append(", followersCount=");
        return C17900vP.A0E(A10, this.A00);
    }
}
