package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gz  reason: invalid class name and case insensitive filesystem */
public final class C47072Gz extends AnonymousClass184 {
    public Double A00;
    public Double A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public C47072Gz() {
        super(2100, new C18180vt(1, 10, 1000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(12, this.A06);
        r3.CHf(10, this.A09);
        r3.CHf(8, this.A07);
        r3.CHf(7, this.A08);
        r3.CHf(6, this.A00);
        r3.CHf(11, this.A0A);
        r3.CHf(5, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A0D(AnonymousClass184.A08(AnonymousClass184.A09(AnonymousClass184.A0A(AnonymousClass184.A0C(AnonymousClass184.A0E(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A03(C17880vN.A0i(), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A09, A13), this.A07, A13), this.A08, A13), this.A00, A13), this.A0A, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidBatteryUsage {");
        AnonymousClass186.A00(this.A02, "networkMobileBytesRx", A10);
        AnonymousClass186.A00(this.A03, "networkMobileBytesTx", A10);
        AnonymousClass186.A00(this.A04, "networkWifiBytesRx", A10);
        AnonymousClass186.A00(this.A05, "networkWifiBytesTx", A10);
        AnonymousClass186.A00(this.A06, "numberPushNotifications", A10);
        AnonymousClass186.A00(this.A09, "sessionName", A10);
        AnonymousClass186.A00(this.A07, "sessionUpT", A10);
        AnonymousClass186.A00(this.A08, "sessionWallclockT", A10);
        AnonymousClass186.A00(this.A00, "systemCpuTime", A10);
        AnonymousClass186.A00(this.A0A, "tags", A10);
        return AnonymousClass184.A0S(this.A01, "userCpuTime", A10);
    }
}
