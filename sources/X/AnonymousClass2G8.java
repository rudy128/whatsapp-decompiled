package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2G8  reason: invalid class name */
public final class AnonymousClass2G8 extends AnonymousClass184 {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public String A04;

    public AnonymousClass2G8() {
        super(4608, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A03, A13), this.A00, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamReportConversationContext {");
        AnonymousClass186.A00(this.A01, "estimatedNumMessagesReceived", A10);
        AnonymousClass186.A00(this.A02, "estimatedNumMessagesSent", A10);
        AnonymousClass186.A00(this.A03, "estimatedTimeSinceFirstMessage", A10);
        AnonymousClass186.A00(this.A00, "isInAddressbook", A10);
        return AnonymousClass184.A0S(this.A04, "reportedJid", A10);
    }
}
