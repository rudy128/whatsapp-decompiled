package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fj  reason: invalid class name and case insensitive filesystem */
public final class C46652Fj extends AnonymousClass184 {
    public Double A00;
    public Double A01;
    public Double A02;
    public String A03;

    public C46652Fj() {
        super(4602, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A03, A13), this.A00, A13), this.A01, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBlockConversationContext {");
        AnonymousClass186.A00(this.A03, "blockedJid", A10);
        AnonymousClass186.A00(this.A00, "estimatedNumMessagesReceived", A10);
        AnonymousClass186.A00(this.A01, "estimatedNumMessagesSent", A10);
        return AnonymousClass184.A0S(this.A02, "estimatedTimeSinceFirstMessage", A10);
    }
}
