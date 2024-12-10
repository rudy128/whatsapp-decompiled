package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.638  reason: invalid class name */
public final class AnonymousClass638 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;

    public AnonymousClass638() {
        super(2588, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(3, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(AnonymousClass184.A06(AnonymousClass184.A03(C17880vN.A0i(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamThirdPartyPackImport {");
        AnonymousClass186.A00(this.A00, "animated", A10);
        AnonymousClass186.A00(this.A01, "importSuccess", A10);
        AnonymousClass186.A00(this.A02, "stickerCount", A10);
        return AnonymousClass184.A0S(this.A03, "totalSizeIn10Kb", A10);
    }
}
