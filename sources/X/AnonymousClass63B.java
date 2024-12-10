package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63B  reason: invalid class name */
public final class AnonymousClass63B extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    public AnonymousClass63B() {
        super(5594, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(5, this.A00);
        r3.CHf(4, this.A03);
        r3.CHf(6, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A02);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A06(C17880vN.A0l(), this.A00, A13), this.A03, A13), this.A01);
        AnonymousClass184.A0X(A13, 3);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWearableWaNotificationDelivery {");
        AnonymousClass186.A00(this.A02, "clientTimestamp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "notifEvent", A10);
        AnonymousClass186.A00(this.A03, "notifId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "notifType", A10);
    }
}
