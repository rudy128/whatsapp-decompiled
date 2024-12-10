package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rT  reason: invalid class name and case insensitive filesystem */
public final class C171288rT extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public C171288rT() {
        super(2570, new C18180vt(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A05);
        r3.CHf(3, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0S(AnonymousClass184.A03(AnonymousClass184.A09(C17880vN.A0m(), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A00, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamNotificationStanzaReceive {");
        AnonymousClass186.A00(this.A01, "dbReadsCount", A10);
        AnonymousClass186.A00(this.A02, "dbWritesCount", A10);
        AnonymousClass186.A00(this.A03, "notificationStanzaDuration", A10);
        AnonymousClass186.A00(this.A04, "notificationStanzaOfflineCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "notificationStanzaStage", A10);
        AnonymousClass186.A00(this.A05, "notificationStanzaSubType", A10);
        return AnonymousClass184.A0S(this.A06, "notificationStanzaType", A10);
    }
}
