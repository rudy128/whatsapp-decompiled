package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sM  reason: invalid class name and case insensitive filesystem */
public final class C171838sM extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
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
    public Long A0S;
    public Long A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;

    public C171838sM() {
        super(3792, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(18, this.A0D);
        r3.CHf(19, this.A0E);
        r3.CHf(20, this.A0F);
        r3.CHf(23, this.A0G);
        r3.CHf(24, this.A0H);
        r3.CHf(21, this.A0I);
        r3.CHf(22, this.A0J);
        r3.CHf(34, this.A0U);
        r3.CHf(1, this.A07);
        r3.CHf(2, this.A08);
        r3.CHf(3, this.A0K);
        r3.CHf(8, this.A0L);
        r3.CHf(9, this.A0V);
        r3.CHf(14, this.A00);
        r3.CHf(10, this.A01);
        r3.CHf(11, this.A02);
        r3.CHf(35, this.A03);
        r3.CHf(15, this.A04);
        r3.CHf(17, this.A05);
        r3.CHf(13, this.A0W);
        r3.CHf(6, this.A0X);
        r3.CHf(4, this.A09);
        r3.CHf(12, this.A06);
        r3.CHf(5, this.A0A);
        r3.CHf(25, this.A0M);
        r3.CHf(26, this.A0N);
        r3.CHf(27, this.A0O);
        r3.CHf(28, this.A0P);
        r3.CHf(29, this.A0Q);
        r3.CHf(30, this.A0R);
        r3.CHf(31, this.A0S);
        r3.CHf(32, this.A0B);
        r3.CHf(33, this.A0T);
        r3.CHf(7, this.A0Y);
        r3.CHf(36, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0H(AnonymousClass8BV.A0Y(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0G(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A03(AnonymousClass8BV.A0X(AnonymousClass184.A0O(AnonymousClass184.A0N(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0M(AnonymousClass184.A0L(18, this.A0D, A13), this.A0E, A13), this.A0F, A13), this.A0G, A13), this.A0H, A13), this.A0I, A13), this.A0J, A13), this.A0U, A13), this.A07, A13), this.A08, A13), this.A0K, A13), this.A0L, A13), this.A0V, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 16);
        A13.put(AnonymousClass8BV.A0Z(AnonymousClass184.A09(AnonymousClass8BV.A0W(AnonymousClass8BV.A0V(C108975cc.A0W(C108975cc.A0V(AnonymousClass8BV.A0U(AnonymousClass8BV.A0T(AnonymousClass8BV.A0S(AnonymousClass8BV.A0R(C108975cc.A0U(AnonymousClass184.A07(AnonymousClass184.A0E(AnonymousClass184.A06(AnonymousClass184.A08(AnonymousClass184.A0F(17, this.A05, A13), this.A0W, A13), this.A0X, A13), this.A09, A13), this.A06, A13), this.A0A, A13), this.A0M, A13), this.A0N, A13), this.A0O, A13), this.A0P, A13), this.A0Q, A13), this.A0R, A13), this.A0S, A13), this.A0B, A13), this.A0T, A13), this.A0Y, A13), this.A0C);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamQbmMessageRead {");
        AnonymousClass186.A00(this.A0D, "apiDailyThreadCount7d", A10);
        AnonymousClass186.A00(this.A0E, "apiMessageCount1d", A10);
        AnonymousClass186.A00(this.A0F, "apiMessageCount7d", A10);
        AnonymousClass186.A00(this.A0G, "apiTotalMessageCount", A10);
        AnonymousClass186.A00(this.A0H, "apiTotalNewThreadCount", A10);
        AnonymousClass186.A00(this.A0I, "apiUniqueThreadCount1d", A10);
        AnonymousClass186.A00(this.A0J, "apiUniqueThreadCount7d", A10);
        AnonymousClass186.A00(this.A0U, "bizTrustTier", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "chatsFolderType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "contactType", A10);
        AnonymousClass186.A00(this.A0K, "deltaTime", A10);
        AnonymousClass186.A00(this.A0L, "deltaTimeReceived", A10);
        AnonymousClass186.A00(this.A0V, "hsmTagStr", A10);
        AnonymousClass186.A00(this.A00, "isBulkAction", A10);
        AnonymousClass186.A00(this.A01, "isFromAdsManagerMm", A10);
        AnonymousClass186.A00(this.A02, "isFromCapi", A10);
        AnonymousClass186.A00(this.A03, "isInsubContact", A10);
        AnonymousClass186.A00(this.A04, "isMuted", A10);
        AnonymousClass186.A00(this.A05, "messageHasUrl", A10);
        AnonymousClass186.A00(this.A0W, "messageIdHmac", A10);
        AnonymousClass186.A00(this.A0X, "messageTypeStr", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "qbmFlag", A10);
        AnonymousClass186.A00(this.A06, "readReceiptsEnabled", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "readSource", A10);
        AnonymousClass186.A00(this.A0M, "smbDailyThreadCount7d", A10);
        AnonymousClass186.A00(this.A0N, "smbMessageCount1d", A10);
        AnonymousClass186.A00(this.A0O, "smbMessageCount7d", A10);
        AnonymousClass186.A00(this.A0P, "smbTotalMessageCount", A10);
        AnonymousClass186.A00(this.A0Q, "smbTotalNewThreadCount", A10);
        AnonymousClass186.A00(this.A0R, "smbUniqueThreadCount1d", A10);
        AnonymousClass186.A00(this.A0S, "smbUniqueThreadCount7d", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "threadCreationTime", A10);
        AnonymousClass186.A00(this.A0T, "threadDwellTime", A10);
        AnonymousClass186.A00(this.A0Y, "threadIdHmac", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0C), "thumbnailType", A10);
    }
}
