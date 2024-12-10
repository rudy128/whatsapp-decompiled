package X;

import java.util.Iterator;
import java.util.List;

public final class DEZ implements E9B {
    public C24907CPa BOy(C24331BzS bzS, C24331BzS bzS2, List list, List list2, List list3, int i, int i2) {
        throw BE6.A0v("Only photo mode is used");
    }

    public C24907CPa BXW(List list, int i, int i2) {
        throw BE6.A0v("Only photo mode is used");
    }

    public C24907CPa BbQ(List list, List list2, int i, int i2) {
        throw BE6.A0v("Only photo mode is used");
    }

    public C24907CPa BX5(List list, List list2, int i, int i2) {
        int i3 = 0;
        C26132Csv csv = (C26132Csv) list.get(C18070vi.A15(list, list2) ? 1 : 0);
        Iterator it = list.iterator();
        C26132Csv csv2 = null;
        int i4 = 0;
        while (it.hasNext()) {
            C26132Csv csv3 = (C26132Csv) it.next();
            int i5 = csv3.A02;
            int i6 = csv3.A01;
            int i7 = i5 * i6;
            if (C108945cZ.A00(((float) i5) / ((float) i6), 4.0f / 3.0f) <= 0.05f && i7 > i3) {
                csv2 = csv3;
                i3 = i7;
            } else if (i7 > i4) {
                csv = csv3;
                i4 = i7;
            }
        }
        if (csv2 != null) {
            csv = csv2;
        }
        int i8 = i * i2;
        Iterator it2 = list2.iterator();
        C26132Csv csv4 = null;
        int i9 = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            C26132Csv csv5 = (C26132Csv) it2.next();
            int i10 = csv5.A02;
            int i11 = csv5.A01;
            int A05 = C108945cZ.A05(i8, i10 * i11);
            if (A05 < i9) {
                if (C108945cZ.A00(((float) i10) / ((float) i11), ((float) csv.A02) / ((float) csv.A01)) <= 0.05f) {
                    csv4 = csv5;
                    i9 = A05;
                }
            }
        }
        return new C24907CPa(csv4, csv, (C26132Csv) null);
    }
}
