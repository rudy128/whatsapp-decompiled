package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63R  reason: invalid class name */
public final class AnonymousClass63R extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;

    public AnonymousClass63R() {
        super(3160, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(9, this.A05);
        r3.CHf(8, this.A03);
        r3.CHf(10, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A05);
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A0C(AnonymousClass3MY.A0g(), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidContactListStartNewChat {");
        AnonymousClass186.A00(this.A00, "androidContactListStartNewChatFrequentlyContacted", A10);
        AnonymousClass186.A00(this.A01, "androidContactListStartNewChatSearch", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "androidContactListStartNewChatType", A10);
        AnonymousClass186.A00(this.A05, "contactPosition", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "suggestedContactsSection", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A04), "uiActionSource", A10);
    }
}
