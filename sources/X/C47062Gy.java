package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gy  reason: invalid class name and case insensitive filesystem */
public final class C47062Gy extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A06);
        r3.CHf(11, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A07);
        r3.CHf(7, this.A00);
        r3.CHf(8, this.A01);
        r3.CHf(9, this.A08);
        r3.CHf(10, this.A09);
    }

    public C47062Gy() {
        super(4356, AnonymousClass184.A02(), 2, 248614979);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A06);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(11, this.A04, A13), this.A05, A13), this.A07, A13), this.A00, A13), this.A01, A13), this.A08, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsProxyLogin {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "androidKeystoreState", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "connectionOrigin", A10);
        AnonymousClass186.A00(this.A06, "connectionT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "loginDnsResolver", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "loginResult", A10);
        AnonymousClass186.A00(this.A07, "loginT", A10);
        AnonymousClass186.A00(this.A00, "longConnect", A10);
        AnonymousClass186.A00(this.A01, "psPassive", A10);
        AnonymousClass186.A00(this.A08, "retryCount", A10);
        return AnonymousClass184.A0S(this.A09, "serverErrorCode", A10);
    }
}
