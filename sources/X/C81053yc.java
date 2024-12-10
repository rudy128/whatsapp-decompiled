package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3yc  reason: invalid class name and case insensitive filesystem */
public final class C81053yc extends AnonymousClass184 {
    public Boolean A00;

    public C81053yc() {
        super(5310, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPrivacySettingDisableLinkPreviewsDaily {");
        return AnonymousClass184.A0S(this.A00, "previewsDisabled", A10);
    }
}
