package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hb  reason: invalid class name and case insensitive filesystem */
public final class C47092Hb extends AnonymousClass184 {
    public Long A00;
    public String A01;
    public String A02;

    public C47092Hb() {
        super(6086, AnonymousClass184.A01(), 0, -1);
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
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("blockee_wid", "ctwa_blocks_discovery_entry_point", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A02 == null) {
            C59552mU A002 = AnonymousClass184.A00("ctwa_thread_entry_point", "ctwa_blocks_discovery_entry_point", C18460wS.A00);
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
        A10.append("WamCtwaBlocksDiscoveryEntryPoint {");
        AnonymousClass186.A00(this.A00, "blockeeWid", A10);
        AnonymousClass186.A00(this.A01, "ctwaAdId", A10);
        return AnonymousClass184.A0S(this.A02, "ctwaThreadEntryPoint", A10);
    }
}
