package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CZy  reason: case insensitive filesystem */
public class C25147CZy {
    public final E0B A00;
    public final AtomicReference A01 = new AtomicReference((Object) null);

    public C25246Cbl A00(C26041Cr5 cr5, C26224CvE cvE, C22821Di r6, C22821Di r7) {
        E0B e0b = this.A00;
        D64 d64 = (D64) e0b;
        d64.A07 = true;
        d64.A02 = cvE;
        d64.A01 = cr5;
        d64.A05 = r6;
        d64.A06 = r7;
        D64.A00(C24268ByR.StartInput, d64);
        C25246Cbl cbl = new C25246Cbl(e0b, this);
        this.A01.set(cbl);
        return cbl;
    }

    public final void A01() {
        D64.A00(C24268ByR.HideKeyboard, (D64) this.A00);
    }

    public final void A02() {
        if (this.A01.get() != null) {
            D64.A00(C24268ByR.ShowKeyboard, (D64) this.A00);
        }
    }

    public C25147CZy(E0B e0b) {
        this.A00 = e0b;
    }
}
