package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gd  reason: invalid class name and case insensitive filesystem */
public final class C46852Gd extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;

    public C46852Gd() {
        super(3894, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A04);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(6, this.A03);
        r3.CHf(8, this.A06);
        r3.CHf(9, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A04, A13), this.A05, A13), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 5);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A08(7, this.A02, A13), this.A03, A13), this.A06, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAvatarStickerSend {");
        AnonymousClass186.A00(C17900vP.A08(this.A04), "avatarStickerSendMessageType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "avatarStickerSendOriginType", A10);
        AnonymousClass186.A00(this.A00, "stickerIsAnimated", A10);
        AnonymousClass186.A00(this.A01, "stickerIsCountry", A10);
        AnonymousClass186.A00(this.A02, "stickerIsPregenerated", A10);
        AnonymousClass186.A00(this.A03, "stickerIsSocialSticker", A10);
        AnonymousClass186.A00(this.A06, "stickerRevisionId", A10);
        return AnonymousClass184.A0S(this.A07, "stickerStyle", A10);
    }
}
