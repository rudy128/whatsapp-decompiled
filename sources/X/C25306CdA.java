package X;

/* renamed from: X.CdA  reason: case insensitive filesystem */
public abstract class C25306CdA {
    public static CXL A00(D44 d44) {
        CXL cxl = new CXL();
        cxl.A06 = d44.A03;
        float f = d44.A02;
        if (f != Float.MIN_VALUE) {
            cxl.A01 = f;
        }
        float f2 = d44.A00;
        if (f2 != Float.MIN_VALUE) {
            cxl.A00 = f2;
        }
        return cxl;
    }

    public static CXL A01(C20269AEc aEc, float f) {
        CXL cxl = new CXL();
        cxl.A06 = aEc;
        cxl.A01 = f;
        return cxl;
    }
}
