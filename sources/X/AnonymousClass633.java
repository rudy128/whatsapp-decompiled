package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.633  reason: invalid class name */
public final class AnonymousClass633 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A03);
    }

    public AnonymousClass633() {
        super(3266, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A02, A13), this.A01, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsPhoneNumberHyperlink {");
        AnonymousClass186.A00(this.A00, "isPhoneNumHyperlinkOwner", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "phoneNumHyperlinkAction", A10);
        AnonymousClass186.A00(this.A01, "phoneNumberStatusOnWa", A10);
        return AnonymousClass184.A0S(this.A03, "sequenceNumber", A10);
    }
}
