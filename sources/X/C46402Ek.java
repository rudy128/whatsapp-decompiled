package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ek  reason: invalid class name and case insensitive filesystem */
public final class C46402Ek extends AnonymousClass184 {
    public Boolean A00;

    public C46402Ek() {
        super(2520, new C18180vt(1, 20, 1000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0i(), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdAppStateDirtyBits {");
        return AnonymousClass184.A0S(this.A00, "dirtyBitsFalsePositive", A10);
    }
}
