package X;

/* renamed from: X.DxE  reason: case insensitive filesystem */
public class C28306DxE extends AnonymousClass1By {
    public C28339Dxl A00;
    public C28321DxT A01;
    public C28365DyB A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.DxE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.DyD, X.DyB] */
    public static C28306DxE A01(Object obj) {
        if (obj instanceof C28306DxE) {
            return (C28306DxE) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A052 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A00 = A052;
        for (int i = 0; i != A052.A0K(); i++) {
            C28341Dxn A032 = C28341Dxn.A03(A052.A0M(i));
            int i2 = A032.A00;
            if (i2 == 0) {
                obj2.A01 = C28321DxT.A01(A032);
            } else if (i2 == 1) {
                obj2.A06 = AnonymousClass000.A1O(C28336Dxi.A03(A032).A00);
            } else if (i2 == 2) {
                obj2.A05 = AnonymousClass000.A1O(C28336Dxi.A03(A032).A00);
            } else if (i2 == 3) {
                C28269Dwd A033 = C28269Dwd.A03(A032);
                obj2.A02 = new C28367DyD(A033.A0K(), A033.A00);
            } else if (i2 == 4) {
                obj2.A03 = AnonymousClass000.A1O(C28336Dxi.A03(A032).A00);
            } else if (i2 == 5) {
                obj2.A04 = AnonymousClass000.A1O(C28336Dxi.A03(A032).A00);
            } else {
                throw AnonymousClass000.A0k("unknown tag in IssuingDistributionPoint");
            }
        }
        return obj2;
    }

    public String toString() {
        String str = AnonymousClass1Bo.A00;
        StringBuffer A0s = BE6.A0s();
        A0s.append("IssuingDistributionPoint: [");
        A0s.append(str);
        C28321DxT dxT = this.A01;
        if (dxT != null) {
            BEB.A1L("distributionPoint", str, dxT.toString(), A0s);
        }
        if (this.A06) {
            BEB.A1L("onlyContainsUserCerts", str, "true", A0s);
        }
        if (this.A05) {
            BEB.A1L("onlyContainsCACerts", str, "true", A0s);
        }
        C28365DyB dyB = this.A02;
        if (dyB != null) {
            BEB.A1L("onlySomeReasons", str, dyB.toString(), A0s);
        }
        if (this.A04) {
            BEB.A1L("onlyContainsAttributeCerts", str, "true", A0s);
        }
        if (this.A03) {
            BEB.A1L("indirectCRL", str, "true", A0s);
        }
        return BE9.A0p("]", str, A0s);
    }
}
