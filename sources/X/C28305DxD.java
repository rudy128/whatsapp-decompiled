package X;

/* renamed from: X.DxD  reason: case insensitive filesystem */
public class C28305DxD extends AnonymousClass1By {
    public int A00;
    public C28269Dwd A01;
    public C28292Dx0 A02;
    public C28280Dwo A03;
    public boolean A04;

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(3);
        csy.A02(this.A03);
        csy.A02(this.A02);
        return C28339Dxl.A07(this.A01, csy);
    }

    public int hashCode() {
        if (!this.A04) {
            this.A00 = super.hashCode();
            this.A04 = true;
        }
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.DxD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.Dwo, java.lang.Object] */
    public static C28305DxD A01(Object obj) {
        C28280Dwo dwo;
        if (obj instanceof C28305DxD) {
            return (C28305DxD) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A04 = false;
        if (A05.A0K() == 3) {
            AnonymousClass1Bx A0M = A05.A0M(0);
            if (A0M instanceof C28280Dwo) {
                dwo = (C28280Dwo) A0M;
            } else if (A0M != null) {
                C28339Dxl A052 = C28339Dxl.A05(A0M);
                ? obj3 = new Object();
                if (A052.A0K() < 3 || A052.A0K() > 7) {
                    throw C28339Dxl.A02(A052);
                }
                int i = 0;
                if (A052.A0M(0) instanceof C28337Dxj) {
                    obj3.A00 = C28337Dxj.A02(A052.A0M(0));
                    i = 1;
                }
                int i2 = i + 1;
                obj3.A03 = C28292Dx0.A01(A052.A0M(i));
                int i3 = i2 + 1;
                obj3.A02 = C28324DxW.A01(A052.A0M(i2));
                int i4 = i3 + 1;
                obj3.A06 = C28323DxV.A01(A052.A0M(i3));
                if (i4 < A052.A0K() && ((A052.A0M(i4) instanceof C28332Dxe) || (A052.A0M(i4) instanceof C28338Dxk) || (A052.A0M(i4) instanceof C28323DxV))) {
                    obj3.A05 = C28323DxV.A01(A052.A0M(i4));
                    i4++;
                }
                if (i4 < A052.A0K() && !(A052.A0M(i4) instanceof C28341Dxn)) {
                    obj3.A01 = C28339Dxl.A05(A052.A0M(i4));
                    i4++;
                }
                dwo = obj3;
                if (i4 < A052.A0K()) {
                    dwo = obj3;
                    if (A052.A0M(i4) instanceof C28341Dxn) {
                        obj3.A04 = C28309DxH.A02(C28339Dxl.A06((C28341Dxn) A052.A0M(i4), true));
                        dwo = obj3;
                    }
                }
            } else {
                dwo = null;
            }
            obj2.A03 = dwo;
            obj2.A02 = C28292Dx0.A01(C28339Dxl.A04(A05));
            obj2.A01 = C28269Dwd.A02(A05.A0M(2));
            return obj2;
        }
        throw AnonymousClass000.A0k("sequence wrong size for CertificateList");
    }
}
