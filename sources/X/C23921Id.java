package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Id  reason: invalid class name and case insensitive filesystem */
public abstract class C23921Id {
    public static AnonymousClass1IZ partition(Iterator it, int i) {
        return partitionImpl(it, i, false);
    }

    public static AnonymousClass1IZ partitionImpl(Iterator it, int i, boolean z) {
        C199610h.A04(it);
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        C199610h.A07(z2);
        return new AnonymousClass2AM(it, i, false);
    }

    public static Iterator concat(Iterator it) {
        return new C23941If(it);
    }

    public static Iterator consumingForArray(Iterator... itArr) {
        return new C23931Ie(itArr);
    }

    public static AnonymousClass1IZ singletonIterator(Object obj) {
        return new AnonymousClass2AN(obj);
    }

    public static String toString(Iterator it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean addAll(Collection collection, Iterator it) {
        C199610h.A04(collection);
        C199610h.A04(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean elementsEqual(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L_0x0000:
            boolean r1 = r3.hasNext()
            boolean r0 = r4.hasNext()
            if (r1 == 0) goto L_0x001c
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r3.next()
            java.lang.Object r0 = r4.next()
            boolean r0 = X.C24604CBi.A00(r1, r0)
            if (r0 != 0) goto L_0x0000
        L_0x001b:
            return r2
        L_0x001c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23921Id.elementsEqual(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static AnonymousClass1IZ emptyIterator() {
        return emptyListIterator();
    }

    public static C23891Ia emptyListIterator() {
        return C23951Ig.EMPTY;
    }

    public static boolean removeAll(Iterator it, Collection collection) {
        C199610h.A04(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static AnonymousClass1IZ unmodifiableIterator(Iterator it) {
        C199610h.A04(it);
        return new C23961Ih(it);
    }

    public static Iterator concat(Iterator it, Iterator it2) {
        C199610h.A04(it);
        C199610h.A04(it2);
        return concat(consumingForArray(it, it2));
    }
}
