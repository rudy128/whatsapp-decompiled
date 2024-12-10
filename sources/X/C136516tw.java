package X;

/* renamed from: X.6tw  reason: invalid class name and case insensitive filesystem */
public final class C136516tw {
    public final int A00;
    public final long A01;
    public final C29681ch A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136516tw) {
                C136516tw r8 = (C136516tw) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00 || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A06, r8.A06) || this.A01 != r8.A01 || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A08, r8.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0K(this.A01, ((((((((((((AnonymousClass001.A0k(this.A02) * 31) + this.A00) * 31) + C17900vP.A00(this.A04)) * 31) + 1231) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A05)) * 31) + C108955ca.A06(this.A08);
    }

    public C136516tw(C29681ch r1, Integer num, String str, String str2, String str3, String str4, String str5, int i, long j) {
        this.A02 = r1;
        this.A00 = i;
        this.A04 = str;
        this.A03 = num;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = j;
        this.A05 = str4;
        this.A08 = str5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterCallState(jid=");
        A10.append(this.A02);
        A10.append(", entryPoint=");
        A10.append(this.A00);
        A10.append(", code=");
        A10.append(this.A04);
        C108975cc.A16(A10, ", isOpenFromPrimarySurface=");
        A10.append(", logInstanceKey=");
        A10.append(this.A03);
        A10.append(", pcId=");
        A10.append(this.A07);
        A10.append(", name=");
        A10.append(this.A06);
        A10.append(", expiration=");
        A10.append(this.A01);
        A10.append(", handler=");
        A10.append(this.A05);
        A10.append(", type=");
        return C17900vP.A0B(this.A08, A10);
    }
}
