package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.61u  reason: invalid class name and case insensitive filesystem */
public final class C1180061u extends AnonymousClass184 {
    public Integer A00;

    public C1180061u() {
        super(5488, AnonymousClass184.A01(), 0, -1);
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
        A10.append("WamAndroidContactPickerSearch {");
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "contactPickerUsage", A10);
    }
}
