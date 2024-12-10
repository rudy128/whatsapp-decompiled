package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8sO  reason: invalid class name and case insensitive filesystem */
public final class C171858sO extends AnonymousClass184 {
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
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;

    public C171858sO() {
        super(2162, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A07);
        r3.CHf(24, this.A0G);
        r3.CHf(3, this.A08);
        r3.CHf(23, this.A0H);
        r3.CHf(32, this.A0I);
        r3.CHf(34, this.A00);
        r3.CHf(15, this.A0N);
        r3.CHf(13, this.A01);
        r3.CHf(11, this.A0O);
        r3.CHf(22, this.A0J);
        r3.CHf(21, this.A02);
        r3.CHf(18, this.A03);
        r3.CHf(20, this.A04);
        r3.CHf(19, this.A0P);
        r3.CHf(25, this.A0Q);
        r3.CHf(31, this.A09);
        r3.CHf(2, this.A0R);
        r3.CHf(9, this.A0S);
        r3.CHf(10, this.A0T);
        r3.CHf(47, this.A0U);
        r3.CHf(1, this.A0V);
        r3.CHf(42, this.A0A);
        r3.CHf(40, this.A05);
        r3.CHf(36, this.A06);
        r3.CHf(38, this.A0W);
        r3.CHf(39, this.A0X);
        r3.CHf(17, this.A0B);
        r3.CHf(26, this.A0K);
        r3.CHf(27, this.A0L);
        r3.CHf(12, this.A0C);
        r3.CHf(14, this.A0M);
        r3.CHf(28, this.A0D);
        r3.CHf(30, this.A0E);
        r3.CHf(46, this.A0Y);
        r3.CHf(35, this.A0Z);
        r3.CHf(6, this.A0a);
        r3.CHf(5, this.A0b);
        r3.CHf(8, this.A0F);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0k(), this.A07);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0Q(44, AnonymousClass184.A0R(A13, 43), A13), this.A0G, A13), this.A08);
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass8BV.A0V(23, this.A0H, A13), this.A0I);
        AnonymousClass184.A0X(A13, 33);
        A13.put(AnonymousClass184.A0H(34, this.A00, A13), this.A0N);
        AnonymousClass184.A0X(A13, 45);
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0B(C108975cc.A0S(C108975cc.A0W(C108975cc.A0U(AnonymousClass184.A0L(AnonymousClass184.A0M(AnonymousClass184.A0K(AnonymousClass184.A0N(AnonymousClass184.A0O(AnonymousClass184.A0D(13, this.A01, A13), this.A0O, A13), this.A0J, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A0P, A13), this.A0Q, A13), this.A09, A13), this.A0R, A13), this.A0S, A13), this.A0T);
        A13.put(AnonymousClass184.A03(47, this.A0U, A13), this.A0V);
        AnonymousClass184.A0X(A13, 29);
        A13.put(42, this.A0A);
        A13.put(AnonymousClass8BV.A0Z(40, this.A05, A13), this.A06);
        AnonymousClass184.A0X(A13, 41);
        A13.put(38, this.A0W);
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0E(AnonymousClass8BV.A0S(AnonymousClass8BV.A0R(AnonymousClass184.A0J(39, this.A0X, A13), this.A0B, A13), this.A0K, A13), this.A0L, A13), this.A0C, A13), this.A0M);
        AnonymousClass184.A0X(A13, 16);
        A13.put(C108975cc.A0V(28, this.A0D, A13), this.A0E);
        A13.put(AnonymousClass184.A08(AnonymousClass8BV.A0Y(46, this.A0Y, A13), this.A0Z, A13), this.A0a);
        AnonymousClass184.A0X(A13, 37);
        A13.put(AnonymousClass184.A0A(C17880vN.A0l(), this.A0b, A13), this.A0F);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPaymentsUserAction {");
        AnonymousClass186.A00(C17900vP.A08(this.A07), "actionTarget", A10);
        AnonymousClass186.A00(this.A0G, "paymentAccountRowSelected", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "paymentActionType", A10);
        AnonymousClass186.A00(this.A0H, "paymentNumberOfAccountsAvailable", A10);
        AnonymousClass186.A00(this.A0I, "paymentNumberOfPeopleInvited", A10);
        AnonymousClass186.A00(this.A00, "paymentSent", A10);
        AnonymousClass186.A00(this.A0N, "paymentSmsProviderNumber", A10);
        AnonymousClass186.A00(this.A01, "paymentsAccountsExist", A10);
        AnonymousClass186.A00(this.A0O, "paymentsBankId", A10);
        AnonymousClass186.A00(this.A0J, "paymentsBanksRowSelected", A10);
        AnonymousClass186.A00(this.A02, "paymentsBanksScrolled", A10);
        AnonymousClass186.A00(this.A03, "paymentsBanksSearchActivated", A10);
        AnonymousClass186.A00(this.A04, "paymentsBanksSearchSelected", A10);
        AnonymousClass186.A00(this.A0P, "paymentsBanksSearchString", A10);
        AnonymousClass186.A00(this.A0Q, "paymentsBanksSelectedName", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "paymentsContactsBucket", A10);
        AnonymousClass186.A00(this.A0R, "paymentsCountryCode", A10);
        AnonymousClass186.A00(this.A0S, "paymentsErrorCode", A10);
        AnonymousClass186.A00(this.A0T, "paymentsErrorText", A10);
        AnonymousClass186.A00(this.A0U, "paymentsErrorTitle", A10);
        AnonymousClass186.A00(this.A0V, "paymentsEventId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "paymentsIqCallStatus", A10);
        AnonymousClass186.A00(this.A05, "paymentsIsMandate", A10);
        AnonymousClass186.A00(this.A06, "paymentsIsOrder", A10);
        AnonymousClass186.A00(this.A0W, "paymentsOrderType", A10);
        AnonymousClass186.A00(this.A0X, "paymentsP2mPaymentConfigId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "paymentsRequestName", A10);
        AnonymousClass186.A00(this.A0K, "paymentsRequestRetryCount", A10);
        AnonymousClass186.A00(this.A0L, "paymentsRequestRetryTimeDelaySeconds", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "paymentsResponseResult", A10);
        AnonymousClass186.A00(this.A0M, "paymentsSmsProviderRetryCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0D), "paymentsUpiCheckPinErrorReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0E), "paymentsVerifyCardResult", A10);
        AnonymousClass186.A00(this.A0Y, "previousScreenName", A10);
        AnonymousClass186.A00(this.A0Z, "queryParams", A10);
        AnonymousClass186.A00(this.A0a, "referral", A10);
        AnonymousClass186.A00(this.A0b, "screen", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0F), "upiPaymentsPspId", A10);
    }
}
