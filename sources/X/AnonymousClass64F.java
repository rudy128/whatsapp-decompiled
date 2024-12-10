package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64F  reason: invalid class name */
public final class AnonymousClass64F extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public AnonymousClass64F() {
        super(2884, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(11, this.A00);
        r3.CHf(12, this.A01);
        r3.CHf(13, this.A02);
        r3.CHf(14, this.A03);
        r3.CHf(1, this.A04);
        r3.CHf(6, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(8, this.A07);
        r3.CHf(5, this.A08);
        r3.CHf(3, this.A09);
        r3.CHf(15, this.A0A);
        r3.CHf(2, this.A0B);
        r3.CHf(7, this.A0C);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A0B(AnonymousClass184.A08(AnonymousClass184.A03(AnonymousClass184.A0G(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0J(AnonymousClass184.A0I(C108955ca.A0g(), this.A00, A13), (Object) null, A13), (Object) null, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07);
        AnonymousClass184.A0X(A13, 10);
        A13.put(AnonymousClass184.A09(C108975cc.A0S(AnonymousClass184.A0H(C108975cc.A0T(C17880vN.A0l(), this.A08, A13), this.A09, A13), this.A0A, A13), this.A0B, A13), this.A0C);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStickerDailyAggregatedEvent {");
        AnonymousClass186.A00(this.A00, "stickerAddToFavoriteCount", A10);
        AnonymousClass186.A00(this.A01, "stickerPackDeleteCount", A10);
        AnonymousClass186.A00(this.A02, "stickerPickerOpenedCount", A10);
        AnonymousClass186.A00(this.A03, "stickerSearchOpenedCount", A10);
        AnonymousClass186.A00(this.A04, "stickerSendCount", A10);
        AnonymousClass186.A00(this.A05, "stickerSendCountForward", A10);
        AnonymousClass186.A00(this.A06, "stickerSendCountIsAnimated", A10);
        AnonymousClass186.A00(this.A07, "stickerSendCountIsFirstParty", A10);
        AnonymousClass186.A00(this.A08, "stickerSendCountStickerPickerTabEmotion", A10);
        AnonymousClass186.A00(this.A09, "stickerSendCountStickerPickerTabFavorites", A10);
        AnonymousClass186.A00(this.A0A, "stickerSendCountStickerPickerTabPack", A10);
        AnonymousClass186.A00(this.A0B, "stickerSendCountStickerPickerTabRecents", A10);
        return AnonymousClass184.A0S(this.A0C, "stickerSendCountStickerSearch", A10);
    }
}
