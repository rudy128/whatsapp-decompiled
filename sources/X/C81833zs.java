package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zs  reason: invalid class name and case insensitive filesystem */
public final class C81833zs extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;

    public C81833zs() {
        super(5814, new C18180vt(1, 1, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(9, this.A00);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(12, this.A08);
        r3.CHf(13, this.A09);
        r3.CHf(7, this.A0C);
        r3.CHf(14, this.A0A);
        r3.CHf(6, this.A0B);
        r3.CHf(8, this.A0D);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A01 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("group_chat_size", "presence_group_chat_open", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("group_presence_sub_type", "presence_group_chat_open", C18460wS.A00), arrayList);
        }
        if (this.A04 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("num_sub_response", "presence_group_chat_open", C18460wS.A00), arrayList);
        }
        if (this.A05 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("num_sub_success", "presence_group_chat_open", C18460wS.A00), arrayList);
        }
        if (this.A06 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("num_subs_sent", "presence_group_chat_open", C18460wS.A00), arrayList);
        }
        if (this.A0B == null) {
            C59552mU A002 = AnonymousClass184.A00("total_presence_sub_count", "presence_group_chat_open", C18460wS.A00);
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
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A08(AnonymousClass184.A0G(AnonymousClass184.A09(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0C(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A0B(C17880vN.A0h(), this.A01, A13), this.A00, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0C, A13), this.A0A, A13), this.A0B, A13), this.A0D);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPresenceGroupChatOpen {");
        AnonymousClass186.A00(this.A01, "groupChatSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "groupPresenceSubType", A10);
        AnonymousClass186.A00(this.A02, "numExistingSubs", A10);
        AnonymousClass186.A00(this.A03, "numHasTc", A10);
        AnonymousClass186.A00(this.A04, "numSubResponse", A10);
        AnonymousClass186.A00(this.A05, "numSubSuccess", A10);
        AnonymousClass186.A00(this.A06, "numSubsSent", A10);
        AnonymousClass186.A00(this.A07, "onlineCountEntry", A10);
        AnonymousClass186.A00(this.A08, "onlineCountExit", A10);
        AnonymousClass186.A00(this.A09, "onlineCountMax", A10);
        AnonymousClass186.A00(this.A0C, "threadId", A10);
        AnonymousClass186.A00(this.A0A, "timeOpenMs", A10);
        AnonymousClass186.A00(this.A0B, "totalPresenceSubCount", A10);
        return AnonymousClass184.A0S(this.A0D, "unifiedSessionId", A10);
    }
}
