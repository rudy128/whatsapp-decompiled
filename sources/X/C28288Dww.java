package X;

/* renamed from: X.Dww  reason: case insensitive filesystem */
public class C28288Dww extends AnonymousClass1By {
    public C28275Dwj A00;
    public C28289Dwx A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Dww, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.Dwj] */
    public static C28288Dww A01(Object obj) {
        C28275Dwj dwj;
        if (obj instanceof C28288Dww) {
            return (C28288Dww) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        AnonymousClass1Bx A03 = C28339Dxl.A03(A05);
        if (A03 instanceof C28275Dwj) {
            dwj = (C28275Dwj) A03;
        } else if (A03 != null) {
            C28335Dxh A02 = C28335Dxh.A02(A03);
            ? obj3 = new Object();
            obj3.A00 = A02;
            dwj = obj3;
        } else {
            dwj = null;
        }
        obj2.A00 = dwj;
        if (A05.A0K() == 2) {
            obj2.A01 = C28289Dwx.A01(C28339Dxl.A06((C28341Dxn) A05.A0M(1), true));
        }
        return obj2;
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        A0t.A02(this.A00);
        C28289Dwx dwx = this.A01;
        if (dwx != null) {
            C28341Dxn.A04(dwx, A0t);
        }
        return new C28357Dy3(A0t);
    }
}
