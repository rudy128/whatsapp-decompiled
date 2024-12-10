package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HO  reason: invalid class name */
public final class AnonymousClass2HO extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
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
    public String A0L;

    public AnonymousClass2HO() {
        super(1006, new C18180vt(1, 20, 100, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(20, this.A06);
        r3.CHf(10, this.A07);
        r3.CHf(19, this.A08);
        r3.CHf(22, this.A09);
        r3.CHf(23, this.A0A);
        r3.CHf(14, this.A0B);
        r3.CHf(16, this.A0C);
        r3.CHf(17, this.A0D);
        r3.CHf(12, this.A00);
        r3.CHf(21, this.A0E);
        r3.CHf(6, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(15, this.A0F);
        r3.CHf(7, this.A0G);
        r3.CHf(8, this.A03);
        r3.CHf(11, this.A0H);
        r3.CHf(13, this.A0I);
        r3.CHf(24, this.A05);
        r3.CHf(25, this.A0J);
        r3.CHf(18, this.A0K);
        r3.CHf(9, this.A04);
        r3.CHf(1, this.A0L);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0Q(AnonymousClass184.A0F(AnonymousClass184.A0D(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0H(AnonymousClass184.A07(AnonymousClass184.A08(AnonymousClass184.A0N(AnonymousClass184.A0E(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0G(AnonymousClass184.A0P(AnonymousClass184.A0O(AnonymousClass184.A0L(AnonymousClass184.A0C(20, this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A00, A13), this.A0E, A13), this.A01, A13), this.A02, A13), this.A0F, A13), this.A0G, A13), this.A03, A13), this.A0H, A13), this.A0I, A13), this.A05);
        A13.put(AnonymousClass184.A04(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A03(AnonymousClass184.A0B(AnonymousClass184.A0K(25, this.A0J, A13), this.A0K, A13), this.A04, A13), this.A0L, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamContactSyncEvent {");
        AnonymousClass186.A00(this.A06, "contactSyncBusinessResponseNew", A10);
        AnonymousClass186.A00(this.A07, "contactSyncChangedVersionRowCount", A10);
        AnonymousClass186.A00(this.A08, "contactSyncDeviceResponseNew", A10);
        AnonymousClass186.A00(this.A09, "contactSyncDisappearingModeResponseNew", A10);
        AnonymousClass186.A00(this.A0A, "contactSyncEndTimestamp", A10);
        AnonymousClass186.A00(this.A0B, "contactSyncErrorCode", A10);
        AnonymousClass186.A00(this.A0C, "contactSyncFailureProtocol", A10);
        AnonymousClass186.A00(this.A0D, "contactSyncLatency", A10);
        AnonymousClass186.A00(this.A00, "contactSyncNoop", A10);
        AnonymousClass186.A00(this.A0E, "contactSyncPayResponseNew", A10);
        AnonymousClass186.A00(this.A01, "contactSyncRequestClearWaSyncData", A10);
        AnonymousClass186.A00(this.A02, "contactSyncRequestIsUrgent", A10);
        AnonymousClass186.A00(this.A0F, "contactSyncRequestProtocol", A10);
        AnonymousClass186.A00(this.A0G, "contactSyncRequestRetryCount", A10);
        AnonymousClass186.A00(this.A03, "contactSyncRequestShouldRetry", A10);
        AnonymousClass186.A00(this.A0H, "contactSyncRequestedCount", A10);
        AnonymousClass186.A00(this.A0I, "contactSyncResponseCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "contactSyncSource", A10);
        AnonymousClass186.A00(this.A0J, "contactSyncStartTimestamp", A10);
        AnonymousClass186.A00(this.A0K, "contactSyncStatusResponseNew", A10);
        AnonymousClass186.A00(this.A04, "contactSyncSuccess", A10);
        return AnonymousClass184.A0S(this.A0L, "contactSyncType", A10);
    }
}
