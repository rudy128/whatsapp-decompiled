package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.4s8  reason: invalid class name and case insensitive filesystem */
public final class C99024s8 implements Iterator, C18450wR {
    public Iterator A00;
    public final List A01 = AnonymousClass000.A13();
    public final C22821Di A02;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public Object next() {
        Object next = this.A00.next();
        Iterator it = (Iterator) this.A02.invoke(next);
        if (it == null || !it.hasNext()) {
            while (!this.A00.hasNext()) {
                List list = this.A01;
                if (!AnonymousClass000.A1a(list)) {
                    break;
                }
                this.A00 = (Iterator) C29431cG.A0d(list);
                if (!list.isEmpty()) {
                    list.remove(AnonymousClass3MX.A01(list));
                } else {
                    throw new NoSuchElementException("List is empty.");
                }
            }
        } else {
            this.A01.add(this.A00);
            this.A00 = it;
        }
        return next;
    }

    public C99024s8(Iterator it, C22821Di r3) {
        this.A02 = r3;
        this.A00 = it;
    }
}
