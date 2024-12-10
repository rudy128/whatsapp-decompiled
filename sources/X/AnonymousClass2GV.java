package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GV  reason: invalid class name */
public final class AnonymousClass2GV extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;

    public AnonymousClass2GV() {
        super(2180, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(7, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(5, this.A04);
        r3.CHf(2, this.A01);
        r3.CHf(6, this.A05);
        r3.CHf(4, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A08(AnonymousClass184.A04(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A09(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A00, A13), this.A04, A13), this.A01, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdDeviceSyncAck {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "chatType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "invisibleMessageCategory", A10);
        AnonymousClass186.A00(this.A00, "isLid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "localAddressingMode", A10);
        AnonymousClass186.A00(this.A01, "revoke", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "serverAddressingMode", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A06), "typeOfGroup", A10);
    }
}
