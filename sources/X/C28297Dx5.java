package X;

/* renamed from: X.Dx5  reason: case insensitive filesystem */
public class C28297Dx5 extends AnonymousClass1By {
    public C28339Dxl A00;
    public C28269Dwd A01;
    public C28311DxJ A02;
    public C28292Dx0 A03;

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(4);
        csy.A02(this.A02);
        csy.A02(this.A03);
        csy.A02(this.A01);
        C28339Dxl dxl = this.A00;
        if (dxl != null) {
            C28341Dxn.A04(dxl, csy);
        }
        return new C28357Dy3(csy);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Dx5, java.lang.Object] */
    public static C28297Dx5 A01(Object obj) {
        if (obj instanceof C28297Dx5) {
            return (C28297Dx5) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A02 = C28311DxJ.A01(C28339Dxl.A03(A05));
        obj2.A03 = C28292Dx0.A01(A05.A0M(1));
        obj2.A01 = (C28269Dwd) A05.A0M(2);
        if (A05.A0K() > 3) {
            obj2.A00 = C28339Dxl.A06((C28341Dxn) A05.A0M(3), true);
        }
        return obj2;
    }
}
