package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Br9  reason: case insensitive filesystem */
public final class C23852Br9 extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;

    public C23852Br9() {
        super(5342, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A08);
        r3.CHf(2, this.A0I);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A09);
        r3.CHf(5, this.A0A);
        r3.CHf(6, this.A0B);
        r3.CHf(7, this.A0C);
        r3.CHf(8, this.A02);
        r3.CHf(9, this.A0D);
        r3.CHf(11, this.A0E);
        r3.CHf(12, this.A0J);
        r3.CHf(13, this.A0K);
        r3.CHf(26, this.A0L);
        r3.CHf(14, this.A03);
        r3.CHf(15, this.A04);
        r3.CHf(16, this.A0M);
        r3.CHf(17, this.A05);
        r3.CHf(18, this.A0F);
        r3.CHf(19, this.A0N);
        r3.CHf(20, this.A0G);
        r3.CHf(21, this.A0H);
        r3.CHf(22, this.A00);
        r3.CHf(23, this.A06);
        r3.CHf(24, this.A0O);
        r3.CHf(25, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A08, A13), this.A0I, A13), this.A01, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A02, A13), this.A0D);
        AnonymousClass184.A0X(A13, 10);
        A13.put(C108975cc.A0U(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0O(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass8BV.A0R(AnonymousClass184.A0F(BE9.A0i(11, this.A0E, A13), this.A0J, A13), this.A0K, A13), this.A0L, A13), this.A03, A13), this.A04, A13), this.A0M, A13), this.A05, A13), this.A0F, A13), this.A0N, A13), this.A0G, A13), this.A0H, A13), this.A00, A13), this.A06, A13), this.A0O, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamArEffectSession {");
        AnonymousClass186.A00(this.A08, "arClass", A10);
        AnonymousClass186.A00(this.A0I, "deliveryOperationId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "effectCategory", A10);
        AnonymousClass186.A00(this.A09, "effectDurationT", A10);
        AnonymousClass186.A00(this.A0A, "effectEftT", A10);
        AnonymousClass186.A00(this.A0B, "effectEitT", A10);
        AnonymousClass186.A00(this.A0C, "effectEmtT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "effectEndReason", A10);
        AnonymousClass186.A00(this.A0D, "effectEndT", A10);
        AnonymousClass186.A00(this.A0E, "effectEttiT", A10);
        AnonymousClass186.A00(this.A0J, "effectId", A10);
        AnonymousClass186.A00(this.A0K, "effectInstanceId", A10);
        AnonymousClass186.A00(this.A0L, "effectLoadingFailedError", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "effectLoadingFailedReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "effectLoadingResultType", A10);
        AnonymousClass186.A00(this.A0M, "effectSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "effectStartReason", A10);
        AnonymousClass186.A00(this.A0F, "effectStartT", A10);
        AnonymousClass186.A00(this.A0N, "effectTier", A10);
        AnonymousClass186.A00(this.A0G, "effectTotalLoadingT", A10);
        AnonymousClass186.A00(this.A0H, "flmConsentDurationT", A10);
        AnonymousClass186.A00(this.A00, "flmConsentRequested", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "flmConsentType", A10);
        AnonymousClass186.A00(this.A0O, "productSessionId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A07), "productSurface", A10);
    }
}
