package X;

import android.graphics.Typeface;

public class DLC implements C28521E5l {
    public final int A00;
    public final Object A01;

    public DLC(C26249Cvn cvn, int i) {
        this.A00 = i;
        this.A01 = cvn;
    }

    public void BCI(Typeface typeface) {
        boolean A04;
        int i = this.A00;
        C26249Cvn cvn = (C26249Cvn) this.A01;
        if (i != 0) {
            A04 = C26249Cvn.A05(typeface, cvn);
        } else {
            A04 = C26249Cvn.A04(typeface, cvn);
        }
        if (A04) {
            cvn.A0D(false);
        }
    }
}
