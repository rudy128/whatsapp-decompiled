package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rA  reason: invalid class name and case insensitive filesystem */
public final class C171098rA extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public C171098rA() {
        super(3944, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A04);
        r3.CHf(2, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A07(C108975cc.A0S(C17880vN.A0h(), this.A04, A13), this.A01, A13), this.A02, A13), this.A00, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamWaFsGroupJoinRequestAction {");
        AnonymousClass186.A00(this.A04, "groupJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "groupJoinRequestAction", A10);
        AnonymousClass186.A00(this.A02, "groupJoinRequestGroupsInCommon", A10);
        AnonymousClass186.A00(this.A00, "isSuccessful", A10);
        return AnonymousClass184.A0S(this.A03, "serverResponseTime", A10);
    }
}
