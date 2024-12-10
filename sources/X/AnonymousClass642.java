package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.642  reason: invalid class name */
public final class AnonymousClass642 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;

    public AnonymousClass642() {
        super(3688, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(12, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A08);
        r3.CHf(6, this.A09);
        r3.CHf(7, this.A05);
        r3.CHf(8, this.A06);
        r3.CHf(9, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0C(AnonymousClass184.A0D(AnonymousClass184.A06(C108975cc.A0T(AnonymousClass184.A0E(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), (Object) null, A13), (Object) null, A13), this.A08, A13), this.A09, A13), this.A05, A13), this.A06, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStatusViewerActions {");
        AnonymousClass186.A00(this.A00, "fullStatusViewed", A10);
        AnonymousClass186.A00(this.A01, "isFirstViewOfStatus", A10);
        AnonymousClass186.A00(this.A02, "isMentioned", A10);
        AnonymousClass186.A00(this.A03, "isPosterBiz", A10);
        AnonymousClass186.A00(this.A04, "isPosterInAddressBook", A10);
        AnonymousClass186.A00(this.A08, "statusId", A10);
        AnonymousClass186.A00(this.A09, "statusPosterJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "statusViewEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "statusViewerNonTrafficActionType", A10);
        return AnonymousClass184.A0S(this.A07, "statusViewerSessionId", A10);
    }
}
