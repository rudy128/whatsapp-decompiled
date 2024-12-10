package X;

/* renamed from: X.DxT  reason: case insensitive filesystem */
public class C28321DxT extends AnonymousClass1By implements E3M {
    public int A00;
    public AnonymousClass1Bx A01;

    public AnonymousClass1Bz CP9() {
        return new C28341Dxn(this.A01, this.A00, false);
    }

    public String toString() {
        String str;
        String str2 = AnonymousClass1Bo.A00;
        StringBuffer A0s = BE6.A0s();
        A0s.append("DistributionPointName: [");
        A0s.append(str2);
        int i = this.A00;
        String obj = this.A01.toString();
        if (i == 0) {
            str = "fullName";
        } else {
            str = "nameRelativeToCRLIssuer";
        }
        BEB.A1L(str, str2, obj, A0s);
        return BE9.A0p("]", str2, A0s);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.DxT, java.lang.Object] */
    public static C28321DxT A01(C28341Dxn dxn) {
        AnonymousClass1Bx A03;
        C28341Dxn A032 = C28341Dxn.A03(C28341Dxn.A02(dxn));
        if (A032 == null) {
            return null;
        }
        ? obj = new Object();
        int i = A032.A00;
        obj.A00 = i;
        if (i == 0) {
            A03 = new C28317DxP(C28339Dxl.A06(A032, false));
        } else {
            A03 = C28340Dxm.A03(A032);
        }
        obj.A01 = A03;
        return obj;
    }
}
