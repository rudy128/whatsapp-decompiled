package X;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.An2  reason: case insensitive filesystem */
public final class C21613An2<E> extends C19800z1<E> implements RandomAccess {
    public int A00;
    public int A01;
    public final List A02;

    public Object get(int i) {
        C29761cp.A02(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    public C21613An2(List list) {
        this.A02 = list;
    }

    public int A0B() {
        return this.A00;
    }
}
