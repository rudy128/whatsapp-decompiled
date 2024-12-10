package X;

import java.util.Map;

public final class DDJ implements C28605E9w, C28659ECw {
    public final C25279Ccb A00;
    public final C28605E9w A01;
    public final C25279Ccb A02;
    public final C28659ECw A03;

    public void C1p(ECs eCs, String str, Throwable th, Map map) {
        C18070vi.A0d(eCs, 0);
        this.A00.A07(((DDI) eCs).A09, str, th, map);
        this.A01.C1p(eCs, str, th, map);
    }

    public void C1q(ECs eCs, String str, Map map) {
        C18070vi.A0d(eCs, 0);
        this.A00.A08(((DDI) eCs).A09, str, map);
        this.A01.C1q(eCs, str, map);
    }

    public void C1r(ECs eCs, String str) {
        C18070vi.A0d(eCs, 0);
        this.A00.A06(((DDI) eCs).A09, str);
        this.A01.C1r(eCs, str);
    }

    public boolean CFc(ECs eCs, String str) {
        C18070vi.A0d(eCs, 0);
        Boolean valueOf = Boolean.valueOf(this.A00.A0A(((DDI) eCs).A09));
        if (!C72463Mc.A1Y(valueOf)) {
            valueOf = Boolean.valueOf(this.A01.CFc(eCs, str));
        }
        return C72453Mb.A1Y(valueOf);
    }

    public void C1n(ECs eCs) {
        this.A00.A03(((DDI) eCs).A09);
        this.A01.C1n(eCs);
    }

    public void C1o(ECs eCs, String str) {
        this.A00.A05(((DDI) eCs).A09, str);
        this.A01.C1o(eCs, str);
    }

    public void C3J(ECs eCs) {
        this.A02.A04(((DDI) eCs).A09);
        this.A03.C3J(eCs);
    }

    public void C3M(ECs eCs, Throwable th) {
        DDI ddi = (DDI) eCs;
        this.A02.A01(ddi.A07, ddi.A09, th, eCs.Bfu());
        this.A03.C3M(eCs, th);
    }

    public void C3R(ECs eCs) {
        DDI ddi = (DDI) eCs;
        this.A02.A00(ddi.A07, ddi.A08, ddi.A09, eCs.Bfu());
        this.A03.C3R(eCs);
    }

    public void C3S(ECs eCs) {
        DDI ddi = (DDI) eCs;
        this.A02.A02(ddi.A07, ddi.A09, eCs.Bfu());
        this.A03.C3S(eCs);
    }

    public void C9Q(ECs eCs, String str, boolean z) {
        this.A00.A09(((DDI) eCs).A09, str, z);
        this.A01.C9Q(eCs, str, z);
    }

    public DDJ(C25279Ccb ccb, C28659ECw eCw) {
        this.A00 = ccb;
        this.A01 = eCw;
        this.A02 = ccb;
        this.A03 = eCw;
    }
}
