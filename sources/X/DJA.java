package X;

import android.content.Context;

public final class DJA implements E5J {
    public final CQ4 CHE(Context context, C28568E7y e7y, String str) {
        CQ4 cq4 = new CQ4();
        int CTN = e7y.CTN(context, str);
        cq4.A01 = CTN;
        if (CTN != 0) {
            cq4.A02 = 1;
        } else {
            int CSy = e7y.CSy(context, str);
            cq4.A00 = CSy;
            if (CSy != 0) {
                cq4.A02 = -1;
                return cq4;
            }
        }
        return cq4;
    }
}
