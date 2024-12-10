package X;

import android.content.Context;

public final class DJB implements E5J {
    public final CQ4 CHE(Context context, C28568E7y e7y, String str) {
        CQ4 cq4 = new CQ4();
        cq4.A00 = e7y.CSy(context, str);
        int i = 1;
        int CTN = e7y.CTN(context, str);
        cq4.A01 = CTN;
        int i2 = cq4.A00;
        if (i2 == 0) {
            i2 = 0;
            if (CTN == 0) {
                i = 0;
                cq4.A02 = i;
                return cq4;
            }
        }
        if (CTN < i2) {
            i = -1;
        }
        cq4.A02 = i;
        return cq4;
    }
}
