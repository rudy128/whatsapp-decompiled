package X;

import java.util.Map;

public enum C0G {
    ;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = C17880vN.A11();
        for (C0G c0g : values()) {
            if (c0g == A02) {
                A00.put("switch", c0g);
            } else if (c0g != A03) {
                A00.put(c0g.name(), c0g);
            }
        }
    }

    public static C0G A00(String str, int i) {
        return new C0G(str, i);
    }
}
