package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64O  reason: invalid class name */
public final class AnonymousClass64O extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
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
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public String A0I;
    public String A0J;
    public String A0K;

    public AnonymousClass64O() {
        super(4660, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(12, this.A0I);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A0J);
        r3.CHf(20, this.A06);
        r3.CHf(21, this.A07);
        r3.CHf(18, this.A08);
        r3.CHf(19, this.A09);
        r3.CHf(6, this.A0A);
        r3.CHf(7, this.A0B);
        r3.CHf(8, this.A0C);
        r3.CHf(9, this.A0D);
        r3.CHf(13, this.A0E);
        r3.CHf(14, this.A0F);
        r3.CHf(10, this.A0G);
        r3.CHf(11, this.A0H);
        r3.CHf(15, this.A02);
        r3.CHf(17, this.A0K);
        r3.CHf(16, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0I(AnonymousClass184.A0J(AnonymousClass184.A0H(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A0L(AnonymousClass184.A0K(AnonymousClass184.A0N(AnonymousClass184.A0M(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A0E(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A04, A13), this.A05, A13), this.A0I, A13), this.A01, A13), this.A0J, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C, A13), this.A0D, A13), this.A0E, A13), this.A0F, A13), this.A0G, A13), this.A0H, A13), this.A02, A13), this.A0K, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSelectParticipantFromPicker {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "addParticipantPickerResult", A10);
        AnonymousClass186.A00(this.A04, "adhocIndex", A10);
        AnonymousClass186.A00(this.A05, "adhocTotal", A10);
        AnonymousClass186.A00(this.A0I, "appSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "callParticipantSelectSource", A10);
        AnonymousClass186.A00(this.A0J, "callRandomId", A10);
        AnonymousClass186.A00(this.A06, "favoritesGroupIndex", A10);
        AnonymousClass186.A00(this.A07, "favoritesGroupTotal", A10);
        AnonymousClass186.A00(this.A08, "favoritesIndex", A10);
        AnonymousClass186.A00(this.A09, "favoritesTotal", A10);
        AnonymousClass186.A00(this.A0A, "groupChatIndex", A10);
        AnonymousClass186.A00(this.A0B, "groupChatTotal", A10);
        AnonymousClass186.A00(this.A0C, "lgcIndex", A10);
        AnonymousClass186.A00(this.A0D, "lgcTotal", A10);
        AnonymousClass186.A00(this.A0E, "oneOnOneIndex", A10);
        AnonymousClass186.A00(this.A0F, "oneOnOneTotal", A10);
        AnonymousClass186.A00(this.A0G, "starredIndex", A10);
        AnonymousClass186.A00(this.A0H, "starredTotal", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "subSurface", A10);
        AnonymousClass186.A00(this.A0K, "suggestionSessionId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "uiSurface", A10);
    }
}
