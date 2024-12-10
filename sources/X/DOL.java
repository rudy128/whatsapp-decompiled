package X;

import java.util.Iterator;
import java.util.List;

public class DOL implements E6L {
    public Object Bdr(C25812CmP cmP, Object obj, List list) {
        StringBuilder A10 = AnonymousClass000.A10();
        EBZ ebz = cmP.A01.A00;
        if (obj instanceof List) {
            for (Object next : ebz.CPI(obj)) {
                if (next instanceof String) {
                    AnonymousClass8BS.A1D(next, A10);
                }
            }
        }
        if (list != null) {
            Iterator it = C25584CiO.A00(cmP, String.class, list).iterator();
            while (it.hasNext()) {
                A10.append(C17880vN.A0v(it));
            }
        }
        return A10.toString();
    }
}
