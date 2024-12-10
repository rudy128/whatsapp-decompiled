package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0z1  reason: invalid class name and case insensitive filesystem */
public abstract class C19800z1<E> extends C19790z0<E> implements List<E>, C18450wR {
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C18070vi.A0d(collection, 1);
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            if (!C18070vi.A18(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        if (this instanceof C19820z3) {
            C19820z3 r1 = (C19820z3) this;
            C29761cp.A02(i, r1.entries.length);
            return r1.entries[i];
        } else if (this instanceof AnonymousClass3F3) {
            return Byte.valueOf(((AnonymousClass3F3) this).A00[i]);
        } else {
            AnonymousClass3F2 r2 = (AnonymousClass3F2) this;
            C29761cp.A02(i, r2.A00);
            return r2.A02.get(r2.A01 + i);
        }
    }

    public int indexOf(Object obj) {
        if (this instanceof C19820z3) {
            C19820z3 r1 = (C19820z3) this;
            if (!(obj instanceof Enum)) {
                return -1;
            }
            Enum enumR = (Enum) obj;
            C18070vi.A0d(enumR, 0);
            int ordinal = enumR.ordinal();
            Enum[] enumArr = r1.entries;
            C18070vi.A0d(enumArr, 0);
            if (ordinal < 0 || ordinal >= enumArr.length || enumArr[ordinal] != enumR) {
                return -1;
            }
            return ordinal;
        } else if (this instanceof AnonymousClass3F3) {
            AnonymousClass3F3 r12 = (AnonymousClass3F3) this;
            if (obj instanceof Byte) {
                byte byteValue = ((Number) obj).byteValue();
                byte[] bArr = r12.A00;
                int length = bArr.length;
                for (int i = 0; i < length; i++) {
                    if (byteValue == bArr[i]) {
                        return i;
                    }
                }
            }
            return -1;
        } else {
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (C18070vi.A18(it.next(), obj)) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
    }

    public int lastIndexOf(Object obj) {
        int i;
        if (this instanceof C19820z3) {
            if (!(obj instanceof Enum)) {
                return -1;
            }
            C18070vi.A0d(obj, 0);
            return indexOf(obj);
        } else if (this instanceof AnonymousClass3F3) {
            AnonymousClass3F3 r1 = (AnonymousClass3F3) this;
            if (obj instanceof Byte) {
                byte byteValue = ((Number) obj).byteValue();
                byte[] bArr = r1.A00;
                int length = bArr.length - 1;
                if (length >= 0) {
                    do {
                        i = length - 1;
                        if (byteValue == bArr[length]) {
                            return length;
                        }
                        length = i;
                    } while (i >= 0);
                }
            }
            return -1;
        } else {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (C18070vi.A18(listIterator.previous(), obj)) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        }
    }

    public ListIterator listIterator(int i) {
        return new AnonymousClass3F1(this, i);
    }

    public List subList(int i, int i2) {
        return new AnonymousClass3F2(this, i, i2);
    }

    public int hashCode() {
        int i;
        Iterator it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public ListIterator listIterator() {
        return new AnonymousClass3F1(this, 0);
    }
}
