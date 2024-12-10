package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.8kl  reason: invalid class name and case insensitive filesystem */
public final class C169268kl extends C174298wY {
    public final int A00;
    public final LatLng A01;
    public final C22494BAb A02;
    public final C22435B7r A03;
    public final AF0 A04;
    public final boolean A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C169268kl(com.google.android.gms.maps.model.LatLng r12, X.C22494BAb r13, X.C22435B7r r14, X.AF0 r15, int r16, boolean r17) {
        /*
            r11 = this;
            r10 = 1
            r5 = 0
            r7 = 74
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r6 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r8
            r11.A05 = r9
            r11.A01 = r12
            r11.A04 = r15
            r11.A02 = r13
            r11.A03 = r14
            r0 = 0
            r11.A03 = r0
            r11.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169268kl.<init>(com.google.android.gms.maps.model.LatLng, X.BAb, X.B7r, X.AF0, int, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169268kl) {
                C169268kl r5 = (C169268kl) obj;
                if (this.A00 != r5.A00 || this.A05 != r5.A05 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = AnonymousClass0DV.A00(this.A00 * 31, this.A05);
        return (AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A04, (AnonymousClass000.A0N(this.A01, A002) + 1231) * 31))) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MapViewBusinessProfileListItem(wamLocationType=");
        A10.append(this.A00);
        A10.append(", shouldShowDistance=");
        A10.append(this.A05);
        A10.append(", userLocation=");
        A10.append(this.A01);
        C108975cc.A16(A10, ", shouldShowProductImages=");
        A10.append(", businessProfile=");
        A10.append(this.A04);
        A10.append(", onClickProfileListener=");
        A10.append(this.A02);
        A10.append(", businessProfileSyncListener=");
        A10.append(this.A03);
        AnonymousClass000.A1G(A10, ", rankingAnalyticsFieldProvider=");
        A10.append(", isRecentSearchBusiness=");
        return C17900vP.A0F(A10, false);
    }
}
