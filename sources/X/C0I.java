package X;

import java.util.Map;

public enum C0I {
    ;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = C17880vN.A11();
        for (C0I c0i : values()) {
            if (c0i == A02) {
                A00.put("class", c0i);
            } else if (c0i != A03) {
                A00.put(c0i.name().replace('_', '-'), c0i);
            }
        }
    }

    public static C0I A00(String str, int i) {
        return new C0I(str, i);
    }
}
