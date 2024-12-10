package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hc  reason: invalid class name and case insensitive filesystem */
public final class C47102Hc extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public C47102Hc() {
        super(6018, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A01);
    }

    public List validate() {
        ArrayList arrayList;
        if (this.A00 == null) {
            arrayList = AnonymousClass184.A0U(AnonymousClass184.A00("custom_packs_action", "custom_packs_actions", C18460wS.A00));
        } else {
            arrayList = null;
        }
        C18460wS r2 = C18460wS.A00;
        ArrayList A0V = AnonymousClass184.A0V(AnonymousClass184.A00("is_success", "custom_packs_actions", r2), arrayList);
        if (this.A02 == null) {
            A0V.add(AnonymousClass184.A00("num_sticker_in_pack", "custom_packs_actions", r2));
        }
        return A0V;
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A00);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A06(C17880vN.A0j(), this.A02, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCustomPacksActions {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "customPacksAction", A10);
        AnonymousClass186.A00(this.A02, "numStickerInPack", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "stickerPackActionSurface", A10);
    }
}
