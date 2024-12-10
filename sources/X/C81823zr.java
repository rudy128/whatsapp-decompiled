package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zr  reason: invalid class name and case insensitive filesystem */
public final class C81823zr extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;

    public C81823zr() {
        super(5948, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A06);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A03);
        r3.CHf(9, this.A07);
        r3.CHf(7, this.A04);
        r3.CHf(8, this.A05);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A06 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("app_session_id", "messaging_mega_journey", C18460wS.A00));
        } else {
            arrayList = null;
        }
        if (this.A02 == null) {
            arrayList = AnonymousClass184.A0V(AnonymousClass184.A00("messaging_mega_journey_action", "messaging_mega_journey", C18460wS.A00), arrayList);
        }
        if (this.A05 == null) {
            C59552mU A002 = AnonymousClass184.A00("user_journey_event_ms", "messaging_mega_journey", C18460wS.A00);
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
        A13.put(C17880vN.A0h(), this.A06);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A0B(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0j(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A07, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMessagingMegaJourney {");
        AnonymousClass186.A00(this.A06, "appSessionId", A10);
        AnonymousClass186.A00(this.A00, "containsUnreadMessages", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "lastUnreadMessageMediaType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "messagingMegaJourneyAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "messagingMegaJourneyEntryPoint", A10);
        AnonymousClass186.A00(this.A07, "unifiedSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "userJourneyChatType", A10);
        return AnonymousClass184.A0S(this.A05, "userJourneyEventMs", A10);
    }
}
