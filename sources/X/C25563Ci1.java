package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ci1  reason: case insensitive filesystem */
public class C25563Ci1 {
    public final Map A00 = C17880vN.A11();
    public final Map A01 = C17880vN.A11();
    public final Map A02 = C17880vN.A11();

    public static HashMap A00(C25563Ci1 ci1, String str) {
        HashMap A10;
        HashMap A11 = C17880vN.A11();
        Map map = (Map) ci1.A01.get(str);
        if (map == null) {
            A10 = C17880vN.A11();
        } else {
            A10 = BE6.A10(map);
        }
        A11.put("data", A10);
        A11.put("context", BE6.A10(ci1.A00));
        return A11;
    }
}
