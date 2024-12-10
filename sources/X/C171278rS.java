package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rS  reason: invalid class name and case insensitive filesystem */
public final class C171278rS extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;

    public C171278rS() {
        super(3684, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A05);
        r3.CHf(7, this.A02);
        r3.CHf(8, this.A03);
        r3.CHf(9, this.A06);
        r3.CHf(12, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0C(AnonymousClass184.A0D(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A05, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A02, A13), this.A03, A13), this.A06, A13), (Object) null, A13), (Object) null, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamNotificationSetting {");
        AnonymousClass186.A00(this.A00, "groupReactionNotification", A10);
        AnonymousClass186.A00(this.A01, "groupShowNotification", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "groupSoundTone", A10);
        AnonymousClass186.A00(this.A02, "messageReactionNotification", A10);
        AnonymousClass186.A00(this.A03, "messageShowNotification", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "messageSoundTone", A10);
        return AnonymousClass184.A0S(this.A04, "statusReminderNotification", A10);
    }
}
