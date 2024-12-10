package X;

import java.util.Collection;
import java.util.Comparator;

/* renamed from: X.Ble  reason: case insensitive filesystem */
public final class C23551Ble extends CY2 {
    public C23552Blf build() {
        return C23552Blf.fromMapEntries(this.builderMap.entrySet(), (Comparator) null);
    }

    public Collection newMutableValueCollection() {
        return C26064Cre.preservesInsertionOrderOnAddsSet();
    }

    public C23551Ble put(Object obj, Object obj2) {
        super.put(obj, obj2);
        return this;
    }
}
