package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62t  reason: invalid class name and case insensitive filesystem */
public final class C1182562t extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public C1182562t() {
        super(5276, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 1);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(AnonymousClass184.A0A(AnonymousClass184.A09(C17880vN.A0i(), this.A00, A13), (Object) null, A13), (Object) null, A13), this.A01, A13), this.A02, A13), this.A03);
        AnonymousClass184.A0X(A13, 6);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAvatarMediaPickerSend {");
        AnonymousClass186.A00(this.A00, "avatarStickerOverlayCount", A10);
        AnonymousClass186.A00(this.A01, "chatRecipients", A10);
        AnonymousClass186.A00(this.A02, "countryAvatarStickerOverlayCount", A10);
        return AnonymousClass184.A0S(this.A03, "statusRecipients", A10);
    }
}
