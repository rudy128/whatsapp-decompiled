package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;

/* renamed from: X.10w  reason: invalid class name and case insensitive filesystem */
public abstract class C201110w<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    public static final long serialVersionUID = 912559;
    public transient C199410f entrySet;
    public transient C199410f keySet;
    public transient C199310e values;

    public abstract C199410f createEntrySet();

    public abstract C199410f createKeySet();

    public abstract C199310e createValues();

    public abstract Object get(Object obj);

    public static C201210x builder() {
        return new C201210x();
    }

    public static C201210x builderWithExpectedSize(int i) {
        C201310y.checkNonnegative(i, "expectedSize");
        return new C201210x(i);
    }

    public static C201110w copyOf(Iterable iterable) {
        int i = 4;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        C201210x r0 = new C201210x(i);
        r0.putAll(iterable);
        return r0.build();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public C199410f entrySet() {
        C199410f r0 = this.entrySet;
        if (r0 != null) {
            return r0;
        }
        C199410f createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public C199410f keySet() {
        C199410f r0 = this.keySet;
        if (r0 != null) {
            return r0;
        }
        C199410f createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C199310e values() {
        C199310e r0 = this.values;
        if (r0 != null) {
            return r0;
        }
        C199310e createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public Object writeReplace() {
        return new C70433Ba(this);
    }

    public static C201110w of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        C201310y.checkEntryNotNull(obj, obj2);
        C201310y.checkEntryNotNull(obj3, obj4);
        C201310y.checkEntryNotNull(obj5, obj6);
        C201310y.checkEntryNotNull(obj7, obj8);
        return AnonymousClass110.create(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return C62742ru.equalsImpl(this, obj);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public int hashCode() {
        return C63772tf.hashCodeImpl(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C62742ru.toStringImpl(this);
    }

    public static C201110w copyOf(Map map) {
        if (!(map instanceof C201110w) || (map instanceof SortedMap)) {
            return copyOf((Iterable) map.entrySet());
        }
        return (C201110w) map;
    }

    public static C201110w of(Object obj, Object obj2) {
        C201310y.checkEntryNotNull(obj, obj2);
        return AnonymousClass110.create(1, new Object[]{obj, obj2});
    }

    public static C201110w of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C201310y.checkEntryNotNull(obj, obj2);
        C201310y.checkEntryNotNull(obj3, obj4);
        C201310y.checkEntryNotNull(obj5, obj6);
        return AnonymousClass110.create(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static C201110w of(Object obj, Object obj2, Object obj3, Object obj4) {
        C201310y.checkEntryNotNull(obj, obj2);
        C201310y.checkEntryNotNull(obj3, obj4);
        return AnonymousClass110.create(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static C201110w of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        C201310y.checkEntryNotNull(obj, obj2);
        C201310y.checkEntryNotNull(obj3, obj4);
        C201310y.checkEntryNotNull(obj5, obj6);
        C201310y.checkEntryNotNull(obj7, obj8);
        C201310y.checkEntryNotNull(obj9, obj10);
        return AnonymousClass110.create(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static C201110w of() {
        return AnonymousClass110.EMPTY;
    }
}
