package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* renamed from: X.BfY  reason: case insensitive filesystem */
public final class C23346BfY extends DVL implements NavigableMap {
    public static final Comparator A03;
    public static final C23346BfY A04;
    public final transient C23345BfX A00;
    public final transient C23340BfS A01;
    public final transient C23346BfY A02;

    /* renamed from: A03 */
    public final C23346BfY subMap(Object obj, Object obj2, boolean z, boolean z2) {
        IllegalArgumentException illegalArgumentException = null;
        if (!(obj == null || obj2 == null)) {
            if (this.A01.A02.compare(obj, obj2) <= 0) {
                return headMap(obj2, z2).tailMap(obj, z);
            }
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q(obj, obj2, A1b);
            illegalArgumentException = AnonymousClass000.A0k(CBB.A00("expected fromKey <= toKey but %s > %s", A1b));
        }
        throw illegalArgumentException;
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Comparator comparator() {
        return this.A01.A02;
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, obj2, true, false);
    }

    static {
        C23351Bfd bfd = C23351Bfd.A00;
        A03 = bfd;
        C23340BfS A002 = C23340BfS.A00(bfd);
        C23355Bfh bfh = C23345BfX.A00;
        A04 = new C23346BfY(C23344BfW.A02, (C23346BfY) null, A002);
    }

    private final C23346BfY A00(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A00.size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return A01(this.A01.A02);
        }
        C23340BfS bfS = this.A01;
        C23345BfX bfX = this.A00;
        return new C23346BfY(bfX.subList(i, i2), (C23346BfY) null, bfS.A0B(i, i2));
    }

    public static C23346BfY A01(Comparator comparator) {
        if (C23351Bfd.A00.equals(comparator)) {
            return A04;
        }
        C23340BfS A002 = C23340BfS.A00(comparator);
        C23355Bfh bfh = C23345BfX.A00;
        return new C23346BfY(C23344BfW.A02, (C23346BfY) null, A002);
    }

    /* renamed from: A04 */
    public final C23346BfY headMap(Object obj, boolean z) {
        if (obj != null) {
            C23340BfS bfS = this.A01;
            int binarySearch = Collections.binarySearch(bfS.A01, obj, bfS.A02);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            } else if (z) {
                binarySearch++;
            }
            return A00(0, binarySearch);
        }
        throw null;
    }

    /* renamed from: A05 */
    public final C23346BfY tailMap(Object obj, boolean z) {
        if (obj != null) {
            C23340BfS bfS = this.A01;
            int binarySearch = Collections.binarySearch(bfS.A01, obj, bfS.A02);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            } else if (!z) {
                binarySearch++;
            }
            return A00(binarySearch, this.A00.size());
        }
        throw null;
    }

    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.A01.descendingSet();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        DUG bfb;
        Comparator bfc;
        C23346BfY bfY = this.A02;
        if (bfY != null) {
            return bfY;
        }
        boolean isEmpty = isEmpty();
        C23340BfS bfS = this.A01;
        if (isEmpty) {
            Comparator comparator = bfS.A02;
            if (comparator instanceof DUG) {
                bfb = (DUG) comparator;
            } else {
                bfb = new C23349Bfb(comparator);
            }
            if (bfb instanceof C23350Bfc) {
                bfc = ((C23350Bfc) bfb).zza;
            } else if (bfb instanceof C23352Bfe) {
                bfc = C23351Bfd.A00;
            } else if (bfb instanceof C23351Bfd) {
                bfc = C23352Bfe.A00;
            } else {
                bfc = new C23350Bfc(bfb);
            }
            return A01(bfc);
        }
        return new C23346BfY(this.A00.A09(), this, bfS.descendingSet());
    }

    public final Object firstKey() {
        return this.A01.first();
    }

    public final Object lastKey() {
        return this.A01.last();
    }

    public final int size() {
        return this.A00.size();
    }

    public C23346BfY(C23345BfX bfX, C23346BfY bfY, C23340BfS bfS) {
        this.A01 = bfS;
        this.A00 = bfX;
        this.A02 = bfY;
    }

    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) C108955ca.A0p(entrySet().A09());
    }

    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().A09().get(AnonymousClass000.A0Q(this.A00));
    }

    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw C17880vN.A0y();
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
