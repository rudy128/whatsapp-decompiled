package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zX  reason: invalid class name and case insensitive filesystem */
public final class C81623zX extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(11, this.A05);
        r3.CHf(2, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(6, this.A00);
        r3.CHf(7, this.A01);
        r3.CHf(8, this.A02);
        r3.CHf(15, this.A06);
    }

    public C81623zX() {
        super(4362, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 10);
        A13.put(11, this.A05);
        AnonymousClass184.A0X(A13, 1);
        A13.put(C17880vN.A0i(), this.A03);
        A13.put(AnonymousClass184.A0E(AnonymousClass184.A06(AnonymousClass184.A05(16, (Object) null, A13), (Object) null, A13), this.A04, A13), (Object) null);
        A13.put(AnonymousClass184.A0H(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0G(AnonymousClass184.A0F(17, (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A06);
        AnonymousClass184.A0X(A13, 9);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamBizTrustSignalCard {");
        AnonymousClass186.A00(this.A05, "bizCardId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "bizTrustSignalCardEventType", A10);
        AnonymousClass186.A00(this.A04, "businessPhoneNumber", A10);
        AnonymousClass186.A00(this.A00, "shownFacebookLikes", A10);
        AnonymousClass186.A00(this.A01, "shownInstagramFollowers", A10);
        AnonymousClass186.A00(this.A02, "shownJoinDate", A10);
        return AnonymousClass184.A0S(this.A06, "threadIdHmac", A10);
    }
}
