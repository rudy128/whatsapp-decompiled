package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqz  reason: case insensitive filesystem */
public final class C23842Bqz extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;

    public C23842Bqz() {
        super(4780, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A09);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A0A);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A0B);
        r3.CHf(8, this.A05);
        r3.CHf(9, this.A0C);
        r3.CHf(10, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(12, this.A08);
        r3.CHf(13, this.A00);
        r3.CHf(14, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0F(BE9.A0i(BE9.A0h(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A09, A13), this.A02, A13), this.A0A, A13), this.A03, A13), this.A04, A13), this.A0B, A13), this.A05, A13), this.A0C, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A00, A13), this.A0D);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamEphemeralSyncResponseReceive {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "clientDisappearingModeInitiator", A10);
        AnonymousClass186.A00(this.A09, "clientEphemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "clientEphemeralityInitiator", A10);
        AnonymousClass186.A00(this.A0A, "clientEphemeralitySettingTimestamp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "clientEphemeralityTriggerAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "esrDisappearingModeInitiator", A10);
        AnonymousClass186.A00(this.A0B, "esrEphemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "esrEphemeralityInitiator", A10);
        AnonymousClass186.A00(this.A0C, "esrEphemeralitySettingTimestamp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "esrEphemeralityTriggerAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "esrFailureReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "esrResolveResult", A10);
        AnonymousClass186.A00(this.A00, "isAGroup", A10);
        return AnonymousClass184.A0S(this.A0D, "threadId", A10);
    }
}
