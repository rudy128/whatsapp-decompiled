package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qm  reason: invalid class name and case insensitive filesystem */
public final class C170858qm extends AnonymousClass184 {
    public Long A00;
    public String A01;

    public C170858qm() {
        super(2442, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A01);
        r3.CHf(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(C17880vN.A0i(), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamExitReasonsSummary {");
        AnonymousClass186.A00(this.A01, "exitReasonsCensus", A10);
        return AnonymousClass184.A0S(this.A00, "lastReportedExitTime", A10);
    }
}
