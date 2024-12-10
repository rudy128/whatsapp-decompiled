package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2H6  reason: invalid class name */
public final class AnonymousClass2H6 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;

    public AnonymousClass2H6() {
        super(2292, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(14, this.A04);
        r3.CHf(12, this.A05);
        r3.CHf(6, this.A06);
        r3.CHf(11, this.A00);
        r3.CHf(13, this.A01);
        r3.CHf(5, this.A07);
        r3.CHf(4, this.A08);
        r3.CHf(2, this.A02);
        r3.CHf(8, this.A03);
        r3.CHf(9, this.A09);
        r3.CHf(10, this.A0B);
        r3.CHf(1, this.A0C);
        r3.CHf(3, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A03(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A04(AnonymousClass184.A06(AnonymousClass184.A07(AnonymousClass184.A0F(AnonymousClass184.A0D(AnonymousClass184.A08(AnonymousClass184.A0E(14, this.A04, A13), this.A05, A13), this.A06, A13), this.A00, A13), this.A01, A13), this.A07, A13), this.A08, A13), this.A02, A13), this.A03, A13), this.A09, A13), this.A0B, A13), this.A0C, A13), this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdBootstrapHistoryDataUploaded {");
        AnonymousClass186.A00(this.A04, "historySyncChunkOrder", A10);
        AnonymousClass186.A00(this.A05, "historySyncStageProgress", A10);
        AnonymousClass186.A00(this.A06, "mdBootstrapChatsCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mdBootstrapHistoryPayloadType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mdBootstrapHistoryUploadStepResult", A10);
        AnonymousClass186.A00(this.A07, "mdBootstrapMessagesCount", A10);
        AnonymousClass186.A00(this.A08, "mdBootstrapPayloadSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "mdBootstrapPayloadType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "mdBootstrapStepResult", A10);
        AnonymousClass186.A00(this.A09, "mdHsOldestMessageTimestamp", A10);
        AnonymousClass186.A00(this.A0B, "mdRegAttemptId", A10);
        AnonymousClass186.A00(this.A0C, "mdSessionId", A10);
        return AnonymousClass184.A0S(this.A0A, "mdTimestamp", A10);
    }
}
