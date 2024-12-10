package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.Dwf  reason: case insensitive filesystem */
public class C28271Dwf extends C28333Dxf {
    public int A0D() {
        return A0B().length;
    }

    public C28271Dwf(C26135Csy csy) {
        int i = 0;
        AnonymousClass1Bz A02 = C28333Dxf.A02(csy, 0);
        if (A02 instanceof AnonymousClass1C0) {
            this.A02 = (AnonymousClass1C0) A02;
            i = 1;
            A02 = C28333Dxf.A02(csy, 1);
        }
        if (A02 instanceof C28337Dxj) {
            this.A01 = (C28337Dxj) A02;
            i++;
            A02 = C28333Dxf.A02(csy, i);
        }
        if (!(A02 instanceof C28341Dxn)) {
            this.A03 = A02;
            i++;
            A02 = C28333Dxf.A02(csy, i);
        }
        if (csy.A00 != i + 1) {
            throw AnonymousClass000.A0k("input vector too large");
        } else if (A02 instanceof C28341Dxn) {
            C28341Dxn dxn = (C28341Dxn) A02;
            int i2 = dxn.A00;
            if (i2 < 0 || i2 > 2) {
                throw AnonymousClass001.A13("invalid encoding value: ", AnonymousClass000.A10(), i2);
            }
            this.A00 = i2;
            this.A04 = C28341Dxn.A02(dxn);
        } else {
            throw AnonymousClass000.A0k("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        ByteArrayOutputStream A15 = C108945cZ.A15();
        C28333Dxf.A03(A15, "DL", this.A02);
        C28333Dxf.A03(A15, "DL", this.A01);
        C28333Dxf.A03(A15, "DL", this.A03);
        A15.write(new C28341Dxn(this.A04, this.A00, true).A0C("DL"));
        byte[] byteArray = A15.toByteArray();
        cr0.A04(32, 8, z);
        int length = byteArray.length;
        cr0.A03(length);
        C26039Cr0.A02(cr0, byteArray, length);
    }
}
