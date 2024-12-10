package X;

import java.io.OutputStream;

/* renamed from: X.Dy5  reason: case insensitive filesystem */
public class C28359Dy5 extends C28340Dxm {
    public int A00 = -1;

    public AnonymousClass1Bz A0F() {
        return this;
    }

    public int A0D() {
        int i = this.A00;
        if (i < 0) {
            AnonymousClass1Bx[] r2 = this.A00;
            int length = r2.length;
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = BEA.A0E(r2, i2, i);
            }
            this.A00 = i;
        }
        return C26084Cs1.A00(i) + 1 + i;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [X.Cr0, java.lang.Object] */
    public void A0G(C26039Cr0 cr0, boolean z) {
        C26039Cr0 cr02;
        if (z) {
            C26039Cr0.A01(cr0, 49);
        }
        if ((cr0 instanceof C28330Dxc) || (cr0 instanceof C28329Dxb)) {
            cr02 = cr0;
        } else {
            OutputStream outputStream = cr0.A00;
            ? obj = new Object();
            obj.A00 = outputStream;
            cr02 = obj;
        }
        AnonymousClass1Bx[] r8 = this.A00;
        int length = r8.length;
        int i = this.A00;
        int i2 = 0;
        if (i < 0) {
            if (length > 16) {
                int i3 = 0;
                i = 0;
                do {
                    i = BEA.A0E(r8, i3, i);
                    i3++;
                } while (i3 < length);
                this.A00 = i;
            } else {
                AnonymousClass1Bz[] r3 = new AnonymousClass1Bz[length];
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    AnonymousClass1Bz A0F = r8[i5].CP9().A0F();
                    r3[i5] = A0F;
                    i4 += A0F.A0D();
                }
                this.A00 = i4;
                cr0.A03(i4);
                while (i2 < length) {
                    cr02.A05(r3[i2], true);
                    i2++;
                }
                return;
            }
        }
        cr0.A03(i);
        while (i2 < length) {
            cr02.A05(r8[i2].CP9(), true);
            i2++;
        }
    }
}
