package X;

/* renamed from: X.Dwz  reason: case insensitive filesystem */
public class C28291Dwz extends AnonymousClass1By {
    public AnonymousClass1Bx A00;
    public AnonymousClass1C0 A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Dwz] */
    public static C28291Dwz A01(Object obj) {
        if (obj instanceof C28291Dwz) {
            return (C28291Dwz) obj;
        }
        if (obj != null) {
            C28339Dxl A05 = C28339Dxl.A05(obj);
            ? obj2 = new Object();
            obj2.A01 = (AnonymousClass1C0) C28339Dxl.A03(A05);
            obj2.A00 = C28339Dxl.A04(A05);
            return obj2;
        }
        throw AnonymousClass000.A0k("null value in getInstance()");
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        A0t.A02(this.A01);
        return C28339Dxl.A07(this.A00, A0t);
    }
}
