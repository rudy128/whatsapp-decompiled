package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Dbc  reason: case insensitive filesystem */
public class C27306Dbc extends AbstractSet<K> {
    public final /* synthetic */ C27301DbX this$0;

    public C27306Dbc(C27301DbX dbX) {
        this.this$0 = dbX;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    public Iterator iterator() {
        return this.this$0.keySetIterator();
    }

    public boolean remove(Object obj) {
        C27301DbX dbX = this.this$0;
        Map delegateOrNull = dbX.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.keySet().remove(obj);
        }
        return AnonymousClass3Ma.A1Z(dbX.removeHelper(obj), C27301DbX.NOT_FOUND);
    }

    public int size() {
        return this.this$0.size();
    }
}
