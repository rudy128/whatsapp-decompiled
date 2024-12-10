package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DEY implements E9B {
    public C24907CPa BOy(C24331BzS bzS, C24331BzS bzS2, List list, List list2, List list3, int i, int i2) {
        C26132Csv csv;
        ArrayList A13 = AnonymousClass000.A13();
        if (list2 == null || list2.isEmpty()) {
            A13.addAll(list3);
        } else {
            for (Object next : list2) {
                if (list3.contains(next)) {
                    A13.add(next);
                }
            }
        }
        List A01 = C26099CsJ.A01(C26099CsJ.A01, A13);
        DUP.A00(this, A01, 5);
        C26132Csv csv2 = null;
        if (A01.size() == 1) {
            csv = (C26132Csv) C108955ca.A0p(A01);
        } else {
            csv = null;
        }
        C24331BzS bzS3 = C24331BzS.HIGH;
        if (bzS2.equals(bzS3)) {
            csv = (C26132Csv) A01.get(AnonymousClass3MX.A02(A01, 1));
        } else if (bzS2.equals(C24331BzS.MEDIUM)) {
            int A00 = C26132Csv.A00((C26132Csv) A01.get(AnonymousClass3MX.A02(A01, 1))) / 2;
            int size = A01.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                csv = (C26132Csv) A01.get(size);
            } while (C26132Csv.A00(csv) > A00);
        } else if (bzS2.equals(C24331BzS.LOW)) {
            int A002 = C26132Csv.A00((C26132Csv) A01.get(AnonymousClass3MX.A02(A01, 1))) / 3;
            int size2 = A01.size();
            do {
                size2--;
                if (size2 < 0) {
                    break;
                }
                csv = (C26132Csv) A01.get(size2);
            } while (C26132Csv.A00(csv) > A002);
        }
        C28111Yx.A02(csv);
        List A012 = C26099CsJ.A01(C26099CsJ.A00, list);
        ArrayList A10 = C17880vN.A10(A012);
        if (A10.isEmpty()) {
            A10.addAll(A012);
        }
        DUP.A00(this, A10, 6);
        if (bzS.equals(bzS3)) {
            csv2 = (C26132Csv) A10.get(A10.size() - 1);
        } else if (bzS.equals(C24331BzS.MEDIUM)) {
            int size3 = A10.size();
            do {
                size3--;
                if (size3 < 0) {
                    break;
                }
                csv2 = (C26132Csv) A10.get(size3);
            } while (C26132Csv.A00(csv2) > 2097152);
        } else if (bzS.equals(C24331BzS.LOW)) {
            int size4 = A10.size();
            do {
                size4--;
                if (size4 < 0) {
                    break;
                }
                csv2 = (C26132Csv) A10.get(size4);
            } while (C26132Csv.A00(csv2) > 1048576);
        }
        return new C24907CPa(csv, csv2, csv);
    }

    public C24907CPa BX5(List list, List list2, int i, int i2) {
        throw C17880vN.A0y();
    }

    public C24907CPa BXW(List list, int i, int i2) {
        float f;
        float f2;
        float max = ((float) Math.max(i, i2)) / ((float) Math.min(i, i2));
        Iterator it = list.iterator();
        int i3 = 0;
        C26132Csv csv = null;
        while (it.hasNext()) {
            C26132Csv csv2 = (C26132Csv) it.next();
            int i4 = csv2.A02;
            int i5 = csv2.A01;
            if (max < ((float) Math.max(i4, i5)) / ((float) Math.min(i4, i5))) {
                f2 = (float) i5;
                f = f2 * max;
            } else {
                f = (float) i4;
                f2 = f / max;
            }
            int i6 = (int) (f * f2);
            if (i6 > i3) {
                csv = csv2;
                i3 = i6;
            }
        }
        return new C24907CPa(csv, (C26132Csv) null, (C26132Csv) null);
    }

    public C24907CPa BbQ(List list, List list2, int i, int i2) {
        throw C17880vN.A0y();
    }
}
