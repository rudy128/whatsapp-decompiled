package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rD  reason: invalid class name and case insensitive filesystem */
public final class C171128rD extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public C171128rD() {
        super(2582, new C18180vt(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(4, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A06(C108975cc.A0S(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A00, A13), this.A01, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCallStanzaReceive {");
        AnonymousClass186.A00(this.A02, "callStanzaDuration", A10);
        AnonymousClass186.A00(this.A03, "callStanzaOfflineCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "callStanzaStage", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "callStanzaType", A10);
        AnonymousClass186.A00(this.A04, "dbReadsCount", A10);
        return AnonymousClass184.A0S(this.A05, "dbWritesCount", A10);
    }
}
