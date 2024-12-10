package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sA  reason: invalid class name and case insensitive filesystem */
public final class C171718sA extends AnonymousClass184 {
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
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(22, this.A0G);
        r3.CHf(7, this.A0A);
        r3.CHf(1, this.A0B);
        r3.CHf(16, this.A05);
        r3.CHf(10, this.A06);
        r3.CHf(2, this.A0C);
        r3.CHf(6, this.A0D);
        r3.CHf(11, this.A0H);
        r3.CHf(12, this.A00);
        r3.CHf(13, this.A01);
        r3.CHf(17, this.A02);
        r3.CHf(14, this.A0E);
        r3.CHf(8, this.A0F);
        r3.CHf(19, this.A03);
        r3.CHf(3, this.A07);
        r3.CHf(5, this.A08);
        r3.CHf(20, this.A04);
        r3.CHf(4, this.A0I);
        r3.CHf(21, this.A09);
    }

    public C171718sA() {
        super(3772, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A0G(AnonymousClass184.A0J(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A08(C108975cc.A0S(AnonymousClass184.A0C(AnonymousClass184.A0I(AnonymousClass184.A03(AnonymousClass184.A09(22, this.A0G, A13), this.A0A, A13), this.A0B, A13), this.A05, A13), this.A06, A13), this.A0C, A13), this.A0D, A13), this.A0H, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A0E, A13), this.A0F);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0L(18, AnonymousClass184.A0R(A13, 15), A13), this.A03, A13), this.A07);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A0N(AnonymousClass184.A06(AnonymousClass184.A0M(C17880vN.A0l(), this.A08, A13), this.A04, A13), this.A0I, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBusinessTemplateMessageUserAction {");
        AnonymousClass186.A00(this.A0G, "bizTrustTier", A10);
        AnonymousClass186.A00(this.A0A, "businessMessageSentTs", A10);
        AnonymousClass186.A00(this.A0B, "businessPhoneNumber", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "chatsFolderType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "contactType", A10);
        AnonymousClass186.A00(this.A0C, "deltaTime", A10);
        AnonymousClass186.A00(this.A0D, "deltaTimeReceived", A10);
        AnonymousClass186.A00(this.A0H, "hsmTagStr", A10);
        AnonymousClass186.A00(this.A00, "isFromAdsManagerMm", A10);
        AnonymousClass186.A00(this.A01, "isFromCapi", A10);
        AnonymousClass186.A00(this.A02, "isMuted", A10);
        AnonymousClass186.A00(this.A0E, "lastOutgoingTs", A10);
        AnonymousClass186.A00(this.A0F, "messageDeliveredTs", A10);
        AnonymousClass186.A00(this.A03, "messageHasUrl", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "messageLevelAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "qbmFlag", A10);
        AnonymousClass186.A00(this.A04, "readReceiptsEnabled", A10);
        AnonymousClass186.A00(this.A0I, "templateId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A09), "threadCreationTime", A10);
    }
}
