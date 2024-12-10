package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.DEc  reason: case insensitive filesystem */
public class C26794DEc implements E9B {
    public C26132Csv A00;
    public C26132Csv A01;
    public C26132Csv A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C24907CPa BOy(C24331BzS bzS, C24331BzS bzS2, List list, List list2, List list3, int i, int i2) {
        return A00(list, list2, list3, i, i2);
    }

    public C24907CPa BX5(List list, List list2, int i, int i2) {
        return A00(list, (List) null, list2, i, i2);
    }

    public C24907CPa BXW(List list, int i, int i2) {
        return A00((List) null, (List) null, list, i, i2);
    }

    public C24907CPa BbQ(List list, List list2, int i, int i2) {
        return A00((List) null, list, list2, i, i2);
    }

    private C24907CPa A00(List list, List list2, List list3, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        HashSet hashSet;
        C26132Csv csv;
        int i7 = i;
        int i8 = i2;
        List list4 = list2;
        List<C26132Csv> list5 = list;
        C26132Csv csv2 = new C26132Csv(Math.max(i7, i8), Math.min(i7, i8));
        int i9 = this.A04;
        if (i9 > 0) {
            float f = (float) i9;
            i4 = (int) (0.8f * f);
            i3 = (int) (f * 1.2f);
        } else {
            i3 = 3145728;
            i4 = 0;
        }
        ArrayList A022 = A02(list3, i3);
        if (list != null) {
            list5 = A02(list5, 10485760);
        }
        if (list2 != null) {
            list4 = A02(list4, 2097152);
        }
        if (list5 != null) {
            int i10 = this.A03;
            if (i10 <= 0) {
                i10 = C26132Csv.A00(csv2);
            }
            i5 = 0;
            if (i10 > 0) {
                Iterator it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C26132Csv csv3 = (C26132Csv) it.next();
                    C26132Csv A012 = C25314CdK.A01(csv3, csv2);
                    if (A012 != null) {
                        csv3 = A012;
                    }
                    int A002 = C26132Csv.A00(csv3);
                    if (A002 > i5) {
                        i5 = A002;
                        if (A002 >= i10) {
                            i5 = i10;
                            break;
                        }
                    }
                }
            }
        } else {
            i5 = 0;
        }
        int i11 = this.A05;
        if (i4 != 0) {
            double A003 = C25314CdK.A00(csv2.A02, csv2.A01);
            double sqrt = Math.sqrt(((double) i4) / A003);
            csv2 = new C26132Csv((int) (A003 * sqrt), (int) sqrt);
        }
        C26132Csv csv4 = null;
        if (i5 <= 0 || list5 == null) {
            i6 = 0;
            hashSet = null;
        } else {
            i6 = (int) (((double) i5) * 0.85d);
            hashSet = C17880vN.A12();
            for (C26132Csv csv5 : list5) {
                C26132Csv csv6 = csv5;
                C26132Csv A013 = C25314CdK.A01(csv5, csv2);
                if (A013 != null) {
                    csv6 = A013;
                }
                if (C26132Csv.A00(csv6) >= i6) {
                    hashSet.add(Double.valueOf(C25314CdK.A00(csv5.A02, csv5.A01)));
                }
            }
        }
        C26132Csv A014 = A01(csv2, A022, hashSet, 0.0d);
        if (A014 == null && (A014 = A01(csv2, A022, (Set) null, 0.0d)) == null) {
            throw AnonymousClass8BR.A0w("Could not calculate preview size.");
        }
        double A004 = C25314CdK.A00(A014.A02, A014.A01);
        if (list5 != null) {
            if (i5 > 0) {
                double sqrt2 = Math.sqrt(((double) i6) / A004);
                csv2 = new C26132Csv((int) (A004 * sqrt2), (int) sqrt2);
            }
            csv = A01(csv2, list5, (Set) null, A004);
        } else {
            csv = null;
        }
        if (list4 != null) {
            if (i11 == 0) {
                csv4 = A01(A014, list4, (Set) null, A004);
            } else {
                double d = 0.0d;
                if (A004 != 0.0d) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < list4.size(); i13++) {
                        C26132Csv csv7 = (C26132Csv) list4.get(i13);
                        int i14 = csv7.A02;
                        int i15 = csv7.A01;
                        int i16 = i14 * i15;
                        double A005 = C25314CdK.A00(i14, i15);
                        int A052 = C108945cZ.A05(i11, i16);
                        double A015 = BE6.A01(A004, A005);
                        if (csv4 != null) {
                            double d2 = (double) i16;
                            if (((double) (((int) (d2 * A015)) + A052)) >= ((double) (((int) (d2 * d)) + i12))) {
                            }
                        }
                        csv4 = csv7;
                        d = A015;
                        i12 = A052;
                    }
                }
            }
        }
        this.A01 = A014;
        this.A00 = csv;
        this.A02 = csv4;
        return new C24907CPa(A014, csv, csv4);
    }

    public static C26132Csv A01(C26132Csv csv, List list, Set set, double d) {
        double d2 = d;
        C26132Csv csv2 = null;
        C26132Csv csv3 = csv;
        int i = csv3.A02;
        int i2 = csv3.A01;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        if (d <= 0.0d) {
            d2 = C25314CdK.A00(i, i2);
        }
        Iterator it = list.iterator();
        double d3 = Double.MAX_VALUE;
        boolean z = false;
        while (it.hasNext()) {
            C26132Csv csv4 = (C26132Csv) it.next();
            int i3 = csv4.A02;
            int i4 = csv4.A01;
            int max2 = Math.max(i3, i4);
            int min2 = Math.min(i3, i4);
            double A002 = C25314CdK.A00(i3, i4);
            Set set2 = set;
            if (set == null || set2.isEmpty() || set2.contains(Double.valueOf(A002))) {
                if (max2 == max && min2 == min && BE6.A01(A002, d2) <= 0.001d) {
                    return csv4;
                }
                double A012 = BE6.A01(d2, A002);
                double d4 = A012 - d3;
                if (d4 <= 0.001d) {
                    if (Math.abs(d4) > 0.001d) {
                        d3 = A012;
                        csv2 = null;
                        z = false;
                    }
                    if (max2 < max || min2 < min) {
                        if (!z) {
                            if (csv2 != null && Long.signum((((long) i3) * ((long) i4)) - (((long) csv2.A02) * ((long) csv2.A01))) <= 0) {
                            }
                        }
                    } else if (!z) {
                        csv2 = csv4;
                        z = true;
                    } else if (csv2 != null) {
                        if (Long.signum((((long) i3) * ((long) i4)) - (((long) csv2.A02) * ((long) csv2.A01))) >= 0) {
                        }
                    }
                    csv2 = csv4;
                }
            }
        }
        return csv2;
    }

    public C26794DEc(int i, int i2, int i3) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = i3;
    }

    public static ArrayList A02(List list, int i) {
        ArrayList A14 = AnonymousClass000.A14(list);
        C26132Csv csv = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C26132Csv csv2 = (C26132Csv) list.get(i2);
            if (C26132Csv.A00(csv2) <= i) {
                A14.add(csv2);
            }
            if (csv == null || C26132Csv.A00(csv2) < C26132Csv.A00(csv)) {
                csv = csv2;
            }
        }
        if (A14.isEmpty() && csv != null) {
            A14.add(csv);
        }
        return A14;
    }

    public C26794DEc(int i, int i2, int i3, boolean z) {
        this.A04 = i;
        this.A03 = i2;
        this.A05 = i3;
    }
}
