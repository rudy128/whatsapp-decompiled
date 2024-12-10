package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2HZ  reason: invalid class name */
public final class AnonymousClass2HZ extends AnonymousClass184 {
    public Integer A00;
    public Long A01;

    public AnonymousClass2HZ() {
        super(5296, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
    }

    public List validate() {
        ArrayList arrayList;
        Long l;
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0U(new C59552mU("search_bar_engagement", ".nonnull", C18460wS.A00, C18070vi.A0M("search_bar_action")));
        } else {
            arrayList = null;
        }
        Integer num = this.A00;
        if (num != null && num.intValue() == 2 && ((l = this.A01) == null || l.longValue() <= 0)) {
            C18460wS r2 = C18460wS.A00;
            C59552mU r0 = new C59552mU("search_bar_engagement", "search_open_duration > 0", r2, r2);
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
        A13.put(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSearchBarEngagement {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "searchBarAction", A10);
        return AnonymousClass184.A0S(this.A01, "searchOpenDuration", A10);
    }
}
