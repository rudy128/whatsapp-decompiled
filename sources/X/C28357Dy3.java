package X;

import java.io.OutputStream;

/* renamed from: X.Dy3  reason: case insensitive filesystem */
public class C28357Dy3 extends C28339Dxl {
    public int A00;

    public C28357Dy3() {
        this.A00 = -1;
    }

    public AnonymousClass1Bz A0E() {
        return this;
    }

    public AnonymousClass1Bz A0F() {
        return this;
    }

    public int A0D() {
        int i = this.A00;
        if (i < 0) {
            int length = this.A00.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += BE9.A12(this.A00, i2).A0D();
            }
            this.A00 = i;
        }
        return C26084Cs1.A00(i) + 1 + i;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Cr0, java.lang.Object] */
    public void A0G(C26039Cr0 cr0, boolean z) {
        C28329Dxb dxb;
        if (z) {
            C26039Cr0.A01(cr0, 48);
        }
        if (cr0 instanceof C28329Dxb) {
            dxb = (C28329Dxb) cr0;
        } else {
            OutputStream outputStream = cr0.A00;
            ? obj = new Object();
            obj.A00 = outputStream;
            dxb = obj;
        }
        int length = this.A00.length;
        int i = this.A00;
        int i2 = 0;
        if (i < 0) {
            if (length > 16) {
                int i3 = 0;
                i = 0;
                do {
                    i += BE9.A12(this.A00, i3).A0D();
                    i3++;
                } while (i3 < length);
                this.A00 = i;
            } else {
                AnonymousClass1Bz[] r3 = new AnonymousClass1Bz[length];
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    AnonymousClass1Bz A12 = BE9.A12(this.A00, i5);
                    r3[i5] = A12;
                    i4 += A12.A0D();
                }
                this.A00 = i4;
                cr0.A03(i4);
                while (i2 < length) {
                    r3[i2].A0G(dxb, true);
                    i2++;
                }
                return;
            }
        }
        cr0.A03(i);
        while (i2 < length) {
            BE9.A12(this.A00, i2).A0G(dxb, true);
            i2++;
        }
    }

    public C28357Dy3(AnonymousClass1Bx[] r4) {
        if (r4 != null) {
            int length = r4.length;
            int i = 0;
            while (i < length) {
                if (r4[i] != null) {
                    i++;
                }
            }
            this.A00 = C26135Csy.A00(r4);
            this.A00 = -1;
            return;
        }
        throw AnonymousClass000.A0s("'elements' cannot be null, or contain null");
    }

    public C28357Dy3(C26135Csy csy) {
        this.A00 = csy.A03();
        this.A00 = -1;
    }
}
