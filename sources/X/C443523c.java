package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.23c  reason: invalid class name and case insensitive filesystem */
public final class C443523c implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final Object[] A02;

    public boolean hasNext() {
        if (this.A00 < this.A02.length) {
            return true;
        }
        return false;
    }

    public C443523c(Object[] objArr, int i) {
        this.A02 = objArr;
        this.A01 = i;
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            int i = this.A00;
            int i2 = this.A01;
            Object[] objArr = this.A02;
            int length = objArr.length;
            int min = Math.min(i + i2, length);
            if (length > i2 || i != 0) {
                objArr = Arrays.copyOfRange(objArr, i, min);
            }
            this.A00 += i2;
            return objArr;
        }
        throw new NoSuchElementException("There are no more chunks to provide.");
    }
}
