package X;

import java.util.NoSuchElementException;

/* renamed from: X.07w  reason: invalid class name and case insensitive filesystem */
public final class C012807w extends C06910a3 {
    public final Object[] A00;

    public C012807w(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.A00 = objArr;
    }

    public Object next() {
        if (hasNext()) {
            Object[] objArr = this.A00;
            int A02 = A02();
            A06(A02 + 1);
            return objArr[A02];
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.A00;
            A06(A02() - 1);
            return objArr[A02()];
        }
        throw new NoSuchElementException();
    }
}
