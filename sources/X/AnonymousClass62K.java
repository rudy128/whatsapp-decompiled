package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62K  reason: invalid class name */
public final class AnonymousClass62K extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
    }

    public AnonymousClass62K() {
        super(5176, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDangerousFileOpenStats {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "clickthroughAction", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "senderRelationship", A10);
    }
}
