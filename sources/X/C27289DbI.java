package X;

import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: X.DbI  reason: case insensitive filesystem */
public abstract class C27289DbI<E> extends AbstractCollection<E> implements Collection<E>, C23161Ex {
    public int A00() {
        return ((C27351DcN) this).A00.size();
    }

    public abstract boolean add(Object obj);

    public final /* bridge */ int size() {
        return A00();
    }
}
