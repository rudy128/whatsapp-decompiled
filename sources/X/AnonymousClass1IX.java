package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.1IX  reason: invalid class name */
public abstract class AnonymousClass1IX<E> extends C199310e<E> implements List<E>, RandomAccess {
    public static final C23891Ia EMPTY_ITR = new C23911Ic(AnonymousClass1IY.EMPTY, 0);
    public static final long serialVersionUID = -889275714;

    public static AnonymousClass1IX asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static AnonymousClass1IX of(Object obj) {
        return construct(obj);
    }

    @Deprecated
    public final AnonymousClass1IX asList() {
        return this;
    }

    public AnonymousClass1IX subListUnchecked(int i, int i2) {
        return new AnonymousClass2AJ(this, i, i2 - i);
    }

    public static AnonymousClass2AI builder() {
        return new AnonymousClass2AI();
    }

    public static AnonymousClass1IX copyOf(Collection collection) {
        if (!(collection instanceof C199310e)) {
            return construct(collection.toArray());
        }
        AnonymousClass1IX asList = ((C199310e) collection).asList();
        if (asList.isPartialView()) {
            return asImmutableList(asList.toArray());
        }
        return asList;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C220618l.indexOfImpl(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C220618l.lastIndexOfImpl(this, obj);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static AnonymousClass1IX construct(Object... objArr) {
        AnonymousClass1HW.checkElementsNotNull(objArr);
        return asImmutableList(objArr);
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        return C220618l.equalsImpl(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public AnonymousClass1IZ iterator() {
        return listIterator();
    }

    public C23891Ia listIterator(int i) {
        C199610h.A02(i, size());
        if (isEmpty()) {
            return EMPTY_ITR;
        }
        return new C23911Ic(this, i);
    }

    public AnonymousClass1IX reverse() {
        if (size() <= 1) {
            return this;
        }
        return new AnonymousClass2AK(this);
    }

    public AnonymousClass1IX subList(int i, int i2) {
        C199610h.A03(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return subListUnchecked(i, i2);
    }

    public Object writeReplace() {
        return new AnonymousClass3BY(toArray());
    }

    public static AnonymousClass1IX asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return of();
        }
        return new AnonymousClass1IY(objArr, i);
    }

    public static AnonymousClass1IX copyOf(Object[] objArr) {
        if (objArr.length == 0) {
            return of();
        }
        return construct((Object[]) objArr.clone());
    }

    public static AnonymousClass1IX of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(obj, obj2, obj3, obj4, obj5);
    }

    public static AnonymousClass1IX of(Object obj, Object obj2, Object obj3) {
        return construct(obj, obj2, obj3);
    }

    public C23891Ia listIterator() {
        return listIterator(0);
    }

    public static AnonymousClass1IX of(Object obj, Object obj2, Object obj3, Object obj4) {
        return construct(obj, obj2, obj3, obj4);
    }

    public static AnonymousClass1IX of() {
        return AnonymousClass1IY.EMPTY;
    }
}
