package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.041  reason: invalid class name */
public final class AnonymousClass041<V> implements Map<Class<?>, V> {
    public final Map A00;

    public static AnonymousClass041 A00(Map map) {
        return new AnonymousClass041(map);
    }

    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.A00.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    public boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    public Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    public Object get(Object obj) {
        if (obj instanceof Class) {
            return this.A00.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public int size() {
        return this.A00.size();
    }

    public Collection values() {
        return this.A00.values();
    }

    public AnonymousClass041(Map map) {
        this.A00 = map;
    }
}
