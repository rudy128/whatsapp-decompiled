package X;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* renamed from: X.DbV  reason: case insensitive filesystem */
public class C27299DbV<K, V> extends AbstractMap<V, K> implements AnonymousClass3MQ<V, K>, Serializable {
    public final C27300DbW forward;
    public transient Set inverseEntrySet;

    public void clear() {
        this.forward.clear();
    }

    public boolean containsKey(Object obj) {
        return this.forward.containsValue(obj);
    }

    public boolean containsValue(Object obj) {
        return this.forward.containsKey(obj);
    }

    public Set entrySet() {
        Set set = this.inverseEntrySet;
        if (set != null) {
            return set;
        }
        C23548Blb blb = new C23548Blb(this.forward);
        this.inverseEntrySet = blb;
        return blb;
    }

    public Object get(Object obj) {
        return this.forward.getInverse(obj);
    }

    public Set keySet() {
        return this.forward.values();
    }

    public Object put(Object obj, Object obj2) {
        return this.forward.putInverse(obj, obj2, false);
    }

    public Object remove(Object obj) {
        return this.forward.removeInverse(obj);
    }

    public int size() {
        return this.forward.size;
    }

    public Set values() {
        return this.forward.keySet();
    }

    public C27299DbV(C27300DbW dbW) {
        this.forward = dbW;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        AnonymousClass3MQ unused = this.forward.inverse = this;
    }

    public AnonymousClass3MQ inverse() {
        throw AnonymousClass04E.createAndThrow();
    }
}
