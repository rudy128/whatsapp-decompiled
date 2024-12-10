package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8ry  reason: invalid class name and case insensitive filesystem */
public final class C171598ry extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(21, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(22, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(25, this.A05);
        r3.CHf(26, this.A06);
        r3.CHf(27, this.A07);
        r3.CHf(28, this.A08);
        r3.CHf(19, this.A09);
        r3.CHf(20, this.A0A);
        r3.CHf(24, this.A0B);
        r3.CHf(23, this.A0C);
    }

    public C171598ry() {
        super(2642, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(AnonymousClass184.A05(AnonymousClass184.A0O(AnonymousClass184.A03(21, this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        Object A0R = AnonymousClass184.A0R(A13, 15);
        A13.put(AnonymousClass184.A0P(AnonymousClass184.A0Q(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A06(AnonymousClass184.A0B(AnonymousClass184.A08(AnonymousClass184.A0F(AnonymousClass8BV.A0T(AnonymousClass184.A0E(AnonymousClass184.A0A(AnonymousClass184.A07(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A09(AnonymousClass8BV.A0S(AnonymousClass8BV.A0R(C108975cc.A0U(AnonymousClass184.A0J(AnonymousClass184.A0I(14, A0R, A13), A0R, A13), A0R, A13), this.A05, A13), this.A06, A13), this.A07, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A08, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidInfraHealth {");
        AnonymousClass186.A00(this.A00, "psDailyStartsBgCold", A10);
        AnonymousClass186.A00(this.A01, "psDailyStartsCold", A10);
        AnonymousClass186.A00(this.A02, "psDailyStartsFgCold", A10);
        AnonymousClass186.A00(this.A03, "psDailyStartsLukeWarm", A10);
        AnonymousClass186.A00(this.A04, "psDailyStartsWarms", A10);
        AnonymousClass186.A00(this.A05, "psNumberOfChats", A10);
        AnonymousClass186.A00(this.A06, "psNumberOfChatsHidden", A10);
        AnonymousClass186.A00(this.A07, "psNumberOfChatsHiddenNull", A10);
        AnonymousClass186.A00(this.A08, "psNumberOfMessagesOrphan", A10);
        AnonymousClass186.A00(this.A09, "timeSinceLastColdStartInMin", A10);
        AnonymousClass186.A00(this.A0A, "timeSinceLastEventInMin", A10);
        AnonymousClass186.A00(this.A0B, "timeSinceLastLukewarmStartInMin", A10);
        return AnonymousClass184.A0S(this.A0C, "timeSinceLastWarmStartInMin", A10);
    }
}
