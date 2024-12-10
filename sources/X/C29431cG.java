package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: X.1cG  reason: invalid class name and case insensitive filesystem */
public abstract class C29431cG extends C29421cF {
    public static final double A0T(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        Iterator it = iterable.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += (double) ((Number) it.next()).intValue();
            i++;
            if (i < 0) {
                AnonymousClass1ZU.A0A();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    public static final int A0U(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static final C99434so A0V(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        return new C99434so(iterable, 4);
    }

    public static final Object A0X(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof List) {
            return A0b((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object A0Y(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    public static final Object A0Z(Iterable iterable) {
        Object next;
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof List) {
            return A0d((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final Object A0a(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        return null;
    }

    public static final Object A0b(List list) {
        C18070vi.A0d(list, 0);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A0c(List list) {
        C18070vi.A0d(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object A0d(List list) {
        C18070vi.A0d(list, 0);
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A0e(List list) {
        C18070vi.A0d(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Object A0f(List list, int i) {
        C18070vi.A0d(list, 0);
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final String A0g(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, C22821Di r5) {
        C18070vi.A0d(iterable, 0);
        StringBuilder sb = new StringBuilder();
        A16(sb, charSequence, charSequence2, charSequence3, iterable, r5);
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static final ArrayList A0i(Iterable iterable, int i, int i2) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator A00 = C181839Sa.A00(iterable.iterator(), i, i2, false);
            while (A00.hasNext()) {
                arrayList.add(A00.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i3 = size / i2;
        int i4 = 1;
        if (size % i2 == 0) {
            i4 = 0;
        }
        ArrayList arrayList2 = new ArrayList(i3 + i4);
        int i5 = 0;
        while (i5 < size) {
            int i6 = size - i5;
            int i7 = i;
            if (i > i6) {
                i7 = i6;
            }
            ArrayList arrayList3 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList3.add(list.get(i8 + i5));
            }
            arrayList2.add(arrayList3);
            i5 += i2;
            if (i5 < 0) {
                break;
            }
        }
        return arrayList2;
    }

    public static final ArrayList A0j(Iterable iterable, Iterable iterable2) {
        C18070vi.A0d(iterable, 0);
        C18070vi.A0d(iterable2, 1);
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C29351c6.A0C(iterable, 10), C29351c6.A0C(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new AnonymousClass1D6(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final ArrayList A0k(Iterable iterable, Collection collection) {
        C18070vi.A0d(collection, 0);
        C18070vi.A0d(iterable, 1);
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C29401cD.A0J(iterable, arrayList2);
        return arrayList2;
    }

    public static final ArrayList A0l(Object obj, Collection collection) {
        C18070vi.A0d(collection, 0);
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final ArrayList A0m(Collection collection) {
        C18070vi.A0d(collection, 0);
        return new ArrayList(collection);
    }

    public static final HashSet A0n(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        HashSet hashSet = new HashSet(C200610r.A03(C29351c6.A0C(iterable, 12)));
        A17(iterable, hashSet);
        return hashSet;
    }

    public static final List A0p(Iterable iterable) {
        ArrayList arrayList;
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - 1;
            if (size <= 0) {
                return C18460wS.A00;
            }
            if (size == 1) {
                List singletonList = Collections.singletonList(A0Z(iterable));
                C18070vi.A0X(singletonList);
                return singletonList;
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(((List) iterable).get(i));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        char c = 0;
        for (Object next : iterable) {
            if (c >= 1) {
                arrayList.add(next);
            } else {
                c = 1;
            }
        }
        return AnonymousClass1ZU.A07(arrayList);
    }

    public static final List A0q(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final List A0r(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return A0t(iterable);
        }
        List A0u = A0u(iterable);
        C29421cF.A0S(A0u);
        return A0u;
    }

    public static final List A0s(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0t(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C18070vi.A0d(array, 0);
            if (array.length > 1) {
                Arrays.sort(array);
            }
            List asList = Arrays.asList(array);
            C18070vi.A0X(asList);
            return asList;
        }
        List A0u = A0u(iterable);
        C29391cC.A0G(A0u);
        return A0u;
    }

    public static final List A0t(Iterable iterable) {
        Object next;
        C18070vi.A0d(iterable, 0);
        if (!(iterable instanceof Collection)) {
            return AnonymousClass1ZU.A07(A0u(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C18460wS.A00;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        List singletonList = Collections.singletonList(next);
        C18070vi.A0X(singletonList);
        return singletonList;
    }

    public static final List A0v(Iterable iterable, int i) {
        C18070vi.A0d(iterable, 0);
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return C18460wS.A00;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return A0t(iterable);
                }
                if (i == 1) {
                    List singletonList = Collections.singletonList(A0X(iterable));
                    C18070vi.A0X(singletonList);
                    return singletonList;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return AnonymousClass1ZU.A07(arrayList);
        }
    }

    public static final List A0w(Iterable iterable, Iterable iterable2) {
        C18070vi.A0d(iterable, 0);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0t(iterable2);
        }
        Collection collection = (Collection) iterable2;
        if (collection.isEmpty()) {
            return A0t(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!collection.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final List A0x(Iterable iterable, Object obj) {
        C18070vi.A0d(iterable, 0);
        ArrayList arrayList = new ArrayList(C29351c6.A0C(iterable, 10));
        boolean z = false;
        for (Object next : iterable) {
            if (z || !C18070vi.A18(next, obj)) {
                arrayList.add(next);
            } else {
                z = true;
            }
        }
        return arrayList;
    }

    public static final List A0y(Iterable iterable, Comparator comparator) {
        C18070vi.A0d(iterable, 0);
        C18070vi.A0d(comparator, 1);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0t(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C18070vi.A0d(array, 0);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            C18070vi.A0X(asList);
            return asList;
        }
        List A0u = A0u(iterable);
        C29391cC.A0H(A0u, comparator);
        return A0u;
    }

    public static final Set A11(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A17(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final Set A12(Iterable iterable) {
        Object obj;
        Iterator it;
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C200610r.A03(collection.size()));
                    A17(iterable, linkedHashSet);
                    return linkedHashSet;
                } else if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                    Set singleton = Collections.singleton(obj);
                    C18070vi.A0X(singleton);
                    return singleton;
                } else {
                    it = iterable.iterator();
                }
            }
            return C25511Om.A00;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        A17(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            it = linkedHashSet2.iterator();
        }
        return C25511Om.A00;
        obj = it.next();
        Set singleton2 = Collections.singleton(obj);
        C18070vi.A0X(singleton2);
        return singleton2;
    }

    public static final Set A13(Iterable iterable, Iterable iterable2) {
        C18070vi.A0d(iterable, 0);
        C18070vi.A0d(iterable2, 1);
        Set A11 = A11(iterable);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0t(iterable2);
        }
        A11.retainAll((Collection) iterable2);
        return A11;
    }

    public static final Set A14(Iterable iterable, Iterable iterable2) {
        C18070vi.A0d(iterable, 0);
        Set A11 = A11(iterable);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0t(iterable2);
        }
        A11.removeAll((Collection) iterable2);
        return A11;
    }

    public static final C98534rJ A15(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        return new C98534rJ(new C71503Hg(iterable));
    }

    public static final void A16(Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, C22821Di r9) {
        C18070vi.A0d(iterable, 0);
        appendable.append(charSequence2);
        int i = 0;
        for (Object next : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            AnonymousClass1Y6.A00(appendable, next, r9);
        }
        appendable.append(charSequence3);
    }

    public static final void A17(Iterable iterable, Collection collection) {
        C18070vi.A0d(iterable, 0);
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static final boolean A18(Iterable iterable, Object obj) {
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i = 0;
            for (Object next : iterable) {
                if (i < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                } else if (C18070vi.A18(obj, next)) {
                    return true;
                } else {
                    i++;
                }
            }
            return false;
        } else if (((List) iterable).indexOf(obj) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean A19(Iterable iterable, C22821Di r5) {
        C18070vi.A0d(iterable, 0);
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (Object invoke : iterable) {
                if (((Boolean) r5.invoke(invoke)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final byte[] A1A(Collection collection) {
        C18070vi.A0d(collection, 0);
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final int[] A1B(Collection collection) {
        C18070vi.A0d(collection, 0);
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static final long[] A1C(Collection collection) {
        C18070vi.A0d(collection, 0);
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static String A0h(CharSequence charSequence, Iterable iterable, C22821Di r3) {
        return A0g(charSequence, "", "", iterable, r3);
    }

    public static final List A0u(Iterable iterable) {
        if (iterable instanceof Collection) {
            return A0m((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        A17(iterable, arrayList);
        return arrayList;
    }

    public static final List A0z(Iterable iterable, C22821Di r5) {
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Boolean) r5.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Comparable A0W(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Iterator A0o(Iterable iterable) {
        return A0t(iterable).iterator();
    }

    public static final List A10(List list, int i) {
        int size = list.size();
        if (i >= size) {
            return A0t(list);
        }
        if (i == 1) {
            List singletonList = Collections.singletonList(A0d(list));
            C18070vi.A0X(singletonList);
            return singletonList;
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }
}
