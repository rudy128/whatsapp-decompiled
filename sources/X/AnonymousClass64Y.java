package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.64Y  reason: invalid class name */
public final class AnonymousClass64Y extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;

    public AnonymousClass64Y() {
        super(5308, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(11, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A06);
        r3.CHf(7, this.A07);
        r3.CHf(8, this.A08);
        r3.CHf(9, this.A09);
        r3.CHf(10, this.A0A);
    }

    public List validate() {
        ArrayList arrayList;
        Long l;
        Long l2;
        if (this.A01 == null) {
            arrayList = AnonymousClass184.A0U(new C59552mU("search_action_event", ".nonnull", C18460wS.A00, C18070vi.A0M("search_action")));
        } else {
            arrayList = null;
        }
        Integer num = this.A01;
        if (num != null && num.intValue() == 1 && ((l2 = this.A04) == null || l2.longValue() <= 0)) {
            C18460wS r2 = C18460wS.A00;
            arrayList = AnonymousClass184.A0V(new C59552mU("search_action_event", "search_ai_suggestion_count > 0", r2, r2), arrayList);
        }
        Integer num2 = this.A01;
        if (num2 != null && num2.intValue() == 2 && ((l = this.A04) == null || l.longValue() != 1)) {
            C18460wS r22 = C18460wS.A00;
            C59552mU r0 = new C59552mU("search_action_event", "search_ai_suggestion_count == 1", r22, r22);
            if (arrayList != null) {
                arrayList.add(r0);
                return arrayList;
            }
            arrayList = AnonymousClass184.A0U(r0);
        }
        if (arrayList == null) {
            return C18460wS.A00;
        }
        return arrayList;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A0D(C17880vN.A0h(), this.A03, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSearchActionEvent {");
        AnonymousClass186.A00(this.A03, "bizSearchCount", A10);
        AnonymousClass186.A00(this.A00, "resultPageShown", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "searchAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "searchActionEntryPoint", A10);
        AnonymousClass186.A00(this.A04, "searchAiSuggestionCount", A10);
        AnonymousClass186.A00(this.A05, "searchChatsCount", A10);
        AnonymousClass186.A00(this.A06, "searchContactsCount", A10);
        AnonymousClass186.A00(this.A07, "searchFilterCount", A10);
        AnonymousClass186.A00(this.A08, "searchGroupsCount", A10);
        AnonymousClass186.A00(this.A09, "searchMessagesCount", A10);
        return AnonymousClass184.A0S(this.A0A, "selectedItemRank", A10);
    }
}
