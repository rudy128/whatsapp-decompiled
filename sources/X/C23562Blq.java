package X;

import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Blq  reason: case insensitive filesystem */
public class C23562Blq extends Multisets.ElementSet<E> {
    public final /* synthetic */ C27285DbE this$0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23562Blq(C27285DbE dbE) {
        this();
        this.this$0 = dbE;
    }

    public Iterator iterator() {
        return this.this$0.elementIterator();
    }

    public C28677EDz multiset() {
        return this.this$0;
    }

    public void clear() {
        multiset().clear();
    }

    public boolean contains(Object obj) {
        return multiset().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return multiset().containsAll(collection);
    }

    public boolean isEmpty() {
        return multiset().isEmpty();
    }

    public boolean remove(Object obj) {
        return AnonymousClass000.A1R(multiset().remove(obj, Integer.MAX_VALUE));
    }

    public int size() {
        return multiset().entrySet().size();
    }

    public C23562Blq() {
    }
}
