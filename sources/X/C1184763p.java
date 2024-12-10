package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63p  reason: invalid class name and case insensitive filesystem */
public final class C1184763p extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A03);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A05);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A06);
        r3.CHf(8, this.A07);
    }

    public C1184763p() {
        super(6070, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A03(C108955ca.A0f(), this.A03, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A05);
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(C17880vN.A0m(), this.A04, A13), this.A06, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMarketingMessageUserControlsJourney {");
        AnonymousClass186.A00(this.A03, "businessPhoneNumber", A10);
        AnonymousClass186.A00(this.A00, "isSuccess", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mmUserControlsAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "mmUserControlsEntryPoint", A10);
        AnonymousClass186.A00(this.A05, "mmUserControlsErrorType", A10);
        AnonymousClass186.A00(this.A04, "sequenceNumber", A10);
        AnonymousClass186.A00(this.A06, "templateId", A10);
        return AnonymousClass184.A0S(this.A07, "unifiedSessionId", A10);
    }
}
