package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2H8  reason: invalid class name */
public final class AnonymousClass2H8 extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;

    public AnonymousClass2H8() {
        super(472, new C18180vt(1, 100, 5000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A01);
        r3.CHf(11, this.A02);
        r3.CHf(13, this.A06);
        r3.CHf(14, this.A07);
        r3.CHf(15, this.A08);
        r3.CHf(5, this.A09);
        r3.CHf(8, this.A00);
        r3.CHf(10, (Object) null);
        r3.CHf(6, this.A0A);
        r3.CHf(4, this.A03);
        r3.CHf(7, this.A04);
        r3.CHf(3, this.A0B);
        r3.CHf(12, this.A0C);
        r3.CHf(1, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0L(AnonymousClass184.A0F(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0D(9, this.A01, A13), this.A02, A13), (Object) null, A13), (Object) null, A13), this.A06, A13), (Object) null);
        C17880vN.A1O((Object) null, A13, 20);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A07(AnonymousClass184.A0H(14, this.A07, A13), this.A08, A13), this.A09, A13), this.A00);
        AnonymousClass184.A0X(A13, 10);
        A13.put(C17880vN.A0m(), this.A0A);
        AnonymousClass184.A0X(A13, 16);
        A13.put(AnonymousClass184.A09(C17880vN.A0k(), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A03(AnonymousClass184.A0E(C17880vN.A0j(), this.A0B, A13), this.A0C, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUiAction {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "agentEngagementType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "botType", A10);
        AnonymousClass186.A00(this.A06, "dbMainThreadCount", A10);
        AnonymousClass186.A00(this.A07, "dbReadsCount", A10);
        AnonymousClass186.A00(this.A08, "dbWritesCount", A10);
        AnonymousClass186.A00(this.A09, "deviceCount", A10);
        AnonymousClass186.A00(this.A00, "isLid", A10);
        AnonymousClass186.A00(this.A0A, "participantCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "sizeBucket", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "uiActionChatType", A10);
        AnonymousClass186.A00(this.A0B, "uiActionT", A10);
        AnonymousClass186.A00(this.A0C, "uiActionTtrcSurfaceName", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A05), "uiActionType", A10);
    }
}
