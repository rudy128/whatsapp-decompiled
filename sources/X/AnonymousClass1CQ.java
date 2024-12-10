package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1CQ  reason: invalid class name */
public final class AnonymousClass1CQ implements Map, Serializable, C18450wR {
    public static final AnonymousClass1CQ A00 = new Object();
    public static final long serialVersionUID = 8246714829545688274L;

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final Object readResolve() {
        return A00;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        return false;
    }

    public final /* bridge */ Set entrySet() {
        return C25511Om.A00;
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* bridge */ Set keySet() {
        return C25511Om.A00;
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return C18460wS.A00;
    }
}
