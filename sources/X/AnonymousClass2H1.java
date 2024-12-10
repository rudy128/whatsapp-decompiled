package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2H1  reason: invalid class name */
public final class AnonymousClass2H1 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public AnonymousClass2H1() {
        super(2298, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A02);
        r3.CHf(14, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(10, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(2, this.A05);
        r3.CHf(6, this.A08);
        r3.CHf(1, this.A0A);
        r3.CHf(4, this.A09);
        r3.CHf(13, this.A00);
        r3.CHf(7, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0G(C17880vN.A0l(), this.A02, A13), this.A06, A13), this.A07);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A0F(AnonymousClass184.A06(AnonymousClass184.A03(AnonymousClass184.A0B(AnonymousClass184.A0E(AnonymousClass184.A08(AnonymousClass184.A04(AnonymousClass184.A05(10, this.A03, A13), this.A04, A13), this.A05, A13), this.A08, A13), (Object) null, A13), (Object) null, A13), this.A0A, A13), this.A09, A13), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdBootstrapDataApplied {");
        AnonymousClass186.A00(C17900vP.A08(this.A02), "collection", A10);
        AnonymousClass186.A00(this.A06, "historySyncChunkOrder", A10);
        AnonymousClass186.A00(this.A07, "historySyncStageProgress", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "mdBootstrapHistoryPayloadType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "mdBootstrapPayloadType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "mdBootstrapSource", A10);
        AnonymousClass186.A00(this.A08, "mdBootstrapStepDuration", A10);
        AnonymousClass186.A00(this.A0A, "mdSessionId", A10);
        AnonymousClass186.A00(this.A09, "mdTimestamp", A10);
        AnonymousClass186.A00(this.A00, "sentViaMms", A10);
        return AnonymousClass184.A0S(this.A01, "usedSnapshot", A10);
    }
}
