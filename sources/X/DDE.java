package X;

import android.net.Uri;
import java.util.concurrent.Executor;

public final class DDE implements E4W {
    public final C24777CJu A00;
    public final C24272ByV A01;
    public final E4U A02;
    public final Executor A03;
    public final boolean A04;
    public final E4K A05;
    public final C9C A06;
    public final BSI A07;
    public final E4W A08;

    public void CCn(C25268CcD ccD, ECs eCs) {
        C25268CcD bsp;
        C25268CcD bsp2;
        C25268CcD ccD2 = ccD;
        C18070vi.A0d(ccD, 0);
        ECs eCs2 = eCs;
        C18070vi.A0d(eCs, 1);
        if (!C26212Cuq.A04()) {
            Uri uri = ((DDI) eCs2).A07.A03;
            if (C20012A3c.A01(uri) || C25955CpN.A00(uri)) {
                bsp2 = new BSP(new CTV(this.A07), this.A06, ccD2, this, eCs2);
            } else {
                bsp2 = new BSO(ccD, this, eCs);
            }
            this.A08.CCn(bsp2, eCs);
            return;
        }
        C26212Cuq.A03("DecodeProducer#produceResults");
        try {
            Uri uri2 = ((DDI) eCs2).A07.A03;
            if (C20012A3c.A01(uri2) || C25955CpN.A00(uri2)) {
                bsp = new BSP(new CTV(this.A07), this.A06, ccD2, this, eCs2);
            } else {
                bsp = new BSO(ccD, this, eCs);
            }
            this.A08.CCn(bsp, eCs);
        } finally {
            C26212Cuq.A01();
        }
    }

    public DDE(E4K e4k, C24777CJu cJu, C24272ByV byV, E4U e4u, C9C c9c, BSI bsi, E4W e4w, Executor executor, boolean z) {
        C18070vi.A0d(cJu, 10);
        C18070vi.A0d(e4k, 12);
        this.A07 = bsi;
        this.A03 = executor;
        this.A02 = e4u;
        this.A06 = c9c;
        this.A01 = byV;
        this.A04 = z;
        this.A08 = e4w;
        this.A00 = cJu;
        this.A05 = e4k;
    }
}
