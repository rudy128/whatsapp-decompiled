package X;

import android.util.Pair;

public class CZT {
    public boolean A01() {
        C18030ve r2;
        if (!(this instanceof BWB) || (r2 = ((BWB) this).A00) == null) {
            return false;
        }
        return C18020vd.A05(C18040vf.A02, r2, 11763);
    }

    public boolean A02() {
        C18030ve r2;
        if (this instanceof BWB) {
            BWB bwb = (BWB) this;
            if (!bwb.A02 || (r2 = bwb.A00) == null || !C18020vd.A05(C18040vf.A02, r2, 9020)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Pair A00() {
        Integer A0Z = BE7.A0Z();
        return new Pair(A0Z, A0Z);
    }
}
