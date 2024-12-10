package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3z2  reason: invalid class name and case insensitive filesystem */
public final class C81313z2 extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public C81313z2() {
        super(3426, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(4, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCadminDemote {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "cadminDemoteOrigin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "cadminDemoteResult", A10);
        return AnonymousClass184.A0S(this.A00, "isLastCadminOrCreator", A10);
    }
}
