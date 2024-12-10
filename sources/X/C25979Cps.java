package X;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.Cps  reason: case insensitive filesystem */
public class C25979Cps {
    public static final Map A03 = new IdentityHashMap();
    public int A00 = 1;
    public Object A01;
    public final E4M A02;

    public static void A00(C25979Cps cps) {
        boolean A1R;
        synchronized (cps) {
            A1R = AnonymousClass000.A1R(cps.A00);
        }
        if (!A1R) {
            throw new C27201DZa();
        }
    }

    public synchronized Object A01() {
        return this.A01;
    }

    public C25979Cps(E4M e4m, Object obj) {
        this.A01 = obj;
        this.A02 = e4m;
        Map map = A03;
        synchronized (map) {
            Integer num = (Integer) map.get(obj);
            if (num == null) {
                C17880vN.A1P(obj, map, 1);
            } else {
                C17880vN.A1P(obj, map, num.intValue() + 1);
            }
        }
    }
}
