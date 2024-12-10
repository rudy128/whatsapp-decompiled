package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class CFz {
    public static final Map A00;

    static {
        HashMap A11 = C17880vN.A11();
        A11.put("avg", C23763Bp8.class);
        A11.put("stddev", C23764Bp9.class);
        A11.put("sum", C23762Bp7.class);
        A11.put("min", C23761Bp6.class);
        A11.put("max", C23760Bp5.class);
        A11.put("concat", DOL.class);
        Class<DOM> cls = DOM.class;
        A11.put("length", cls);
        A11.put("size", cls);
        A11.put("append", DOJ.class);
        A11.put("keys", DOK.class);
        A00 = Collections.unmodifiableMap(A11);
    }
}
