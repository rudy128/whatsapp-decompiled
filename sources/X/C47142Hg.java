package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hg  reason: invalid class name and case insensitive filesystem */
public final class C47142Hg extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C47142Hg() {
        super(5900, new C18180vt(1, 1, 20000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("logging_trigger_action", "unread_count", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A02 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("unread_badge_count", "unread_count", C18460wS.A00), arrayList);
        }
        if (this.A03 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("unread_message_count", "unread_count", C18460wS.A00), arrayList);
        }
        if (this.A04 == null) {
            C59552mU A002 = AnonymousClass184.A00("unread_thread_count", "unread_count", C18460wS.A00);
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
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A02, A13), this.A01, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUnreadCount {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "loggingTriggerAction", A10);
        AnonymousClass186.A00(this.A02, "unreadBadgeCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "unreadBadgeSetting", A10);
        AnonymousClass186.A00(this.A03, "unreadMessageCount", A10);
        return AnonymousClass184.A0S(this.A04, "unreadThreadCount", A10);
    }
}
