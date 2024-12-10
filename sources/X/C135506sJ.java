package X;

/* renamed from: X.6sJ  reason: invalid class name and case insensitive filesystem */
public final class C135506sJ {
    public final int A00;
    public final int A01;
    public final AnonymousClass1BI A02;

    public C135506sJ(AnonymousClass1BI r2, int i, int i2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135506sJ) {
                C135506sJ r5 = (C135506sJ) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A02) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusRankingEngagementData(chatJid=");
        A10.append(this.A02);
        A10.append(", totalClicks=");
        A10.append(this.A00);
        A10.append(", totalImpressions=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
