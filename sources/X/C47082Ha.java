package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Ha  reason: invalid class name and case insensitive filesystem */
public final class C47082Ha extends AnonymousClass184 {
    public Integer A00;
    public String A01;
    public String A02;

    public C47082Ha() {
        super(4920, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("block_flow_action", "blocking_funnel", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A01 == null) {
            C59552mU A002 = AnonymousClass184.A00("block_funnel_entry_point", "blocking_funnel", C18460wS.A00);
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
        A13.put(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBlockingFunnel {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "blockFlowAction", A10);
        AnonymousClass186.A00(this.A01, "blockFunnelEntryPoint", A10);
        return AnonymousClass184.A0S(this.A02, "hashedBlockedConversationJids", A10);
    }
}
