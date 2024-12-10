package X;

/* renamed from: X.6tx  reason: invalid class name and case insensitive filesystem */
public final class C136526tx {
    public final int A00;
    public final C133786pU A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C136526tx(C133786pU r2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        C18070vi.A0d(str2, 2);
        this.A04 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A03 = str3;
        this.A02 = num;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136526tx) {
                C136526tx r5 = (C136526tx) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || this.A00 != r5.A00 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A032 = C17880vN.A03(this.A04);
        String str = this.A03;
        return AnonymousClass000.A0O(this.A01, (((((((C17890vO.A02(str, (C17890vO.A02(this.A05, A032) + this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A07)) * 31) + C108955ca.A06(this.A08)) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountLinkingBloksFetcherParams(appId=");
        A10.append(this.A04);
        A10.append(", entryPoint=");
        A10.append(this.A05);
        A10.append(", accountType=");
        A10.append(this.A00);
        A10.append(", accessToken=");
        A10.append(this.A03);
        A10.append(", markerId=");
        A10.append(this.A02);
        A10.append(", loggingEvent=");
        A10.append(this.A06);
        A10.append(", webAuthData=");
        A10.append(this.A07);
        A10.append(", opaqueTarget=");
        A10.append(this.A08);
        A10.append(", callbacks=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
