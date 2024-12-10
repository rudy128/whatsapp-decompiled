package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sI  reason: invalid class name and case insensitive filesystem */
public final class C171798sI extends AnonymousClass184 {
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
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;

    public C171798sI() {
        super(3790, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(21, this.A0B);
        r3.CHf(22, this.A0C);
        r3.CHf(23, this.A0D);
        r3.CHf(26, this.A0E);
        r3.CHf(27, this.A0F);
        r3.CHf(24, this.A0G);
        r3.CHf(25, this.A0H);
        r3.CHf(36, this.A0R);
        r3.CHf(1, this.A07);
        r3.CHf(10, this.A0I);
        r3.CHf(2, this.A08);
        r3.CHf(14, this.A0S);
        r3.CHf(15, this.A00);
        r3.CHf(16, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(11, this.A0J);
        r3.CHf(19, this.A03);
        r3.CHf(17, this.A0T);
        r3.CHf(7, this.A0U);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A09);
        r3.CHf(12, this.A0V);
        r3.CHf(9, this.A06);
        r3.CHf(28, this.A0K);
        r3.CHf(29, this.A0L);
        r3.CHf(30, this.A0M);
        r3.CHf(31, this.A0N);
        r3.CHf(32, this.A0O);
        r3.CHf(33, this.A0P);
        r3.CHf(34, this.A0Q);
        r3.CHf(35, this.A0A);
        r3.CHf(8, this.A0W);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(C108975cc.A0S(AnonymousClass184.A0C(AnonymousClass184.A03(AnonymousClass8BV.A0Z(C108975cc.A0U(AnonymousClass184.A0Q(AnonymousClass8BV.A0S(AnonymousClass8BV.A0R(AnonymousClass184.A0P(AnonymousClass184.A0O(21, this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A0F, A13), this.A0G, A13), this.A0H, A13), this.A0R, A13), this.A07, A13), this.A0I, A13), this.A08, A13), this.A0S, A13), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 20);
        A13.put(AnonymousClass184.A0D(C17880vN.A0j(), this.A02, A13), this.A0J);
        A13.put(AnonymousClass184.A0A(AnonymousClass8BV.A0Y(AnonymousClass8BV.A0X(AnonymousClass8BV.A0W(AnonymousClass8BV.A0V(C108975cc.A0W(C108975cc.A0V(AnonymousClass8BV.A0U(AnonymousClass8BV.A0T(AnonymousClass184.A0B(AnonymousClass184.A0E(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A09(AnonymousClass184.A0J(AnonymousClass184.A0L(18, AnonymousClass184.A0R(A13, 13), A13), this.A03, A13), this.A0T, A13), this.A0U, A13), this.A04, A13), this.A05, A13), this.A09, A13), this.A0V, A13), this.A06, A13), this.A0K, A13), this.A0L, A13), this.A0M, A13), this.A0N, A13), this.A0O, A13), this.A0P, A13), this.A0Q, A13), this.A0A, A13), this.A0W);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamQbmIncomingMessage {");
        AnonymousClass186.A00(this.A0B, "apiDailyThreadCount7d", A10);
        AnonymousClass186.A00(this.A0C, "apiMessageCount1d", A10);
        AnonymousClass186.A00(this.A0D, "apiMessageCount7d", A10);
        AnonymousClass186.A00(this.A0E, "apiTotalMessageCount", A10);
        AnonymousClass186.A00(this.A0F, "apiTotalNewThreadCount", A10);
        AnonymousClass186.A00(this.A0G, "apiUniqueThreadCount1d", A10);
        AnonymousClass186.A00(this.A0H, "apiUniqueThreadCount7d", A10);
        AnonymousClass186.A00(this.A0R, "bizTrustTier", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "chatsFolderType", A10);
        AnonymousClass186.A00(this.A0I, "companionDevices", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "contactType", A10);
        AnonymousClass186.A00(this.A0S, "hsmTagStr", A10);
        AnonymousClass186.A00(this.A00, "isFromAdsManagerMm", A10);
        AnonymousClass186.A00(this.A01, "isFromCapi", A10);
        AnonymousClass186.A00(this.A02, "keepChatsArchivedEnabled", A10);
        AnonymousClass186.A00(this.A0J, "lastOutgoingMessageDeltaTime", A10);
        AnonymousClass186.A00(this.A03, "messageHasUrl", A10);
        AnonymousClass186.A00(this.A0T, "messageIdHmac", A10);
        AnonymousClass186.A00(this.A0U, "messageTypeStr", A10);
        AnonymousClass186.A00(this.A04, "muted", A10);
        AnonymousClass186.A00(this.A05, "notificationEnabled", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "qbmFlag", A10);
        AnonymousClass186.A00(this.A0V, "qbmFlagStr", A10);
        AnonymousClass186.A00(this.A06, "readReceiptsEnabled", A10);
        AnonymousClass186.A00(this.A0K, "smbDailyThreadCount7d", A10);
        AnonymousClass186.A00(this.A0L, "smbMessageCount1d", A10);
        AnonymousClass186.A00(this.A0M, "smbMessageCount7d", A10);
        AnonymousClass186.A00(this.A0N, "smbTotalMessageCount", A10);
        AnonymousClass186.A00(this.A0O, "smbTotalNewThreadCount", A10);
        AnonymousClass186.A00(this.A0P, "smbUniqueThreadCount1d", A10);
        AnonymousClass186.A00(this.A0Q, "smbUniqueThreadCount7d", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "threadCreationTime", A10);
        return AnonymousClass184.A0S(this.A0W, "threadIdHmac", A10);
    }
}
