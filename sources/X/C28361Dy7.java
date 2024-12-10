package X;

import java.util.Enumeration;

/* renamed from: X.Dy7  reason: case insensitive filesystem */
public class C28361Dy7 extends C28341Dxn {
    public void A0G(C26039Cr0 cr0, boolean z) {
        Enumeration enumeration;
        cr0.A04(160, this.A00, z);
        C26039Cr0.A01(cr0, 128);
        boolean z2 = this.A02;
        AnonymousClass1Bx r3 = this.A01;
        if (!z2) {
            if (r3 instanceof C28342Dxo) {
                if (r3 instanceof C28328Dxa) {
                    enumeration = ((C28328Dxa) r3).A0K();
                } else {
                    enumeration = new C28328Dxa(((C28342Dxo) r3).A00).A0K();
                }
            } else if (r3 instanceof C28339Dxl) {
                enumeration = ((C28339Dxl) r3).A0L();
            } else if (r3 instanceof C28340Dxm) {
                enumeration = new C27101DUf((C28340Dxm) r3);
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("not implemented: ");
                AnonymousClass8BW.A1M(r3, A10);
                throw new C24210BxM(A10.toString());
            }
            while (enumeration.hasMoreElements()) {
                cr0.A05(((AnonymousClass1Bx) enumeration.nextElement()).CP9(), true);
            }
        } else {
            cr0.A05(r3.CP9(), true);
        }
        C26039Cr0.A01(cr0, 0);
        C26039Cr0.A01(cr0, 0);
    }

    public boolean A0H() {
        if (this.A02 || C28341Dxn.A02(this).A0H()) {
            return true;
        }
        return false;
    }

    public int A0D() {
        int A01;
        int A0D = C28341Dxn.A02(this).A0D();
        if (this.A02) {
            A01 = C26084Cs1.A01(this.A00) + C26084Cs1.A00(A0D);
        } else {
            A0D--;
            A01 = C26084Cs1.A01(this.A00);
        }
        return A01 + A0D;
    }
}
