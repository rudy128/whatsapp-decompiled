package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Dbz  reason: case insensitive filesystem */
public final class C27328Dbz<K, V> extends LinkedHashMap<K, V> {
    public static final C27328Dbz A00;
    public boolean isMutable = true;

    static {
        C27328Dbz dbz = new C27328Dbz();
        A00 = dbz;
        dbz.isMutable = false;
    }

    public static int A00(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = CIC.A04;
            int i = r3;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof E68)) {
            return obj.hashCode();
        } else {
            throw C17880vN.A0y();
        }
    }

    public void clear() {
        if (this.isMutable) {
            super.clear();
            return;
        }
        throw C17880vN.A0y();
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator A0i = C17890vO.A0i(this);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            if (!map.containsKey(A16.getKey())) {
                return false;
            }
            Object value = A16.getValue();
            Object obj2 = map.get(A16.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                equals = value.equals(obj2);
                continue;
            } else {
                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public Object put(Object obj, Object obj2) {
        if (this.isMutable) {
            Charset charset = CIC.A04;
            if (obj == null) {
                throw BE6.A0m();
            } else if (obj2 != null) {
                return super.put(obj, obj2);
            } else {
                throw BE6.A0m();
            }
        } else {
            throw C17880vN.A0y();
        }
    }

    public void putAll(Map map) {
        if (this.isMutable) {
            Iterator A0x = AnonymousClass8BU.A0x(map);
            while (A0x.hasNext()) {
                Object next = A0x.next();
                Charset charset = CIC.A04;
                if (next == null) {
                    throw BE6.A0m();
                } else if (map.get(next) == null) {
                    throw BE6.A0m();
                }
            }
            super.putAll(map);
            return;
        }
        throw C17880vN.A0y();
    }

    public Object remove(Object obj) {
        if (this.isMutable) {
            return super.remove(obj);
        }
        throw C17880vN.A0y();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.LinkedHashMap, X.Dbz] */
    public C27328Dbz A01() {
        ? linkedHashMap;
        if (isEmpty()) {
            return linkedHashMap;
        }
        linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.isMutable = true;
        return linkedHashMap;
    }

    public Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public int hashCode() {
        Iterator A0i = C17890vO.A0i(this);
        int i = 0;
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            i += A00(A16.getValue()) ^ A00(A16.getKey());
        }
        return i;
    }
}
