package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: X.DbH  reason: case insensitive filesystem */
public abstract class C27288DbH extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BE6.A1Z();

    public abstract boolean contains(Object obj);

    public final Object[] toArray(Object[] objArr) {
        if (objArr != null) {
            int size = size();
            int length = objArr.length;
            if (length < size) {
                Object[] A08 = A08();
                if (A08 != null) {
                    return Arrays.copyOfRange(A08, A05(), A04(), objArr.getClass());
                }
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else if (length > size) {
                objArr[size] = null;
            }
            A06(objArr);
            return objArr;
        }
        throw null;
    }

    public int A04() {
        if (this instanceof C23340BfS) {
            return ((C23340BfS) this).A01.A04();
        }
        if (this instanceof C23348Bfa) {
            return ((C23348Bfa) this).A00;
        }
        if (this instanceof C23344BfW) {
            return ((C23344BfW) this).A00;
        }
        if (this instanceof C23342BfU) {
            C23342BfU bfU = (C23342BfU) this;
            return bfU.zzc.A05() + bfU.A00 + bfU.A01;
        }
        throw C17880vN.A0y();
    }

    public int A05() {
        if (this instanceof C23340BfS) {
            return ((C23340BfS) this).A01.A05();
        }
        if ((this instanceof C23348Bfa) || (this instanceof C23344BfW)) {
            return 0;
        }
        if (this instanceof C23342BfU) {
            C23342BfU bfU = (C23342BfU) this;
            return bfU.zzc.A05() + bfU.A00;
        }
        throw C17880vN.A0y();
    }

    public int A06(Object[] objArr) {
        if (this instanceof C23339BfR) {
            objArr[0] = ((C23339BfR) this).A00;
            return 1;
        } else if (this instanceof C23340BfS) {
            return ((C23340BfS) this).A01.A06(objArr);
        } else {
            if (this instanceof C23348Bfa) {
                C23348Bfa bfa = (C23348Bfa) this;
                Object[] objArr2 = bfa.A01;
                int i = bfa.A00;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                return i;
            } else if (this instanceof C23345BfX) {
                C23345BfX bfX = (C23345BfX) this;
                if (bfX instanceof C23344BfW) {
                    C23344BfW bfW = (C23344BfW) bfX;
                    Object[] objArr3 = bfW.A01;
                    int i2 = bfW.A00;
                    System.arraycopy(objArr3, 0, objArr, 0, i2);
                    return i2;
                }
                int size = bfX.size();
                for (int i3 = 0; i3 < size; i3++) {
                    objArr[i3] = bfX.get(i3);
                }
                return size;
            } else {
                C27102DUg A07 = A07();
                int i4 = 0;
                while (A07.hasNext()) {
                    objArr[i4] = A07.next();
                    i4++;
                }
                return i4;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.Bff, java.lang.Object, X.DUg] */
    public C27102DUg A07() {
        C23345BfX A09;
        if (this instanceof C23339BfR) {
            Object obj = ((C23339BfR) this).A00;
            ? obj2 = new Object();
            obj2.A00 = obj;
            return obj2;
        }
        if (this instanceof C23340BfS) {
            A09 = ((C23340BfS) this).A01;
        } else if ((this instanceof C23348Bfa) || (this instanceof C23347BfZ)) {
            A09 = ((C23341BfT) this).A09();
        } else {
            A09 = (C23345BfX) this;
        }
        return A09.listIterator(0);
    }

    public Object[] A08() {
        if (this instanceof C23340BfS) {
            return ((C23340BfS) this).A01.A08();
        }
        if (this instanceof C23348Bfa) {
            return ((C23348Bfa) this).A01;
        }
        if (this instanceof C23344BfW) {
            return ((C23344BfW) this).A01;
        }
        if (this instanceof C23342BfU) {
            return ((C23342BfU) this).zzc.A08();
        }
        return null;
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
