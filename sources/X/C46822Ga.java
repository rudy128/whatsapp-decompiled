package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ga  reason: invalid class name and case insensitive filesystem */
public final class C46822Ga extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;

    public C46822Ga() {
        super(1842, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A05);
        r3.CHf(5, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(6, this.A02);
        r3.CHf(8, this.A03);
        r3.CHf(9, this.A04);
        r3.CHf(7, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(C17880vN.A0h(), this.A05, A13), this.A00);
        AnonymousClass184.A0X(A13, 3);
        A13.put(C17880vN.A0k(), this.A01);
        AnonymousClass184.A0X(A13, 2);
        A13.put(C17880vN.A0m(), this.A02);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A09(AnonymousClass184.A0B(8, this.A03, A13), this.A04, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStickerAddToFavorite {");
        AnonymousClass186.A00(C17900vP.A08(this.A05), "stickerAddToFavoriteOrigin", A10);
        AnonymousClass186.A00(this.A00, "stickerIsAi", A10);
        AnonymousClass186.A00(this.A01, "stickerIsAvatar", A10);
        AnonymousClass186.A00(this.A02, "stickerIsFromStickerMaker", A10);
        AnonymousClass186.A00(this.A03, "stickerIsGiphy", A10);
        AnonymousClass186.A00(this.A04, "stickerIsTenor", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A06), "stickerMakerSourceType", A10);
    }
}
