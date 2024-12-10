package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Br3  reason: case insensitive filesystem */
public final class C23846Br3 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    public C23846Br3() {
        super(5344, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A06);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A07);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A08);
        r3.CHf(6, this.A0B);
        r3.CHf(15, this.A0C);
        r3.CHf(7, this.A02);
        r3.CHf(8, this.A03);
        r3.CHf(9, this.A0D);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A09);
        r3.CHf(12, this.A0A);
        r3.CHf(13, this.A0E);
        r3.CHf(14, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0F(BE9.A0i(BE9.A0h(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0H(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A06, A13), this.A00, A13), this.A07, A13), this.A01, A13), this.A08, A13), this.A0B, A13), this.A0C, A13), this.A02, A13), this.A03, A13), this.A0D, A13), this.A04, A13), this.A09, A13), this.A0A, A13), this.A0E, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamIgluEffectSession {");
        AnonymousClass186.A00(this.A06, "arClass", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "effectCategory", A10);
        AnonymousClass186.A00(this.A07, "effectDurationT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "effectEndReason", A10);
        AnonymousClass186.A00(this.A08, "effectEndT", A10);
        AnonymousClass186.A00(this.A0B, "effectId", A10);
        AnonymousClass186.A00(this.A0C, "effectLoadingFailedError", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "effectLoadingFailedReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "effectLoadingResultType", A10);
        AnonymousClass186.A00(this.A0D, "effectSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "effectStartReason", A10);
        AnonymousClass186.A00(this.A09, "effectStartT", A10);
        AnonymousClass186.A00(this.A0A, "effectTotalLoadingT", A10);
        AnonymousClass186.A00(this.A0E, "productSessionId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A05), "productSurface", A10);
    }
}
