package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63F  reason: invalid class name */
public final class AnonymousClass63F extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public String A04;

    public AnonymousClass63F() {
        super(4708, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A04);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A04, A13), this.A03, A13), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCallSheet {");
        AnonymousClass186.A00(this.A04, "callRandomId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "callSheetEntryPoint", A10);
        AnonymousClass186.A00(this.A00, "callSheetIsComplete", A10);
        AnonymousClass186.A00(this.A01, "isLinkedGroupCall", A10);
        return AnonymousClass184.A0S(this.A02, "isVideoCall", A10);
    }
}
