package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ff  reason: invalid class name and case insensitive filesystem */
public final class C46612Ff extends AnonymousClass184 {
    public Boolean A00;
    public Long A01;
    public String A02;

    public C46612Ff() {
        super(2126, new C18180vt(1, 20, 200, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A02, A13), this.A01, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSuperpackDecompressionSuccess {");
        AnonymousClass186.A00(this.A02, "assetName", A10);
        AnonymousClass186.A00(this.A01, "decompressionT", A10);
        return AnonymousClass184.A0S(this.A00, "isMainThread", A10);
    }
}
