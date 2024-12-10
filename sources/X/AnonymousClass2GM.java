package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GM  reason: invalid class name */
public final class AnonymousClass2GM extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public AnonymousClass2GM() {
        super(1502, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(5, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A06(AnonymousClass184.A03(AnonymousClass184.A05(AnonymousClass184.A07(C17880vN.A0i(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUserActivitySessionSummary {");
        AnonymousClass186.A00(this.A00, "userActivityDuration", A10);
        AnonymousClass186.A00(this.A01, "userActivityForeground", A10);
        AnonymousClass186.A00(this.A02, "userActivitySessionsLength", A10);
        AnonymousClass186.A00(this.A03, "userActivityStartTime", A10);
        AnonymousClass186.A00(this.A04, "userActivityTimeChange", A10);
        return AnonymousClass184.A0S(this.A05, "userSessionSummarySequence", A10);
    }
}
