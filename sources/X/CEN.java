package X;

import java.util.HashMap;
import java.util.Map;

public abstract class CEN {
    public static final Map A00;

    static {
        HashMap hashMap = new HashMap(9);
        A00 = hashMap;
        Integer num = AnonymousClass00R.A0u;
        hashMap.put("xx-small", new DS0(num, 0.694f));
        hashMap.put("x-small", new DS0(num, 0.833f));
        hashMap.put("small", new DS0(num, 10.0f));
        hashMap.put("medium", new DS0(num, 12.0f));
        hashMap.put("large", new DS0(num, 14.4f));
        hashMap.put("x-large", new DS0(num, 17.3f));
        hashMap.put("xx-large", new DS0(num, 20.7f));
        Integer num2 = AnonymousClass00R.A18;
        hashMap.put("smaller", new DS0(num2, 83.33f));
        hashMap.put("larger", new DS0(num2, 120.0f));
    }
}
