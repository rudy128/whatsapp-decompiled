package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2HX  reason: invalid class name */
public final class AnonymousClass2HX extends AnonymousClass184 {
    public Boolean A00;
    public Long A01;

    public AnonymousClass2HX() {
        super(5582, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A00);
    }

    public List validate() {
        if (!C18070vi.A19(this.A00, false)) {
            return C18460wS.A00;
        }
        C18460wS r3 = C18460wS.A00;
        return AnonymousClass184.A0U(new C59552mU("reachout_timelock_enforcement_sheet_info", "was_sheet_seen_for_first_time != False", r3, r3));
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamReachoutTimelockEnforcementSheetInfo {");
        AnonymousClass186.A00(this.A01, "timeSinceEnforcemeentEndAndSheetSeenMs", A10);
        return AnonymousClass184.A0S(this.A00, "wasSheetSeenForFirstTime", A10);
    }
}
