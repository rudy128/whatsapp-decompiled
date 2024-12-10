package X;

import java.io.OutputStream;

/* renamed from: X.Dy9  reason: case insensitive filesystem */
public class C28363Dy9 extends C28341Dxn {
    public AnonymousClass1Bz A0E() {
        return this;
    }

    public AnonymousClass1Bz A0F() {
        return this;
    }

    public boolean A0H() {
        if (this.A02 || C28341Dxn.A02(this).A0E().A0H()) {
            return true;
        }
        return false;
    }

    public int A0D() {
        int A01;
        int A0D = C28341Dxn.A02(this).A0E().A0D();
        if (this.A02) {
            A01 = C26084Cs1.A01(this.A00) + C26084Cs1.A00(A0D);
        } else {
            A0D--;
            A01 = C26084Cs1.A01(this.A00);
        }
        return A01 + A0D;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Cr0, java.lang.Object] */
    public void A0G(C26039Cr0 cr0, boolean z) {
        C28329Dxb dxb;
        AnonymousClass1Bz A0E = C28341Dxn.A02(this).A0E();
        boolean z2 = this.A02;
        int i = 128;
        if (z2 || A0E.A0H()) {
            i = 160;
        }
        cr0.A04(i, this.A00, z);
        if (z2) {
            cr0.A03(A0E.A0D());
        }
        if (cr0 instanceof C28329Dxb) {
            dxb = (C28329Dxb) cr0;
        } else {
            OutputStream outputStream = cr0.A00;
            ? obj = new Object();
            obj.A00 = outputStream;
            dxb = obj;
        }
        A0E.A0G(dxb, z2);
    }
}
