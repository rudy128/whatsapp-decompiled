package X;

import java.util.Map;

/* renamed from: X.Blh  reason: case insensitive filesystem */
public class C23554Blh<K, V> extends C199410f<Map.Entry<K, V>> {
    public final transient Object[] alternatingKeysAndValues;
    public final transient C201110w map;
    public final transient int size;

    public boolean isPartialView() {
        return true;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.map.get(key))) {
            return false;
        }
        return true;
    }

    public AnonymousClass1IX createAsList() {
        return new C23550Bld(this);
    }

    public int size() {
        return this.size;
    }

    public C23554Blh(C201110w r1, Object[] objArr, int i, int i2) {
        this.map = r1;
        this.alternatingKeysAndValues = objArr;
        this.size = i2;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public AnonymousClass1IZ iterator() {
        return asList().iterator();
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
