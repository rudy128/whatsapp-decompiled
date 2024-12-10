package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HI  reason: invalid class name */
public final class AnonymousClass2HI extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;

    public AnonymousClass2HI() {
        super(1980, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A0D);
        r3.CHf(8, this.A03);
        r3.CHf(16, this.A04);
        r3.CHf(19, this.A00);
        r3.CHf(12, this.A01);
        r3.CHf(20, this.A05);
        r3.CHf(15, this.A02);
        r3.CHf(14, this.A0G);
        r3.CHf(6, this.A06);
        r3.CHf(5, this.A07);
        r3.CHf(10, this.A0E);
        r3.CHf(2, this.A08);
        r3.CHf(11, this.A09);
        r3.CHf(3, this.A0A);
        r3.CHf(4, this.A0F);
        r3.CHf(1, this.A0B);
        r3.CHf(13, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0H(AnonymousClass184.A0M(AnonymousClass184.A0E(AnonymousClass184.A0L(AnonymousClass184.A0I(AnonymousClass184.A0A(9, this.A0D, A13), this.A03, A13), this.A04, A13), this.A00, A13), this.A01, A13), this.A05, A13), this.A02);
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0D(AnonymousClass184.A04(AnonymousClass184.A0C(AnonymousClass184.A07(AnonymousClass184.A08(14, this.A0G, A13), this.A06, A13), this.A07, A13), this.A0E, A13), this.A08, A13), this.A09, A13), this.A0A);
        AnonymousClass184.A0X(A13, 17);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A03(C17880vN.A0k(), this.A0F, A13), this.A0B, A13), this.A0C);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPlaceholderActivity {");
        AnonymousClass186.A00(this.A0D, "deviceCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "deviceSizeBucket", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "e2eSenderType", A10);
        AnonymousClass186.A00(this.A00, "isHostedChat", A10);
        AnonymousClass186.A00(this.A01, "isLid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "localAddressingMode", A10);
        AnonymousClass186.A00(this.A02, "messageBeforeReg", A10);
        AnonymousClass186.A00(this.A0G, "messageKeyHash", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "messageMediaType", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A07), A10);
        AnonymousClass186.A00(this.A0E, "participantCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "placeholderActionInd", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "placeholderAddReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "placeholderChatTypeInd", A10);
        AnonymousClass186.A00(this.A0F, "placeholderTimePeriod", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "placeholderTypeInd", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0C), "typeOfGroup", A10);
    }
}
