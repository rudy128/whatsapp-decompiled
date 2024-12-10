package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63M  reason: invalid class name */
public final class AnonymousClass63M extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;

    public AnonymousClass63M() {
        super(5768, new C18180vt(1, 10, 20, false), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A04, A13), this.A00, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStickerPackActions {");
        AnonymousClass186.A00(this.A02, "originPackId", A10);
        AnonymousClass186.A00(this.A03, "packId", A10);
        AnonymousClass186.A00(this.A04, "packName", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "packType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "stickerAction", A10);
    }
}
