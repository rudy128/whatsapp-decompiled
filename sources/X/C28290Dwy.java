package X;

/* renamed from: X.Dwy  reason: case insensitive filesystem */
public class C28290Dwy extends AnonymousClass1By {
    public C28338Dxk A00;
    public C28312DxK A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.Dwy] */
    public static C28290Dwy A01(Object obj) {
        if (obj instanceof C28290Dwy) {
            return (C28290Dwy) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A00 = C28338Dxk.A06(C28339Dxl.A03(A05));
        if (A05.A0K() > 1) {
            obj2.A01 = C28312DxK.A01(C28335Dxh.A02(C28341Dxn.A02((C28341Dxn) A05.A0M(1))));
        }
        return obj2;
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        A0t.A02(this.A00);
        C28312DxK dxK = this.A01;
        if (dxK != null) {
            C28341Dxn.A04(dxK, A0t);
        }
        return new C28357Dy3(A0t);
    }
}
