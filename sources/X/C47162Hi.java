package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hi  reason: invalid class name and case insensitive filesystem */
public final class C47162Hi extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;

    public C47162Hi() {
        super(4628, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(15, this.A02);
        r3.CHf(11, this.A03);
        r3.CHf(10, this.A07);
        r3.CHf(7, this.A04);
        r3.CHf(8, this.A05);
        r3.CHf(12, this.A06);
        r3.CHf(9, this.A08);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0U(new C59552mU("bot_interaction", ".nonnull \"agent_engagement_type\"", C18460wS.A00, C18070vi.A0M("agent_engagement_type")));
        } else {
            arrayList = null;
        }
        if (this.A05 == null) {
            arrayList = AnonymousClass184.A0V(new C59552mU("bot_interaction", ".nonnull \"message_type\"", C18460wS.A00, C18070vi.A0M("message_type")), arrayList);
        }
        if (this.A04 == null) {
            arrayList = AnonymousClass184.A0V(new C59552mU("bot_interaction", ".nonnull \"message_media_type\"", C18460wS.A00, C18070vi.A0M("message_media_type")), arrayList);
        }
        if (this.A07 == null) {
            arrayList = AnonymousClass184.A0V(new C59552mU("bot_interaction", ".nonnull \"interaction_ts\"", C18460wS.A00, C18070vi.A0M("interaction_ts")), arrayList);
        }
        if (this.A03 == null) {
            arrayList = AnonymousClass184.A0V(new C59552mU("bot_interaction", ".nonnull \"bot_type\"", C18460wS.A00, C18070vi.A0M("bot_type")), arrayList);
        }
        if (this.A08 == null) {
            C59552mU r0 = new C59552mU("bot_interaction", ".nonnull \"request_id\"", C18460wS.A00, C18070vi.A0M("request_id"));
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
        A13.put(AnonymousClass184.A0C(AnonymousClass184.A0D(AnonymousClass184.A0H(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A07);
        AnonymousClass184.A0X(A13, 16);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0B(AnonymousClass184.A0E(AnonymousClass184.A0A(7, this.A04, A13), this.A05, A13), this.A06, A13), this.A08, A13), (Object) null);
        C17880vN.A1O((Object) null, A13, 14);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBotInteraction {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "agentEngagementType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "botInteractionStage", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "botRequestSessionSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "botType", A10);
        AnonymousClass186.A00(this.A07, "interactionTs", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "messageMediaType", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A05), A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "modelType", A10);
        return AnonymousClass184.A0S(this.A08, "requestId", A10);
    }
}
