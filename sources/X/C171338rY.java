package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rY  reason: invalid class name and case insensitive filesystem */
public final class C171338rY extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C171338rY() {
        super(2444, new C18180vt(1, 20, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A03);
        r3.CHf(7, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(5, this.A04);
        r3.CHf(2, this.A07);
        r3.CHf(1, this.A05);
        r3.CHf(4, this.A02);
        r3.CHf(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A06(AnonymousClass184.A03(C108975cc.A0S(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A09(C108955ca.A0f(), this.A03, A13), this.A00, A13), this.A01, A13), this.A04, A13), this.A07, A13), this.A05, A13), this.A02, A13), this.A06);
        AnonymousClass184.A0X(A13, 6);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamExitReasonEvent {");
        AnonymousClass186.A00(this.A03, "exitImportance", A10);
        AnonymousClass186.A00(this.A00, "exitLowMemorySupported", A10);
        AnonymousClass186.A00(this.A01, "exitPss", A10);
        AnonymousClass186.A00(this.A04, "exitReason", A10);
        AnonymousClass186.A00(this.A07, "exitReasonDescription", A10);
        AnonymousClass186.A00(this.A05, "exitReasonTimestamp", A10);
        AnonymousClass186.A00(this.A02, "exitRss", A10);
        return AnonymousClass184.A0S(this.A06, "exitStatus", A10);
    }
}
