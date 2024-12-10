package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rk  reason: invalid class name and case insensitive filesystem */
public final class C171458rk extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C171458rk() {
        super(3062, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(9, this.A01);
        r3.CHf(10, this.A02);
        r3.CHf(3, this.A00);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(2, this.A06);
        r3.CHf(8, this.A07);
        r3.CHf(4, this.A05);
        r3.CHf(7, this.A08);
        r3.CHf(1, this.A09);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A09(AnonymousClass184.A06(AnonymousClass184.A0A(C108975cc.A0S(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A05(AnonymousClass184.A0C(C108955ca.A0f(), this.A01, A13), this.A02, A13), this.A00, A13), this.A03, A13), this.A04, A13), this.A06, A13), this.A07, A13), this.A05, A13), this.A08, A13), this.A09);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamDirectorySearchConsumerServerErrors {");
        AnonymousClass186.A00(this.A01, "directorySearchAcsErrorCode", A10);
        AnonymousClass186.A00(this.A02, "directorySearchAcsTokenNotReadyReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "directorySearchCallType", A10);
        AnonymousClass186.A00(this.A03, "directorySearchErrorApiErrorCode", A10);
        AnonymousClass186.A00(this.A04, "directorySearchErrorApiErrorSubCode", A10);
        AnonymousClass186.A00(this.A06, "directorySearchErrorEntrypoint", A10);
        AnonymousClass186.A00(this.A07, "directorySearchErrorFbtraceId", A10);
        AnonymousClass186.A00(this.A05, "directorySearchErrorHttpResponseCode", A10);
        AnonymousClass186.A00(this.A08, "directorySearchErrorMessage", A10);
        return AnonymousClass184.A0S(this.A09, "directorySessionId", A10);
    }
}
