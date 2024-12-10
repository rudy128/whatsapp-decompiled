package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62B  reason: invalid class name */
public final class AnonymousClass62B extends AnonymousClass184 {
    public Integer A00;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, (Object) null);
        r3.CHf(1, this.A00);
    }

    public AnonymousClass62B() {
        super(2908, AnonymousClass184.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 2);
        A13.put(C17880vN.A0h(), this.A00);
        AnonymousClass184.A0X(A13, 3);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWaShopsManagement {");
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "shopsManagementAction", A10);
    }
}
