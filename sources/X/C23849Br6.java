package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Br6  reason: case insensitive filesystem */
public final class C23849Br6 extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public String A0J;

    public C23849Br6() {
        super(4778, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A0C);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A0D);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A0E);
        r3.CHf(8, this.A05);
        r3.CHf(9, this.A0F);
        r3.CHf(10, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(12, this.A0G);
        r3.CHf(13, this.A08);
        r3.CHf(14, this.A00);
        r3.CHf(15, this.A09);
        r3.CHf(16, this.A0H);
        r3.CHf(17, this.A0A);
        r3.CHf(18, this.A0I);
        r3.CHf(19, this.A0B);
        r3.CHf(20, this.A0J);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0M(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(BE9.A0i(BE9.A0h(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A0C, A13), this.A02, A13), this.A0D, A13), this.A03, A13), this.A04, A13), this.A0E, A13), this.A05, A13), this.A0F, A13), this.A06, A13), this.A07, A13), this.A0G, A13), this.A08, A13), this.A00, A13), this.A09, A13), this.A0H, A13), this.A0A, A13), this.A0I, A13), this.A0B, A13), this.A0J);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamEphemeralSyncResponseSend {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "clientDisappearingModeInitiator", A10);
        AnonymousClass186.A00(this.A0C, "clientEphemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "clientEphemeralityInitiator", A10);
        AnonymousClass186.A00(this.A0D, "clientEphemeralitySettingTimestamp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "clientEphemeralityTriggerAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "esrDisappearingModeInitiator", A10);
        AnonymousClass186.A00(this.A0E, "esrEphemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "esrEphemeralityInitiator", A10);
        AnonymousClass186.A00(this.A0F, "esrEphemeralitySettingTimestamp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "esrEphemeralityTriggerAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "esrFailureReason", A10);
        AnonymousClass186.A00(this.A0G, "esrSendAttempt", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "esrSendResult", A10);
        AnonymousClass186.A00(this.A00, "isAGroup", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "messageDisappearingModeInitiator", A10);
        AnonymousClass186.A00(this.A0H, "messageEphemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "messageEphemeralityInitiator", A10);
        AnonymousClass186.A00(this.A0I, "messageEphemeralitySettingTimestamp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0B), "messageEphemeralityTriggerAction", A10);
        return AnonymousClass184.A0S(this.A0J, "threadId", A10);
    }
}
