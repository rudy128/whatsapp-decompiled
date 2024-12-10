package X;

/* renamed from: X.DxJ  reason: case insensitive filesystem */
public class C28311DxJ extends AnonymousClass1By {
    public static final C28337Dxj A06 = new C28337Dxj(0);
    public C28338Dxk A00;
    public C28337Dxj A01;
    public C28339Dxl A02;
    public C28319DxR A03;
    public C28309DxH A04;
    public boolean A05;

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(5);
        if (this.A05 || !this.A01.A0J(A06)) {
            C28341Dxn.A04(this.A01, csy);
        }
        csy.A02(this.A03);
        csy.A02(this.A00);
        csy.A02(this.A02);
        C28309DxH dxH = this.A04;
        if (dxH != null) {
            C28341Dxn.A07(dxH, csy, true);
        }
        return new C28357Dy3(csy);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.DxJ] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.DxR, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.DxR, java.lang.Object] */
    public static C28311DxJ A01(Object obj) {
        C28319DxR dxR;
        C28319DxR dxR2;
        C28324DxW A012;
        if (obj instanceof C28311DxJ) {
            return (C28311DxJ) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A052 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        int i = 0;
        if (!(A052.A0M(0) instanceof C28341Dxn) || ((C28341Dxn) A052.A0M(0)).A00 != 0) {
            obj2.A01 = A06;
        } else {
            obj2.A05 = true;
            obj2.A01 = C28337Dxj.A02(C28341Dxn.A02((C28341Dxn) A052.A0M(0)));
            i = 1;
        }
        int i2 = i + 1;
        AnonymousClass1Bx A0M = A052.A0M(i);
        if (A0M instanceof C28319DxR) {
            dxR2 = (C28319DxR) A0M;
        } else {
            if (!(A0M instanceof C28327DxZ)) {
                if (A0M instanceof C28341Dxn) {
                    C28341Dxn dxn = (C28341Dxn) A0M;
                    if (dxn.A00 == 1) {
                        CZY czy = C28324DxW.A05;
                        A012 = C28324DxW.A01(C28339Dxl.A06(dxn, true));
                    } else {
                        A0M = C28342Dxo.A04(dxn, true);
                    }
                } else {
                    A012 = C28324DxW.A01(A0M);
                }
                ? obj3 = new Object();
                obj3.A00 = A012;
                dxR = obj3;
                dxR2 = dxR;
            }
            ? obj4 = new Object();
            obj4.A00 = A0M;
            dxR = obj4;
            dxR2 = dxR;
        }
        obj2.A03 = dxR2;
        int i3 = i2 + 1;
        obj2.A00 = C28338Dxk.A06(A052.A0M(i2));
        int i4 = i3 + 1;
        obj2.A02 = (C28339Dxl) A052.A0M(i3);
        if (A052.A0K() > i4) {
            obj2.A04 = C28309DxH.A02(C28339Dxl.A06((C28341Dxn) A052.A0M(i4), true));
        }
        return obj2;
    }
}
