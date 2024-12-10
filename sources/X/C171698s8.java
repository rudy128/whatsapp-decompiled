package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s8  reason: invalid class name and case insensitive filesystem */
public final class C171698s8 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public String A0H;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(20, this.A0F);
        r3.CHf(6, this.A09);
        r3.CHf(1, this.A0A);
        r3.CHf(14, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(2, this.A0B);
        r3.CHf(5, this.A0C);
        r3.CHf(10, this.A0G);
        r3.CHf(11, this.A00);
        r3.CHf(12, this.A01);
        r3.CHf(15, this.A02);
        r3.CHf(13, this.A0D);
        r3.CHf(7, this.A0E);
        r3.CHf(17, this.A03);
        r3.CHf(4, this.A07);
        r3.CHf(18, this.A04);
        r3.CHf(3, this.A0H);
        r3.CHf(19, this.A08);
    }

    public C171698s8() {
        super(3768, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A0F(AnonymousClass184.A0H(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A07(C108975cc.A0S(AnonymousClass184.A0B(AnonymousClass184.A0G(AnonymousClass184.A03(AnonymousClass184.A08(20, this.A0F, A13), this.A09, A13), this.A0A, A13), this.A05, A13), this.A06, A13), this.A0B, A13), this.A0C, A13), this.A0G, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A0D, A13), this.A0E);
        AnonymousClass184.A0X(A13, 16);
        A13.put(17, this.A03);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A0L(AnonymousClass184.A05(AnonymousClass184.A0K(C17880vN.A0k(), this.A07, A13), this.A04, A13), this.A0H, A13), this.A08);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBusinessTemplateMessageReplyStats {");
        AnonymousClass186.A00(this.A0F, "bizTrustTier", A10);
        AnonymousClass186.A00(this.A09, "businessMessageSentTs", A10);
        AnonymousClass186.A00(this.A0A, "businessPhoneNumber", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "chatsFolderType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "contactType", A10);
        AnonymousClass186.A00(this.A0B, "deltaTime", A10);
        AnonymousClass186.A00(this.A0C, "deltaTimeReceived", A10);
        AnonymousClass186.A00(this.A0G, "hsmTagStr", A10);
        AnonymousClass186.A00(this.A00, "isFromAdsManagerMm", A10);
        AnonymousClass186.A00(this.A01, "isFromCapi", A10);
        AnonymousClass186.A00(this.A02, "isMuted", A10);
        AnonymousClass186.A00(this.A0D, "lastOutgoingTs", A10);
        AnonymousClass186.A00(this.A0E, "messageDeliveredTs", A10);
        AnonymousClass186.A00(this.A03, "messageHasUrl", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "qbmFlag", A10);
        AnonymousClass186.A00(this.A04, "readReceiptsEnabled", A10);
        AnonymousClass186.A00(this.A0H, "templateId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A08), "threadCreationTime", A10);
    }
}
