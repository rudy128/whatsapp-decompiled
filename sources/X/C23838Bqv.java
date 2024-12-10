package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqv  reason: case insensitive filesystem */
public final class C23838Bqv extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;

    public C23838Bqv() {
        super(2130, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(3, this.A08);
        r3.CHf(6, this.A00);
        r3.CHf(8, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(9, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A04(AnonymousClass184.A03(AnonymousClass184.A09(AnonymousClass184.A0A(AnonymousClass184.A08(AnonymousClass184.A05(AnonymousClass184.A07(C17880vN.A0k(), this.A05, A13), this.A06, A13), this.A08, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidInviteEvent {");
        AnonymousClass186.A00(this.A05, "inviteAddressbookSize", A10);
        AnonymousClass186.A00(this.A06, "inviteAddressbookWhatsappSize", A10);
        AnonymousClass186.A00(this.A08, "inviteAppName", A10);
        AnonymousClass186.A00(this.A00, "inviteContactPermissionDisabled", A10);
        AnonymousClass186.A00(this.A01, "inviteContactWithMultiplePhoneNumbersClicked", A10);
        AnonymousClass186.A00(this.A02, "inviteContactWithMultiplePhoneNumbersExists", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "inviteEventType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "inviteSource", A10);
        return AnonymousClass184.A0S(this.A07, "totalUniqueInvitesCount", A10);
    }
}
