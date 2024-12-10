package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GE  reason: invalid class name */
public final class AnonymousClass2GE extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;

    public AnonymousClass2GE() {
        super(2998, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(3, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(1, this.A05);
        r3.CHf(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A03(AnonymousClass184.A04(AnonymousClass184.A05(AnonymousClass184.A07(C17880vN.A0m(), this.A02, A13), this.A03, A13), this.A00, A13), this.A01, A13), this.A05, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdBootstrapHistoryDataReceived {");
        AnonymousClass186.A00(this.A02, "historySyncChunkOrder", A10);
        AnonymousClass186.A00(this.A03, "historySyncStageProgress", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mdBootstrapHistoryPayloadType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mdBootstrapPayloadType", A10);
        AnonymousClass186.A00(this.A05, "mdSessionId", A10);
        return AnonymousClass184.A0S(this.A04, "mdTimestamp", A10);
    }
}
