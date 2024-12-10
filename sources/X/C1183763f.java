package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63f  reason: invalid class name and case insensitive filesystem */
public final class C1183763f extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C1183763f() {
        super(3748, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A02);
        r3.CHf(7, this.A06);
        r3.CHf(8, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C17880vN.A0i(), this.A00, A13), this.A04, A13), this.A01, A13), this.A05, A13), this.A02, A13), this.A06, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamNotificationDelivery {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "notificationAction", A10);
        AnonymousClass186.A00(this.A04, "notificationDeliveryT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "notificationDestination", A10);
        AnonymousClass186.A00(this.A05, "notificationId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "notificationSource", A10);
        AnonymousClass186.A00(this.A06, "threadId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "uiNotificationType", A10);
    }
}
