package X;

/* renamed from: X.Dwt  reason: case insensitive filesystem */
public class C28285Dwt extends AnonymousClass1By {
    public C28321DxT A00;
    public C28317DxP A01;
    public C28365DyB A02;

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(3);
        C28321DxT dxT = this.A00;
        if (dxT != null) {
            C28341Dxn.A06(dxT, csy, 0, true);
        }
        C28365DyB dyB = this.A02;
        if (dyB != null) {
            C28341Dxn.A06(dyB, csy, 1, false);
        }
        C28317DxP dxP = this.A01;
        if (dxP != null) {
            C28341Dxn.A06(dxP, csy, 2, false);
        }
        return new C28357Dy3(csy);
    }

    public String toString() {
        String str = AnonymousClass1Bo.A00;
        StringBuffer A0s = BE6.A0s();
        A0s.append("DistributionPoint: [");
        A0s.append(str);
        C28321DxT dxT = this.A00;
        if (dxT != null) {
            BEB.A1L("distributionPoint", str, dxT.toString(), A0s);
        }
        C28365DyB dyB = this.A02;
        if (dyB != null) {
            BEB.A1L("reasons", str, dyB.toString(), A0s);
        }
        C28317DxP dxP = this.A01;
        if (dxP != null) {
            BEB.A1L("cRLIssuer", str, dxP.toString(), A0s);
        }
        return BE9.A0p("]", str, A0s);
    }
}
