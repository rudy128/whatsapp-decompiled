package X;

import java.util.LinkedHashMap;
import java.util.Map;

public final class DNY implements E6F {
    public Map A00;
    public final CYP A01 = new CYP();
    public final C20000A2o A02;
    public final Object A03;

    public DNY(C20000A2o a2o) {
        C18070vi.A0d(a2o, 1);
        this.A02 = a2o;
        Object A0p = C17880vN.A0p();
        this.A03 = A0p;
        synchronized (A0p) {
            this.A00 = CDU.A00(a2o.A02());
        }
    }

    public CO9 COx(String str) {
        CO9 co9;
        C24157BwP bwP = new C24157BwP(str, 1);
        synchronized (this.A03) {
            co9 = (CO9) this.A02.A01(bwP, "ASYNC_COMPONENT", 0);
        }
        return co9;
    }

    public static void A00(DNY dny, C20000A2o a2o) {
        LinkedHashMap A002 = CDU.A00(a2o.A02());
        dny.A00 = A002;
        dny.A01.A01(new DNX(A002));
    }
}
