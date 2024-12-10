package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zd  reason: invalid class name and case insensitive filesystem */
public final class C81683zd extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;

    public C81683zd() {
        super(5830, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A01);
        r3.CHf(8, this.A02);
        r3.CHf(11, this.A06);
        r3.CHf(12, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A03(AnonymousClass184.A0C(9, this.A03, A13), this.A04, A13), this.A00, A13), this.A05, A13), this.A01);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass3MY.A0g(), this.A02, A13), this.A06, A13), this.A07, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamListUpdate {");
        AnonymousClass186.A00(this.A03, "groupsAdded", A10);
        AnonymousClass186.A00(this.A04, "groupsAfterUpdate", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "listAction", A10);
        AnonymousClass186.A00(this.A05, "listId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "listType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "updateEntryPoint", A10);
        AnonymousClass186.A00(this.A06, "usersAdded", A10);
        return AnonymousClass184.A0S(this.A07, "usersAfterUpdate", A10);
    }
}
