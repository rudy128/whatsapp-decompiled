package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rG  reason: invalid class name and case insensitive filesystem */
public final class C171158rG extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;

    public C171158rG() {
        super(2166, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A00);
        r3.CHf(3, this.A04);
        r3.CHf(1, this.A05);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(C17880vN.A0m(), this.A01, A13), this.A00);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A03(C17880vN.A0j(), this.A04, A13), this.A05, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPushNotificationReceived {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "deliveredPriority", A10);
        AnonymousClass186.A00(this.A00, "payloadDecryptSuccess", A10);
        AnonymousClass186.A00(this.A04, "pushNotificationEventId", A10);
        AnonymousClass186.A00(this.A05, "pushNotificationId", A10);
        AnonymousClass186.A00(this.A02, "pushReceivedT", A10);
        return AnonymousClass184.A0S(this.A03, "pushSentT", A10);
    }
}
