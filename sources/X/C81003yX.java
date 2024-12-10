package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3yX  reason: invalid class name and case insensitive filesystem */
public final class C81003yX extends AnonymousClass184 {
    public Long A00;

    public C81003yX() {
        super(1136, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamE2ePlaceholdersViewed {");
        return AnonymousClass184.A0S(this.A00, "decryptionPlaceholderViews", A10);
    }
}
