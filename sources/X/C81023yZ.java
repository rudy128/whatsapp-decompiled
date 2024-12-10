package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3yZ  reason: invalid class name and case insensitive filesystem */
public final class C81023yZ extends AnonymousClass184 {
    public Long A00;

    public C81023yZ() {
        super(2522, new C18180vt(1, 20, 1000, false), 0, -1);
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
        A10.append("WamMdAppStateMessageRange {");
        return AnonymousClass184.A0S(this.A00, "additionalMessagesCount", A10);
    }
}
