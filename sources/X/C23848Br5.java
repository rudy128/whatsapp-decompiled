package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Br5  reason: case insensitive filesystem */
public final class C23848Br5 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Double A04;
    public Double A05;
    public Double A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;

    public C23848Br5() {
        super(5478, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(14, this.A00);
        r3.CHf(15, this.A01);
        r3.CHf(1, this.A04);
        r3.CHf(16, this.A09);
        r3.CHf(17, this.A0A);
        r3.CHf(19, this.A0G);
        r3.CHf(2, this.A02);
        r3.CHf(20, this.A05);
        r3.CHf(3, this.A0B);
        r3.CHf(4, this.A0C);
        r3.CHf(5, this.A0D);
        r3.CHf(6, this.A0E);
        r3.CHf(21, this.A0H);
        r3.CHf(8, this.A0I);
        r3.CHf(9, this.A0F);
        r3.CHf(10, this.A07);
        r3.CHf(11, this.A08);
        r3.CHf(12, this.A03);
        r3.CHf(22, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0M(AnonymousClass184.A04(AnonymousClass184.A0L(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A03(AnonymousClass184.A0H(14, this.A00, A13), this.A01, A13), this.A04, A13), this.A09, A13), this.A0A, A13), this.A0G, A13), this.A02, A13), this.A05);
        AnonymousClass184.A0X(A13, 18);
        A13.put(AnonymousClass184.A0N(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0j(), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A0H);
        AnonymousClass184.A0X(A13, 7);
        A13.put(BE9.A0i(BE9.A0h(AnonymousClass184.A0C(AnonymousClass184.A0B(8, this.A0I, A13), this.A0F, A13), this.A07, A13), this.A08, A13), this.A03);
        AnonymousClass184.A0X(A13, 13);
        A13.put(22, this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamTranscription {");
        AnonymousClass186.A00(this.A00, "appBackgroundedAtEnd", A10);
        AnonymousClass186.A00(this.A01, "appBackgroundedAtStart", A10);
        AnonymousClass186.A00(this.A04, "averageConfidence", A10);
        AnonymousClass186.A00(this.A09, "decodingT", A10);
        AnonymousClass186.A00(this.A0A, "encodingT", A10);
        AnonymousClass186.A00(this.A0G, "inputLocale", A10);
        AnonymousClass186.A00(this.A02, "outgoingMessage", A10);
        AnonymousClass186.A00(this.A05, "percentageRedacted", A10);
        AnonymousClass186.A00(this.A0B, "prepareT", A10);
        AnonymousClass186.A00(this.A0C, "pttLength", A10);
        AnonymousClass186.A00(this.A0D, "speechApiErrorCode", A10);
        AnonymousClass186.A00(this.A0E, "transcribeT", A10);
        AnonymousClass186.A00(this.A0H, "transcriptId", A10);
        AnonymousClass186.A00(this.A0I, "transcriptionLocale", A10);
        AnonymousClass186.A00(this.A0F, "transcriptionOverallT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "transcriptionRequestType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "transcriptionResult", A10);
        AnonymousClass186.A00(this.A03, "transcriptionUnavailable", A10);
        return AnonymousClass184.A0S(this.A06, "wordsPerSecond", A10);
    }
}
