package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64A  reason: invalid class name */
public final class AnonymousClass64A extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;

    public AnonymousClass64A() {
        super(1180, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(6, this.A02);
        r3.CHf(9, this.A03);
        r3.CHf(11, this.A09);
        r3.CHf(12, this.A0A);
        r3.CHf(13, this.A04);
        r3.CHf(14, this.A05);
        r3.CHf(8, this.A06);
        r3.CHf(3, this.A07);
        r3.CHf(2, this.A08);
        r3.CHf(1, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A08(AnonymousClass184.A06(C108955ca.A0e(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A0E(C108955ca.A0g(), this.A09, A13), this.A0A);
        AnonymousClass184.A0X(A13, 15);
        A13.put(AnonymousClass184.A03(C108975cc.A0S(C108975cc.A0T(AnonymousClass184.A0A(AnonymousClass184.A0G(C108955ca.A0i(), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A0B);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusReply {");
        AnonymousClass186.A00(this.A00, "isMentioned", A10);
        AnonymousClass186.A00(this.A01, "isPosterBiz", A10);
        AnonymousClass186.A00(this.A02, "isPosterInAddressBook", A10);
        AnonymousClass186.A00(this.A03, "isReplyBarBelowCanvas", A10);
        AnonymousClass186.A00(this.A09, "mediaHeight", A10);
        AnonymousClass186.A00(this.A0A, "mediaWidth", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "replyEntryMethod", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "replyExitMethod", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "statusContentType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "statusReplyMessageType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "statusReplyResult", A10);
        return AnonymousClass184.A0S(this.A0B, "statusSessionId", A10);
    }
}
