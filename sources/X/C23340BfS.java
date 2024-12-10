package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: X.BfS  reason: case insensitive filesystem */
public final class C23340BfS extends C23341BfT implements NavigableSet, C28674EDr {
    public static final C23340BfS A03 = new C23340BfS(C23344BfW.A02, C23351Bfd.A00);
    public transient C23340BfS A00;
    public final transient C23345BfX A01;
    public final transient Comparator A02;

    public static boolean A01(Comparator comparator, Iterable iterable) {
        Object obj;
        if (comparator == null || iterable == null) {
            throw null;
        }
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = C23351Bfd.A00;
            }
        } else if (!(iterable instanceof C28674EDr)) {
            return false;
        } else {
            obj = ((C23340BfS) ((C28674EDr) iterable)).A02;
        }
        return comparator.equals(obj);
    }

    /* renamed from: A0C */
    public final C23340BfS subSet(Object obj, Object obj2, boolean z, boolean z2) {
        IllegalArgumentException illegalArgumentException = null;
        if (!(obj == null || obj2 == null)) {
            Comparator comparator = this.A02;
            if (comparator.compare(obj, obj2) <= 0) {
                C23345BfX bfX = this.A01;
                int binarySearch = Collections.binarySearch(bfX, obj, comparator);
                if (binarySearch < 0) {
                    binarySearch ^= -1;
                } else if (!z) {
                    binarySearch++;
                }
                C23340BfS A0B = A0B(binarySearch, bfX.size());
                int binarySearch2 = Collections.binarySearch(A0B.A01, obj2, A0B.A02);
                if (binarySearch2 < 0) {
                    binarySearch2 ^= -1;
                } else if (z2) {
                    binarySearch2++;
                }
                return A0B.A0B(0, binarySearch2);
            }
            illegalArgumentException = BE6.A0j();
        }
        throw illegalArgumentException;
    }

    public final Comparator comparator() {
        return this.A02;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.A01, obj, this.A02) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x004a
            boolean r0 = r8 instanceof java.util.Set
            r5 = 0
            if (r0 == 0) goto L_0x0049
            java.util.Set r8 = (java.util.Set) r8
            X.BfX r2 = r7.A01
            int r1 = r2.size()
            int r0 = r8.size()
            if (r1 != r0) goto L_0x0049
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x004a
            java.util.Comparator r4 = r7.A02
            boolean r0 = A01(r4, r8)
            if (r0 == 0) goto L_0x0044
            java.util.Iterator r3 = r8.iterator()
            X.Bfh r2 = r2.listIterator(r5)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
        L_0x002c:
            boolean r0 = r2.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x004a
            java.lang.Object r1 = r2.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            java.lang.Object r0 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x0049
            int r0 = r4.compare(r1, r0)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x002c
            return r5
        L_0x0043:
            return r5
        L_0x0044:
            boolean r0 = r7.containsAll(r8)
            return r0
        L_0x0049:
            return r5
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23340BfS.equals(java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, obj2, true, false);
    }

    static {
        C23355Bfh bfh = C23345BfX.A00;
    }

    public static C23340BfS A00(Comparator comparator) {
        if (C23351Bfd.A00.equals(comparator)) {
            return A03;
        }
        C23355Bfh bfh = C23345BfX.A00;
        return new C23340BfS(C23344BfW.A02, comparator);
    }

    /* renamed from: A0A */
    public final C23340BfS descendingSet() {
        C23340BfS bfS = this.A00;
        if (bfS == null) {
            Comparator reverseOrder = Collections.reverseOrder(this.A02);
            if (isEmpty()) {
                bfS = A00(reverseOrder);
            } else {
                bfS = new C23340BfS(this.A01.A09(), reverseOrder);
            }
            this.A00 = bfS;
            bfS.A00 = this;
        }
        return bfS;
    }

    public final C23340BfS A0B(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A01.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return A00(this.A02);
        }
        C23345BfX bfX = this.A01;
        return new C23340BfS(bfX.subList(i, i2), this.A02);
    }

    public final Object ceiling(Object obj) {
        C23345BfX bfX = this.A01;
        if (obj != null) {
            int binarySearch = Collections.binarySearch(bfX, obj, this.A02);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            if (binarySearch == bfX.size()) {
                return null;
            }
            return bfX.get(binarySearch);
        }
        throw null;
    }

    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.A02;
        if (!A01(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C23355Bfh A0B = this.A01.listIterator(0);
        Iterator it = collection.iterator();
        if (A0B.hasNext()) {
            Object next = it.next();
            Object next2 = A0B.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        } else if (!it.hasNext()) {
                            return true;
                        } else {
                            next = it.next();
                        }
                    } else if (!A0B.hasNext()) {
                        break;
                    } else {
                        next2 = A0B.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return this.A01.A09().listIterator(0);
    }

    public final Object floor(Object obj) {
        int i;
        if (obj != null) {
            C23345BfX bfX = this.A01;
            int binarySearch = Collections.binarySearch(bfX, obj, this.A02);
            if (binarySearch >= 0) {
                i = binarySearch + 1;
            } else {
                i = binarySearch ^ -1;
            }
            int i2 = i - 1;
            if (i2 == -1) {
                return null;
            }
            return bfX.get(i2);
        }
        throw null;
    }

    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        if (obj != null) {
            int binarySearch = Collections.binarySearch(this.A01, obj, this.A02);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            } else if (z) {
                binarySearch++;
            }
            return A0B(0, binarySearch);
        }
        throw null;
    }

    public final Object higher(Object obj) {
        C23345BfX bfX = this.A01;
        if (obj != null) {
            int binarySearch = Collections.binarySearch(bfX, obj, this.A02);
            int i = binarySearch ^ -1;
            if (binarySearch >= 0) {
                i = binarySearch + 1;
            }
            if (i == bfX.size()) {
                return null;
            }
            return bfX.get(i);
        }
        throw null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.A01.listIterator(0);
    }

    public final Object lower(Object obj) {
        if (obj != null) {
            C23345BfX bfX = this.A01;
            int binarySearch = Collections.binarySearch(bfX, obj, this.A02);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            int i = binarySearch - 1;
            if (i == -1) {
                return null;
            }
            return bfX.get(i);
        }
        throw null;
    }

    public final int size() {
        return this.A01.size();
    }

    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        if (obj != null) {
            C23345BfX bfX = this.A01;
            int binarySearch = Collections.binarySearch(bfX, obj, this.A02);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            } else if (!z) {
                binarySearch++;
            }
            return A0B(binarySearch, bfX.size());
        }
        throw null;
    }

    public C23340BfS(C23345BfX bfX, Comparator comparator) {
        this.A02 = comparator;
        this.A01 = bfX;
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw C17880vN.A0y();
    }

    public final Object first() {
        if (!isEmpty()) {
            return C108955ca.A0p(this.A01);
        }
        throw BE6.A14();
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    public final Object last() {
        if (!isEmpty()) {
            C23345BfX bfX = this.A01;
            return bfX.get(AnonymousClass000.A0Q(bfX));
        }
        throw BE6.A14();
    }

    @Deprecated
    public final Object pollFirst() {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final Object pollLast() {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final Object removeFirst() {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final Object removeLast() {
        throw C17880vN.A0y();
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        if (obj != null) {
            int binarySearch = Collections.binarySearch(this.A01, obj, this.A02);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            return A0B(0, binarySearch);
        }
        throw null;
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        if (obj != null) {
            C23345BfX bfX = this.A01;
            int binarySearch = Collections.binarySearch(bfX, obj, this.A02);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            return A0B(binarySearch, bfX.size());
        }
        throw null;
    }
}
