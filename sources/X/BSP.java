package X;

import java.io.InputStream;

public final class BSP extends BSZ {
    public final CTV A00;
    public final C9C A01;
    public final /* synthetic */ DDE A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BSP(CTV ctv, C9C c9c, C25268CcD ccD, DDE dde, ECs eCs) {
        super(ccD, dde, eCs);
        this.A02 = dde;
        this.A00 = ctv;
        this.A01 = c9c;
        this.A00 = 0;
    }

    public static void A00(InputStream inputStream, long j) {
        C26208Cuj.A04(AnonymousClass000.A1Q((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip <= 0) {
                if (inputStream.read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j -= skip;
        }
    }
}
