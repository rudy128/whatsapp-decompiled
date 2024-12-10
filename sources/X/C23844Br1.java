package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Br1  reason: case insensitive filesystem */
public final class C23844Br1 extends AnonymousClass184 {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;

    public C23844Br1() {
        super(5092, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A00);
        r3.CHf(6, this.A05);
        r3.CHf(7, this.A06);
        r3.CHf(8, this.A07);
        r3.CHf(9, this.A08);
        r3.CHf(10, this.A09);
        r3.CHf(11, this.A0A);
        r3.CHf(12, this.A0B);
        r3.CHf(13, this.A0C);
        r3.CHf(14, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A0F(BE9.A0i(BE9.A0h(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A00, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSmartGlassesAppCallSessionError {");
        AnonymousClass186.A00(this.A01, "appCallSessionId", A10);
        AnonymousClass186.A00(this.A02, "appColdStartSessionId", A10);
        AnonymousClass186.A00(this.A03, "appWarmStartSessionId", A10);
        AnonymousClass186.A00(this.A04, "callStage", A10);
        AnonymousClass186.A00(this.A00, "eventTimeMs", A10);
        AnonymousClass186.A00(this.A05, "sgBuildFlavor", A10);
        AnonymousClass186.A00(this.A06, "sgDeviceBuildType", A10);
        AnonymousClass186.A00(this.A07, "sgDeviceType", A10);
        AnonymousClass186.A00(this.A08, "sgFailureCategory", A10);
        AnonymousClass186.A00(this.A09, "sgFailureReason", A10);
        AnonymousClass186.A00(this.A0A, "sgSocVersion", A10);
        AnonymousClass186.A00(this.A0B, "smartGlassesStreamSessionId", A10);
        AnonymousClass186.A00(this.A0C, "streamStage", A10);
        return AnonymousClass184.A0S(this.A0D, "streamingProtocol", A10);
    }
}
