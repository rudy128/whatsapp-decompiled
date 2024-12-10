package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: X.10e  reason: invalid class name and case insensitive filesystem */
public abstract class C199310e<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] EMPTY_ARRAY = new Object[0];
    public static final long serialVersionUID = 912559;

    public abstract AnonymousClass1IX asList();

    public abstract boolean contains(Object obj);

    public abstract int copyIntoArray(Object[] objArr, int i);

    public Object[] internalArray() {
        return null;
    }

    public abstract boolean isPartialView();

    public abstract AnonymousClass1IZ iterator();

    public abstract Object writeReplace();

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        C199610h.A04(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return C26064Cre.copy(internalArray, internalArrayStart(), internalArrayEnd(), objArr);
            }
            objArr = AnonymousClass1HW.newArray(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        copyIntoArray(objArr, 0);
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }
}
