package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fc  reason: invalid class name and case insensitive filesystem */
public final class C46582Fc extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public String A02;

    public C46582Fc() {
        super(1172, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A02);
        r3.CHf(2, this.A00);
        r3.CHf(1, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0l(), this.A02, A13), this.A00);
        AnonymousClass184.A0X(A13, 3);
        A13.put(C17880vN.A0h(), this.A01);
        AnonymousClass184.A0X(A13, 4);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusTabOpen {");
        AnonymousClass186.A00(this.A02, "psaCampaigns", A10);
        AnonymousClass186.A00(this.A00, "statusAvailableUpdatesCount", A10);
        return AnonymousClass184.A0S(this.A01, "statusSessionId", A10);
    }
}
