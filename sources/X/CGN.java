package X;

import java.util.Set;

public abstract class CGN {
    public static final Set A00;

    static {
        String[] strArr = new String[8];
        strArr[0] = "hi_US";
        strArr[1] = "hi_IN";
        strArr[2] = "en_US";
        strArr[3] = "en_IN";
        strArr[4] = "bn_IN";
        strArr[5] = "bn_US";
        strArr[6] = "hi";
        A00 = BE6.A15("bn", strArr, 7);
    }
}
