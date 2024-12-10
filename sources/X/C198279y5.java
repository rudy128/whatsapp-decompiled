package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.9y5  reason: invalid class name and case insensitive filesystem */
public class C198279y5 {
    public final C131206ki A00;
    public final C184089aO A01;
    public final Map A02 = new AnonymousClass00O(0);
    public final Map A03 = new AnonymousClass00O(0);

    public static C184089aO A00(C198279y5 r3, String str) {
        Object value;
        Map map = r3.A02;
        if (map.containsKey(str)) {
            value = map.get(str);
        } else {
            Iterator A15 = AnonymousClass000.A15(r3.A03);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (AnonymousClass8BU.A1V(str, (Pattern) A16.getKey())) {
                    value = A16.getValue();
                }
            }
            return r3.A01;
        }
        return (C184089aO) value;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.00O, java.util.Map] */
    public C198279y5(C184089aO r6, C131206ki r7, Map map, Map map2) {
        Boolean bool = C17960vV.A01;
        this.A00 = r7;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            Object value = A16.getValue();
            C17960vV.A07(key);
            for (Object put : (Set) key) {
                this.A02.put(put, value);
            }
        }
        Iterator A152 = AnonymousClass000.A15(map2);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            Object key2 = A162.getKey();
            Object value2 = A162.getValue();
            C17960vV.A07(key2);
            for (Object put2 : (Set) key2) {
                this.A03.put(put2, value2);
            }
        }
        this.A01 = r6;
    }
}
