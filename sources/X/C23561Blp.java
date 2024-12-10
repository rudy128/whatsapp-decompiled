package X;

import com.google.common.collect.Multisets;
import java.util.Iterator;

/* renamed from: X.Blp  reason: case insensitive filesystem */
public class C23561Blp extends Multisets.EntrySet<E> {
    public final /* synthetic */ C27285DbE this$0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23561Blp(C27285DbE dbE) {
        this();
        this.this$0 = dbE;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof C25259Cby)) {
            return false;
        }
        C25259Cby cby = (C25259Cby) obj;
        if (cby.getCount() <= 0 || multiset().count(cby.getElement()) != cby.getCount()) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return this.this$0.entryIterator();
    }

    public C28677EDz multiset() {
        return this.this$0;
    }

    public boolean remove(Object obj) {
        if (obj instanceof C25259Cby) {
            C25259Cby cby = (C25259Cby) obj;
            Object element = cby.getElement();
            int count = cby.getCount();
            if (count != 0) {
                return multiset().setCount(element, count, 0);
            }
        }
        return false;
    }

    public int size() {
        return this.this$0.distinctElements();
    }

    public void clear() {
        multiset().clear();
    }

    public C23561Blp() {
    }
}
