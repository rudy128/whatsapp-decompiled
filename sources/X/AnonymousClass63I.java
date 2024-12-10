package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63I  reason: invalid class name */
public final class AnonymousClass63I extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;

    public AnonymousClass63I() {
        super(3206, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(3, this.A03);
        r3.CHf(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C108975cc.A0T(AnonymousClass184.A03(AnonymousClass184.A07(C17880vN.A0k(), this.A04, A13), this.A00, A13), this.A01, A13), this.A03, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamGraphqlCatalogRequest {");
        AnonymousClass186.A00(this.A04, "businessJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "businessType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "graphqlCatalogEndpoint", A10);
        AnonymousClass186.A00(this.A03, "graphqlErrorCode", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "graphqlRequestResult", A10);
    }
}
