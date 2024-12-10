package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.DUs  reason: case insensitive filesystem */
public class C27109DUs implements Iterator {
    public int A00 = 0;
    public final Object[] A01;

    public C27109DUs(Object[] objArr) {
        this.A01 = objArr;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01.length);
    }

    public Object next() {
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i != objArr.length) {
            this.A00 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException(AnonymousClass001.A1I("Out of elements: ", AnonymousClass000.A10(), i));
    }

    public void remove() {
        throw BE6.A0v("Cannot remove element from an Array.");
    }
}
