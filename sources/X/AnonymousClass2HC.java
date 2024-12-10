package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HC  reason: invalid class name */
public final class AnonymousClass2HC extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public AnonymousClass2HC() {
        super(1728, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(21, this.A05);
        r3.CHf(18, this.A0C);
        r3.CHf(24, this.A06);
        r3.CHf(25, this.A07);
        r3.CHf(22, this.A00);
        r3.CHf(14, this.A01);
        r3.CHf(26, this.A08);
        r3.CHf(9, this.A02);
        r3.CHf(2, this.A09);
        r3.CHf(1, this.A0A);
        r3.CHf(20, this.A0D);
        r3.CHf(19, this.A0E);
        r3.CHf(23, this.A0B);
        r3.CHf(16, this.A03);
        r3.CHf(17, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0Q(AnonymousClass184.A0K(AnonymousClass184.A0D(AnonymousClass184.A0E(21, this.A05, A13), (Object) null, A13), (Object) null, A13), this.A0C, A13), this.A06);
        A13.put(25, this.A07);
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A0G(22, this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A04(AnonymousClass184.A0B(AnonymousClass184.A05(AnonymousClass184.A08(AnonymousClass184.A06(26, this.A08, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A02, A13), this.A09);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0P(AnonymousClass184.A0L(AnonymousClass184.A09(AnonymousClass184.A0A(AnonymousClass184.A0M(C17880vN.A0h(), this.A0A, A13), this.A0D, A13), (Object) null, A13), (Object) null, A13), this.A0E, A13), this.A0B, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamForwardSend {");
        AnonymousClass186.A00(C17900vP.A08(this.A05), "disappearingChatInitiator", A10);
        AnonymousClass186.A00(this.A0C, "ephemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "ephemeralityInitiator", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "ephemeralityTriggerAction", A10);
        AnonymousClass186.A00(this.A00, "isForwardedForward", A10);
        AnonymousClass186.A00(this.A01, "isFrequentlyForwarded", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "messageBizType", A10);
        AnonymousClass186.A00(this.A02, "messageIsInternational", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "messageMediaType", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A0A), A10);
        AnonymousClass186.A00(this.A0D, "receiverDefaultDisappearingDuration", A10);
        AnonymousClass186.A00(this.A0E, "senderDefaultDisappearingDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "typeOfGroup", A10);
        AnonymousClass186.A00(this.A03, "wouldBeFrequentlyForwardedAt3", A10);
        return AnonymousClass184.A0S(this.A04, "wouldBeFrequentlyForwardedAt4", A10);
    }
}
