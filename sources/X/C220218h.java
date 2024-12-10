package X;

import java.util.Map;

/* renamed from: X.18h  reason: invalid class name and case insensitive filesystem */
public class C220218h {
    public final ThreadLocal A00 = new C220318i(this);

    public synchronized String A00(String str) {
        Map map;
        map = (Map) this.A00.get();
        C17960vV.A07(map);
        return (String) map.get(str);
    }

    public synchronized void A01(String str, String str2) {
        Map map = (Map) this.A00.get();
        C17960vV.A07(map);
        map.put(str, str2);
    }
}
