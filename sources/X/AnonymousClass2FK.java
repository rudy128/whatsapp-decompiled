package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2FK  reason: invalid class name */
public final class AnonymousClass2FK extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;

    public AnonymousClass2FK() {
        super(2980, new C18180vt(1, 1, 5, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(1, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(C17880vN.A0i(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamXplatformMigrationDataReady {");
        AnonymousClass186.A00(this.A00, "completedMigration", A10);
        return AnonymousClass184.A0S(this.A01, "completedRegistration", A10);
    }
}
