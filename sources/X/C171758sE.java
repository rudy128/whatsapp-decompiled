package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sE  reason: invalid class name and case insensitive filesystem */
public final class C171758sE extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;

    public C171758sE() {
        super(4112, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(22, this.A09);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A0A);
        r3.CHf(24, this.A06);
        r3.CHf(3, this.A0B);
        r3.CHf(4, this.A0C);
        r3.CHf(5, this.A0D);
        r3.CHf(19, this.A04);
        r3.CHf(20, this.A0E);
        r3.CHf(21, this.A0F);
        r3.CHf(6, this.A0G);
        r3.CHf(17, this.A00);
        r3.CHf(7, this.A07);
        r3.CHf(18, this.A0H);
        r3.CHf(8, this.A0I);
        r3.CHf(9, this.A0J);
        r3.CHf(10, this.A0K);
        r3.CHf(23, this.A05);
        r3.CHf(11, this.A0L);
        r3.CHf(16, this.A0M);
        r3.CHf(25, this.A01);
        r3.CHf(13, this.A02);
        r3.CHf(14, this.A0N);
        r3.CHf(15, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0P(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A0K(AnonymousClass184.A09(AnonymousClass184.A0J(AnonymousClass184.A08(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A0Q(C108975cc.A0S(AnonymousClass184.A03(22, this.A09, A13), this.A03, A13), this.A0A, A13), this.A06, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A04, A13), this.A0E, A13), this.A0F, A13), this.A0G, A13), this.A00, A13), this.A07, A13), this.A0H, A13), this.A0I, A13), this.A0J, A13), this.A0K, A13), this.A05, A13), this.A0L);
        AnonymousClass184.A0X(A13, 12);
        A13.put(AnonymousClass184.A0F(C108975cc.A0U(16, this.A0M, A13), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 26);
        A13.put(AnonymousClass184.A0H(14, this.A0N, A13), this.A08);
        AnonymousClass184.A0X(A13, 27);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamExtensionScreenProgress {");
        AnonymousClass186.A00(this.A09, "adContext", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "bizPlatform", A10);
        AnonymousClass186.A00(this.A0A, "businessOwnerJid", A10);
        AnonymousClass186.A00(this.A06, "clickSequenceNumber", A10);
        AnonymousClass186.A00(this.A0B, "embeddedError", A10);
        AnonymousClass186.A00(this.A0C, "embeddedFlow", A10);
        AnonymousClass186.A00(this.A0D, "embeddedFlowType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "entryPointConversationInitiated", A10);
        AnonymousClass186.A00(this.A0E, "entryPointConversionApp", A10);
        AnonymousClass186.A00(this.A0F, "entryPointConversionSource", A10);
        AnonymousClass186.A00(this.A0G, "extensionCategory", A10);
        AnonymousClass186.A00(this.A00, "extensionRestoredFromCache", A10);
        AnonymousClass186.A00(this.A07, "extensionScreenLength", A10);
        AnonymousClass186.A00(this.A0H, "extensionStatus", A10);
        AnonymousClass186.A00(this.A0I, "extensionsFlowId", A10);
        AnonymousClass186.A00(this.A0J, "extensionsMessageId", A10);
        AnonymousClass186.A00(this.A0K, "extensionsSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "flowEntryPoint", A10);
        AnonymousClass186.A00(this.A0L, "flowStatusExit", A10);
        AnonymousClass186.A00(this.A0M, "hsmTag", A10);
        AnonymousClass186.A00(this.A01, "isSuccessScreen", A10);
        AnonymousClass186.A00(this.A02, "isTemplate", A10);
        AnonymousClass186.A00(this.A0N, "screenProgress", A10);
        return AnonymousClass184.A0S(this.A08, "sequenceNumber", A10);
    }
}
