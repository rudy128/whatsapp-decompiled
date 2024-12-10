package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62O  reason: invalid class name */
public final class AnonymousClass62O extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;

    public AnonymousClass62O() {
        super(3526, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamGroupInviteLinkClick {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "groupInviteLinkEntryPoint", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "groupTypeClient", A10);
    }
}
