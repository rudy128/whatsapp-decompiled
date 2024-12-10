package X;

import java.util.Map;

public final class DBR implements E4O {
    public EAU A00;
    public final C25243Cbe A01;
    public final C24932CQf A02;

    public void CFS(C24315BzC bzC, String str, Map map) {
        C18070vi.A0d(bzC, 0);
        C18070vi.A0e(str, 1, map);
        EAU eau = this.A00;
        if (eau == null) {
            C18070vi.A11("aleBridge");
            throw null;
        } else {
            eau.CFR(bzC, str, map);
        }
    }

    public DBR(C25243Cbe cbe, C24932CQf cQf) {
        this.A02 = cQf;
        this.A01 = cbe;
    }
}
