package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zY  reason: invalid class name and case insensitive filesystem */
public final class C81633zY extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C81633zY() {
        super(3398, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A02, A13), this.A00, A13), this.A01, A13), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A0A(7, this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDisappearingMessageChatPicker {");
        AnonymousClass186.A00(this.A02, "chatsSelected", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "dmChatPickerEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "dmChatPickerEventName", A10);
        AnonymousClass186.A00(this.A03, "ephemeralityDuration", A10);
        AnonymousClass186.A00(this.A04, "groupChatsSelected", A10);
        AnonymousClass186.A00(this.A05, "newlyEphemeralChats", A10);
        return AnonymousClass184.A0S(this.A06, "totalChatsInChatPicker", A10);
    }
}
