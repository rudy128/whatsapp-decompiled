package X;

/* renamed from: X.Dx7  reason: case insensitive filesystem */
public class C28299Dx7 extends AnonymousClass1By {
    public C28338Dxk A00;
    public C28338Dxk A01;
    public C28278Dwm A02;
    public C28320DxS A03;
    public C28309DxH A04;

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(5);
        csy.A02(this.A02);
        csy.A02(this.A03);
        csy.A02(this.A01);
        C28338Dxk dxk = this.A00;
        if (dxk != null) {
            C28341Dxn.A04(dxk, csy);
        }
        C28309DxH dxH = this.A04;
        if (dxH != null) {
            C28341Dxn.A07(dxH, csy, true);
        }
        return new C28357Dy3(csy);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Dx7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.Dwm] */
    /* JADX WARNING: type inference failed for: r1v8, types: [X.DxS, java.lang.Object] */
    public static C28299Dx7 A01(Object obj) {
        C28278Dwm dwm;
        C28320DxS dxS;
        C28341Dxn dxn;
        AnonymousClass1Bx r0;
        if (obj instanceof C28299Dx7) {
            return (C28299Dx7) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        AnonymousClass1Bx A032 = C28339Dxl.A03(A05);
        if (A032 instanceof C28278Dwm) {
            dwm = (C28278Dwm) A032;
        } else if (A032 != null) {
            C28339Dxl A052 = C28339Dxl.A05(A032);
            ? obj3 = new Object();
            obj3.A03 = C28292Dx0.A01(C28339Dxl.A03(A052));
            obj3.A02 = (C28342Dxo) C28339Dxl.A04(A052);
            obj3.A01 = (C28342Dxo) A052.A0M(2);
            obj3.A00 = (C28337Dxj) A052.A0M(3);
            dwm = obj3;
        } else {
            dwm = null;
        }
        obj2.A02 = dwm;
        AnonymousClass1Bx A0M = A05.A0M(1);
        if (A0M == null || (A0M instanceof C28320DxS)) {
            dxS = (C28320DxS) A0M;
        } else if (A0M instanceof C28341Dxn) {
            C28341Dxn dxn2 = (C28341Dxn) A0M;
            ? obj4 = new Object();
            int i = dxn2.A00;
            obj4.A00 = i;
            if (i != 0) {
                if (i == 1) {
                    r0 = C28290Dwy.A01(C28339Dxl.A06(dxn2, false));
                    obj4.A01 = r0;
                    dxS = obj4;
                } else if (i != 2) {
                    throw AnonymousClass001.A13("Unknown tag encountered: ", AnonymousClass000.A10(), i);
                }
            }
            r0 = C28273Dwh.A00;
            obj4.A01 = r0;
            dxS = obj4;
        } else {
            throw BEB.A0T(A0M, "unknown object in factory: ", AnonymousClass000.A10());
        }
        obj2.A03 = dxS;
        obj2.A01 = C28338Dxk.A06(A05.A0M(2));
        if (A05.A0K() > 4) {
            obj2.A00 = C28338Dxk.A06(C28341Dxn.A02((C28341Dxn) A05.A0M(3)));
            dxn = (C28341Dxn) A05.A0M(4);
        } else {
            if (A05.A0K() > 3) {
                dxn = (C28341Dxn) A05.A0M(3);
                if (dxn.A00 == 0) {
                    obj2.A00 = C28338Dxk.A06(C28341Dxn.A02(dxn));
                    return obj2;
                }
            }
            return obj2;
        }
        obj2.A04 = C28309DxH.A02(C28339Dxl.A06(dxn, true));
        return obj2;
    }
}
