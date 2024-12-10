package X;

/* renamed from: X.4Uu  reason: invalid class name and case insensitive filesystem */
public final class C87234Uu {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87234Uu) {
                C87234Uu r5 = (C87234Uu) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A04 == r5.A04 && C18070vi.A18(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00((C17880vN.A03(this.A02) + this.A00) * 31, this.A03), this.A04) + AnonymousClass001.A0k(this.A01);
    }

    public C87234Uu(Integer num, String str, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetricRequest(metricType=");
        A10.append(this.A02);
        A10.append(", groupByDays=");
        A10.append(this.A00);
        A10.append(", groupByCountry=");
        A10.append(this.A03);
        A10.append(", groupByRole=");
        A10.append(this.A04);
        A10.append(", limit=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
