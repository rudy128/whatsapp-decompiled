package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Dbb  reason: case insensitive filesystem */
public class C27305Dbb extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C27301DbX this$0;

    public C27305Dbb(C27301DbX dbX) {
        this.this$0 = dbX;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        C27301DbX dbX = this.this$0;
        Map delegateOrNull = dbX.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int access$500 = dbX.indexOf(entry.getKey());
        if (access$500 == -1 || !C24604CBi.A00(this.this$0.value(access$500), entry.getValue())) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return this.this$0.entrySetIterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r5 = r1.hashTableMask();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean remove(java.lang.Object r11) {
        /*
            r10 = this;
            X.DbX r1 = r10.this$0
            java.util.Map r0 = r1.delegateOrNull()
            if (r0 == 0) goto L_0x0011
            java.util.Set r0 = r0.entrySet()
            boolean r0 = r0.remove(r11)
            return r0
        L_0x0011:
            boolean r0 = r11 instanceof java.util.Map.Entry
            r2 = 0
            if (r0 == 0) goto L_0x0058
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            boolean r0 = r1.needsAllocArrays()
            if (r0 != 0) goto L_0x0058
            int r5 = r1.hashTableMask()
            java.lang.Object r3 = r11.getKey()
            java.lang.Object r4 = r11.getValue()
            X.DbX r0 = r10.this$0
            java.lang.Object r6 = r0.requireTable()
            X.DbX r0 = r10.this$0
            int[] r7 = r0.requireEntries()
            X.DbX r0 = r10.this$0
            java.lang.Object[] r8 = r0.requireKeys()
            X.DbX r0 = r10.this$0
            java.lang.Object[] r9 = r0.requireValues()
            int r1 = X.C26271CwI.remove(r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            if (r1 == r0) goto L_0x0058
            X.DbX r0 = r10.this$0
            r0.moveLastEntry(r1, r5)
            X.DbX r0 = r10.this$0
            X.C27301DbX.access$1210(r0)
            r0.incrementModCount()
            r0 = 1
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27305Dbb.remove(java.lang.Object):boolean");
    }

    public int size() {
        return this.this$0.size();
    }
}
