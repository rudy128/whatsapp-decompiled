package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GQ  reason: invalid class name */
public final class AnonymousClass2GQ extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Long A06;

    public AnonymousClass2GQ() {
        super(3138, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A06);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(1, this.A04);
        r3.CHf(10, this.A05);
        r3.CHf(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(C17880vN.A0i(), this.A06, A13), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A0C(AnonymousClass184.A03(AnonymousClass184.A0B(AnonymousClass184.A0A(C17880vN.A0l(), this.A02, A13), (Object) null, A13), (Object) null, A13), this.A04, A13), this.A05, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamConversationsNuxUiAction {");
        AnonymousClass186.A00(this.A06, "contactPosition", A10);
        AnonymousClass186.A00(this.A00, "favorited", A10);
        AnonymousClass186.A00(this.A01, "frequentlyContacted", A10);
        AnonymousClass186.A00(this.A02, "presence", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "uiActionSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "uiSurface", A10);
        return AnonymousClass184.A0S(this.A03, "withProfilePic", A10);
    }
}
