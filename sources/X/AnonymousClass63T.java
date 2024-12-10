package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63T  reason: invalid class name */
public final class AnonymousClass63T extends AnonymousClass184 {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public AnonymousClass63T() {
        super(3916, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(2, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 6);
        A13.put(C108975cc.A0T(C108955ca.A0e(), this.A05, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAvatarHealth {");
        AnonymousClass186.A00(this.A01, "avatarHealthEventData", A10);
        AnonymousClass186.A00(this.A02, "avatarHealthEventExperiments", A10);
        AnonymousClass186.A00(this.A03, "avatarHealthEventFilters", A10);
        AnonymousClass186.A00(this.A04, "avatarHealthEventReason", A10);
        AnonymousClass186.A00(this.A05, "avatarHealthEventRevisionId", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "avatarHealthEventType", A10);
    }
}
