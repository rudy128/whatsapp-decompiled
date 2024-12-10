package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HL  reason: invalid class name */
public final class AnonymousClass2HL extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Long A0H;
    public Long A0I;

    public AnonymousClass2HL() {
        super(478, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(15, this.A04);
        r3.CHf(19, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(6, this.A0H);
        r3.CHf(4, this.A07);
        r3.CHf(2, this.A08);
        r3.CHf(8, this.A09);
        r3.CHf(1, this.A00);
        r3.CHf(13, this.A0A);
        r3.CHf(23, this.A0B);
        r3.CHf(22, this.A0C);
        r3.CHf(20, this.A01);
        r3.CHf(11, this.A02);
        r3.CHf(16, (Object) null);
        r3.CHf(17, (Object) null);
        r3.CHf(21, this.A0D);
        r3.CHf(7, this.A0E);
        r3.CHf(9, this.A03);
        r3.CHf(3, this.A0I);
        r3.CHf(10, this.A0F);
        r3.CHf(18, (Object) null);
        r3.CHf(12, this.A0G);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0I(AnonymousClass184.A0D(AnonymousClass184.A0M(AnonymousClass184.A0O(AnonymousClass184.A0P(AnonymousClass184.A0F(AnonymousClass184.A03(AnonymousClass184.A0A(AnonymousClass184.A04(AnonymousClass184.A06(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0L(15, this.A04, A13), this.A05, A13), this.A06, A13), this.A0H, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A00, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A01, A13), this.A02, A13), (Object) null);
        C17880vN.A1O((Object) null, A13, 17);
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0G(AnonymousClass184.A0K(AnonymousClass184.A0C(AnonymousClass184.A05(AnonymousClass184.A0B(AnonymousClass184.A09(21, this.A0D, A13), this.A0E, A13), this.A03, A13), this.A0I, A13), this.A0F, A13), (Object) null, A13), (Object) null, A13), this.A0G);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamE2eMessageRecv {");
        AnonymousClass186.A00(C17900vP.A08(this.A04), "agentEngagementType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "botType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "e2eCiphertextType", A10);
        AnonymousClass186.A00(this.A0H, "e2eCiphertextVersion", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "e2eDestination", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "e2eFailureReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "e2eSenderType", A10);
        AnonymousClass186.A00(this.A00, "e2eSuccessful", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "editType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "groupEncryptionState", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "invisibleMessageCategory", A10);
        AnonymousClass186.A00(this.A01, "isHostedChat", A10);
        AnonymousClass186.A00(this.A02, "isLid", A10);
        String str = null;
        Integer num = this.A0D;
        if (num != null) {
            str = num.toString();
        }
        AnonymousClass186.A00(str, "messageDistributionType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0E), "messageMediaType", A10);
        AnonymousClass186.A00(this.A03, "offline", A10);
        AnonymousClass186.A00(this.A0I, "retryCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0F), "revokeType", A10);
        String str2 = null;
        Integer num2 = this.A0G;
        if (num2 != null) {
            str2 = num2.toString();
        }
        return AnonymousClass184.A0S(str2, "typeOfGroup", A10);
    }
}
