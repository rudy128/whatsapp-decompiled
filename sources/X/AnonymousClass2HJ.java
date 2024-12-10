package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2HJ  reason: invalid class name */
public final class AnonymousClass2HJ extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public String A0F;
    public String A0G;

    public AnonymousClass2HJ() {
        super(1176, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A05);
        r3.CHf(16, this.A0A);
        r3.CHf(17, this.A0F);
        r3.CHf(13, this.A00);
        r3.CHf(11, this.A01);
        r3.CHf(2, this.A06);
        r3.CHf(12, this.A0B);
        r3.CHf(7, this.A07);
        r3.CHf(5, this.A0C);
        r3.CHf(18, this.A0G);
        r3.CHf(8, this.A02);
        r3.CHf(9, this.A03);
        r3.CHf(14, this.A04);
        r3.CHf(10, this.A0D);
        r3.CHf(4, this.A08);
        r3.CHf(3, this.A09);
        r3.CHf(1, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 19);
        A13.put(C17880vN.A0m(), this.A05);
        AnonymousClass184.A0X(A13, 15);
        A13.put(AnonymousClass184.A0J(16, this.A0A, A13), this.A0F);
        AnonymousClass184.A0X(A13, 20);
        A13.put(AnonymousClass184.A03(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A0C(AnonymousClass184.A0G(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A0K(AnonymousClass184.A07(AnonymousClass184.A09(AnonymousClass184.A0E(AnonymousClass184.A04(AnonymousClass184.A0D(13, this.A00, A13), this.A01, A13), this.A06, A13), this.A0B, A13), this.A07, A13), this.A0C, A13), this.A0G, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A0D, A13), this.A08, A13), this.A09, A13), this.A0E);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusPost {");
        AnonymousClass186.A00(C17900vP.A08(this.A05), "defaultStatusPrivacySetting", A10);
        AnonymousClass186.A00(this.A0A, "externalInteractables", A10);
        AnonymousClass186.A00(this.A0F, "externalPackageName", A10);
        AnonymousClass186.A00(this.A00, "isReshare", A10);
        AnonymousClass186.A00(this.A01, "isResultTerminal", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "mediaType", A10);
        AnonymousClass186.A00(this.A0B, "messageSendT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "perPostStatusPrivacySetting", A10);
        AnonymousClass186.A00(this.A0C, "retryCount", A10);
        AnonymousClass186.A00(this.A0G, "shareType", A10);
        AnonymousClass186.A00(this.A02, "statusAudienceSelectorClicked", A10);
        AnonymousClass186.A00(this.A03, "statusAudienceSelectorUpdated", A10);
        AnonymousClass186.A00(this.A04, "statusContainsMusic", A10);
        AnonymousClass186.A00(this.A0D, "statusMentionCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "statusPostOrigin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "statusPostResult", A10);
        return AnonymousClass184.A0S(this.A0E, "statusSessionId", A10);
    }
}
