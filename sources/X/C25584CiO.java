package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CiO  reason: case insensitive filesystem */
public class C25584CiO {
    public E6M A00;
    public CYQ A01;
    public Boolean A02 = AnonymousClass000.A0h();
    public Integer A03;
    public String A04;

    public static ArrayList A00(C25812CmP cmP, Class cls, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((C25584CiO) it.next()).A00.get();
            EBZ ebz = cmP.A01.A00;
            if (obj instanceof List) {
                for (Object next : ebz.CPI(obj)) {
                    if (next != null) {
                        if (!BE7.A1W(cls, next)) {
                            if (cls == String.class) {
                                next = next.toString();
                            }
                        }
                        A13.add(next);
                    }
                }
            } else if (obj != null) {
                if (BE7.A1W(cls, obj)) {
                    A13.add(obj);
                } else if (cls == String.class) {
                    C108955ca.A1U(obj, A13);
                }
            }
        }
        return A13;
    }
}
