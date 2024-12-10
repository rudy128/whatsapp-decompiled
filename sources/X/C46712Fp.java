package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fp  reason: invalid class name and case insensitive filesystem */
public final class C46712Fp extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public C46712Fp() {
        super(3484, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0j(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamKeepInChatNotif {");
        AnonymousClass186.A00(this.A00, "kicGroupNotificationTaps", A10);
        AnonymousClass186.A00(this.A01, "kicGroupNotifications", A10);
        AnonymousClass186.A00(this.A02, "kicNotificationTaps", A10);
        return AnonymousClass184.A0S(this.A03, "kicNotifications", A10);
    }
}
