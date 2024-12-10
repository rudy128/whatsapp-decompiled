package X;

import java.util.List;

public class CTY {
    public final AnonymousClass8Qu A00;
    public final C22919BVh A01;
    public final C22920BVi A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    public CTY(C25017CTt cTt) {
        String str = cTt.A03;
        if (str != null) {
            this.A03 = str;
            C22920BVi bVi = cTt.A02;
            this.A06 = cTt.A07;
            this.A07 = cTt.A08;
            this.A02 = bVi;
            this.A00 = cTt.A00;
            this.A01 = cTt.A01;
            this.A05 = cTt.A06;
            this.A04 = cTt.A05;
            return;
        }
        throw AnonymousClass000.A0n("Cache name must not be null");
    }
}
