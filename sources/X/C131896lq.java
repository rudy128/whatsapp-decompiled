package X;

import java.util.Map;

/* renamed from: X.6lq  reason: invalid class name and case insensitive filesystem */
public class C131896lq {
    public final Map A00 = C17880vN.A11();
    public final Map A01 = C17880vN.A11();

    public void A00(Object obj, Object obj2) {
        Map map = this.A01;
        if (map.containsKey(obj2) && !C42171xk.A00(map.get(obj2), obj)) {
            map.put(obj2, obj);
            Object obj3 = this.A00.get(obj2);
            C17960vV.A07(obj3);
            ((C22851Dl) obj3).Bo9(obj);
        }
    }
}
