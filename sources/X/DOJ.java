package X;

import java.util.Iterator;
import java.util.List;

public class DOJ implements E6L {
    public Object Bdr(C25812CmP cmP, Object obj, List list) {
        EBZ ebz = cmP.A01.A00;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25584CiO ciO = (C25584CiO) it.next();
                if (obj instanceof List) {
                    ebz.CHv(obj, ebz.BhV(obj), ciO.A00.get());
                }
            }
        }
        return obj;
    }
}
