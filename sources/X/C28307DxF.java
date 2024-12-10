package X;

/* renamed from: X.DxF  reason: case insensitive filesystem */
public class C28307DxF extends AnonymousClass1By {
    public C28340Dxm A00;

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.DxF, java.lang.Object] */
    public static C28307DxF A01(Object obj) {
        if (obj instanceof C28307DxF) {
            return (C28307DxF) obj;
        }
        if (obj == null) {
            return null;
        }
        C28340Dxm A02 = C28340Dxm.A02(obj);
        ? obj2 = new Object();
        obj2.A00 = A02;
        return obj2;
    }

    public C28291Dwz A0D() {
        AnonymousClass1Bx[] r1 = this.A00.A00;
        if (r1.length == 0) {
            return null;
        }
        return C28291Dwz.A01(r1[0]);
    }

    public C28291Dwz[] A0E() {
        C28340Dxm dxm = this.A00;
        int length = dxm.A00.length;
        C28291Dwz[] dwzArr = new C28291Dwz[length];
        for (int i = 0; i != length; i++) {
            dwzArr[i] = C28291Dwz.A01(dxm.A00[i]);
        }
        return dwzArr;
    }
}
