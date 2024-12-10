package X;

/* renamed from: X.9tY  reason: invalid class name and case insensitive filesystem */
public final class C195569tY {
    public final long A00;
    public final C179509Ig A01;
    public final AnonymousClass9IV A02;
    public final AnonymousClass1E2 A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final C29681ch A07;

    public C195569tY(C179509Ig r2, AnonymousClass9IV r3, AnonymousClass1E2 r4, C29681ch r5, Long l, String str, String str2, long j) {
        AnonymousClass8BU.A1H(r5, 1, r3);
        this.A07 = r5;
        this.A03 = r4;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = l;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195569tY) {
                C195569tY r8 = (C195569tY) obj;
                if (!C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A04, r8.A04) || this.A01 != r8.A01 || this.A02 != r8.A02 || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A01, (((((((AnonymousClass000.A0L(this.A07) + AnonymousClass001.A0k(this.A03)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A06)) * 31) + C17880vN.A02(this.A04)) * 31)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterMember(newsletterJid=");
        A10.append(this.A07);
        A10.append(", memberJid=");
        A10.append(this.A03);
        A10.append(", displayName=");
        A10.append(this.A05);
        A10.append(", profilePictureDirectPath=");
        A10.append(this.A06);
        A10.append(", followTimestamp=");
        A10.append(this.A04);
        A10.append(", role=");
        A10.append(this.A01);
        A10.append(", typeOfFetch=");
        A10.append(this.A02);
        A10.append(", fetchedMs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
