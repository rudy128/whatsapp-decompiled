package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8sS  reason: invalid class name and case insensitive filesystem */
public final class C171898sS extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;

    public C171898sS() {
        super(5976, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A06);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A05);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A01);
        r3.CHf(7, this.A07);
        r3.CHf(8, this.A04);
        r3.CHf(9, this.A08);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A02 == null) {
            arrayList = AnonymousClass8BR.A11(AnonymousClass184.A00("contact_type", "qbm_message_level_action", C18460wS.A00), new C59552mU[1], 0);
        } else {
            arrayList = null;
        }
        if (this.A03 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("message_action_entry_point", "qbm_message_level_action", C18460wS.A00), arrayList);
        }
        if (this.A01 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("message_has_url", "qbm_message_level_action", C18460wS.A00), arrayList);
        }
        if (this.A04 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("message_level_action", "qbm_message_level_action", C18460wS.A00), arrayList);
        }
        if (this.A08 == null) {
            C59552mU A002 = AnonymousClass184.A00("thread_id_hmac", "qbm_message_level_action", C18460wS.A00);
            if (arrayList != null) {
                arrayList.add(A002);
                return arrayList;
            }
            arrayList = AnonymousClass8BR.A11(A002, new C59552mU[1], 0);
        }
        if (arrayList == null) {
            return C18460wS.A00;
        }
        return arrayList;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C108975cc.A0S(C17880vN.A0h(), this.A06, A13), this.A02, A13), this.A05, A13), this.A00, A13), this.A03, A13), this.A01, A13), this.A07, A13), this.A04, A13), this.A08);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamQbmMessageLevelAction {");
        AnonymousClass186.A00(this.A06, "bizTrustTier", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "contactType", A10);
        AnonymousClass186.A00(this.A05, "deltaTimeReceived", A10);
        AnonymousClass186.A00(this.A00, "isInsubContact", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "messageActionEntryPoint", A10);
        AnonymousClass186.A00(this.A01, "messageHasUrl", A10);
        AnonymousClass186.A00(this.A07, "messageIdHmac", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "messageLevelAction", A10);
        return AnonymousClass184.A0S(this.A08, "threadIdHmac", A10);
    }
}
