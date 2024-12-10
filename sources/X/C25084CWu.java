package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CWu  reason: case insensitive filesystem */
public final class C25084CWu {
    public EAJ A00;
    public final C25517ChF A01;
    public final C25588CiS A02;
    public final HashMap A03 = C17880vN.A11();
    public final C26045Cr9 A04;

    public C25084CWu(C25517ChF chF, C26045Cr9 cr9) {
        C25588CiS ciS;
        C18070vi.A0d(chF, 2);
        this.A04 = cr9;
        this.A01 = chF;
        if (AnonymousClass000.A1Y(BE8.A0e(C25517ChF.A0D, AnonymousClass000.A0h(), this.A01.A00))) {
            C25517ChF chF2 = this.A01;
            ciS = new C25588CiS(chF2);
            ciS.A01 = AnonymousClass000.A1Y(BE8.A0e(C25517ChF.A08, AnonymousClass000.A0h(), chF2.A00));
        } else {
            ciS = null;
        }
        this.A02 = ciS;
    }

    public boolean A00() {
        C25517ChF chF = this.A01;
        C9S c9s = C25517ChF.A0C;
        Boolean A0h = AnonymousClass000.A0h();
        Map map = chF.A00;
        if (!AnonymousClass000.A1Y(BE8.A0e(c9s, A0h, map)) || !AnonymousClass000.A1Y(BE8.A0e(C25517ChF.A0E, A0h, map))) {
            return false;
        }
        return true;
    }
}
