package X;

import android.util.Log;
import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.9id  reason: invalid class name and case insensitive filesystem */
public class C189169id {
    public final Map A00 = C17880vN.A13();

    public void A00(C199079zO... r8) {
        C18070vi.A0d(r8, 0);
        for (C199079zO r4 : r8) {
            int i = r4.A01;
            int i2 = r4.A00;
            Map map = this.A00;
            Integer valueOf = Integer.valueOf(i);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            AbstractMap abstractMap = (AbstractMap) obj;
            Integer valueOf2 = Integer.valueOf(i2);
            if (abstractMap.containsKey(valueOf2)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Overriding migration ");
                A10.append(abstractMap.get(valueOf2));
                Log.w("ROOM", AnonymousClass001.A1E(r4, " with ", A10));
            }
            abstractMap.put(valueOf2, r4);
        }
    }
}
