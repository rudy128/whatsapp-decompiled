package X;

import java.util.Iterator;

/* renamed from: X.DNx  reason: case insensitive filesystem */
public class C26975DNx implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        boolean z;
        C23759Bp4 A07 = cmq2.A07();
        if (cmq instanceof C23758Bp3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C25836Cmq A00 = C23758Bp3.A00(cmq);
            if (!(A00 instanceof C23759Bp4)) {
                return true;
            }
            C23759Bp4 A072 = A00.A07();
            Iterator it = A07.iterator();
            while (it.hasNext()) {
                if (!A072.A00.contains(it.next())) {
                }
            }
            return true;
        }
        return false;
    }
}
