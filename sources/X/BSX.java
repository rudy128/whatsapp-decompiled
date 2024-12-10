package X;

import android.util.Pair;

public class BSX extends C22848BSa {
    public final /* synthetic */ DDC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BSX(C25268CcD ccD, DDC ddc) {
        super(ccD);
        this.A00 = ddc;
    }

    public static void A00(BSX bsx) {
        Pair pair;
        DDC ddc = bsx.A00;
        synchronized (ddc) {
            pair = (Pair) ddc.A02.poll();
            if (pair == null) {
                ddc.A00--;
            }
        }
        if (pair != null) {
            C27076DTa.A01(bsx, pair, ddc.A03, 8);
        }
    }
}
