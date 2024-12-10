package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64S  reason: invalid class name */
public final class AnonymousClass64S extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;

    public AnonymousClass64S() {
        super(5576, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A0D);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A06);
        r3.CHf(4, this.A0S);
        r3.CHf(5, this.A0T);
        r3.CHf(6, this.A0U);
        r3.CHf(7, this.A02);
        r3.CHf(8, this.A0E);
        r3.CHf(9, this.A0F);
        r3.CHf(10, this.A00);
        r3.CHf(11, this.A07);
        r3.CHf(12, this.A0G);
        r3.CHf(13, this.A08);
        r3.CHf(14, this.A0H);
        r3.CHf(15, this.A0I);
        r3.CHf(16, this.A03);
        r3.CHf(17, this.A0J);
        r3.CHf(18, this.A09);
        r3.CHf(19, this.A01);
        r3.CHf(20, this.A0K);
        r3.CHf(21, this.A0A);
        r3.CHf(22, this.A0B);
        r3.CHf(23, this.A0L);
        r3.CHf(24, this.A0V);
        r3.CHf(25, this.A0M);
        r3.CHf(26, this.A0N);
        r3.CHf(27, this.A0W);
        r3.CHf(28, this.A04);
        r3.CHf(29, this.A0C);
        r3.CHf(30, this.A0O);
        r3.CHf(31, this.A0P);
        r3.CHf(32, this.A0Q);
        r3.CHf(33, this.A0R);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A0D, A13), this.A05, A13), this.A06, A13), this.A0S, A13), this.A0T, A13), this.A0U, A13), this.A02, A13), this.A0E, A13), this.A0F, A13), this.A00, A13), this.A07, A13), this.A0G, A13), this.A08, A13), this.A0H, A13), this.A0I, A13), this.A03, A13), this.A0J, A13), this.A09, A13), this.A01, A13), this.A0K, A13), this.A0A);
        AnonymousClass184.A0X(A13, 34);
        A13.put(C108975cc.A0U(AnonymousClass184.A0Q(AnonymousClass184.A0P(22, this.A0B, A13), this.A0L, A13), this.A0V, A13), this.A0M);
        A13.put(26, this.A0N);
        A13.put(27, this.A0W);
        A13.put(28, this.A04);
        A13.put(C108975cc.A0W(C108975cc.A0V(29, this.A0C, A13), this.A0O, A13), this.A0P);
        A13.put(C108955ca.A0j(), this.A0Q);
        A13.put(33, this.A0R);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMediaDownloadUserAttempt {");
        AnonymousClass186.A00(this.A0D, "activeThreadCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "backendStore", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "connectionType", A10);
        AnonymousClass186.A00(this.A0S, "debugMediaException", A10);
        AnonymousClass186.A00(this.A0T, "debugMediaIp", A10);
        AnonymousClass186.A00(this.A0U, "debugUrl", A10);
        AnonymousClass186.A00(this.A02, "downloadBytesTransferred", A10);
        AnonymousClass186.A00(this.A0E, "downloadConnectT", A10);
        AnonymousClass186.A00(this.A0F, "downloadHttpCode", A10);
        AnonymousClass186.A00(this.A00, "downloadIsReuse", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "downloadMode", A10);
        AnonymousClass186.A00(this.A0G, "downloadNetworkT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "downloadOrigin", A10);
        AnonymousClass186.A00(this.A0H, "downloadResumePoint", A10);
        AnonymousClass186.A00(this.A0I, "downloadTimeToFirstByteT", A10);
        AnonymousClass186.A00(this.A03, "estimatedBandwidth", A10);
        AnonymousClass186.A00(this.A0J, "fileValidationT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "httpProtocolVersionType", A10);
        AnonymousClass186.A00(this.A01, "isEncrypted", A10);
        AnonymousClass186.A00(this.A0K, "maxThreadCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "mediaDownloadResult", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "networkStack", A10);
        AnonymousClass186.A00(this.A0L, "overallConnBlockFetchT", A10);
        AnonymousClass186.A00(this.A0V, "overallConnectionClass", A10);
        AnonymousClass186.A00(this.A0M, "overallCumT", A10);
        AnonymousClass186.A00(this.A0N, "overallCumV2T", A10);
        AnonymousClass186.A00(this.A0W, "overallDomain", A10);
        AnonymousClass186.A00(this.A04, "overallMediaSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "overallMediaType", A10);
        AnonymousClass186.A00(this.A0O, "overallQueueT", A10);
        AnonymousClass186.A00(this.A0P, "overallRetryCount", A10);
        AnonymousClass186.A00(this.A0Q, "overallT", A10);
        return AnonymousClass184.A0S(this.A0R, "timeDelayed", A10);
    }
}
