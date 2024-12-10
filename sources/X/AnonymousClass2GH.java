package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GH  reason: invalid class name */
public final class AnonymousClass2GH extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;

    public AnonymousClass2GH() {
        super(3806, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A05);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(6, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A05);
        AnonymousClass184.A0X(A13, 7);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C17880vN.A0i(), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 8);
        A13.put(C17880vN.A0m(), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPnhDaily {");
        AnonymousClass186.A00(this.A05, "communityId", A10);
        AnonymousClass186.A00(this.A01, "pnhIndicatorClicksChat", A10);
        AnonymousClass186.A00(this.A02, "pnhIndicatorClicksInfoScreen", A10);
        AnonymousClass186.A00(this.A03, "reactionDeleteCount", A10);
        AnonymousClass186.A00(this.A04, "reactionOpenTrayCount", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "typeOfGroup", A10);
    }
}
