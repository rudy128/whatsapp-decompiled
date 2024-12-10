package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.18A  reason: invalid class name */
public final class AnonymousClass18A {
    public static final AnonymousClass18B A01 = new AnonymousClass18B((Object) null);
    public final Map A00 = new HashMap();

    public void A00(int i, Object obj) {
        if (obj == null) {
            this.A00.remove(Integer.valueOf(i));
            return;
        }
        AnonymousClass18B r3 = new AnonymousClass18B(obj);
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !map.get(valueOf).equals(r3)) {
            map.put(valueOf, r3);
        }
    }
}
