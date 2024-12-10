package X;

import android.graphics.ColorSpace;
import java.io.InputStream;

/* renamed from: X.DCu  reason: case insensitive filesystem */
public class C26765DCu implements E4U {
    public final E4K A00;
    public final E4U A01;
    public final E4U A02;
    public final E4U A03 = new C26763DCs(this);
    public final C26134Csx A04;

    public BSE A00(ColorSpace colorSpace, C25798CmA cmA, DRJ drj, C25112CYh cYh, int i) {
        DRN A032 = this.A04.A03(cmA.A02, colorSpace, drj, i);
        try {
            C26208Cuj.A01(A032);
            DRJ.A03(drj);
            int i2 = drj.A02;
            DRJ.A03(drj);
            BSE bse = new BSE(A032, cYh, i2, drj.A00);
            bse.CD2("is_rounded", AnonymousClass000.A0h());
            return bse;
        } finally {
            if (A032 != null) {
                A032.close();
            }
        }
    }

    public C26765DCu(E4U e4u, E4U e4u2, C26134Csx csx) {
        this.A01 = e4u;
        this.A02 = e4u2;
        this.A04 = csx;
        this.A00 = C24697CGj.A00;
    }

    public C28672EDo BI4(C25798CmA cmA, DRJ drj, C25112CYh cYh, int i) {
        InputStream A08;
        DRJ.A03(drj);
        C25783Clu clu = drj.A07;
        if ((clu == null || clu == C25783Clu.A02) && (A08 = drj.A08()) != null) {
            drj.A07 = C26104CsO.A00(A08);
        }
        return this.A03.BI4(cmA, drj, cYh, i);
    }
}
