package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.DbD  reason: case insensitive filesystem */
public class C27284DbD extends AbstractCollection<V> {
    public final /* synthetic */ C27301DbX this$0;

    public C27284DbD(C27301DbX dbX) {
        this.this$0 = dbX;
    }

    public void clear() {
        this.this$0.clear();
    }

    public Iterator iterator() {
        return this.this$0.valuesIterator();
    }

    public int size() {
        return this.this$0.size();
    }
}
