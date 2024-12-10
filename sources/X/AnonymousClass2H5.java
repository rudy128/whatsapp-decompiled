package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2H5  reason: invalid class name */
public final class AnonymousClass2H5 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;

    public AnonymousClass2H5() {
        super(1616, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(6, this.A08);
        r3.CHf(2, this.A01);
        r3.CHf(11, this.A09);
        r3.CHf(13, this.A05);
        r3.CHf(14, this.A02);
        r3.CHf(7, this.A0A);
        r3.CHf(10, this.A06);
        r3.CHf(8, this.A0B);
        r3.CHf(9, this.A0C);
        r3.CHf(4, this.A03);
        r3.CHf(3, this.A07);
        r3.CHf(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A04(AnonymousClass184.A08(C17880vN.A0h(), this.A00, A13), this.A08, A13), this.A01, A13), this.A09);
        AnonymousClass184.A0X(A13, 12);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A0C(AnonymousClass184.A09(AnonymousClass184.A0G(13, this.A05, A13), this.A02, A13), this.A0A, A13), this.A06, A13), this.A0B, A13), this.A0C, A13), this.A03, A13), this.A07, A13), this.A04);
        AnonymousClass184.A0X(A13, 15);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatFilterEvent {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "actionType", A10);
        AnonymousClass186.A00(this.A08, "activitySessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "filterType", A10);
        AnonymousClass186.A00(this.A09, "labelName", A10);
        AnonymousClass186.A00(this.A05, "listIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "listType", A10);
        AnonymousClass186.A00(this.A0A, "metadata", A10);
        AnonymousClass186.A00(this.A06, "predefinedId", A10);
        AnonymousClass186.A00(this.A0B, "searchQueryId", A10);
        AnonymousClass186.A00(this.A0C, "searchRequestId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "searchResultType", A10);
        AnonymousClass186.A00(this.A07, "sessionId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A04), "targetScreen", A10);
    }
}
