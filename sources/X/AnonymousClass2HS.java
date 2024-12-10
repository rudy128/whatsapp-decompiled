package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HS  reason: invalid class name */
public final class AnonymousClass2HS extends AnonymousClass184 {
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
    public Long A0L;
    public String A0M;
    public String A0N;

    public AnonymousClass2HS() {
        super(3112, new C18180vt(1, 20, 1000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(36, this.A06);
        r3.CHf(45, this.A00);
        r3.CHf(23, this.A07);
        r3.CHf(17, this.A08);
        r3.CHf(18, this.A09);
        r3.CHf(19, this.A0A);
        r3.CHf(2, this.A01);
        r3.CHf(13, this.A02);
        r3.CHf(37, this.A03);
        r3.CHf(3, this.A0B);
        r3.CHf(14, this.A0C);
        r3.CHf(24, this.A0D);
        r3.CHf(6, this.A0E);
        r3.CHf(7, this.A0F);
        r3.CHf(8, this.A0G);
        r3.CHf(20, this.A0H);
        r3.CHf(9, this.A0I);
        r3.CHf(21, this.A05);
        r3.CHf(46, this.A0J);
        r3.CHf(15, this.A04);
        r3.CHf(25, this.A0K);
        r3.CHf(48, this.A0M);
        r3.CHf(12, this.A0L);
        r3.CHf(34, this.A0N);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 35);
        A13.put(AnonymousClass184.A03(36, this.A06, A13), (Object) null);
        C17880vN.A1O((Object) null, A13, 39);
        C17880vN.A1O((Object) null, A13, 40);
        C17880vN.A1O((Object) null, A13, 41);
        C17880vN.A1O((Object) null, A13, 42);
        C17880vN.A1O((Object) null, A13, 43);
        C17880vN.A1O((Object) null, A13, 44);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A04(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0P(45, this.A00, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A01, A13), this.A02);
        A13.put(37, this.A03);
        AnonymousClass184.A0X(A13, 22);
        A13.put(C17880vN.A0j(), this.A0B);
        AnonymousClass184.A0X(A13, 38);
        A13.put(14, this.A0C);
        AnonymousClass184.A0X(A13, 4);
        A13.put(24, this.A0D);
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A0N(AnonymousClass184.A0B(AnonymousClass184.A0M(AnonymousClass184.A0A(AnonymousClass184.A09(C17880vN.A0m(), this.A0E, A13), this.A0F, A13), this.A0G, A13), this.A0H, A13), this.A0I, A13), this.A05);
        A13.put(46, this.A0J);
        AnonymousClass184.A0X(A13, 10);
        A13.put(15, this.A04);
        AnonymousClass184.A0X(A13, 11);
        A13.put(25, this.A0K);
        Object A0R = AnonymousClass184.A0R(A13, 26);
        C17880vN.A1O(A0R, A13, 27);
        C17880vN.A1O(A0R, A13, 28);
        C17880vN.A1O(A0R, A13, 29);
        C17880vN.A1O(A0R, A13, 47);
        C17880vN.A1O(A0R, A13, 30);
        C17880vN.A1O(A0R, A13, 31);
        C17880vN.A1O(A0R, A13, 32);
        C17880vN.A1O(A0R, A13, 33);
        A13.put(AnonymousClass184.A0E(48, this.A0M, A13), this.A0L);
        A13.put(34, this.A0N);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamOfflineResume {");
        AnonymousClass186.A00(this.A06, "attemptNumber", A10);
        AnonymousClass186.A00(this.A00, "disconnected", A10);
        AnonymousClass186.A00(this.A07, "expectedOfflineCallCount", A10);
        AnonymousClass186.A00(this.A08, "expectedOfflineMessageCount", A10);
        AnonymousClass186.A00(this.A09, "expectedOfflineNotificationCount", A10);
        AnonymousClass186.A00(this.A0A, "expectedOfflineReceiptCount", A10);
        AnonymousClass186.A00(this.A01, "isOfflineCompleteMissed", A10);
        AnonymousClass186.A00(this.A02, "isResumeInForeground", A10);
        AnonymousClass186.A00(this.A03, "isResumeStartedInForeground", A10);
        AnonymousClass186.A00(this.A0B, "lastStanzaT", A10);
        AnonymousClass186.A00(this.A0C, "mailboxAge", A10);
        AnonymousClass186.A00(this.A0D, "offlineCallCount", A10);
        AnonymousClass186.A00(this.A0E, "offlineMessageCount", A10);
        AnonymousClass186.A00(this.A0F, "offlineNotificationCount", A10);
        AnonymousClass186.A00(this.A0G, "offlinePreviewT", A10);
        AnonymousClass186.A00(this.A0H, "offlineProcessingT", A10);
        AnonymousClass186.A00(this.A0I, "offlineReceiptCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "offlineResumeResult", A10);
        AnonymousClass186.A00(this.A0J, "offlineSessionT", A10);
        AnonymousClass186.A00(this.A04, "onTrickleMode", A10);
        AnonymousClass186.A00(this.A0K, "passiveModeT", A10);
        AnonymousClass186.A00(this.A0M, "runningTasks", A10);
        AnonymousClass186.A00(this.A0L, "socketConnectT", A10);
        return AnonymousClass184.A0S(this.A0N, "transientOfflineSessionId", A10);
    }
}
