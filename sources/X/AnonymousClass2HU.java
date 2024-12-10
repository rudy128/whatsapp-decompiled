package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HU  reason: invalid class name */
public final class AnonymousClass2HU extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;
    public Long A0Y;
    public Long A0Z;
    public String A0a;
    public String A0b;

    public AnonymousClass2HU() {
        super(1994, new C18180vt(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(16, this.A00);
        r3.CHf(36, this.A0M);
        r3.CHf(26, this.A0E);
        r3.CHf(11, this.A0N);
        r3.CHf(12, this.A0O);
        r3.CHf(1, this.A0P);
        r3.CHf(42, this.A0F);
        r3.CHf(15, this.A01);
        r3.CHf(21, this.A0Q);
        r3.CHf(17, this.A0G);
        r3.CHf(45, this.A0H);
        r3.CHf(33, this.A02);
        r3.CHf(27, this.A03);
        r3.CHf(41, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(8, this.A06);
        r3.CHf(24, this.A07);
        r3.CHf(29, this.A08);
        r3.CHf(18, this.A0R);
        r3.CHf(3, this.A0I);
        r3.CHf(30, this.A09);
        r3.CHf(31, this.A0A);
        r3.CHf(4, this.A0J);
        r3.CHf(14, this.A0B);
        r3.CHf(37, this.A0S);
        r3.CHf(34, this.A0T);
        r3.CHf(28, this.A0C);
        r3.CHf(39, this.A0U);
        r3.CHf(44, this.A0a);
        r3.CHf(13, this.A0V);
        r3.CHf(10, this.A0W);
        r3.CHf(2, this.A0K);
        r3.CHf(40, this.A0X);
        r3.CHf(23, this.A0Y);
        r3.CHf(25, this.A0D);
        r3.CHf(19, this.A0Z);
        r3.CHf(38, this.A0L);
        r3.CHf(46, this.A0b);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(16, this.A00);
        C17880vN.A1O(AnonymousClass184.A0R(A13, 32), A13, 35);
        A13.put(36, this.A0M);
        A13.put(AnonymousClass184.A03(AnonymousClass184.A0E(AnonymousClass184.A0D(26, this.A0E, A13), this.A0N, A13), this.A0O, A13), this.A0P);
        A13.put(AnonymousClass184.A0J(AnonymousClass184.A0N(AnonymousClass184.A0H(42, this.A0F, A13), this.A01, A13), this.A0Q, A13), this.A0G);
        A13.put(45, this.A0H);
        A13.put(33, this.A02);
        A13.put(27, this.A03);
        A13.put(AnonymousClass184.A0Q(AnonymousClass184.A0A(AnonymousClass184.A0B(41, this.A04, A13), this.A05, A13), this.A06, A13), this.A07);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0K(29, this.A08, A13), this.A0R, A13), this.A0I);
        A13.put(30, this.A09);
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A06(31, this.A0A, A13), this.A0J, A13), this.A0B);
        A13.put(37, this.A0S);
        A13.put(34, this.A0T);
        A13.put(28, this.A0C);
        A13.put(39, this.A0U);
        A13.put(AnonymousClass184.A04(AnonymousClass184.A0C(AnonymousClass184.A0F(44, this.A0a, A13), this.A0V, A13), this.A0W, A13), this.A0K);
        A13.put(AnonymousClass184.A0P(40, this.A0X, A13), this.A0Y);
        A13.put(25, this.A0D);
        AnonymousClass184.A0X(A13, 20);
        A13.put(19, this.A0Z);
        A13.put(38, this.A0L);
        A13.put(46, this.A0b);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidMessageSendPerf {");
        AnonymousClass186.A00(this.A00, "appRestart", A10);
        AnonymousClass186.A00(this.A0M, "deviceCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0E), "deviceSizeBucket", A10);
        AnonymousClass186.A00(this.A0N, "durationAbs", A10);
        AnonymousClass186.A00(this.A0O, "durationRelative", A10);
        AnonymousClass186.A00(this.A0P, "durationT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0F), "editType", A10);
        AnonymousClass186.A00(this.A01, "fetchPrekeys", A10);
        AnonymousClass186.A00(this.A0Q, "fetchPrekeysPercentage", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0G), "groupSizeBucket", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0H), "invisibleMessageCategory", A10);
        AnonymousClass186.A00(this.A02, "isDirectedMessage", A10);
        AnonymousClass186.A00(this.A03, "isE2eBackfill", A10);
        AnonymousClass186.A00(this.A04, "isLid", A10);
        AnonymousClass186.A00(this.A05, "isMessageFanout", A10);
        AnonymousClass186.A00(this.A06, "isMessageForward", A10);
        AnonymousClass186.A00(this.A07, "isRevokeMessage", A10);
        AnonymousClass186.A00(this.A08, "isViewOnce", A10);
        AnonymousClass186.A00(this.A0R, "jobsInQueue", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0I), "mediaType", A10);
        AnonymousClass186.A00(this.A09, "messageIsFirstUserMessage", A10);
        AnonymousClass186.A00(this.A0A, "messageIsInvisible", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A0J), A10);
        AnonymousClass186.A00(this.A0B, "networkWasDisconnected", A10);
        AnonymousClass186.A00(this.A0S, "participantCount", A10);
        AnonymousClass186.A00(this.A0T, "phoneCores", A10);
        AnonymousClass186.A00(this.A0C, "prekeysEligibleForPrallelProcessing", A10);
        AnonymousClass186.A00(this.A0U, "receiverDeviceCount", A10);
        AnonymousClass186.A00(this.A0a, "runningTasks", A10);
        AnonymousClass186.A00(this.A0V, "sendCount", A10);
        AnonymousClass186.A00(this.A0W, "sendRetryCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0K), "sendStage", A10);
        AnonymousClass186.A00(this.A0X, "senderDeviceCount", A10);
        AnonymousClass186.A00(this.A0Y, "senderKeyDistributionCountPercentage", A10);
        AnonymousClass186.A00(this.A0D, "sessionsMissingWhenComposing", A10);
        AnonymousClass186.A00(this.A0Z, "threadsInExecution", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0L), "typeOfGroup", A10);
        return AnonymousClass184.A0S(this.A0b, "userToDeviceSizeBucket", A10);
    }
}
