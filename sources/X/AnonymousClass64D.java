package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64D  reason: invalid class name */
public final class AnonymousClass64D extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Double A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public AnonymousClass64D() {
        super(458, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(11, this.A02);
        r3.CHf(12, this.A03);
        r3.CHf(13, this.A04);
        r3.CHf(14, this.A05);
        r3.CHf(7, this.A09);
        r3.CHf(8, this.A0A);
        r3.CHf(5, this.A0B);
        r3.CHf(4, this.A00);
        r3.CHf(9, this.A0C);
        r3.CHf(1, this.A07);
        r3.CHf(3, this.A06);
        r3.CHf(2, this.A08);
        r3.CHf(6, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(C108975cc.A0S(C108975cc.A0T(AnonymousClass184.A03(AnonymousClass184.A0B(AnonymousClass184.A06(AnonymousClass184.A07(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(C108955ca.A0g(), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A00, A13), this.A0C, A13), this.A07, A13), this.A06, A13), this.A08, A13), this.A01);
        AnonymousClass184.A0X(A13, 10);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPtt {");
        AnonymousClass186.A00(this.A02, "pttAvgNoiseLoudness", A10);
        AnonymousClass186.A00(this.A03, "pttAvgNoiseLoudnessReduction", A10);
        AnonymousClass186.A00(this.A04, "pttAvgSpeechLoudness", A10);
        AnonymousClass186.A00(this.A05, "pttAvgSpeechLoudnessReduction", A10);
        AnonymousClass186.A00(this.A09, "pttDraftPlayCnt", A10);
        AnonymousClass186.A00(this.A0A, "pttDraftSeekCnt", A10);
        AnonymousClass186.A00(this.A0B, "pttDuration", A10);
        AnonymousClass186.A00(this.A00, "pttLock", A10);
        AnonymousClass186.A00(this.A0C, "pttPauseCnt", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "pttResult", A10);
        AnonymousClass186.A00(this.A06, "pttSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "pttSource", A10);
        return AnonymousClass184.A0S(this.A01, "pttStop", A10);
    }
}
