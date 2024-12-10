package X;

import java.io.InputStream;

/* renamed from: X.CVg  reason: case insensitive filesystem */
public final class C25052CVg {
    public final CV5 A00;
    public final BSG A01;

    public C25052CVg(CV5 cv5, BSG bsg) {
        C18070vi.A0d(bsg, 1);
        this.A01 = bsg;
        this.A00 = cv5;
    }

    public DRG A00(InputStream inputStream, int i) {
        C18070vi.A0d(inputStream, 0);
        C24230Bxi bxi = new C24230Bxi(this.A01, i);
        try {
            this.A00.A00(inputStream, bxi);
            return bxi.A00();
        } finally {
            bxi.close();
        }
    }
}
