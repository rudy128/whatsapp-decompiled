package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0Zp  reason: invalid class name and case insensitive filesystem */
public class C06770Zp implements Iterator, C18450wR {
    public int A00;
    public Object A01;
    public final Map A02;

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A02.size());
    }

    public C06770Zp(Object obj, Map map) {
        this.A01 = obj;
        this.A02 = map;
    }

    public Object next() {
        if (hasNext()) {
            Object obj = this.A01;
            this.A00++;
            Object obj2 = this.A02.get(obj);
            if (obj2 != null) {
                this.A01 = ((C04160Mb) obj2).A00;
                return obj;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Hash code of an element (");
            A10.append(obj);
            throw new ConcurrentModificationException(AnonymousClass000.A0y(") has changed after it was added to the persistent set.", A10));
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }
}
