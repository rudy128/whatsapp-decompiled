package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GI  reason: invalid class name */
public final class AnonymousClass2GI extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A05);
    }

    public AnonymousClass2GI() {
        super(3314, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsUserActivitySessionSummary {");
        AnonymousClass186.A00(this.A00, "psUserActivityDuration", A10);
        AnonymousClass186.A00(this.A01, "psUserActivityForeground", A10);
        AnonymousClass186.A00(this.A02, "psUserActivitySessionsLength", A10);
        AnonymousClass186.A00(this.A03, "psUserActivityStartTime", A10);
        AnonymousClass186.A00(this.A04, "psUserActivityTimeChange", A10);
        return AnonymousClass184.A0S(this.A05, "psUserSessionSummarySequence", A10);
    }
}
