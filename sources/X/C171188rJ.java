package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rJ  reason: invalid class name and case insensitive filesystem */
public final class C171188rJ extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A04);
        r3.CHf(8, this.A05);
        r3.CHf(3, this.A00);
        r3.CHf(5, this.A01);
        r3.CHf(9, this.A06);
        r3.CHf(6, this.A02);
        r3.CHf(7, this.A03);
    }

    public C171188rJ() {
        super(4294, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0A(C17880vN.A0i(), this.A04, A13), this.A05, A13), this.A00);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0B(C17880vN.A0l(), this.A01, A13), this.A06, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAceSurveyUserResponse {");
        AnonymousClass186.A00(this.A04, "aceSurveyBusinessSessionId", A10);
        AnonymousClass186.A00(this.A05, "aceSurveyDebugInfo", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "aceSurveyEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "aceSurveyTrigger", A10);
        AnonymousClass186.A00(this.A06, "aceSurveyType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "aceSurveyUserEvent", A10);
        return AnonymousClass184.A0S(this.A03, "businessPhoneNumber", A10);
    }
}
