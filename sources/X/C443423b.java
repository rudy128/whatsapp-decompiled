package X;

import java.util.Iterator;

/* renamed from: X.23b  reason: invalid class name and case insensitive filesystem */
public class C443423b implements Iterable {
    public final int A00;
    public final Object[] A01;

    public Iterator iterator() {
        return new C443523c(this.A01, this.A00);
    }

    public C443423b(Object[] objArr, int i) {
        if (i >= 1) {
            this.A01 = objArr;
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException("Chunk size must be positive.");
    }
}
