package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63h  reason: invalid class name and case insensitive filesystem */
public final class C1183963h extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;

    public C1183963h() {
        super(3548, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A04);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A06);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A04, A13), this.A05, A13), this.A06, A13), this.A00, A13), this.A02, A13), this.A01, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamProductSearch {");
        AnonymousClass186.A00(this.A04, "catalogOwnerJid", A10);
        AnonymousClass186.A00(this.A05, "catalogSessionId", A10);
        AnonymousClass186.A00(this.A06, "productId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "searchEntryPoint", A10);
        AnonymousClass186.A00(this.A02, "searchResultIndex", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "searchViewAction", A10);
        return AnonymousClass184.A0S(this.A03, "sequenceNumber", A10);
    }
}
