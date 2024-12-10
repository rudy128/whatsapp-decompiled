package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GR  reason: invalid class name */
public final class AnonymousClass2GR extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public AnonymousClass2GR() {
        super(4752, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(6, this.A04);
        r3.CHf(9, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A03, A13), this.A05, A13), this.A06, A13), this.A04, A13), this.A00);
        AnonymousClass184.A0X(A13, 8);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDefaultSubGroupCommentsDailyStats {");
        AnonymousClass186.A00(this.A01, "accumulatedComments", A10);
        AnonymousClass186.A00(this.A02, "cagMessageSentDs", A10);
        AnonymousClass186.A00(this.A03, "commentDeletes", A10);
        AnonymousClass186.A00(this.A05, "commentParentGroupId", A10);
        AnonymousClass186.A00(this.A06, "commentSpaceId", A10);
        AnonymousClass186.A00(this.A04, "comments", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "groupSizeBucket", A10);
    }
}
