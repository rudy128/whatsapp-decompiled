package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sD  reason: invalid class name and case insensitive filesystem */
public final class C171748sD extends AnonymousClass184 {
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

    public C171748sD() {
        super(3006, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(26, this.A0B);
        r3.CHf(14, this.A04);
        r3.CHf(13, this.A00);
        r3.CHf(2, this.A05);
        r3.CHf(11, this.A01);
        r3.CHf(10, this.A0C);
        r3.CHf(3, this.A0D);
        r3.CHf(1, this.A06);
        r3.CHf(15, this.A0E);
        r3.CHf(16, this.A0F);
        r3.CHf(12, this.A07);
        r3.CHf(22, this.A08);
        r3.CHf(20, this.A0G);
        r3.CHf(21, this.A0H);
        r3.CHf(23, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(4, this.A0I);
        r3.CHf(9, this.A0J);
        r3.CHf(17, this.A0K);
        r3.CHf(6, this.A09);
        r3.CHf(18, this.A0A);
        r3.CHf(24, this.A0L);
        r3.CHf(25, this.A0M);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0G(26, this.A0B, A13), this.A04, A13), this.A00);
        AnonymousClass184.A0X(A13, 19);
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0D(C17880vN.A0i(), this.A05, A13), this.A01, A13), this.A0C);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A0P(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0O(AnonymousClass184.A0E(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A03(C17880vN.A0j(), this.A0D, A13), this.A06, A13), this.A0E, A13), this.A0F, A13), this.A07, A13), this.A08, A13), this.A0G, A13), this.A0H, A13), this.A02);
        AnonymousClass184.A0X(A13, 7);
        A13.put(C108975cc.A0U(AnonymousClass184.A0Q(AnonymousClass184.A0K(AnonymousClass184.A08(AnonymousClass184.A0J(AnonymousClass184.A0B(AnonymousClass184.A06(C17880vN.A0l(), this.A03, A13), this.A0I, A13), this.A0J, A13), this.A0K, A13), this.A09, A13), this.A0A, A13), this.A0L, A13), this.A0M);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBizCatalogView {");
        AnonymousClass186.A00(this.A0B, "adId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "bizPlatform", A10);
        AnonymousClass186.A00(this.A00, "cartToggle", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "catalogEntryPoint", A10);
        AnonymousClass186.A00(this.A01, "catalogEventSampled", A10);
        AnonymousClass186.A00(this.A0C, "catalogOwnerJid", A10);
        AnonymousClass186.A00(this.A0D, "catalogSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "catalogViewAction", A10);
        AnonymousClass186.A00(this.A0E, "collectionId", A10);
        AnonymousClass186.A00(this.A0F, "collectionIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "deepLinkOpenFrom", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "entryPointConversationInitiated", A10);
        AnonymousClass186.A00(this.A0G, "entryPointConversionApp", A10);
        AnonymousClass186.A00(this.A0H, "entryPointConversionSource", A10);
        AnonymousClass186.A00(this.A02, "hasVariants", A10);
        AnonymousClass186.A00(this.A03, "isOrderMsgAttached", A10);
        AnonymousClass186.A00(this.A0I, "orderId", A10);
        AnonymousClass186.A00(this.A0J, "productId", A10);
        AnonymousClass186.A00(this.A0K, "productIndex", A10);
        AnonymousClass186.A00(this.A09, "quantity", A10);
        AnonymousClass186.A00(this.A0A, "sequenceNumber", A10);
        AnonymousClass186.A00(this.A0L, "variantTypes", A10);
        return AnonymousClass184.A0S(this.A0M, "variantsExtraAttributes", A10);
    }
}
