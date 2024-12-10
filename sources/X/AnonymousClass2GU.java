package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GU  reason: invalid class name */
public final class AnonymousClass2GU extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public AnonymousClass2GU() {
        super(2290, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(2, this.A00);
        r3.CHf(7, this.A01);
        r3.CHf(8, this.A05);
        r3.CHf(1, this.A06);
        r3.CHf(3, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A03(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A04(AnonymousClass184.A06(C17880vN.A0l(), this.A02, A13), this.A03, A13), this.A00, A13), this.A01, A13), this.A05, A13), this.A06, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdBootstrapAppStateDataUploaded {");
        AnonymousClass186.A00(this.A02, "mdBootstrapContactsCount", A10);
        AnonymousClass186.A00(this.A03, "mdBootstrapPayloadSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mdBootstrapPayloadType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mdBootstrapStepResult", A10);
        AnonymousClass186.A00(this.A05, "mdRegAttemptId", A10);
        AnonymousClass186.A00(this.A06, "mdSessionId", A10);
        return AnonymousClass184.A0S(this.A04, "mdTimestamp", A10);
    }
}
