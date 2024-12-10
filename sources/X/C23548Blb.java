package X;

import java.util.Map;

/* renamed from: X.Blb  reason: case insensitive filesystem */
public class C23548Blb<K, V> extends C27304Dba<K, V, Map.Entry<V, K>> {
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int findEntryByValue = this.biMap.findEntryByValue(key);
        if (findEntryByValue == -1 || !C24604CBi.A00(this.biMap.keys[findEntryByValue], value)) {
            return false;
        }
        return true;
    }

    public Map.Entry forEntry(int i) {
        return new C23540BlT(this.biMap, i);
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int smearedHash = AnonymousClass111.smearedHash(key);
        int findEntryByValue = this.biMap.findEntryByValue(key, smearedHash);
        if (findEntryByValue == -1 || !C24604CBi.A00(this.biMap.keys[findEntryByValue], value)) {
            return false;
        }
        this.biMap.removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return true;
    }

    public C23548Blb(C27300DbW dbW) {
        super(dbW);
    }
}
