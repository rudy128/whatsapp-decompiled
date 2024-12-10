package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8r6  reason: invalid class name and case insensitive filesystem */
public final class C171058r6 extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(5, this.A00);
        r3.CHf(4, this.A03);
        r3.CHf(2, this.A04);
    }

    public C171058r6() {
        super(3764, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(AnonymousClass184.A06(AnonymousClass184.A07(AnonymousClass184.A03(C17880vN.A0j(), this.A01, A13), this.A02, A13), this.A00, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBusinessTemplateMessageNotificationStats {");
        AnonymousClass186.A00(this.A01, "businessMessageSentTs", A10);
        AnonymousClass186.A00(this.A02, "businessPhoneNumber", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "contactType", A10);
        AnonymousClass186.A00(this.A03, "messageDeliveredTs", A10);
        return AnonymousClass184.A0S(this.A04, "templateId", A10);
    }
}
