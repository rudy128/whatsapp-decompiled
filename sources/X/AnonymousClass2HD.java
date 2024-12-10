package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HD  reason: invalid class name */
public final class AnonymousClass2HD extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
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

    public AnonymousClass2HD() {
        super(3724, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(12, this.A02);
        r3.CHf(14, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(3, this.A06);
        r3.CHf(13, this.A07);
        r3.CHf(15, this.A00);
        r3.CHf(16, this.A08);
        r3.CHf(4, this.A09);
        r3.CHf(5, this.A0A);
        r3.CHf(6, this.A01);
        r3.CHf(11, this.A0D);
        r3.CHf(7, this.A0E);
        r3.CHf(8, this.A0B);
        r3.CHf(10, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0G(12, this.A02, A13), this.A03);
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0D(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0F(AnonymousClass184.A05(AnonymousClass184.A0B(C17880vN.A0i(), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A00, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A01, A13), this.A0D, A13), this.A0E, A13), this.A0B, A13), this.A0C);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamIncomingMessageDrop {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "agentEngagementType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "botType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "e2eDestination", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "e2eFailureReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "e2eSenderType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "invisibleMessageCategory", A10);
        AnonymousClass186.A00(this.A00, "isLid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "localAddressingMode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "messageDropReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "messageMediaType", A10);
        AnonymousClass186.A00(this.A01, "offline", A10);
        AnonymousClass186.A00(this.A0D, "offlineCount", A10);
        AnonymousClass186.A00(this.A0E, "retryCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "revokeType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0C), "typeOfGroup", A10);
    }
}
