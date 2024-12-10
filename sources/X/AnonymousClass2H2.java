package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2H2  reason: invalid class name */
public final class AnonymousClass2H2 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public AnonymousClass2H2() {
        super(2296, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(15, this.A03);
        r3.CHf(14, this.A04);
        r3.CHf(13, this.A00);
        r3.CHf(4, this.A05);
        r3.CHf(2, this.A01);
        r3.CHf(7, this.A06);
        r3.CHf(8, this.A02);
        r3.CHf(1, this.A0A);
        r3.CHf(9, this.A07);
        r3.CHf(10, this.A08);
        r3.CHf(3, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0G(15, this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 6);
        A13.put(13, this.A00);
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A03(AnonymousClass184.A0E(AnonymousClass184.A0D(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A04(C17880vN.A0k(), this.A05, A13), this.A01, A13), this.A06, A13), this.A02, A13), (Object) null, A13), (Object) null, A13), this.A0A, A13), this.A07, A13), this.A08, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdBootstrapHistoryDataDownloaded {");
        AnonymousClass186.A00(this.A03, "historySyncChunkOrder", A10);
        AnonymousClass186.A00(this.A04, "historySyncStageProgress", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mdBootstrapHistoryPayloadType", A10);
        AnonymousClass186.A00(this.A05, "mdBootstrapPayloadSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mdBootstrapPayloadType", A10);
        AnonymousClass186.A00(this.A06, "mdBootstrapStepDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "mdBootstrapStepResult", A10);
        AnonymousClass186.A00(this.A0A, "mdSessionId", A10);
        AnonymousClass186.A00(this.A07, "mdStorageQuotaBytes", A10);
        AnonymousClass186.A00(this.A08, "mdStorageQuotaUsedBytes", A10);
        return AnonymousClass184.A0S(this.A09, "mdTimestamp", A10);
    }
}
