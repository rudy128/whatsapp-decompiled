package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fd  reason: invalid class name and case insensitive filesystem */
public final class C46592Fd extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public C46592Fd() {
        super(1846, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0i(), this.A00);
        AnonymousClass184.A0X(A13, 1);
        A13.put(C17880vN.A0k(), this.A01);
        AnonymousClass184.A0X(A13, 5);
        A13.put(C17880vN.A0j(), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStickerPackDelete {");
        AnonymousClass186.A00(this.A00, "stickerPackIsAvatar", A10);
        AnonymousClass186.A00(this.A01, "stickerPackIsLottie", A10);
        return AnonymousClass184.A0S(this.A02, "waAvatarSessionId", A10);
    }
}
