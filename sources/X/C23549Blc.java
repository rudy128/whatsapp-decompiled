package X;

import java.util.Map;

/* renamed from: X.Blc  reason: case insensitive filesystem */
public final class C23549Blc extends C27304Dba<K, V, Map.Entry<K, V>> {
    public final /* synthetic */ C27300DbW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23549Blc(C27300DbW dbW) {
        super(dbW);
        this.this$0 = dbW;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int findEntryByKey = this.this$0.findEntryByKey(key);
        if (findEntryByKey == -1 || !C24604CBi.A00(value, this.this$0.values[findEntryByKey])) {
            return false;
        }
        return true;
    }

    public Map.Entry forEntry(int i) {
        return new C23538BlR(this.this$0, i);
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int smearedHash = AnonymousClass111.smearedHash(key);
        int findEntryByKey = this.this$0.findEntryByKey(key, smearedHash);
        if (findEntryByKey == -1 || !C24604CBi.A00(value, this.this$0.values[findEntryByKey])) {
            return false;
        }
        this.this$0.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return true;
    }
}
