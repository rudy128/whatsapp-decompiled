package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.64Z  reason: invalid class name */
public final class AnonymousClass64Z extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public String A0F;

    public AnonymousClass64Z() {
        super(5800, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A0F);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A06);
        r3.CHf(4, this.A07);
        r3.CHf(5, this.A00);
        r3.CHf(6, this.A08);
        r3.CHf(7, this.A09);
        r3.CHf(8, this.A0A);
        r3.CHf(10, this.A0B);
        r3.CHf(11, this.A01);
        r3.CHf(12, this.A02);
        r3.CHf(13, this.A0C);
        r3.CHf(15, this.A03);
        r3.CHf(16, this.A0D);
        r3.CHf(17, this.A04);
        r3.CHf(18, this.A0E);
    }

    public List validate() {
        ArrayList A0U;
        Long l = this.A0D;
        if (l == null || l.longValue() <= 0) {
            C18460wS r2 = C18460wS.A00;
            A0U = AnonymousClass184.A0U(new C59552mU("ai_voice_interaction", "voice_response_t > 0", r2, r2));
        } else {
            A0U = null;
        }
        if (this.A04 == null) {
            A0U = AnonymousClass184.A0V(new C59552mU("ai_voice_interaction", ".nonnull", C18460wS.A00, C18070vi.A0M("voice_response_type")), A0U);
        }
        Long l2 = this.A0E;
        if (l2 == null || l2.longValue() <= 0) {
            C18460wS r22 = C18460wS.A00;
            C59552mU r0 = new C59552mU("ai_voice_interaction", "voice_response_view_t > 0", r22, r22);
            if (A0U != null) {
                A0U.add(r0);
                return A0U;
            }
            A0U = AnonymousClass184.A0U(r0);
        }
        if (A0U == null) {
            return C18460wS.A00;
        }
        return A0U;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A0F, A13), this.A05, A13), this.A06, A13), this.A07, A13), this.A00, A13), this.A08, A13), this.A09, A13), this.A0A);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(10, this.A0B, A13), this.A01, A13), this.A02, A13), this.A0C);
        AnonymousClass184.A0X(A13, 14);
        A13.put(AnonymousClass184.A0K(AnonymousClass184.A0J(AnonymousClass184.A0I(AnonymousClass3MY.A0h(), this.A03, A13), this.A0D, A13), this.A04, A13), this.A0E);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAiVoiceInteraction {");
        AnonymousClass186.A00(this.A0F, "callRandomId", A10);
        AnonymousClass186.A00(this.A05, "imagineFetchErrorCode", A10);
        AnonymousClass186.A00(this.A06, "imagineFetchT", A10);
        AnonymousClass186.A00(this.A07, "jsonDeserializationErrorCode", A10);
        AnonymousClass186.A00(this.A00, "mutedVoiceOutput", A10);
        AnonymousClass186.A00(this.A08, "reelsCount", A10);
        AnonymousClass186.A00(this.A09, "reelsDownloadFailureCount", A10);
        AnonymousClass186.A00(this.A0A, "reelsDownloadSuccessCount", A10);
        AnonymousClass186.A00(this.A0B, "reelsFetchT", A10);
        AnonymousClass186.A00(this.A01, "reelsImageClicked", A10);
        AnonymousClass186.A00(this.A02, "searchClicked", A10);
        AnonymousClass186.A00(this.A0C, "searchCount", A10);
        AnonymousClass186.A00(this.A03, "voiceResponseShared", A10);
        AnonymousClass186.A00(this.A0D, "voiceResponseT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "voiceResponseType", A10);
        return AnonymousClass184.A0S(this.A0E, "voiceResponseViewT", A10);
    }
}
