package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zW  reason: invalid class name and case insensitive filesystem */
public final class C81613zW extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;

    public C81613zW() {
        super(3980, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A06);
        r3.CHf(9, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A00);
        r3.CHf(7, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A0B(C17880vN.A0h(), this.A06, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A00);
        AnonymousClass184.A0X(A13, 6);
        A13.put(7, this.A05);
        AnonymousClass184.A0X(A13, 8);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAttachmentTrayActions {");
        AnonymousClass186.A00(this.A06, "actionDurationMs", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "actionThreadType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "attachmentTrayAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "attachmentTrayActionTarget", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "groupSizeBucket", A10);
        AnonymousClass186.A00(this.A00, "isAGroup", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A05), "sendMediaType", A10);
    }
}
