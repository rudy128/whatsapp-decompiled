package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63z  reason: invalid class name and case insensitive filesystem */
public final class C1185763z extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C1185763z() {
        super(5196, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A05);
        r3.CHf(2, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(12, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(4, this.A08);
        r3.CHf(5, this.A00);
        r3.CHf(7, this.A01);
        r3.CHf(8, this.A09);
        r3.CHf(9, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0D(AnonymousClass184.A0E(AnonymousClass184.A0C(C108975cc.A0S(C17880vN.A0h(), this.A05, A13), this.A03, A13), this.A04, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A00);
        AnonymousClass184.A0X(A13, 6);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(C108955ca.A0e(), this.A01, A13), this.A09, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamInorganicNotification {");
        AnonymousClass186.A00(this.A05, "appSessionId", A10);
        AnonymousClass186.A00(this.A03, "groupSize", A10);
        AnonymousClass186.A00(this.A04, "inorganicNotifChatThreadCount", A10);
        AnonymousClass186.A00(this.A06, "inorganicNotificationPromotionId", A10);
        AnonymousClass186.A00(this.A07, "inorganicNotificationTypeValue", A10);
        AnonymousClass186.A00(this.A08, "notificationId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "notificationJourneyActionType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "surface", A10);
        AnonymousClass186.A00(this.A09, "threadId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "threadType", A10);
    }
}
