package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GW  reason: invalid class name */
public final class AnonymousClass2GW extends AnonymousClass184 {
    public Double A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Long A06;

    public AnonymousClass2GW() {
        super(1336, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(13, this.A00);
        r3.CHf(12, this.A01);
        r3.CHf(11, this.A06);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(1, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0D(AnonymousClass184.A0E(13, this.A00, A13), this.A01, A13), this.A06, A13), (Object) null, A13), (Object) null, A13), this.A02);
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A08(C17880vN.A0k(), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 2);
        A13.put(C17880vN.A0h(), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMemoryStat {");
        AnonymousClass186.A00(this.A00, "androidDalvikPrivateDirty", A10);
        AnonymousClass186.A00(this.A01, "androidNativePrivateDirty", A10);
        AnonymousClass186.A00(this.A06, "androidThreadCount", A10);
        AnonymousClass186.A00(this.A02, "privateBytes", A10);
        AnonymousClass186.A00(this.A03, "sharedBytes", A10);
        AnonymousClass186.A00(this.A04, "uptime", A10);
        return AnonymousClass184.A0S(this.A05, "workingSetSize", A10);
    }
}
