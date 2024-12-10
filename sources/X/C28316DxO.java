package X;

/* renamed from: X.DxO  reason: case insensitive filesystem */
public class C28316DxO extends AnonymousClass1By {
    public static final C28337Dxj A04 = new C28337Dxj(20);
    public static final C28337Dxj A05 = new C28337Dxj(1);
    public static final C28292Dx0 A06;
    public static final C28292Dx0 A07;
    public C28337Dxj A00 = A04;
    public C28337Dxj A01 = A05;
    public C28292Dx0 A02 = A06;
    public C28292Dx0 A03 = A07;

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(4);
        C28292Dx0 dx0 = this.A02;
        if (!dx0.equals(A06)) {
            C28341Dxn.A04(dx0, csy);
        }
        C28292Dx0 dx02 = this.A03;
        if (!dx02.equals(A07)) {
            C28341Dxn.A07(dx02, csy, true);
        }
        C28337Dxj dxj = this.A00;
        if (!dxj.A0J(A04)) {
            C28341Dxn.A06(dxj, csy, 2, true);
        }
        C28337Dxj dxj2 = this.A01;
        if (!dxj2.A0J(A05)) {
            C28341Dxn.A06(dxj2, csy, 3, true);
        }
        return new C28357Dy3(csy);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Dx0, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.Dx0, java.lang.Object] */
    static {
        AnonymousClass1C0 r1 = AnonymousClass1C6.A07;
        C28273Dwh dwh = C28273Dwh.A00;
        ? obj = new Object();
        obj.A01 = r1;
        obj.A00 = dwh;
        A06 = obj;
        AnonymousClass1C0 r12 = AnonymousClass1Bw.A1J;
        ? obj2 = new Object();
        obj2.A01 = r12;
        obj2.A00 = obj;
        A07 = obj2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.DxO] */
    public static C28316DxO A01(Object obj) {
        if (obj instanceof C28316DxO) {
            return (C28316DxO) obj;
        }
        C28339Dxl A052 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A02 = A06;
        obj2.A03 = A07;
        obj2.A00 = A04;
        obj2.A01 = A05;
        for (int i = 0; i != A052.A0K(); i++) {
            C28341Dxn dxn = (C28341Dxn) A052.A0M(i);
            int i2 = dxn.A00;
            if (i2 == 0) {
                obj2.A02 = C28292Dx0.A01(C28339Dxl.A06(dxn, true));
            } else if (i2 == 1) {
                obj2.A03 = C28292Dx0.A01(C28339Dxl.A06(dxn, true));
            } else if (i2 == 2) {
                obj2.A00 = C28337Dxj.A02(C28341Dxn.A02(dxn));
            } else if (i2 == 3) {
                obj2.A01 = C28337Dxj.A02(C28341Dxn.A02(dxn));
            } else {
                throw AnonymousClass000.A0k("unknown tag");
            }
        }
        return obj2;
    }
}
