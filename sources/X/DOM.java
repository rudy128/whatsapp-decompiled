package X;

import java.util.List;
import java.util.Map;

public class DOM implements E6L {
    public Object Bdr(C25812CmP cmP, Object obj, List list) {
        int BhV;
        if (list != null && list.size() > 0) {
            C23771BpG bpG = ((C25584CiO) list.get(0)).A01.A00;
            boolean z = bpG.A01 instanceof C23770BpF;
            C25278Cca cca = bpG;
            if (!z) {
                while (true) {
                    C25278Cca cca2 = cca.A01;
                    if (cca2 == null) {
                        break;
                    }
                    C25278Cca cca3 = cca2.A01;
                    cca = cca2;
                    if (cca3 == null) {
                        cca2.A01 = new C25278Cca();
                        break;
                    }
                }
            }
            CYQ cyq = ((C25584CiO) list.get(0)).A01;
            C25670Ck0 ck0 = cmP.A01;
            Object A00 = cyq.A00(ck0, obj, obj).A00();
            EBZ ebz = ck0.A00;
            if (A00 instanceof List) {
                BhV = ebz.BhV(A00);
                return Integer.valueOf(BhV);
            }
        }
        EBZ ebz2 = cmP.A01.A00;
        if (!(obj instanceof List) && !(obj instanceof Map)) {
            return null;
        }
        BhV = ebz2.BhV(obj);
        return Integer.valueOf(BhV);
    }
}
