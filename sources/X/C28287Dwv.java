package X;

/* renamed from: X.Dwv  reason: case insensitive filesystem */
public class C28287Dwv extends AnonymousClass1By {
    public int A00;
    public byte[] A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Dwv, java.lang.Object] */
    public static C28287Dwv A01(Object obj) {
        if (obj instanceof C28287Dwv) {
            return (C28287Dwv) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A01 = C28342Dxo.A05(C28339Dxl.A03(A05));
        int i = 12;
        if (A05.A0K() == 2) {
            i = C28337Dxj.A02(C28339Dxl.A04(A05)).A0K();
        }
        obj2.A00 = i;
        return obj2;
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        A0t.A02(new C28327DxZ(this.A01));
        int i = this.A00;
        if (i != 12) {
            A0t.A02(new C28337Dxj((long) i));
        }
        return new C28357Dy3(A0t);
    }
}
