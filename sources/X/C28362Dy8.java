package X;

import java.io.OutputStream;

/* renamed from: X.Dy8  reason: case insensitive filesystem */
public class C28362Dy8 extends C28341Dxn {
    public AnonymousClass1Bz A0F() {
        return this;
    }

    public boolean A0H() {
        if (this.A02 || C28341Dxn.A02(this).A0F().A0H()) {
            return true;
        }
        return false;
    }

    public int A0D() {
        int A01;
        int A0D = C28341Dxn.A02(this).A0F().A0D();
        if (this.A02) {
            A01 = C26084Cs1.A01(this.A00) + C26084Cs1.A00(A0D);
        } else {
            A0D--;
            A01 = C26084Cs1.A01(this.A00);
        }
        return A01 + A0D;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.Cr0, java.lang.Object] */
    public void A0G(C26039Cr0 cr0, boolean z) {
        AnonymousClass1Bz A0F = C28341Dxn.A02(this).A0F();
        boolean z2 = this.A02;
        int i = 128;
        if (z2 || A0F.A0H()) {
            i = 160;
        }
        cr0.A04(i, this.A00, z);
        if (z2) {
            cr0.A03(A0F.A0D());
        }
        boolean z3 = cr0 instanceof C28330Dxc;
        C26039Cr0 cr02 = cr0;
        if (!z3) {
            boolean z4 = cr0 instanceof C28329Dxb;
            cr02 = cr0;
            if (!z4) {
                OutputStream outputStream = cr0.A00;
                ? obj = new Object();
                obj.A00 = outputStream;
                cr02 = obj;
            }
        }
        cr02.A05(A0F, z2);
    }
}
