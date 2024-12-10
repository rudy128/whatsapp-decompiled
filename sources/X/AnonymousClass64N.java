package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64N  reason: invalid class name */
public final class AnonymousClass64N extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;

    public AnonymousClass64N() {
        super(5480, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(4, this.A0C);
        r3.CHf(5, this.A0D);
        r3.CHf(6, this.A0E);
        r3.CHf(7, this.A02);
        r3.CHf(10, this.A04);
        r3.CHf(11, this.A05);
        r3.CHf(13, this.A06);
        r3.CHf(14, this.A07);
        r3.CHf(15, this.A08);
        r3.CHf(18, this.A09);
        r3.CHf(19, this.A0F);
        r3.CHf(20, this.A00);
        r3.CHf(21, this.A0A);
        r3.CHf(22, this.A01);
        r3.CHf(23, this.A0B);
        r3.CHf(24, this.A0G);
        r3.CHf(25, this.A0H);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A03, A13), (Object) null, A13), (Object) null, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A02, A13), (Object) null, A13), (Object) null, A13), this.A04, A13), this.A05);
        AnonymousClass184.A0X(A13, 12);
        A13.put(C108975cc.A0U(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0O(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(C108955ca.A0i(), this.A06, A13), this.A07, A13), this.A08, A13), (Object) null, A13), (Object) null, A13), this.A09, A13), this.A0F, A13), this.A00, A13), this.A0A, A13), this.A01, A13), this.A0B, A13), this.A0G, A13), this.A0H);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamTranscriptionDaily {");
        AnonymousClass186.A00(this.A03, "expandedTranscriptionCount", A10);
        AnonymousClass186.A00(this.A0C, "primaryLocale", A10);
        AnonymousClass186.A00(this.A0D, "secondaryLocale", A10);
        AnonymousClass186.A00(this.A0E, "tertiaryLocale", A10);
        AnonymousClass186.A00(this.A02, "totalAverageConfidence", A10);
        AnonymousClass186.A00(this.A04, "totalPttLength", A10);
        AnonymousClass186.A00(this.A05, "totalPttsPlayed", A10);
        AnonymousClass186.A00(this.A06, "totalPttsTranscribed", A10);
        AnonymousClass186.A00(this.A07, "totalUserVisibleT", A10);
        AnonymousClass186.A00(this.A08, "transcribedPttPlayedCount", A10);
        AnonymousClass186.A00(this.A09, "transcriptionFailureCount", A10);
        AnonymousClass186.A00(this.A0F, "transcriptionPreferredLocale", A10);
        AnonymousClass186.A00(this.A00, "transcriptionSettingEnabled", A10);
        AnonymousClass186.A00(this.A0A, "transcriptionSuccessCount", A10);
        AnonymousClass186.A00(this.A01, "transcriptionSupportedSystem", A10);
        AnonymousClass186.A00(this.A0B, "transcriptionUnavailableCount", A10);
        AnonymousClass186.A00(this.A0G, "userPrimaryLocale", A10);
        return AnonymousClass184.A0S(this.A0H, "userSecondaryLocale", A10);
    }
}
