package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2FD  reason: invalid class name */
public final class AnonymousClass2FD extends AnonymousClass184 {
    public Long A00;
    public Long A01;

    public AnonymousClass2FD() {
        super(4344, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamScheduledCallReminder {");
        AnonymousClass186.A00(this.A00, "missedReminder", A10);
        return AnonymousClass184.A0S(this.A01, "reminderAccuracy", A10);
    }
}
