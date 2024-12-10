package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hh  reason: invalid class name and case insensitive filesystem */
public final class C47152Hh extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public C47152Hh() {
        super(5988, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A04);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A00);
        r3.CHf(6, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A05);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("is_a_group", "notification_activity_setting_update", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A03 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("notification_activity_setting_value", "notification_activity_setting_update", C18460wS.A00), arrayList);
        }
        if (this.A05 == null) {
            C59552mU A002 = AnonymousClass184.A00("thread_id", "notification_activity_setting_update", C18460wS.A00);
            if (arrayList != null) {
                arrayList.add(A002);
                return arrayList;
            }
            arrayList = AnonymousClass184.A0U(A002);
        }
        if (arrayList == null) {
            return C18460wS.A00;
        }
        return arrayList;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A08(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A04, A13), this.A01, A13), this.A00, A13), this.A02, A13), this.A03, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamNotificationActivitySettingUpdate {");
        AnonymousClass186.A00(this.A04, "groupSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "groupTypeClient", A10);
        AnonymousClass186.A00(this.A00, "isAGroup", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "notificationActivitySettingUpdateEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "notificationActivitySettingValue", A10);
        return AnonymousClass184.A0S(this.A05, "threadId", A10);
    }
}
