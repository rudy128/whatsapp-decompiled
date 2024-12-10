package X;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.CXq  reason: case insensitive filesystem */
public final class C25098CXq {
    public final C25550Cho A01(String str) {
        Object obj;
        C18070vi.A0d(str, 0);
        Iterator it = ((LinkedHashSet) C25550Cho.A03.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(((C25550Cho) obj).A01, str)) {
                break;
            }
        }
        C25550Cho cho = (C25550Cho) obj;
        if (cho == null) {
            return C24099BvR.A00;
        }
        return cho;
    }

    public final C25550Cho A00(Integer num) {
        if (num == null) {
            return C24100BvS.A00;
        }
        int intValue = num.intValue();
        C24100BvS bvS = C24100BvS.A00;
        if (intValue == bvS.A00) {
            return bvS;
        }
        C24099BvR bvR = C24099BvR.A00;
        if (intValue == bvR.A00) {
            return bvR;
        }
        C24094BvM bvM = C24094BvM.A00;
        if (intValue == bvM.A00) {
            return bvM;
        }
        C24098BvQ bvQ = C24098BvQ.A00;
        if (intValue == bvQ.A00) {
            return bvQ;
        }
        C24096BvO bvO = C24096BvO.A00;
        if (intValue == bvO.A00) {
            return bvO;
        }
        C24097BvP bvP = C24097BvP.A00;
        if (intValue == bvP.A00) {
            return bvP;
        }
        C24095BvN bvN = C24095BvN.A00;
        if (intValue != bvN.A00) {
            return new C25550Cho(intValue, (String) null);
        }
        return bvN;
    }
}
