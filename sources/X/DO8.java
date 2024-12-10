package X;

import java.util.Iterator;

public class DO8 implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        boolean z;
        if (cmq2 instanceof C23758Bp3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cmq2 = C23758Bp3.A00(cmq2);
            if (cmq2 instanceof C23749Bou) {
                return false;
            }
        }
        C23759Bp4 A07 = cmq2.A07();
        if (cmq instanceof C23758Bp3) {
            cmq = C23758Bp3.A00(cmq);
            if (cmq instanceof C23749Bou) {
                return false;
            }
        }
        Iterator it = cmq.A07().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Iterator it2 = A07.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (next.equals(it2.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
