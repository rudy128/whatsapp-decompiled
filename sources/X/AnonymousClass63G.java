package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63G  reason: invalid class name */
public final class AnonymousClass63G extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public AnonymousClass63G() {
        super(4080, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(7, this.A03);
        r3.CHf(3, this.A02);
        r3.CHf(6, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(AnonymousClass184.A09(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A03, A13), this.A02, A13), (Object) null, A13), (Object) null, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamClientExpiry {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "clientExpiryActionType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "clientExpiryButtonName", A10);
        AnonymousClass186.A00(this.A03, "clientExpiryExpirationTimestamp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "clientExpiryScreenType", A10);
        return AnonymousClass184.A0S(this.A04, "numDaysToExpiry", A10);
    }
}
