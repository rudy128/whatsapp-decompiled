package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.BfX  reason: case insensitive filesystem */
public abstract class C23345BfX extends C27288DbH implements List, RandomAccess {
    public static final C23355Bfh A00 = new C23354Bfg(C23344BfW.A02, 0);

    public static C23345BfX A00(Object[] objArr) {
        if (objArr.length != 0) {
            Object[] objArr2 = (Object[]) objArr.clone();
            int length = objArr2.length;
            int i = 0;
            while (i < length) {
                if (objArr2[i] != null) {
                    i++;
                } else {
                    throw AnonymousClass000.A0s(AnonymousClass001.A1I("at index ", AnonymousClass000.A10(), i));
                }
            }
            if (length != 0) {
                return new C23344BfW(objArr2, length);
            }
        }
        return C23344BfW.A02;
    }

    public static C23344BfW A01(Object obj) {
        Object[] objArr = {obj};
        if (objArr[0] != null) {
            return new C23344BfW(objArr, 1);
        }
        throw AnonymousClass000.A0s(AnonymousClass001.A1I("at index ", AnonymousClass000.A10(), 0));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (CBA.A00(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    if (hasNext) {
                        if (hasNext2) {
                            if (!CBA.A00(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!hasNext2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public C23345BfX A09() {
        if (this instanceof C23343BfV) {
            return ((C23343BfV) this).A00;
        }
        if (size() <= 1) {
            return this;
        }
        return new C23343BfV(this);
    }

    /* renamed from: A0A */
    public C23345BfX subList(int i, int i2) {
        if (this instanceof C23342BfU) {
            C23342BfU bfU = (C23342BfU) this;
            C25874Cni.A02(i, i2, bfU.A01);
            int i3 = bfU.A00;
            return bfU.zzc.subList(i + i3, i2 + i3);
        } else if (this instanceof C23343BfV) {
            C23345BfX bfX = ((C23343BfV) this).A00;
            C25874Cni.A02(i, i2, bfX.size());
            return bfX.subList(bfX.size() - i2, bfX.size() - i).A09();
        } else {
            C25874Cni.A02(i, i2, size());
            int i4 = i2 - i;
            if (i4 == size()) {
                return this;
            }
            if (i4 == 0) {
                return C23344BfW.A02;
            }
            return new C23342BfU(this, i, i4);
        }
    }

    public int indexOf(Object obj) {
        if (this instanceof C23343BfV) {
            C23345BfX bfX = ((C23343BfV) this).A00;
            int lastIndexOf = bfX.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return AnonymousClass000.A0Q(bfX) - lastIndexOf;
            }
            return -1;
        }
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (BE8.A1Y(obj, this, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (this instanceof C23343BfV) {
            C23345BfX bfX = ((C23343BfV) this).A00;
            int indexOf = bfX.indexOf(obj);
            if (indexOf >= 0) {
                return AnonymousClass000.A0Q(bfX) - indexOf;
            }
            return -1;
        }
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!BE8.A1Y(obj, this, size));
            return size;
        }
        return -1;
    }

    /* renamed from: A0B */
    public final C23355Bfh listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw BE6.A0l(C25874Cni.A00(i, size, "index"));
        } else if (isEmpty()) {
            return A00;
        } else {
            return new C23354Bfg(this, i);
        }
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw C17880vN.A0y();
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1Q(indexOf(obj));
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass000.A0O(get(i2), i * 31);
        }
        return i;
    }

    @Deprecated
    public final Object remove(int i) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw C17880vN.A0y();
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
