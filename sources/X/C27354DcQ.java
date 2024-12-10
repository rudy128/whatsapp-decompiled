package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.DcQ  reason: case insensitive filesystem */
public final class C27354DcQ<E> extends AnonymousClass1JC<E> implements List<E>, RandomAccess, Serializable, AnonymousClass1JB {
    public static final C27354DcQ A00;
    public Object[] backing = new Object[10];
    public boolean isReadOnly;
    public int length;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DcQ, X.1JC] */
    static {
        ? r1 = new AnonymousClass1JC();
        r1.backing = new Object[0];
        r1.isReadOnly = true;
        A00 = r1;
    }

    public static final int A00(Collection collection, C27354DcQ dcQ, int i, int i2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            if (collection.contains(dcQ.backing[i + i3]) == z) {
                Object[] objArr = dcQ.backing;
                objArr[i4 + i] = objArr[i3 + i];
                i4++;
                i3++;
            } else {
                i3++;
            }
        }
        int i5 = i2 - i4;
        Object[] objArr2 = dcQ.backing;
        C200310o.A07(objArr2, i + i4, objArr2, i2 + i, dcQ.length);
        Object[] objArr3 = dcQ.backing;
        int i6 = dcQ.length;
        C25360CeK.A01(objArr3, i6 - i5, i6);
        if (i5 > 0) {
            dcQ.modCount++;
        }
        dcQ.length -= i5;
        return i5;
    }

    public boolean addAll(int i, Collection collection) {
        C18070vi.A0d(collection, 1);
        A06(this);
        C29761cp.A03(i, this.length);
        int size = collection.size();
        A05(collection, this, i, size);
        return AnonymousClass000.A1R(size);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (C18070vi.A18(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public boolean removeAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        A06(this);
        if (A00(collection, this, 0, this.length, false) > 0) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        A06(this);
        if (A00(collection, this, 0, this.length, true) > 0) {
            return true;
        }
        return false;
    }

    public List subList(int i, int i2) {
        C29761cp.A04(i, i2, this.length);
        return new C27353DcP((C27353DcP) null, this, this.backing, i, i2 - i);
    }

    public Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        int length2 = objArr.length;
        int i = this.length;
        Object[] objArr2 = this.backing;
        if (length2 < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            C18070vi.A0X(copyOfRange);
            return copyOfRange;
        }
        C200310o.A07(objArr2, 0, objArr, 0, i);
        int i2 = this.length;
        if (i2 >= length2) {
            return objArr;
        }
        objArr[i2] = null;
        return objArr;
    }

    public static final Object A02(C27354DcQ dcQ, int i) {
        dcQ.modCount++;
        Object[] objArr = dcQ.backing;
        Object obj = objArr[i];
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr, i, dcQ.length - i2);
        Object[] objArr2 = dcQ.backing;
        C18070vi.A0d(objArr2, 0);
        objArr2[dcQ.length - 1] = null;
        dcQ.length--;
        return obj;
    }

    private final void A03(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 >= 0) {
            Object[] objArr = this.backing;
            int length2 = objArr.length;
            if (i3 > length2) {
                objArr = Arrays.copyOf(objArr, C29761cp.A00(length2, i3));
                C18070vi.A0X(objArr);
                this.backing = objArr;
            }
            System.arraycopy(objArr, i, objArr, i + i2, this.length - i);
            this.length += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    public static final void A04(Object obj, C27354DcQ dcQ, int i) {
        dcQ.modCount++;
        dcQ.A03(i, 1);
        dcQ.backing[i] = obj;
    }

    public static final void A05(Collection collection, C27354DcQ dcQ, int i, int i2) {
        dcQ.modCount++;
        dcQ.A03(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            dcQ.backing[i + i3] = it.next();
        }
    }

    public static final void A06(C27354DcQ dcQ) {
        if (dcQ.isReadOnly) {
            throw C17880vN.A0y();
        }
    }

    public static final void A07(C27354DcQ dcQ, int i, int i2) {
        if (i2 > 0) {
            dcQ.modCount++;
        }
        Object[] objArr = dcQ.backing;
        C200310o.A07(objArr, i, objArr, i + i2, dcQ.length);
        Object[] objArr2 = dcQ.backing;
        int i3 = dcQ.length;
        C25360CeK.A01(objArr2, i3 - i2, i3);
        dcQ.length -= i2;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new DRP(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public int A0R() {
        return this.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.backing;
        int i = this.length;
        if (i != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!C18070vi.A18(objArr[i2], list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        C29761cp.A02(i, this.length);
        return this.backing[i];
    }

    public int hashCode() {
        Object[] objArr = this.backing;
        int i = this.length;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + AnonymousClass001.A0l(objArr[i3]);
        }
        return i2;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(this.length);
    }

    public int lastIndexOf(Object obj) {
        int i = this.length;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!C18070vi.A18(this.backing[i], obj));
        return i;
    }

    public ListIterator listIterator(int i) {
        C29761cp.A03(i, this.length);
        return new DVE(this, i);
    }

    public String toString() {
        return C25360CeK.A00(this, this.backing, 0, this.length);
    }

    public Object A0S(int i) {
        A06(this);
        C29761cp.A02(i, this.length);
        return A02(this, i);
    }

    public void add(int i, Object obj) {
        A06(this);
        C29761cp.A03(i, this.length);
        A04(obj, this, i);
    }

    public void clear() {
        A06(this);
        A07(this, 0, this.length);
    }

    public boolean remove(Object obj) {
        A06(this);
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Object set(int i, Object obj) {
        A06(this);
        C29761cp.A02(i, this.length);
        Object[] objArr = this.backing;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public boolean add(Object obj) {
        A06(this);
        A04(obj, this, this.length);
        return true;
    }

    public boolean addAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        A06(this);
        int size = collection.size();
        A05(collection, this, this.length, size);
        return AnonymousClass000.A1R(size);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public Object[] toArray() {
        return C200310o.A0E(this.backing, 0, this.length);
    }
}
