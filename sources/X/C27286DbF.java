package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: X.DbF  reason: case insensitive filesystem */
public abstract class C27286DbF extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BE6.A1Z();

    public final Object[] toArray(Object[] objArr) {
        int A002;
        if (objArr != null) {
            int size = size();
            int length = objArr.length;
            if (length < size) {
                Object[] A01 = A01();
                if (A01 == null) {
                    if (length != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size);
                } else {
                    int A003 = A00();
                    if (this instanceof C23432Bgx) {
                        A002 = ((C23432Bgx) this).A00;
                    } else {
                        C23431Bgw bgw = (C23431Bgw) this;
                        A002 = bgw.zzc.A00() + bgw.A00 + bgw.A01;
                    }
                    return Arrays.copyOfRange(A01, A003, A002, objArr.getClass());
                }
            } else if (length > size) {
                objArr[size] = null;
            }
            C23433Bgy bgy = (C23433Bgy) this;
            if (bgy instanceof C23432Bgx) {
                C23432Bgx bgx = (C23432Bgx) bgy;
                System.arraycopy(bgx.A01, 0, objArr, 0, bgx.A00);
            } else {
                int size2 = bgy.size();
                for (int i = 0; i < size2; i++) {
                    objArr[i] = bgy.get(i);
                }
            }
            return objArr;
        }
        throw null;
    }

    public int A00() {
        if (this instanceof C23432Bgx) {
            return 0;
        }
        C23431Bgw bgw = (C23431Bgw) this;
        return bgw.zzc.A00() + bgw.A00;
    }

    public Object[] A01() {
        if (this instanceof C23432Bgx) {
            return ((C23432Bgx) this).A01;
        }
        return ((C23431Bgw) this).zzc.A01();
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
