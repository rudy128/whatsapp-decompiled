package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2FM  reason: invalid class name */
public final class AnonymousClass2FM extends AnonymousClass184 {
    public Boolean A00;
    public Long A01;
    public Long A02;

    public AnonymousClass2FM() {
        super(3040, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A00);
        r3.CHf(1, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A05(C17880vN.A0i(), this.A01, A13), this.A00, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAdvListTimestampInvalid {");
        AnonymousClass186.A00(this.A01, "advListIncomingTimestampInHours", A10);
        AnonymousClass186.A00(this.A00, "advListIsExpired", A10);
        return AnonymousClass184.A0S(this.A02, "advListLocalTimestampInHours", A10);
    }
}
