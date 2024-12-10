package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GY  reason: invalid class name */
public final class AnonymousClass2GY extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public AnonymousClass2GY() {
        super(2638, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A00);
        r3.CHf(8, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(6, this.A05);
        r3.CHf(2, this.A04);
        r3.CHf(5, this.A06);
        r3.CHf(1, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(7, this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 3);
        A13.put(AnonymousClass184.A03(AnonymousClass184.A07(AnonymousClass184.A04(AnonymousClass184.A08(C17880vN.A0k(), this.A02, A13), this.A05, A13), this.A04, A13), this.A06, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamOfflineCountTooHigh {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "callStanzaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "invisibleMessageCategory", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A02), A10);
        AnonymousClass186.A00(this.A05, "notificationStanzaType", A10);
        AnonymousClass186.A00(this.A04, "offlineCount", A10);
        AnonymousClass186.A00(this.A06, "receiptStanzaType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "stanzaType", A10);
    }
}
