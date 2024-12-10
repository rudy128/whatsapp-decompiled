package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: X.Blj  reason: case insensitive filesystem */
public abstract class C23556Blj<E> extends C199410f<E> implements NavigableSet<E>, C28675EDs<E> {
    public static final long serialVersionUID = 912559;
    public final transient Comparator comparator;
    public transient C23556Blj descendingSet;

    public abstract Object ceiling(Object obj);

    public abstract C23556Blj createDescendingSet();

    public abstract /* bridge */ /* synthetic */ Iterator descendingIterator();

    public abstract Object first();

    public abstract Object floor(Object obj);

    public abstract C23556Blj headSetImpl(Object obj, boolean z);

    public abstract Object higher(Object obj);

    public abstract Object last();

    public abstract Object lower(Object obj);

    public C23556Blj subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract C23556Blj subSetImpl(Object obj, boolean z, Object obj2, boolean z2);

    public abstract C23556Blj tailSetImpl(Object obj, boolean z);

    public static C23556Blj construct(Comparator comparator2, int i, Object... objArr) {
        if (i == 0) {
            return emptySet(comparator2);
        }
        AnonymousClass1HW.checkElementsNotNull(objArr, i);
        Arrays.sort(objArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator2.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        C23555Bli bli = C23555Bli.NATURAL_EMPTY_SET;
        return new C23555Bli(AnonymousClass1IX.asImmutableList(objArr, i2), comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public Comparator comparator() {
        return this.comparator;
    }

    public C23556Blj descendingSet() {
        C23556Blj blj = this.descendingSet;
        if (blj != null) {
            return blj;
        }
        C23556Blj createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    public Object writeReplace() {
        return new C27062DRi(this.comparator, toArray());
    }

    public C23556Blj(Comparator comparator2) {
        this.comparator = comparator2;
    }

    public static C23555Bli emptySet(Comparator comparator2) {
        if (DUS.natural().equals(comparator2)) {
            return C23555Bli.NATURAL_EMPTY_SET;
        }
        C23555Bli bli = C23555Bli.NATURAL_EMPTY_SET;
        return new C23555Bli(AnonymousClass1IX.of(), comparator2);
    }

    public static int unsafeCompare(Comparator comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    public C23556Blj headSet(Object obj, boolean z) {
        C199610h.A04(obj);
        return headSetImpl(obj, z);
    }

    @Deprecated
    public final Object pollFirst() {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final Object pollLast() {
        throw C17880vN.A0y();
    }

    public C23556Blj tailSet(Object obj, boolean z) {
        C199610h.A04(obj);
        return tailSetImpl(obj, z);
    }

    public C23556Blj headSet(Object obj) {
        return headSet(obj, false);
    }

    public C23556Blj tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    public C23556Blj subSet(Object obj, boolean z, Object obj2, boolean z2) {
        C199610h.A04(obj);
        C199610h.A04(obj2);
        C199610h.A07(C108975cc.A1A(this.comparator.compare(obj, obj2)));
        return subSetImpl(obj, z, obj2, z2);
    }
}
