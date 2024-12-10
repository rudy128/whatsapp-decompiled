package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.18l  reason: invalid class name and case insensitive filesystem */
public abstract class C220618l {
    public static int computeArrayListCapacity(int i) {
        C201310y.checkNonnegative(i, "arraySize");
        return C25336Cdv.A00(((long) i) + 5 + ((long) (i / 10)));
    }

    public static int indexOfImpl(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C24604CBi.A00(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int lastIndexOfImpl(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C24604CBi.A00(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static boolean equalsImpl(List list, Object obj) {
        C199610h.A04(list);
        if (obj != list) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                int size = list.size();
                if (size == list2.size()) {
                    if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
                        return C23921Id.elementsEqual(list.iterator(), list2.iterator());
                    }
                    int i = 0;
                    while (i < size) {
                        if (C24604CBi.A00(list.get(i), list2.get(i))) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static int indexOfRandomAccess(List list, Object obj) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOfRandomAccess(List list, Object obj) {
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (!obj.equals(list.get(size)));
        return size;
    }

    public static ArrayList newArrayList(Iterable iterable) {
        C199610h.A04(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    public static ArrayList newArrayList(Object... objArr) {
        C199610h.A04(objArr);
        ArrayList arrayList = new ArrayList(computeArrayListCapacity(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList newArrayList(Iterator it) {
        ArrayList newArrayList = newArrayList();
        C23921Id.addAll(newArrayList, it);
        return newArrayList;
    }

    public static ArrayList newArrayList() {
        return new ArrayList();
    }
}
