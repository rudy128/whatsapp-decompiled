package X;

import java.io.OutputStream;

/* renamed from: X.Dxf  reason: case insensitive filesystem */
public abstract class C28333Dxf extends AnonymousClass1Bz {
    public int A00;
    public C28337Dxj A01;
    public AnonymousClass1C0 A02;
    public AnonymousClass1Bz A03;
    public AnonymousClass1Bz A04;

    public boolean A0H() {
        return true;
    }

    public boolean A0I(AnonymousClass1Bz r4) {
        AnonymousClass1Bz r0;
        C28337Dxj dxj;
        AnonymousClass1C0 r02;
        if (r4 instanceof C28333Dxf) {
            if (this == r4) {
                return true;
            }
            C28333Dxf dxf = (C28333Dxf) r4;
            AnonymousClass1C0 r1 = this.A02;
            if (r1 != null && ((r02 = dxf.A02) == null || !r02.A0J(r1))) {
                return false;
            }
            C28337Dxj dxj2 = this.A01;
            if (dxj2 != null && ((dxj = dxf.A01) == null || !dxj.A0J(dxj2))) {
                return false;
            }
            AnonymousClass1Bz r12 = this.A03;
            if (r12 == null || ((r0 = dxf.A03) != null && r0.A0J(r12))) {
                return this.A04.A0J(dxf.A04);
            }
            return false;
        }
        return false;
    }

    public static AnonymousClass1Bz A02(C26135Csy csy, int i) {
        if (csy.A00 > i) {
            return csy.A01(i).CP9();
        }
        throw AnonymousClass000.A0k("too few objects in input vector");
    }

    public static void A03(OutputStream outputStream, String str, AnonymousClass1By r3) {
        if (r3 != null) {
            outputStream.write(r3.A0C(str));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Dxf, java.lang.Object, X.1Bz] */
    public AnonymousClass1Bz A0E() {
        AnonymousClass1C0 r5 = this.A02;
        C28337Dxj dxj = this.A01;
        AnonymousClass1Bz r3 = this.A03;
        int i = this.A00;
        AnonymousClass1Bz r1 = this.A04;
        ? obj = new Object();
        obj.A02 = r5;
        obj.A01 = dxj;
        obj.A03 = r3;
        obj.A00 = i;
        obj.A04 = r1;
        return obj;
    }

    public int hashCode() {
        int A0l = AnonymousClass001.A0l(this.A02);
        C28337Dxj dxj = this.A01;
        if (dxj != null) {
            A0l ^= dxj.hashCode();
        }
        AnonymousClass1Bz r0 = this.A03;
        if (r0 != null) {
            A0l ^= r0.hashCode();
        }
        return A0l ^ this.A04.hashCode();
    }
}
