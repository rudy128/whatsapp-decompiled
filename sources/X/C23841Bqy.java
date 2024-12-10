package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqy  reason: case insensitive filesystem */
public final class C23841Bqy extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Long A0C;
    public String A0D;

    public C23841Bqy() {
        super(2184, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A07);
        r3.CHf(4, this.A0D);
        r3.CHf(2, this.A08);
        r3.CHf(21, this.A09);
        r3.CHf(18, this.A0A);
        r3.CHf(10, this.A00);
        r3.CHf(12, this.A01);
        r3.CHf(20, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(14, this.A04);
        r3.CHf(15, this.A05);
        r3.CHf(3, this.A0C);
        r3.CHf(17, this.A06);
        r3.CHf(19, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0K(AnonymousClass184.A0N(AnonymousClass184.A04(AnonymousClass184.A06(C17880vN.A0h(), this.A07, A13), this.A0D, A13), this.A08, A13), this.A09, A13), this.A0A);
        AnonymousClass184.A0X(A13, 6);
        A13.put(10, this.A00);
        AnonymousClass184.A0X(A13, 11);
        A13.put(AnonymousClass184.A0G(AnonymousClass184.A09(AnonymousClass184.A0F(AnonymousClass184.A07(AnonymousClass184.A0M(12, this.A01, A13), this.A02, A13), this.A03, A13), (Object) null, A13), (Object) null, A13), this.A04);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A0L(AnonymousClass184.A0B(AnonymousClass184.A0I(AnonymousClass184.A0J(AnonymousClass184.A05(15, this.A05, A13), this.A0C, A13), this.A06, A13), (Object) null, A13), (Object) null, A13), this.A0B);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidAddContactEvent {");
        AnonymousClass186.A00(C17900vP.A08(this.A07), "addContactEventType", A10);
        AnonymousClass186.A00(this.A0D, "addContactSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "addContactSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "contactSaveErrorCause", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A0A), "contactSaveResult", A10);
        AnonymousClass186.A00(this.A00, "fnameEdited", A10);
        AnonymousClass186.A00(this.A01, "isContactSyncToOs", A10);
        AnonymousClass186.A00(this.A02, "isNativeContactsOn", A10);
        AnonymousClass186.A00(this.A03, "isWhatsappContact", A10);
        AnonymousClass186.A00(this.A04, "lnameEdited", A10);
        AnonymousClass186.A00(this.A05, "phNumberEdited", A10);
        AnonymousClass186.A00(this.A0C, "phoneContactCount", A10);
        AnonymousClass186.A00(this.A06, "syncToggleEdit", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0B), "waContactStatus", A10);
    }
}
