package X;

/* renamed from: X.8km  reason: invalid class name and case insensitive filesystem */
public final class C169278km extends C174298wY {
    public final AF0 A00;
    public final boolean A01;
    public final int A02;
    public final C22494BAb A03;
    public final C22435B7r A04;
    public final BD3 A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C169278km(X.C22494BAb r12, X.C22435B7r r13, X.BD3 r14, X.AF0 r15, int r16, boolean r17) {
        /*
            r11 = this;
            r9 = 0
            r2 = 0
            r7 = 56
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            r10 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A02 = r8
            r11.A00 = r15
            r11.A03 = r12
            r11.A04 = r13
            r11.A05 = r14
            r0 = r17
            r11.A01 = r0
            r11.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169278km.<init>(X.BAb, X.B7r, X.BD3, X.AF0, int, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169278km) {
                C169278km r5 = (C169278km) obj;
                if (this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A00, ((((this.A02 * 31) + 1237) * 31 * 31) + 1237) * 31)))), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TypeaheadBusinessProfileListItemData(wamLocationType=");
        A10.append(this.A02);
        C108975cc.A15(A10, ", shouldShowDistance=");
        AnonymousClass000.A1G(A10, ", userLocation=");
        C108975cc.A15(A10, ", shouldShowProductImages=");
        A10.append(", businessProfile=");
        A10.append(this.A00);
        A10.append(", onClickProfileListener=");
        A10.append(this.A03);
        A10.append(", businessProfileSyncListener=");
        A10.append(this.A04);
        A10.append(", rankingAnalyticsFieldProvider=");
        A10.append(this.A05);
        A10.append(", isRecentSearchBusiness=");
        return C17900vP.A0F(A10, this.A01);
    }
}
