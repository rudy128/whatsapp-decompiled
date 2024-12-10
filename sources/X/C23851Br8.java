package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Br8  reason: case insensitive filesystem */
public final class C23851Br8 extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;

    public C23851Br8() {
        super(5094, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A06);
        r3.CHf(2, this.A07);
        r3.CHf(3, this.A08);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A01);
        r3.CHf(6, this.A09);
        r3.CHf(7, this.A0A);
        r3.CHf(8, this.A0B);
        r3.CHf(9, this.A0C);
        r3.CHf(10, this.A0D);
        r3.CHf(11, this.A0E);
        r3.CHf(12, this.A0F);
        r3.CHf(13, this.A0G);
        r3.CHf(20, this.A0H);
        r3.CHf(14, this.A0I);
        r3.CHf(15, this.A0J);
        r3.CHf(16, this.A02);
        r3.CHf(17, this.A03);
        r3.CHf(21, this.A0K);
        r3.CHf(18, this.A04);
        r3.CHf(19, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0N(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0M(AnonymousClass184.A0F(BE9.A0i(BE9.A0h(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A06, A13), this.A07, A13), this.A08, A13), this.A00, A13), this.A01, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A0F, A13), this.A0G, A13), this.A0H, A13), this.A0I, A13), this.A0J, A13), this.A02, A13), this.A03, A13), this.A0K, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSmartGlassesCallSessionEnd {");
        AnonymousClass186.A00(this.A06, "appCallSessionId", A10);
        AnonymousClass186.A00(this.A07, "appColdStartSessionId", A10);
        AnonymousClass186.A00(this.A08, "appWarmStartSessionId", A10);
        AnonymousClass186.A00(this.A00, "batteryLevelEndPct", A10);
        AnonymousClass186.A00(this.A01, "batteryLevelStartPct", A10);
        AnonymousClass186.A00(this.A09, "endCallStage", A10);
        AnonymousClass186.A00(this.A0A, "glassPhoneAudio", A10);
        AnonymousClass186.A00(this.A0B, "glassPhoneVideo", A10);
        AnonymousClass186.A00(this.A0C, "phoneServerAudio", A10);
        AnonymousClass186.A00(this.A0D, "phoneServerVideo", A10);
        AnonymousClass186.A00(this.A0E, "sgBuildFlavor", A10);
        AnonymousClass186.A00(this.A0F, "sgDeviceBuildType", A10);
        AnonymousClass186.A00(this.A0G, "sgDeviceType", A10);
        AnonymousClass186.A00(this.A0H, "sgLatency", A10);
        AnonymousClass186.A00(this.A0I, "sgSocVersion", A10);
        AnonymousClass186.A00(this.A0J, "smartGlassesStreamSessionId", A10);
        AnonymousClass186.A00(this.A02, "streamSessionEndTimeMs", A10);
        AnonymousClass186.A00(this.A03, "streamSessionStartTimeMs", A10);
        AnonymousClass186.A00(this.A0K, "streamingProtocol", A10);
        AnonymousClass186.A00(this.A04, "thermalThrottlingEndStateType", A10);
        return AnonymousClass184.A0S(this.A05, "thermalThrottlingStartStateType", A10);
    }
}
