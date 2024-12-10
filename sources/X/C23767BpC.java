package X;

import java.util.List;

/* renamed from: X.BpC  reason: case insensitive filesystem */
public abstract class C23767BpC extends C25278Cca {
    public boolean A09(C25812CmP cmP, Object obj, String str) {
        if (obj != null) {
            C25670Ck0 ck0 = cmP.A01;
            if (obj instanceof List) {
                return true;
            }
            if (A08() && !ck0.A03.contains(C24287Byk.SUPPRESS_EXCEPTIONS)) {
                Object[] A1b = AnonymousClass3MW.A1b();
                BE6.A1H(this, A1b, 0);
                A1b[1] = obj;
                throw new C23737Boi(String.format("Filter: %s can only be applied to arrays. Current context is: %s", A1b));
            }
        } else if (A08() && !cmP.A01.A03.contains(C24287Byk.SUPPRESS_EXCEPTIONS)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("The path ");
            A10.append(str);
            throw new C23737Boi(AnonymousClass000.A0y(" is null", A10));
        }
        return false;
    }
}
