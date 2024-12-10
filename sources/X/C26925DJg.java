package X;

import java.nio.charset.Charset;

/* renamed from: X.DJg  reason: case insensitive filesystem */
public final class C26925DJg implements E5P {
    public final C23301Bep A00;

    public final void CTL(EAC eac, Object obj, int i) {
        C23301Bep bep = this.A00;
        int i2 = i << 3;
        bep.A03(i2 | 3);
        eac.CT9(bep.A00, obj);
        bep.A03(i2 | 4);
    }

    public C26925DJg(C23301Bep bep) {
        Charset charset = C25461CgE.A04;
        this.A00 = bep;
        bep.A00 = this;
    }
}
