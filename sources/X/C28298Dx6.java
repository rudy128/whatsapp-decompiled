package X;

/* renamed from: X.Dx6  reason: case insensitive filesystem */
public class C28298Dx6 extends AnonymousClass1By {
    public C28339Dxl A00;
    public C28269Dwd A01;
    public C28292Dx0 A02;
    public C28300Dx8 A03;

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Dx6, java.lang.Object] */
    public static C28298Dx6 A01(Object obj) {
        if (obj instanceof C28298Dx6) {
            return (C28298Dx6) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A00 = A05;
        if (A05.A0K() == 3) {
            obj2.A03 = C28300Dx8.A01(C28339Dxl.A03(A05));
            obj2.A02 = C28292Dx0.A01(C28339Dxl.A04(A05));
            obj2.A01 = C28269Dwd.A02(A05.A0M(2));
            return obj2;
        }
        throw AnonymousClass000.A0k("sequence wrong size for a certificate");
    }
}
