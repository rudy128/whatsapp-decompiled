package X;

/* renamed from: X.DxI  reason: case insensitive filesystem */
public class C28310DxI extends AnonymousClass1By {
    public final AnonymousClass1Bx A00;
    public final AnonymousClass1C0 A01;

    public static C28310DxI A01(Object obj) {
        if (obj instanceof C28310DxI) {
            return (C28310DxI) obj;
        }
        if (obj != null) {
            return new C28310DxI(C28339Dxl.A05(obj));
        }
        return null;
    }

    public C28310DxI(C28339Dxl dxl) {
        this.A01 = AnonymousClass1C0.A02(C28339Dxl.A03(dxl));
        this.A00 = C28341Dxn.A02(C28341Dxn.A03(C28339Dxl.A04(dxl)));
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        A0t.A02(this.A01);
        C28341Dxn.A04(this.A00, A0t);
        return new C28357Dy3(A0t);
    }
}
