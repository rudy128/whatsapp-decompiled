package X;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.DbZ  reason: case insensitive filesystem */
public abstract class C27303DbZ<E> extends AbstractSet<E> {
    public boolean removeAll(Collection collection) {
        return C63772tf.removeAllImpl((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        C199610h.A04(collection);
        return super.retainAll(collection);
    }
}
