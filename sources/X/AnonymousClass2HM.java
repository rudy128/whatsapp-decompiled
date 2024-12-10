package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HM  reason: invalid class name */
public final class AnonymousClass2HM extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Integer A04;
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
    public Long A0F;
    public Long A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;

    public AnonymousClass2HM() {
        super(5564, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A0H);
        r3.CHf(3, this.A0I);
        r3.CHf(4, this.A0J);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A09);
        r3.CHf(7, this.A04);
        r3.CHf(8, this.A00);
        r3.CHf(9, this.A05);
        r3.CHf(11, this.A0A);
        r3.CHf(12, this.A0K);
        r3.CHf(13, this.A03);
        r3.CHf(14, this.A06);
        r3.CHf(15, this.A0B);
        r3.CHf(16, this.A0C);
        r3.CHf(17, this.A0D);
        r3.CHf(18, this.A0E);
        r3.CHf(19, this.A0F);
        r3.CHf(20, this.A07);
        r3.CHf(21, this.A08);
        r3.CHf(22, this.A0G);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A0H, A13), this.A0I, A13), this.A0J, A13), this.A02, A13), this.A09, A13), this.A04, A13), this.A00);
        AnonymousClass184.A0X(A13, 23);
        A13.put(9, this.A05);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A0O(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(11, this.A0A, A13), this.A0K, A13), this.A03, A13), this.A06, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A0F, A13), this.A07, A13), this.A08, A13), this.A0G);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaUploadUserAttempt {");
        AnonymousClass186.A00(this.A01, "bytesTransferred", A10);
        AnonymousClass186.A00(this.A0H, "debugMediaException", A10);
        AnonymousClass186.A00(this.A0I, "debugMediaIp", A10);
        AnonymousClass186.A00(this.A0J, "debugUrl", A10);
        AnonymousClass186.A00(this.A02, "estimatedBandwidth", A10);
        AnonymousClass186.A00(this.A09, "httpCodeResume", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "httpProtocolVersionType", A10);
        AnonymousClass186.A00(this.A00, "isForward", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "mediaUploadMode", A10);
        AnonymousClass186.A00(this.A0A, "overallAttemptCount", A10);
        AnonymousClass186.A00(this.A0K, "overallDomain", A10);
        AnonymousClass186.A00(this.A03, "overallMediaSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "overallMediaType", A10);
        AnonymousClass186.A00(this.A0B, "overallQueueT", A10);
        AnonymousClass186.A00(this.A0C, "overallRetryCount", A10);
        AnonymousClass186.A00(this.A0D, "overallT", A10);
        AnonymousClass186.A00(this.A0E, "transcodeT", A10);
        AnonymousClass186.A00(this.A0F, "uploadHttpCode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "uploadOrigin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "uploadResult", A10);
        return AnonymousClass184.A0S(this.A0G, "uploadResumePoint", A10);
    }
}
