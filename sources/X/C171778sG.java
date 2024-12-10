package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sG  reason: invalid class name and case insensitive filesystem */
public final class C171778sG extends AnonymousClass184 {
    public Double A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;

    public C171778sG() {
        super(4290, AnonymousClass184.A01(), 1, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A0M);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(33, this.A05);
        r3.CHf(4, this.A06);
        r3.CHf(5, this.A0N);
        r3.CHf(6, this.A0O);
        r3.CHf(7, this.A0P);
        r3.CHf(8, this.A0B);
        r3.CHf(9, this.A0C);
        r3.CHf(31, this.A07);
        r3.CHf(10, this.A08);
        r3.CHf(11, this.A09);
        r3.CHf(12, this.A0A);
        r3.CHf(13, (Object) null);
        r3.CHf(14, this.A00);
        r3.CHf(15, this.A0Q);
        r3.CHf(16, this.A0D);
        r3.CHf(17, this.A0E);
        r3.CHf(18, this.A0F);
        r3.CHf(19, this.A0G);
        r3.CHf(23, this.A0H);
        r3.CHf(24, this.A0I);
        r3.CHf(27, this.A0J);
        r3.CHf(32, this.A0K);
        r3.CHf(30, this.A01);
        r3.CHf(28, this.A0L);
        r3.CHf(29, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(C108975cc.A0W(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass8BV.A0W(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A0M, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A0N, A13), this.A0O, A13), this.A0P, A13), this.A0B, A13), this.A0C, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(14, this.A00, A13), this.A0Q, A13), this.A0D, A13), this.A0E, A13), this.A0F, A13), this.A0G);
        Object A0R = AnonymousClass184.A0R(A13, 20);
        A13.put(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0O(21, A0R, A13), A0R, A13), this.A0H, A13), this.A0I);
        C17880vN.A1O(AnonymousClass184.A0R(A13, 25), A13, 26);
        A13.put(AnonymousClass8BV.A0U(AnonymousClass8BV.A0T(C108975cc.A0V(AnonymousClass8BV.A0V(27, this.A0J, A13), this.A0K, A13), this.A01, A13), this.A0L, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWaFsChatTransfer {");
        AnonymousClass186.A00(this.A0M, "fpmAttemptId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "fpmCancellationReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "fpmDeviceRole", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "fpmDiscoveryType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "fpmDonorAppBuild", A10);
        AnonymousClass186.A00(this.A0N, "fpmDonorAppVersion", A10);
        AnonymousClass186.A00(this.A0O, "fpmDonorDeviceName", A10);
        AnonymousClass186.A00(this.A0P, "fpmDonorOsVersion", A10);
        AnonymousClass186.A00(this.A0B, "fpmDonorYearClass2016", A10);
        AnonymousClass186.A00(this.A0C, "fpmDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "fpmEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "fpmErrorCode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "fpmErrorPhase", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "fpmEvent", A10);
        AnonymousClass186.A00(this.A00, "fpmExportedDbSize", A10);
        AnonymousClass186.A00(this.A0Q, "fpmFunnelId", A10);
        AnonymousClass186.A00(this.A0D, "fpmImportCntMediaFailed", A10);
        AnonymousClass186.A00(this.A0E, "fpmImportCntMediaImported", A10);
        AnonymousClass186.A00(this.A0F, "fpmImportCntMessagesFailed", A10);
        AnonymousClass186.A00(this.A0G, "fpmImportCntMessagesImported", A10);
        AnonymousClass186.A00(this.A0H, "fpmNumMediaAttemptToTransferred", A10);
        AnonymousClass186.A00(this.A0I, "fpmNumMediaTransferred", A10);
        AnonymousClass186.A00(this.A0J, "fpmProgress", A10);
        AnonymousClass186.A00(this.A0K, "fpmProtocolVersion", A10);
        AnonymousClass186.A00(this.A01, "fpmTotalTransferSize", A10);
        AnonymousClass186.A00(this.A0L, "storageAvailSize", A10);
        return AnonymousClass184.A0S(this.A02, "waDbSize", A10);
    }
}
