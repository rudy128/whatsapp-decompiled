package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HT  reason: invalid class name */
public final class AnonymousClass2HT extends AnonymousClass184 {
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
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;
    public Long A0Y;
    public Long A0Z;
    public Long A0a;

    public AnonymousClass2HT() {
        super(450, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(28, this.A0B);
        r3.CHf(37, this.A0C);
        r3.CHf(38, this.A0D);
        r3.CHf(16, this.A0S);
        r3.CHf(10, this.A0E);
        r3.CHf(14, this.A0F);
        r3.CHf(25, this.A0G);
        r3.CHf(13, this.A0T);
        r3.CHf(26, this.A0H);
        r3.CHf(27, this.A0I);
        r3.CHf(39, this.A00);
        r3.CHf(41, this.A0J);
        r3.CHf(36, this.A01);
        r3.CHf(19, this.A02);
        r3.CHf(18, this.A03);
        r3.CHf(24, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(33, this.A0K);
        r3.CHf(34, this.A0L);
        r3.CHf(4, this.A06);
        r3.CHf(23, this.A07);
        r3.CHf(5, this.A08);
        r3.CHf(2, this.A0M);
        r3.CHf(6, this.A0U);
        r3.CHf(7, this.A0V);
        r3.CHf(1, this.A0N);
        r3.CHf(8, this.A09);
        r3.CHf(30, this.A0W);
        r3.CHf(40, this.A0O);
        r3.CHf(22, this.A0X);
        r3.CHf(17, this.A0Y);
        r3.CHf(12, this.A0Z);
        r3.CHf(20, this.A0P);
        r3.CHf(11, this.A0a);
        r3.CHf(35, this.A0Q);
        r3.CHf(29, this.A0A);
        r3.CHf(21, this.A0R);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(28, this.A0B);
        A13.put(37, this.A0C);
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0C(AnonymousClass184.A0I(38, this.A0D, A13), this.A0S, A13), this.A0E, A13), this.A0F);
        A13.put(AnonymousClass184.A0F(25, this.A0G, A13), this.A0T);
        A13.put(26, this.A0H);
        A13.put(27, this.A0I);
        A13.put(39, this.A00);
        A13.put(41, this.A0J);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0Q(AnonymousClass184.A0K(AnonymousClass184.A0L(36, this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05);
        A13.put(33, this.A0K);
        A13.put(AnonymousClass184.A04(AnonymousClass184.A07(AnonymousClass184.A0P(AnonymousClass184.A06(34, this.A0L, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A0M);
        AnonymousClass184.A0X(A13, 15);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A03(AnonymousClass184.A09(C17880vN.A0m(), this.A0U, A13), this.A0V, A13), this.A0N, A13), this.A09);
        AnonymousClass184.A0X(A13, 3);
        A13.put(30, this.A0W);
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0M(AnonymousClass184.A0E(AnonymousClass184.A0J(AnonymousClass184.A0O(40, this.A0O, A13), this.A0X, A13), this.A0Y, A13), this.A0Z, A13), this.A0P, A13), this.A0a);
        A13.put(35, this.A0Q);
        A13.put(29, this.A0A);
        C17880vN.A1O(AnonymousClass184.A0R(A13, 31), A13, 32);
        A13.put(21, this.A0R);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMessageReceive {");
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "agentEngagementType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0C), "botType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0D), "chatOrigins", A10);
        AnonymousClass186.A00(this.A0S, "deviceCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0E), "deviceSizeBucket", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0F), "disappearingChatInitiator", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0G), "editType", A10);
        AnonymousClass186.A00(this.A0T, "ephemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0H), "ephemeralityInitiator", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0I), "ephemeralityTriggerAction", A10);
        AnonymousClass186.A00(this.A00, "hasUsername", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0J), "invisibleMessageCategory", A10);
        AnonymousClass186.A00(this.A01, "isAComment", A10);
        AnonymousClass186.A00(this.A02, "isAReply", A10);
        AnonymousClass186.A00(this.A03, "isForwardedForward", A10);
        AnonymousClass186.A00(this.A04, "isLid", A10);
        AnonymousClass186.A00(this.A05, "isViewOnce", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0K), "localAddressingMode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0L), "messageAddressingMode", A10);
        AnonymousClass186.A00(this.A06, "messageIsInternational", A10);
        AnonymousClass186.A00(this.A07, "messageIsInvisible", A10);
        AnonymousClass186.A00(this.A08, "messageIsOffline", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0M), "messageMediaType", A10);
        AnonymousClass186.A00(this.A0U, "messageReceiveT0", A10);
        AnonymousClass186.A00(this.A0V, "messageReceiveT1", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A0N), A10);
        AnonymousClass186.A00(this.A09, "mutedGroupMessage", A10);
        AnonymousClass186.A00(this.A0W, "offlineCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0O), "oppositeVisibleIdentification", A10);
        AnonymousClass186.A00(this.A0X, "paddingBytesSize", A10);
        AnonymousClass186.A00(this.A0Y, "participantCount", A10);
        AnonymousClass186.A00(this.A0Z, "receiverDefaultDisappearingDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0P), "revokeType", A10);
        AnonymousClass186.A00(this.A0a, "senderDefaultDisappearingDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0Q), "serverAddressingMode", A10);
        AnonymousClass186.A00(this.A0A, "stickerIsAi", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0R), "typeOfGroup", A10);
    }
}
