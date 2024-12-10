package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BpI  reason: case insensitive filesystem */
public class C23773BpI extends C25278Cca {
    public static final E6N A00 = new DOP();

    /* JADX WARNING: type inference failed for: r10v0, types: [X.Boo, X.DSB, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v2, types: [X.Boq, X.DSB, java.lang.Object] */
    public static void A00(DSB dsb, C25812CmP cmP, C25278Cca cca, E6N e6n, Object obj, String str) {
        Object obj2;
        C25812CmP cmP2 = cmP;
        EBZ ebz = cmP.A01.A00;
        Object obj3 = obj;
        C25278Cca cca2 = cca;
        E6N e6n2 = e6n;
        String str2 = str;
        if (obj3 instanceof Map) {
            if (e6n2.Bj7(obj3)) {
                cca2.A03(dsb, cmP, obj3, str2);
            }
            Iterator it = ebz.BXg(obj3).iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                StringBuilder A11 = AnonymousClass000.A11(str2);
                A11.append("['");
                A11.append(A0v);
                String A0y = AnonymousClass000.A0y("']", A11);
                Map map = (Map) obj3;
                if (!map.containsKey(A0v)) {
                    obj2 = EBZ.A00;
                } else {
                    obj2 = map.get(A0v);
                }
                if (obj2 != EBZ.A00) {
                    ? obj4 = new Object();
                    obj4.A00 = obj3;
                    obj4.A00 = A0v;
                    A00(obj4, cmP2, cca2, e6n2, obj2, A0y);
                }
            }
        } else if (obj3 instanceof List) {
            int i = 0;
            if (e6n2.Bj7(obj3)) {
                if (cca2.A01 == null) {
                    cca2.A03(dsb, cmP, obj3, str2);
                } else {
                    C25278Cca A01 = cca2.A01();
                    int i2 = 0;
                    for (Object next : ebz.CPI(obj3)) {
                        StringBuilder A112 = AnonymousClass000.A11(str2);
                        AnonymousClass000.A1E("[", "]", A112, i2);
                        String obj5 = A112.toString();
                        A01.A00 = i2;
                        A01.A03(dsb, cmP, next, obj5);
                        i2++;
                    }
                }
            }
            for (Object next2 : ebz.CPI(obj3)) {
                StringBuilder A113 = AnonymousClass000.A11(str2);
                AnonymousClass000.A1E("[", "]", A113, i);
                String obj6 = A113.toString();
                ? obj7 = new Object();
                obj7.A00 = obj3;
                obj7.A00 = i;
                A00(obj7, cmP2, cca2, e6n2, next2, obj6);
                i++;
            }
        }
    }
}
