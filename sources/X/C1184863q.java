package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63q  reason: invalid class name and case insensitive filesystem */
public final class C1184863q extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Double A05;
    public Integer A06;
    public Integer A07;

    public C1184863q() {
        super(1734, new C18180vt(1, 1, 5, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A05);
        r3.CHf(1, this.A06);
        r3.CHf(6, this.A00);
        r3.CHf(5, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(7, this.A03);
        r3.CHf(9, this.A04);
        r3.CHf(8, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 4);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A0B(AnonymousClass184.A09(C108975cc.A0S(AnonymousClass184.A07(AnonymousClass184.A08(AnonymousClass184.A03(C17880vN.A0j(), this.A05, A13), this.A06, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMessageMediaDownload {");
        AnonymousClass186.A00(this.A05, "mediaSize", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "messageMediaType", A10);
        AnonymousClass186.A00(this.A00, "stickerIsAi", A10);
        AnonymousClass186.A00(this.A01, "stickerIsAvatar", A10);
        AnonymousClass186.A00(this.A02, "stickerIsFirstParty", A10);
        AnonymousClass186.A00(this.A03, "stickerIsFromStickerMaker", A10);
        AnonymousClass186.A00(this.A04, "stickerIsLottie", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A07), "stickerMakerSourceType", A10);
    }
}
