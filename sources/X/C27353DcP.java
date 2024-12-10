package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.DcP  reason: case insensitive filesystem */
public final class C27353DcP<E> extends AnonymousClass1JC<E> implements List<E>, RandomAccess, Serializable, AnonymousClass1JB {
    public Object[] backing;
    public int length;
    public final int offset;
    public final C27353DcP parent;
    public final C27354DcQ root;

    public C27353DcP(C27353DcP dcP, C27354DcQ dcQ, Object[] objArr, int i, int i2) {
        C18070vi.A0g(objArr, 1, dcQ);
        this.backing = objArr;
        this.offset = i;
        this.length = i2;
        this.parent = dcP;
        this.root = dcQ;
        this.modCount = dcQ.modCount;
    }

    public boolean addAll(int i, Collection collection) {
        C18070vi.A0d(collection, 1);
        A04();
        A03();
        C29761cp.A03(i, this.length);
        int size = collection.size();
        A07(this.offset + i, collection, size);
        return AnonymousClass000.A1R(size);
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public boolean removeAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        A04();
        A03();
        if (A00(collection, this.offset, this.length, false) > 0) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        A04();
        A03();
        if (A00(collection, this.offset, this.length, true) <= 0) {
            return false;
        }
        return true;
    }

    public List subList(int i, int i2) {
        C29761cp.A04(i, i2, this.length);
        return new C27353DcP(this, this.root, this.backing, this.offset + i, i2 - i);
    }

    public Object[] toArray(Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        A03();
        int length2 = objArr.length;
        int i = this.length;
        Object[] objArr2 = this.backing;
        int i2 = this.offset;
        int i3 = i + i2;
        if (length2 < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i3, objArr.getClass());
            C18070vi.A0X(copyOfRange);
            return copyOfRange;
        }
        C200310o.A07(objArr2, 0, objArr, i2, i3);
        int i4 = this.length;
        if (i4 >= length2) {
            return objArr;
        }
        objArr[i4] = null;
        return objArr;
    }

    private final int A00(Collection collection, int i, int i2, boolean z) {
        int A00;
        C27353DcP dcP = this.parent;
        if (dcP != null) {
            A00 = dcP.A00(collection, i, i2, z);
        } else {
            A00 = C27354DcQ.A00(collection, this.root, i, i2, z);
        }
        if (A00 > 0) {
            this.modCount++;
        }
        this.length -= A00;
        return A00;
    }

    private final Object A02(int i) {
        Object A02;
        this.modCount++;
        C27353DcP dcP = this.parent;
        if (dcP != null) {
            A02 = dcP.A02(i);
        } else {
            A02 = C27354DcQ.A02(this.root, i);
        }
        this.length--;
        return A02;
    }

    private final void A03() {
        if (this.root.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void A04() {
        C27354DcQ dcQ = this.root;
        C27354DcQ dcQ2 = C27354DcQ.A00;
        if (dcQ.isReadOnly) {
            throw C17880vN.A0y();
        }
    }

    private final void A05(int i, int i2) {
        if (i2 > 0) {
            this.modCount++;
        }
        C27353DcP dcP = this.parent;
        if (dcP != null) {
            dcP.A05(i, i2);
        } else {
            C27354DcQ.A07(this.root, i, i2);
        }
        this.length -= i2;
    }

    private final void A06(int i, Object obj) {
        this.modCount++;
        C27353DcP dcP = this.parent;
        if (dcP != null) {
            dcP.A06(i, obj);
        } else {
            C27354DcQ.A04(obj, this.root, i);
        }
        C27354DcQ dcQ = this.root;
        C27354DcQ dcQ2 = C27354DcQ.A00;
        this.backing = dcQ.backing;
        this.length++;
    }

    private final void A07(int i, Collection collection, int i2) {
        this.modCount++;
        C27353DcP dcP = this.parent;
        if (dcP != null) {
            dcP.A07(i, collection, i2);
        } else {
            C27354DcQ.A05(collection, this.root, i, i2);
        }
        C27354DcQ dcQ = this.root;
        C27354DcQ dcQ2 = C27354DcQ.A00;
        this.backing = dcQ.backing;
        this.length += i2;
    }

    private final Object writeReplace() {
        C27354DcQ dcQ = this.root;
        C27354DcQ dcQ2 = C27354DcQ.A00;
        if (dcQ.isReadOnly) {
            return new DRP(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public int A0R() {
        A03();
        return this.length;
    }

    public Object A0S(int i) {
        A04();
        A03();
        C29761cp.A02(i, this.length);
        return A02(this.offset + i);
    }

    public void add(int i, Object obj) {
        A04();
        A03();
        C29761cp.A03(i, this.length);
        A06(this.offset + i, obj);
    }

    public void clear() {
        A04();
        A03();
        A05(this.offset, this.length);
    }

    public boolean equals(Object obj) {
        A03();
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.backing;
        int i = this.offset;
        int i2 = this.length;
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C18070vi.A18(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        A03();
        C29761cp.A02(i, this.length);
        return this.backing[this.offset + i];
    }

    public int hashCode() {
        A03();
        Object[] objArr = this.backing;
        int i = this.offset;
        int i2 = this.length;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + AnonymousClass001.A0l(objArr[i + i4]);
        }
        return i3;
    }

    public int indexOf(Object obj) {
        A03();
        for (int i = 0; i < this.length; i++) {
            if (C18070vi.A18(this.backing[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        A03();
        return AnonymousClass000.A1P(this.length);
    }

    public int lastIndexOf(Object obj) {
        A03();
        int i = this.length;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!C18070vi.A18(this.backing[this.offset + i], obj));
        return i;
    }

    public ListIterator listIterator(int i) {
        A03();
        C29761cp.A03(i, this.length);
        return new DVD(this, i);
    }

    public boolean remove(Object obj) {
        A04();
        A03();
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Object set(int i, Object obj) {
        A04();
        A03();
        C29761cp.A02(i, this.length);
        Object[] objArr = this.backing;
        int i2 = this.offset + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public String toString() {
        A03();
        return C25360CeK.A00(this, this.backing, this.offset, this.length);
    }

    public boolean add(Object obj) {
        A04();
        A03();
        A06(this.offset + this.length, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        C18070vi.A0d(collection, 0);
        A04();
        A03();
        int size = collection.size();
        A07(this.offset + this.length, collection, size);
        return AnonymousClass000.A1R(size);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public Object[] toArray() {
        A03();
        Object[] objArr = this.backing;
        int i = this.offset;
        return C200310o.A0E(objArr, i, this.length + i);
    }
}
