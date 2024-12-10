package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63g  reason: invalid class name and case insensitive filesystem */
public final class C1183863g extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;

    public C1183863g() {
        super(3676, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(8, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(6, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A08(AnonymousClass184.A03(AnonymousClass3MY.A0g(), this.A02, A13), this.A03, A13), this.A00, A13), this.A01, A13), this.A04, A13), this.A05, A13), this.A06);
        AnonymousClass184.A0X(A13, 7);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPollsActions {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "chatType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "groupSizeBucket", A10);
        AnonymousClass186.A00(this.A00, "isAGroup", A10);
        AnonymousClass186.A00(this.A01, "isAdmin", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "pollAction", A10);
        AnonymousClass186.A00(this.A05, "pollCreationDs", A10);
        return AnonymousClass184.A0S(this.A06, "pollOptionsCount", A10);
    }
}
