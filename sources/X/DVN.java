package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class DVN<K, V> implements Map<K, V>, C18450wR {
    public abstract boolean containsKey(Object obj);

    public final /* bridge */ Set entrySet() {
        return new C07410at((C07340am) this);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    Set entrySet = map.entrySet();
                    if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                        Iterator it = entrySet.iterator();
                        while (it.hasNext()) {
                            Map.Entry A16 = AnonymousClass000.A16(it);
                            if (A16 == null) {
                                return false;
                            }
                            Object key = A16.getKey();
                            Object value = A16.getValue();
                            Object obj2 = get(key);
                            if (!C18070vi.A18(value, obj2)) {
                                return false;
                            }
                            if (obj2 == null && !containsKey(key)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object get(Object obj);

    public final /* bridge */ Set keySet() {
        return new C07420au((C07340am) this);
    }

    public final /* bridge */ int size() {
        return ((C07340am) this).A00;
    }

    public final /* bridge */ Collection values() {
        return new C07310aj((C07340am) this);
    }

    public void clear() {
        throw AnonymousClass000.A12();
    }

    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (C18070vi.A18(C17890vO.A0P(it), obj)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(size());
    }

    public Object put(Object obj, Object obj2) {
        throw AnonymousClass000.A12();
    }

    public void putAll(Map map) {
        throw AnonymousClass000.A12();
    }

    public Object remove(Object obj) {
        throw AnonymousClass000.A12();
    }

    public String toString() {
        return C29431cG.A0g(", ", "{", "}", entrySet(), new C28028Dq3(this));
    }
}
