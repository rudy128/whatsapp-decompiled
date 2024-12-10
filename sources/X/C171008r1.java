package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8r1  reason: invalid class name and case insensitive filesystem */
public final class C171008r1 extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;

    public C171008r1() {
        super(5640, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A01, A13), this.A02);
        AnonymousClass184.A0X(A13, 3);
        A13.put(AnonymousClass184.A07(C17880vN.A0k(), this.A03, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamFlowReceivedMonitoring {");
        AnonymousClass186.A00(this.A01, "analyticsIdSfmIndex", A10);
        AnonymousClass186.A00(this.A02, "analyticsIdSfmZeros", A10);
        AnonymousClass186.A00(this.A03, "receivedFlowId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "trafficSource", A10);
    }
}
