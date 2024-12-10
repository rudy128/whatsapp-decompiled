package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gh  reason: invalid class name and case insensitive filesystem */
public final class C46892Gh extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C46892Gh() {
        super(2294, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A02);
        r3.CHf(2, this.A00);
        r3.CHf(6, this.A03);
        r3.CHf(7, this.A01);
        r3.CHf(1, this.A07);
        r3.CHf(8, this.A04);
        r3.CHf(9, this.A05);
        r3.CHf(3, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A04(AnonymousClass184.A06(AnonymousClass184.A0D(C17880vN.A0l(), (Object) null, A13), (Object) null, A13), this.A02, A13), this.A00, A13), this.A03, A13), this.A01);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A05(AnonymousClass184.A0B(AnonymousClass184.A0A(C17880vN.A0h(), this.A07, A13), this.A04, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdBootstrapAppStateDataDownloaded {");
        AnonymousClass186.A00(this.A02, "mdBootstrapPayloadSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mdBootstrapPayloadType", A10);
        AnonymousClass186.A00(this.A03, "mdBootstrapStepDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "mdBootstrapStepResult", A10);
        AnonymousClass186.A00(this.A07, "mdSessionId", A10);
        AnonymousClass186.A00(this.A04, "mdStorageQuotaBytes", A10);
        AnonymousClass186.A00(this.A05, "mdStorageQuotaUsedBytes", A10);
        return AnonymousClass184.A0S(this.A06, "mdTimestamp", A10);
    }
}
