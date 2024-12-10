package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8r7  reason: invalid class name and case insensitive filesystem */
public final class C171068r7 extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C171068r7() {
        super(2246, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A01);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(AnonymousClass184.A03(C17880vN.A0l(), this.A01, A13), this.A00, A13), this.A02, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamExtDirMigration {");
        AnonymousClass186.A00(this.A01, "attemptN", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "extDirMigrationResult", A10);
        AnonymousClass186.A00(this.A02, "extDirMigrationTotalT", A10);
        AnonymousClass186.A00(this.A03, "moveT", A10);
        return AnonymousClass184.A0S(this.A04, "rescanT", A10);
    }
}
