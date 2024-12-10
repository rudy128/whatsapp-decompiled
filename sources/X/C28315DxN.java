package X;

import java.util.Enumeration;

/* renamed from: X.DxN  reason: case insensitive filesystem */
public class C28315DxN extends AnonymousClass1By {
    public static final C28292Dx0 A04;
    public final C28337Dxj A00;
    public final C28337Dxj A01;
    public final C28342Dxo A02;
    public final C28292Dx0 A03;

    public C28315DxN(byte[] bArr, int i) {
        this.A02 = new C28327DxZ(AnonymousClass1C2.A02(bArr));
        this.A00 = new C28337Dxj((long) i);
        this.A01 = null;
        this.A03 = null;
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(4);
        csy.A02(this.A02);
        csy.A02(this.A00);
        C28337Dxj dxj = this.A01;
        if (dxj != null) {
            csy.A02(dxj);
        }
        C28292Dx0 dx0 = this.A03;
        if (dx0 != null && !dx0.equals(A04)) {
            csy.A02(dx0);
        }
        return new C28357Dy3(csy);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Dx0, java.lang.Object] */
    static {
        AnonymousClass1C0 r2 = AnonymousClass1Bw.A1E;
        C28273Dwh dwh = C28273Dwh.A00;
        ? obj = new Object();
        obj.A01 = r2;
        obj.A00 = dwh;
        A04 = obj;
    }

    public C28315DxN(C28339Dxl dxl) {
        Enumeration A0L = dxl.A0L();
        this.A02 = (C28342Dxo) A0L.nextElement();
        this.A00 = (C28337Dxj) A0L.nextElement();
        if (A0L.hasMoreElements()) {
            Object nextElement = A0L.nextElement();
            if (nextElement instanceof C28337Dxj) {
                this.A01 = C28337Dxj.A02(nextElement);
                nextElement = A0L.hasMoreElements() ? A0L.nextElement() : nextElement;
            } else {
                this.A01 = null;
            }
            if (nextElement != null) {
                this.A03 = C28292Dx0.A01(nextElement);
                return;
            }
        } else {
            this.A01 = null;
        }
        this.A03 = null;
    }
}
