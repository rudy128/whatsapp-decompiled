package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8ru  reason: invalid class name and case insensitive filesystem */
public final class C171558ru extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public C171558ru() {
        super(1722, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(13, this.A00);
        r3.CHf(1, this.A02);
        r3.CHf(7, this.A03);
        r3.CHf(3, this.A06);
        r3.CHf(14, this.A07);
        r3.CHf(15, this.A08);
        r3.CHf(8, this.A04);
        r3.CHf(10, this.A01);
        r3.CHf(9, this.A09);
        r3.CHf(2, this.A0A);
        r3.CHf(16, this.A0B);
        r3.CHf(11, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 19);
        A13.put(13, this.A00);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A09(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A06);
        AnonymousClass184.A0X(A13, 18);
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0Q(AnonymousClass184.A07(AnonymousClass184.A0M(AnonymousClass184.A0A(AnonymousClass184.A0H(14, this.A07, A13), this.A08, A13), this.A04, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A01);
        A13.put(AnonymousClass184.A0B(22, AnonymousClass184.A0R(A13, 21), A13), this.A09);
        AnonymousClass184.A0X(A13, 6);
        A13.put(C17880vN.A0i(), this.A0A);
        AnonymousClass184.A0X(A13, 12);
        A13.put(AnonymousClass184.A0D(16, this.A0B, A13), this.A05);
        AnonymousClass184.A0X(A13, 23);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCatalogBiz {");
        AnonymousClass186.A00(this.A00, "cartToggle", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "catalogBizAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "catalogEntryPoint", A10);
        AnonymousClass186.A00(this.A06, "catalogSessionId", A10);
        AnonymousClass186.A00(this.A07, "collectionId", A10);
        AnonymousClass186.A00(this.A08, "collectionIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "deepLinkOpenFrom", A10);
        AnonymousClass186.A00(this.A01, "isOrderMsgAttached", A10);
        AnonymousClass186.A00(this.A09, "orderId", A10);
        AnonymousClass186.A00(this.A0A, "productId", A10);
        AnonymousClass186.A00(this.A0B, "productIndex", A10);
        return AnonymousClass184.A0S(this.A05, "quantity", A10);
    }
}
