package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2p9  reason: invalid class name and case insensitive filesystem */
public abstract class C61112p9 {
    public static final HashMap A00 = C17880vN.A11();
    public static final HashMap A01 = C17880vN.A11();

    public static JSONObject A00(HashMap hashMap) {
        JSONObject A15 = C17880vN.A15();
        Iterator A0i = C17890vO.A0i(hashMap);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            A15.put(Integer.toString(AnonymousClass000.A0M(A16.getKey())), Long.toString(C17880vN.A05(A16.getValue())));
        }
        return A15;
    }
}
