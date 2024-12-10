package X;

import java.util.concurrent.Callable;

public class DVX implements Callable {
    public final float A00;
    public final int A01;
    public final Object A02;

    public DVX(Object obj, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    public final Object call() {
        float f;
        C26223CvD cvD;
        int i;
        if (this.A01 != 0) {
            DRB drb = (DRB) this.A02;
            float f2 = this.A00;
            if (!drb.A0F.get()) {
                i = -6;
            } else {
                drb.A0E.setCornerRadius(f2);
                i = 0;
            }
            return Integer.valueOf(i);
        }
        C26809DEr dEr = (C26809DEr) this.A02;
        float f3 = this.A00;
        if (dEr.isConnected()) {
            C26225CvG cvG = dEr.A0V;
            C25158Ca9 ca9 = cvG.A0I;
            ca9.A01("Can only check if the prepared on the Optic thread");
            if (ca9.A00 && (cvD = dEr.A08) != null) {
                if (cvD.A09(f3, false)) {
                    C26223CvD.A03(dEr, cvG);
                }
                f = dEr.A08.A05();
                return Float.valueOf(f);
            }
        }
        f = -1.0f;
        return Float.valueOf(f);
    }
}
