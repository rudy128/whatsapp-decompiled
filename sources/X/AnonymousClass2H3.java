package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2H3  reason: invalid class name */
public final class AnonymousClass2H3 extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;

    public AnonymousClass2H3() {
        super(1840, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(6, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(5, this.A04);
        r3.CHf(10, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(11, this.A07);
        r3.CHf(8, this.A08);
        r3.CHf(4, this.A09);
        r3.CHf(1, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A04(AnonymousClass184.A08(AnonymousClass184.A05(7, this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 12);
        A13.put(AnonymousClass184.A03(AnonymousClass184.A06(AnonymousClass184.A0A(AnonymousClass184.A0D(AnonymousClass184.A0B(10, this.A05, A13), this.A06, A13), this.A07, A13), this.A08, A13), this.A09, A13), this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamStickerSend {");
        AnonymousClass186.A00(this.A00, "stickerIsAi", A10);
        AnonymousClass186.A00(this.A01, "stickerIsAnimated", A10);
        AnonymousClass186.A00(this.A02, "stickerIsAvatar", A10);
        AnonymousClass186.A00(this.A03, "stickerIsFirstParty", A10);
        AnonymousClass186.A00(this.A04, "stickerIsFromStickerMaker", A10);
        AnonymousClass186.A00(this.A05, "stickerIsGiphy", A10);
        AnonymousClass186.A00(this.A06, "stickerIsLottie", A10);
        AnonymousClass186.A00(this.A07, "stickerIsTenor", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "stickerMakerSourceType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "stickerSendMessageType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A0A), "stickerSendOrigin", A10);
    }
}
