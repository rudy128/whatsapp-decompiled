package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.635  reason: invalid class name */
public final class AnonymousClass635 extends AnonymousClass184 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;

    public AnonymousClass635() {
        super(2740, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A02);
        r3.CHf(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A06(C108975cc.A0T(C17880vN.A0i(), this.A01, A13), this.A03, A13), this.A02, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStickerCommonQueryToStaticServer {");
        AnonymousClass186.A00(this.A01, "httpResponseCode", A10);
        AnonymousClass186.A00(this.A03, "params", A10);
        AnonymousClass186.A00(this.A02, "queryLatencyMs", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A00), "queryType", A10);
    }
}
