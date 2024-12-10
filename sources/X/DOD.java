package X;

import java.util.List;

public class DOD implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        boolean z;
        int i;
        if (cmq2 instanceof C23757Bp2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        int intValue = cmq2.A04().A00.intValue();
        if (cmq instanceof C23755Bp0) {
            i = cmq.A06().A01.length();
        } else if (!(cmq instanceof C23758Bp3)) {
            return false;
        } else {
            C23758Bp3 A03 = cmq.A03();
            if (A03.A09() instanceof List) {
                i = ((List) A03.A09()).size();
            } else {
                i = -1;
            }
        }
        if (i == intValue) {
            return true;
        }
        return false;
    }
}
