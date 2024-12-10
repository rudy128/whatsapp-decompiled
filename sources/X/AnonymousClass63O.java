package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63O  reason: invalid class name */
public final class AnonymousClass63O extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public AnonymousClass63O() {
        super(3246, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A04);
        r3.CHf(8, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A03, A13), this.A01, A13), this.A02, A13), this.A04, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUserActionsOnBusinessProfile {");
        AnonymousClass186.A00(this.A03, "businessProfileDirectorySessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "businessProfileViewEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "businessProfileViewEventType", A10);
        AnonymousClass186.A00(this.A04, "businessRootCategory", A10);
        return AnonymousClass184.A0S(this.A00, "isAddedInContacts", A10);
    }
}
