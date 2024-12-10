package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gi  reason: invalid class name and case insensitive filesystem */
public final class C46902Gi extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;

    public C46902Gi() {
        super(2242, new C18180vt(1, 1, 100, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A02);
        r3.CHf(8, this.A00);
        r3.CHf(4, this.A05);
        r3.CHf(7, this.A03);
        r3.CHf(2, this.A06);
        r3.CHf(1, this.A04);
        r3.CHf(3, this.A07);
        r3.CHf(5, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A03(AnonymousClass184.A04(AnonymousClass184.A09(AnonymousClass184.A06(AnonymousClass184.A0A(C17880vN.A0m(), this.A02, A13), this.A00, A13), this.A05, A13), this.A03, A13), this.A06, A13), this.A04, A13), this.A07, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSignCredential {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "applicationState", A10);
        AnonymousClass186.A00(this.A00, "isFromWameta", A10);
        AnonymousClass186.A00(this.A05, "overallT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "projectCode", A10);
        AnonymousClass186.A00(this.A06, "retryCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "signCredentialResult", A10);
        AnonymousClass186.A00(this.A07, "signCredentialT", A10);
        return AnonymousClass184.A0S(this.A01, "waConnectedToChatd", A10);
    }
}
