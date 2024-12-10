package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2ru  reason: invalid class name and case insensitive filesystem */
public abstract class C62742ru {
    public static int capacity(int i) {
        if (i >= 3) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        C201310y.checkNonnegative(i, "expectedSize");
        return i + 1;
    }

    public static boolean equalsImpl(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String toStringImpl(Map map) {
        StringBuilder newStringBuilderForCollection = AnonymousClass2SZ.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        Iterator A15 = AnonymousClass000.A15(map);
        boolean z = true;
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (!z) {
                newStringBuilderForCollection.append(", ");
            }
            newStringBuilderForCollection.append(A16.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(A16.getValue());
            z = false;
        }
        return C17890vO.A0b(newStringBuilderForCollection);
    }
}
