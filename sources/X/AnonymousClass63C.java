package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63C  reason: invalid class name */
public final class AnonymousClass63C extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public AnonymousClass63C() {
        super(2204, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(C108975cc.A0S(AnonymousClass184.A03(C108975cc.A0T(C17880vN.A0k(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidNtpSync {");
        AnonymousClass186.A00(this.A00, "ntpSyncCountPeriod", A10);
        AnonymousClass186.A00(this.A01, "ntpSyncFailedCount", A10);
        AnonymousClass186.A00(this.A02, "ntpSyncStartedCount", A10);
        AnonymousClass186.A00(this.A03, "ntpSyncSucceededCount", A10);
        return AnonymousClass184.A0S(this.A04, "ntpSyncWorkManagerInit", A10);
    }
}
