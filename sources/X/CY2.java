package X;

import java.util.Collection;
import java.util.Map;

public abstract class CY2 {
    public final Map builderMap = C26064Cre.preservesInsertionOrderOnPutsMap();

    public abstract Collection newMutableValueCollection();

    public CY2 put(Object obj, Object obj2) {
        C201310y.checkEntryNotNull(obj, obj2);
        Collection collection = (Collection) this.builderMap.get(obj);
        if (collection == null) {
            Map map = this.builderMap;
            collection = newMutableValueCollection();
            map.put(obj, collection);
        }
        collection.add(obj2);
        return this;
    }
}
