package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GX  reason: invalid class name */
public final class AnonymousClass2GX extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public AnonymousClass2GX() {
        super(3904, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A06);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A01, A13), this.A02, A13), this.A06, A13), this.A00);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0l(), this.A03, A13), this.A04, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamNonMessagePeerDataOperationResponse {");
        AnonymousClass186.A00(this.A01, "peerDataErrorCount", A10);
        AnonymousClass186.A00(this.A02, "peerDataNotFoundCount", A10);
        AnonymousClass186.A00(this.A06, "peerDataRequestSessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "peerDataRequestType", A10);
        AnonymousClass186.A00(this.A03, "peerDataResponseCount", A10);
        AnonymousClass186.A00(this.A04, "peerDataSuccessProcessCount", A10);
        return AnonymousClass184.A0S(this.A05, "peerDataSuccessResponseCount", A10);
    }
}
