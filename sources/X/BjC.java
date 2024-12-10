package X;

import java.util.Iterator;

public final class BjC extends C23526BjD {
    public static final BjC A02;
    public static final Object[] A03;
    public final transient Object[] A00;
    public final transient Object[] A01;

    public final int hashCode() {
        return 0;
    }

    public final int size() {
        return 0;
    }

    public final /* synthetic */ Iterator iterator() {
        BjB bjB = this.A00;
        if (bjB == null) {
            C23530BjH bjH = BjB.A00;
            bjB = C23528BjF.A01;
            this.A00 = bjB;
        }
        return bjB.listIterator(0);
    }

    static {
        Object[] A1Z = BE6.A1Z();
        A03 = A1Z;
        A02 = new BjC(A1Z, A1Z);
    }

    public BjC(Object[] objArr, Object[] objArr2) {
        this.A00 = objArr;
        this.A01 = objArr2;
    }

    public final boolean contains(Object obj) {
        return false;
    }
}
