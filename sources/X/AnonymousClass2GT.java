package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GT  reason: invalid class name */
public final class AnonymousClass2GT extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(1, this.A05);
        r3.CHf(7, this.A06);
    }

    public AnonymousClass2GT() {
        super(2176, AnonymousClass184.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A03(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(C17880vN.A0i(), this.A01, A13), this.A02, A13), this.A00, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMdBadDeviceSentMessage {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "dsmError", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "editType", A10);
        AnonymousClass186.A00(this.A00, "isLid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "mediaType", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A04), A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "peerType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A06), "revokeType", A10);
    }
}
