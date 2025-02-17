package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1If  reason: invalid class name and case insensitive filesystem */
public class C23941If implements Iterator {
    public Iterator iterator = C23921Id.emptyIterator();
    public Deque metaIterators;
    public Iterator toRemove;
    public Iterator topMetaIterator;

    private Iterator getTopMetaIterator() {
        while (true) {
            Iterator it = this.topMetaIterator;
            if (it != null && it.hasNext()) {
                return this.topMetaIterator;
            }
            Deque deque = this.metaIterators;
            if (deque == null || deque.isEmpty()) {
                return null;
            }
            this.topMetaIterator = (Iterator) this.metaIterators.removeFirst();
        }
    }

    public boolean hasNext() {
        while (true) {
            Iterator it = this.iterator;
            C199610h.A04(it);
            if (it.hasNext()) {
                return true;
            }
            Iterator topMetaIterator2 = getTopMetaIterator();
            this.topMetaIterator = topMetaIterator2;
            if (topMetaIterator2 == null) {
                return false;
            }
            Iterator it2 = (Iterator) topMetaIterator2.next();
            this.iterator = it2;
            if (it2 instanceof C23941If) {
                C23941If r2 = (C23941If) it2;
                this.iterator = r2.iterator;
                Deque deque = this.metaIterators;
                if (deque == null) {
                    deque = new ArrayDeque();
                    this.metaIterators = deque;
                }
                deque.addFirst(this.topMetaIterator);
                if (r2.metaIterators != null) {
                    while (!r2.metaIterators.isEmpty()) {
                        this.metaIterators.addFirst(r2.metaIterators.removeLast());
                    }
                }
                this.topMetaIterator = r2.topMetaIterator;
            }
        }
    }

    public void remove() {
        Iterator it = this.toRemove;
        if (it != null) {
            it.remove();
            this.toRemove = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }

    public C23941If(Iterator it) {
        C199610h.A04(it);
        this.topMetaIterator = it;
    }

    public Object next() {
        if (hasNext()) {
            Iterator it = this.iterator;
            this.toRemove = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }
}
