package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2G2  reason: invalid class name */
public final class AnonymousClass2G2 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public AnonymousClass2G2() {
        super(4796, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A04);
        r3.CHf(4, this.A00);
        r3.CHf(3, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(1, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A06(C17880vN.A0i(), this.A04, A13), this.A00, A13), this.A02, A13), this.A03, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDeviceBackupSetting {");
        AnonymousClass186.A00(this.A04, "deviceBackupSettingError", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "deviceBackupSettingEventSource", A10);
        AnonymousClass186.A00(this.A02, "deviceBackupSettingGoogleAccountCount", A10);
        AnonymousClass186.A00(this.A03, "deviceBackupSettingPlayStoreResult", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "deviceBackupSettingStatus", A10);
    }
}
