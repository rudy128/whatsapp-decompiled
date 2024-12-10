package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rB  reason: invalid class name and case insensitive filesystem */
public final class C171108rB extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;

    public C171108rB() {
        super(4292, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A03);
        r3.CHf(1, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(7, this.A04);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(C17880vN.A0m(), this.A03, A13), this.A00);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A09(C17880vN.A0j(), this.A01, A13), this.A04, A13), this.A02, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAceSurveyUserEngagement {");
        AnonymousClass186.A00(this.A03, "aceSurveyDebugInfo", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "aceSurveyEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "aceSurveyTrigger", A10);
        AnonymousClass186.A00(this.A04, "aceSurveyType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "aceSurveyUserEvent", A10);
        return AnonymousClass184.A0S(this.A05, "aceSurveyUserSessionId", A10);
    }
}
