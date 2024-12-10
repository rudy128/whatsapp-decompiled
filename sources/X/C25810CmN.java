package X;

/* renamed from: X.CmN  reason: case insensitive filesystem */
public final class C25810CmN {
    public boolean A00;
    public final C25793Cm5 A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25810CmN) {
                C25810CmN cmN = (C25810CmN) obj;
                if (!(this.A00 == cmN.A00 && this.A05 == cmN.A05 && this.A06 == cmN.A06 && this.A04 == cmN.A04 && this.A07 == cmN.A07 && this.A08 == cmN.A08 && C18070vi.A18(this.A01, cmN.A01) && this.A09 == cmN.A09 && C18070vi.A18(this.A02, cmN.A02) && C18070vi.A18(this.A03, cmN.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A00), this.A05), this.A06), this.A04), this.A07), this.A08)), this.A09) + AnonymousClass001.A0k(this.A02)) * 31) + C108955ca.A06(this.A03);
    }

    public C25810CmN(C25793Cm5 cm5, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A04 = z4;
        this.A07 = z5;
        this.A08 = z6;
        this.A01 = cm5;
        this.A09 = z7;
        this.A02 = num;
        this.A03 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(viewVisible=");
        A10.append(this.A00);
        A10.append(", fullToggleVisible=");
        A10.append(this.A05);
        A10.append(", glassesSelected=");
        A10.append(this.A06);
        A10.append(", connecting=");
        A10.append(this.A04);
        A10.append(", isConnected=");
        A10.append(this.A07);
        A10.append(", isStatusIndicatorVisible=");
        A10.append(this.A08);
        A10.append(", statusIndicatorViewState=");
        A10.append(this.A01);
        A10.append(", isTooltipVisible=");
        A10.append(this.A09);
        A10.append(", tooltipTextRes=");
        A10.append(this.A02);
        A10.append(", tooltipTextStringKey=");
        return C17900vP.A0B(this.A03, A10);
    }

    public C25810CmN() {
        this(new C25793Cm5((C24867CNl) null, false, false, false), (Integer) null, (String) null, true, false, false, false, false, false, false);
    }
}
