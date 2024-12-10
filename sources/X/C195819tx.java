package X;

import java.util.List;

/* renamed from: X.9tx  reason: invalid class name and case insensitive filesystem */
public final class C195819tx {
    public final Double A00;
    public final Double A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195819tx) {
                C195819tx r5 = (C195819tx) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || this.A0C != r5.A0C || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A07, C17880vN.A03(this.A06));
        return AnonymousClass000.A0N(this.A0B, (((((((AnonymousClass0DV.A00((((((C17890vO.A02(this.A0A, A022) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31, this.A0C) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A09)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C108955ca.A06(this.A08);
    }

    public C195819tx(Double d, Double d2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        C18070vi.A0o(str, str2, str3);
        this.A06 = str;
        this.A07 = str2;
        this.A0A = str3;
        this.A04 = num;
        this.A03 = num2;
        this.A02 = num3;
        this.A0C = z;
        this.A05 = str4;
        this.A09 = str5;
        this.A00 = d;
        this.A01 = d2;
        this.A0B = list;
        this.A08 = str6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessSearchProfile(id=");
        A10.append(this.A06);
        A10.append(", jid=");
        A10.append(this.A07);
        A10.append(", verifiedName=");
        A10.append(this.A0A);
        A10.append(", verificationLevel=");
        A10.append(this.A04);
        A10.append(", igFollowers=");
        A10.append(this.A03);
        A10.append(", fbFollowers=");
        A10.append(this.A02);
        A10.append(", isWelcomeBannerEligible=");
        A10.append(this.A0C);
        A10.append(", creationDate=");
        A10.append(this.A05);
        A10.append(", subTitle=");
        A10.append(this.A09);
        A10.append(", latitude=");
        A10.append(this.A00);
        A10.append(", longitude=");
        A10.append(this.A01);
        A10.append(", verifiedNameHighlightRanges=");
        A10.append(this.A0B);
        A10.append(", rankingId=");
        return C17900vP.A0B(this.A08, A10);
    }
}
