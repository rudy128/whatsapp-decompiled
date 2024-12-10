package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.DEb  reason: case insensitive filesystem */
public final class C26793DEb implements E9B {
    public final C26132Csv A01(List list) {
        int i = 0;
        C26132Csv csv = (C26132Csv) list.get(0);
        Iterator it = list.iterator();
        C26132Csv csv2 = null;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                C26132Csv csv3 = (C26132Csv) it.next();
                int i3 = csv3.A02;
                int i4 = csv3.A01;
                int i5 = i3 * i4;
                if (C108945cZ.A00(((float) i3) / ((float) i4), 1.0f / 1.0f) <= 0.05f && i5 > i) {
                    if (i3 == 1920) {
                        csv2 = csv3;
                        if (i4 == 1920) {
                            break;
                        }
                    }
                    csv2 = csv3;
                    i = i5;
                } else if (i5 > i2) {
                    csv = csv3;
                    i2 = i5;
                }
            } else if (csv2 == null) {
                return csv;
            }
        }
        return csv2;
    }

    public C24907CPa BXW(List list, int i, int i2) {
        C18070vi.A0d(list, 0);
        C26132Csv A01 = A01(list);
        return new C24907CPa(A00(A01, list, i * i2), A01, (C26132Csv) null);
    }

    private final C26132Csv A00(C26132Csv csv, List list, int i) {
        Iterator it = list.iterator();
        C26132Csv csv2 = null;
        int i2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            C26132Csv csv3 = (C26132Csv) it.next();
            int i3 = csv3.A02;
            int i4 = csv3.A01;
            int A05 = C108945cZ.A05(i, i3 * i4);
            if (A05 < i2) {
                if (C108945cZ.A00(((float) i3) / ((float) i4), ((float) csv.A02) / ((float) csv.A01)) > 0.05f) {
                    continue;
                } else {
                    if (i3 == 1920) {
                        csv2 = csv3;
                        if (i4 == 1920) {
                            break;
                        }
                    }
                    csv2 = csv3;
                    i2 = A05;
                }
            }
        }
        return csv2;
    }

    public C24907CPa BOy(C24331BzS bzS, C24331BzS bzS2, List list, List list2, List list3, int i, int i2) {
        C18070vi.A0i(list, list3);
        C26132Csv A01 = A01(list);
        return new C24907CPa(A00(A01, list3, i * i2), A01, (C26132Csv) null);
    }

    public C24907CPa BX5(List list, List list2, int i, int i2) {
        C18070vi.A0h(list, list2);
        C26132Csv A01 = A01(list);
        return new C24907CPa(A00(A01, list2, i * i2), A01, (C26132Csv) null);
    }

    public C24907CPa BbQ(List list, List list2, int i, int i2) {
        C18070vi.A0h(list, list2);
        C26132Csv A01 = A01(list);
        return new C24907CPa(A00(A01, list2, i * i2), A01, (C26132Csv) null);
    }
}
