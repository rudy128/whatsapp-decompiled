package X;

import java.util.HashMap;
import java.util.Map;

public abstract class CEL {
    public static final Map A00;

    static {
        HashMap hashMap = new HashMap(10);
        A00 = hashMap;
        hashMap.put("none", C24304Bz1.none);
        hashMap.put("xMinYMin", C24304Bz1.xMinYMin);
        hashMap.put("xMidYMin", C24304Bz1.xMidYMin);
        hashMap.put("xMaxYMin", C24304Bz1.xMaxYMin);
        hashMap.put("xMinYMid", C24304Bz1.xMinYMid);
        hashMap.put("xMidYMid", C24304Bz1.xMidYMid);
        hashMap.put("xMaxYMid", C24304Bz1.xMaxYMid);
        hashMap.put("xMinYMax", C24304Bz1.xMinYMax);
        hashMap.put("xMidYMax", C24304Bz1.xMidYMax);
        hashMap.put("xMaxYMax", C24304Bz1.xMaxYMax);
    }
}
