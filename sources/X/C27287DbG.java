package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: X.DbG  reason: case insensitive filesystem */
public abstract class C27287DbG extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BE6.A1Z();

    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        if (objArr != null) {
            int size = size();
            int length = objArr.length;
            int i = 0;
            if (length < size) {
                Object[] A01 = A01();
                if (A01 == null) {
                    if (length != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size);
                } else {
                    int A002 = A00();
                    if (!(this instanceof BjC) && !(this instanceof C23528BjF)) {
                        C23527BjE bjE = (C23527BjE) this;
                        i = bjE.c.A00() + bjE.A00 + bjE.A01;
                    }
                    return Arrays.copyOfRange(A01, A002, i, objArr.getClass());
                }
            } else if (length > size) {
                objArr[size] = null;
            }
            if (this instanceof BjC) {
                objArr2 = ((BjC) this).A00;
            } else {
                BjB bjB = (BjB) this;
                if (bjB instanceof C23528BjF) {
                    objArr2 = ((C23528BjF) bjB).A00;
                } else {
                    int size2 = bjB.size();
                    while (i < size2) {
                        objArr[i] = bjB.get(i);
                        i++;
                    }
                    return objArr;
                }
            }
            System.arraycopy(objArr2, 0, objArr, 0, 0);
            return objArr;
        }
        throw null;
    }

    public int A00() {
        if ((this instanceof BjC) || (this instanceof C23528BjF)) {
            return 0;
        }
        C23527BjE bjE = (C23527BjE) this;
        return bjE.c.A00() + bjE.A00;
    }

    public Object[] A01() {
        if (this instanceof BjC) {
            return ((BjC) this).A00;
        }
        if (this instanceof C23528BjF) {
            return ((C23528BjF) this).A00;
        }
        return ((C23527BjE) this).c.A01();
    }

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final void clear() {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw C17880vN.A0y();
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
