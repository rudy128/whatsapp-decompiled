package X;

import java.util.Date;

/* renamed from: X.9tj  reason: invalid class name and case insensitive filesystem */
public final class C195679tj {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Date A07;
    public final Date A08;
    public final AEI A09;

    public C195679tj(AEI aei, String str, String str2, String str3, String str4, String str5, Date date, Date date2, int i, long j) {
        C18070vi.A0d(str3, 3);
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A00 = i;
        this.A01 = j;
        this.A08 = date;
        this.A07 = date2;
        this.A02 = str4;
        this.A04 = str5;
        this.A09 = aei;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195679tj) {
                C195679tj r8 = (C195679tj) obj;
                if (!C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A03, r8.A03) || this.A00 != r8.A00 || this.A01 != r8.A01 || !C18070vi.A18(this.A08, r8.A08) || !C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A09, r8.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A05, C17880vN.A03(this.A06));
        long j = this.A01;
        return C17890vO.A02(this.A04, C17890vO.A02(this.A02, (((AnonymousClass001.A0K(j, (C17890vO.A02(this.A03, A022) + this.A00) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + AnonymousClass001.A0k(this.A07)) * 31)) + C17880vN.A02(this.A09);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Promotion(promotionId=");
        AnonymousClass8BT.A1W(A10, this.A06);
        A10.append(this.A05);
        A10.append(", discount=");
        A10.append(this.A03);
        A10.append(", discountType=");
        A10.append(this.A00);
        A10.append(", minimumCartPrice=");
        A10.append(this.A01);
        A10.append(", startDate=");
        A10.append(this.A08);
        A10.append(", endDate=");
        A10.append(this.A07);
        A10.append(", description=");
        A10.append(this.A02);
        A10.append(", moreInfo=");
        A10.append(this.A04);
        A10.append(", media=");
        return AnonymousClass001.A1F(this.A09, A10);
    }
}
