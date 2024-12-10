package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hj  reason: invalid class name and case insensitive filesystem */
public final class C47172Hj extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public String A09;

    public C47172Hj() {
        super(5990, new C18180vt(1, 20, 100, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A07);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A03);
        r3.CHf(7, this.A04);
        r3.CHf(8, this.A06);
        r3.CHf(9, this.A08);
        r3.CHf(10, this.A09);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("is_a_group", "notification_highlight_result", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A06 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("notification_highlight_result_value", "notification_highlight_result", C18460wS.A00), arrayList);
        }
        if (this.A09 == null) {
            C59552mU A002 = AnonymousClass184.A00("thread_id", "notification_highlight_result", C18460wS.A00);
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
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A07, A13), this.A05, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A06, A13), this.A08, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamNotificationHighlightResult {");
        AnonymousClass186.A00(this.A07, "groupSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "groupTypeClient", A10);
        AnonymousClass186.A00(this.A00, "isAGroup", A10);
        AnonymousClass186.A00(this.A01, "notificationHighlightIsMention", A10);
        AnonymousClass186.A00(this.A02, "notificationHighlightIsRecentlyEntered", A10);
        AnonymousClass186.A00(this.A03, "notificationHighlightIsReply", A10);
        AnonymousClass186.A00(this.A04, "notificationHighlightIsSavedContact", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "notificationHighlightResultValue", A10);
        AnonymousClass186.A00(this.A08, "secondsSinceLastThreadEnter", A10);
        return AnonymousClass184.A0S(this.A09, "threadId", A10);
    }
}
