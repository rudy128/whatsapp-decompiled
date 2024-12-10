package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rt  reason: invalid class name and case insensitive filesystem */
public final class C171548rt extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Double A08;
    public Long A09;
    public String A0A;

    public C171548rt() {
        super(5482, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A08);
        r3.CHf(2, this.A09);
        r3.CHf(13, this.A0A);
        r3.CHf(4, this.A00);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(8, this.A03);
        r3.CHf(11, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(14, this.A06);
        r3.CHf(12, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A08, A13), this.A09);
        AnonymousClass184.A0X(A13, 3);
        A13.put(AnonymousClass184.A06(13, this.A0A, A13), this.A00);
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0G(AnonymousClass184.A0B(AnonymousClass184.A0D(AnonymousClass184.A0A(AnonymousClass184.A09(C17880vN.A0m(), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07);
        AnonymousClass184.A0X(A13, 10);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamTranscriptionFeedback {");
        AnonymousClass186.A00(this.A08, "averageConfidence", A10);
        AnonymousClass186.A00(this.A09, "pttLength", A10);
        AnonymousClass186.A00(this.A0A, "transcriptId", A10);
        AnonymousClass186.A00(this.A00, "transcriptionCorrect", A10);
        AnonymousClass186.A00(this.A01, "transcriptionQualityReasonMisrecognizedWords", A10);
        AnonymousClass186.A00(this.A02, "transcriptionQualityReasonMissingWords", A10);
        AnonymousClass186.A00(this.A03, "transcriptionQualityReasonMisspelledNames", A10);
        AnonymousClass186.A00(this.A04, "transcriptionQualityReasonOther", A10);
        AnonymousClass186.A00(this.A05, "transcriptionQualityReasonPunctuation", A10);
        AnonymousClass186.A00(this.A06, "transcriptionQualityReasonTookTooLong", A10);
        return AnonymousClass184.A0S(this.A07, "transcriptionQualityReasonWrongLanguage", A10);
    }
}
