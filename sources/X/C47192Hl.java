package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hl  reason: invalid class name and case insensitive filesystem */
public final class C47192Hl extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    public C47192Hl() {
        super(4630, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(11, this.A03);
        r3.CHf(4, this.A0A);
        r3.CHf(2, this.A0B);
        r3.CHf(8, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(5, this.A0C);
        r3.CHf(13, this.A0D);
        r3.CHf(16, this.A0E);
        r3.CHf(12, this.A00);
        r3.CHf(10, this.A01);
        r3.CHf(17, this.A07);
        r3.CHf(6, this.A06);
        r3.CHf(14, this.A08);
        r3.CHf(15, this.A09);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A0B == null) {
            arrayList = AnonymousClass184.A0U(new C59552mU("bot_journey", ".nonnull \"app_session_id\"", C18460wS.A00, C18070vi.A0M("app_session_id")));
        } else {
            arrayList = null;
        }
        if (this.A02 == null) {
            arrayList = AnonymousClass184.A0V(new C59552mU("bot_journey", ".nonnull \"action_type\"", C18460wS.A00, C18070vi.A0M("action_type")), arrayList);
        }
        if (this.A05 == null) {
            C59552mU r0 = new C59552mU("bot_journey", ".nonnull \"bot_entry_point\"", C18460wS.A00, C18070vi.A0M("bot_entry_point"));
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
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A0I(AnonymousClass184.A0F(AnonymousClass184.A07(AnonymousClass184.A09(AnonymousClass184.A0A(AnonymousClass184.A04(AnonymousClass184.A06(AnonymousClass184.A0D(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A0A, A13), this.A0B, A13), this.A04, A13), this.A05, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A00);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A08(AnonymousClass184.A0J(10, this.A01, A13), this.A07, A13), this.A06, A13), this.A08, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBotJourney {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "actionType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "additionalCategory", A10);
        AnonymousClass186.A00(this.A0A, "aiDiscoveryTab", A10);
        AnonymousClass186.A00(this.A0B, "appSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "botDiscoveryPath", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "botEntryPoint", A10);
        AnonymousClass186.A00(this.A0C, "botPersonaId", A10);
        AnonymousClass186.A00(this.A0D, "callRandomId", A10);
        AnonymousClass186.A00(this.A0E, "deviceLanguage", A10);
        AnonymousClass186.A00(this.A00, "isMetaAiAssistant", A10);
        AnonymousClass186.A00(this.A01, "isUserCreatedAgent", A10);
        AnonymousClass186.A00(this.A07, "metricCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "uiSurface", A10);
        AnonymousClass186.A00(this.A08, "xmaReelIndex", A10);
        return AnonymousClass184.A0S(this.A09, "xmaReelMaxIndex", A10);
    }
}
