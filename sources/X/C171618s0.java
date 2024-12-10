package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8s0  reason: invalid class name and case insensitive filesystem */
public final class C171618s0 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;

    public C171618s0() {
        super(494, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A05);
        r3.CHf(14, this.A00);
        r3.CHf(9, this.A06);
        r3.CHf(17, this.A07);
        r3.CHf(23, this.A01);
        r3.CHf(3, this.A08);
        r3.CHf(5, this.A03);
        r3.CHf(2, this.A09);
        r3.CHf(24, this.A04);
        r3.CHf(6, this.A02);
        r3.CHf(15, this.A0A);
        r3.CHf(16, this.A0B);
        r3.CHf(13, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0J(AnonymousClass184.A0B(AnonymousClass184.A0G(AnonymousClass184.A0A(21, AnonymousClass184.A0R(A13, 20), A13), this.A05, A13), this.A00, A13), this.A06, A13), this.A07);
        AnonymousClass184.A0X(A13, 22);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A05(23, this.A01, A13), this.A08, A13), this.A03);
        AnonymousClass184.A0X(A13, 27);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A0Q(C17880vN.A0i(), this.A09, A13), this.A04, A13), this.A02);
        AnonymousClass184.A0X(A13, 26);
        A13.put(15, this.A0A);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0I(18, AnonymousClass184.A0R(A13, 19), A13), this.A0B, A13), this.A0C);
        AnonymousClass184.A0X(A13, 25);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCrashLog {");
        AnonymousClass186.A00(this.A05, "androidAppStateMetadata", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "androidApplicationState", A10);
        AnonymousClass186.A00(this.A06, "androidCrashedBuildVersion", A10);
        AnonymousClass186.A00(this.A07, "androidExitReasonDescription", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "crashApplicationState", A10);
        AnonymousClass186.A00(this.A08, "crashContext", A10);
        AnonymousClass186.A00(this.A03, "crashCount", A10);
        AnonymousClass186.A00(this.A09, "crashReason", A10);
        AnonymousClass186.A00(this.A04, "crashTimeout", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "crashType", A10);
        AnonymousClass186.A00(this.A0A, "lastSurface", A10);
        AnonymousClass186.A00(this.A0B, "runningTasks", A10);
        return AnonymousClass184.A0S(this.A0C, "secondaryProcessName", A10);
    }
}
