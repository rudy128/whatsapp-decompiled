package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.Dwe  reason: case insensitive filesystem */
public class C28270Dwe extends C28333Dxf {
    public int A0D() {
        return A0B().length;
    }

    public AnonymousClass1Bz A0E() {
        return this;
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        ByteArrayOutputStream A15 = C108945cZ.A15();
        C28333Dxf.A03(A15, "DER", this.A02);
        C28333Dxf.A03(A15, "DER", this.A01);
        C28333Dxf.A03(A15, "DER", this.A03);
        A15.write(new C28341Dxn(this.A04, this.A00, true).A0C("DER"));
        byte[] byteArray = A15.toByteArray();
        cr0.A04(32, 8, z);
        int length = byteArray.length;
        cr0.A03(length);
        C26039Cr0.A02(cr0, byteArray, length);
    }
}
