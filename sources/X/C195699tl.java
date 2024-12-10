package X;

import java.util.List;

/* renamed from: X.9tl  reason: invalid class name and case insensitive filesystem */
public final class C195699tl {
    public final A1X A00;
    public final Double A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195699tl) {
                C195699tl r5 = (C195699tl) obj;
                if (!C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A09, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0L(this.A07)));
        return AnonymousClass000.A0O(this.A00, (((((((((AnonymousClass000.A0N(this.A08, A0N) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17900vP.A00(this.A04)) * 31) + C108955ca.A06(this.A02)) * 31);
    }

    public C195699tl(A1X a1x, Double d, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4) {
        this.A07 = list;
        this.A06 = list2;
        this.A09 = list3;
        this.A08 = list4;
        this.A03 = str;
        this.A05 = str2;
        this.A01 = d;
        this.A04 = str3;
        this.A02 = str4;
        this.A00 = a1x;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessSearchResult(categories=");
        A10.append(this.A07);
        A10.append(", apiBusinesses=");
        A10.append(this.A06);
        A10.append(", localBusinesses=");
        A10.append(this.A09);
        A10.append(", filterCategories=");
        A10.append(this.A08);
        A10.append(", pageId=");
        A10.append(this.A03);
        A10.append(", requestId=");
        A10.append(this.A05);
        A10.append(", proximityWeight=");
        A10.append(this.A01);
        A10.append(", rankingLogicVer=");
        A10.append(this.A04);
        A10.append(", csvmConfig=");
        A10.append(this.A02);
        A10.append(", serpMapViewResult=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
