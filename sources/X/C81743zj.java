package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zj  reason: invalid class name and case insensitive filesystem */
public final class C81743zj extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;

    public C81743zj() {
        super(3124, new C18180vt(1, 1, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(11, this.A06);
        r3.CHf(12, this.A07);
        r3.CHf(13, this.A08);
        r3.CHf(14, this.A09);
        r3.CHf(15, this.A0A);
        r3.CHf(16, this.A0B);
        r3.CHf(17, this.A0C);
        r3.CHf(18, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(C17880vN.A0i(), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 4);
        A13.put(C17880vN.A0l(), this.A02);
        AnonymousClass184.A0X(A13, 20);
        A13.put(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0h(), this.A03, A13), this.A04, A13), this.A05, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A);
        A13.put(16, this.A0B);
        A13.put(17, this.A0C);
        A13.put(18, this.A0D);
        AnonymousClass184.A0X(A13, 19);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamContactInfo {");
        AnonymousClass186.A00(this.A00, "avatar", A10);
        AnonymousClass186.A00(this.A01, "blockContact", A10);
        AnonymousClass186.A00(this.A02, "contactDetails", A10);
        AnonymousClass186.A00(this.A03, "contactInfoVisit", A10);
        AnonymousClass186.A00(this.A04, "disappearingMessages", A10);
        AnonymousClass186.A00(this.A05, "encryption", A10);
        AnonymousClass186.A00(this.A06, "mute", A10);
        AnonymousClass186.A00(this.A07, "payments", A10);
        AnonymousClass186.A00(this.A08, "reportContact", A10);
        AnonymousClass186.A00(this.A09, "search", A10);
        AnonymousClass186.A00(this.A0A, "shareContact", A10);
        AnonymousClass186.A00(this.A0B, "starredMessages", A10);
        AnonymousClass186.A00(this.A0C, "videoCall", A10);
        return AnonymousClass184.A0S(this.A0D, "voiceCall", A10);
    }
}
