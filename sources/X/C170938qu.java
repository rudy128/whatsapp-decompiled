package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qu  reason: invalid class name and case insensitive filesystem */
public final class C170938qu extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C170938qu() {
        super(2606, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A02);
        r3.CHf(1, this.A00);
        r3.CHf(3, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0i(), this.A02);
        AnonymousClass184.A0X(A13, 6);
        A13.put(C17880vN.A0h(), this.A00);
        AnonymousClass184.A0X(A13, 5);
        A13.put(C17880vN.A0j(), this.A01);
        AnonymousClass184.A0X(A13, 4);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWaShopsStorefront {");
        AnonymousClass186.A00(this.A02, "shopsSellerJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "storefrontAction", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "waShopsEntryPointSpecifier", A10);
    }
}
