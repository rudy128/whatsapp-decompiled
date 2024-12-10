package X;

/* renamed from: X.BTh  reason: case insensitive filesystem */
public final class C22873BTh extends C3J {
    public final C24867CNl A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C22873BTh(C24867CNl cNl, boolean z, boolean z2, boolean z3, boolean z4) {
        C18070vi.A0d(cNl, 3);
        this.A03 = z;
        this.A02 = z2;
        this.A00 = cNl;
        this.A01 = z3;
        this.A04 = z4;
    }

    public final C22873BTh A00(C24867CNl cNl, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C24867CNl cNl2 = cNl;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.A03;
        }
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = this.A02;
        }
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = this.A01;
        }
        if (cNl == null) {
            cNl2 = this.A00;
        }
        if (bool4 != null) {
            z4 = bool4.booleanValue();
        } else {
            z4 = this.A04;
        }
        return new C22873BTh(cNl2, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22873BTh) {
                C22873BTh bTh = (C22873BTh) obj;
                if (!(this.A03 == bTh.A03 && this.A02 == bTh.A02 && C18070vi.A18(this.A00, bTh.A00) && this.A01 == bTh.A01 && this.A04 == bTh.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A03), this.A02)), this.A01), this.A04);
    }

    public C22873BTh() {
        this(new BY9(100), false, false, false, false);
    }
}
