package X;

import java.util.List;

public abstract class CIN {
    public static final C25783Clu A00;
    public static final C25783Clu A01;
    public static final C25783Clu A02 = new C25783Clu("DNG", "dng");
    public static final C25783Clu A03;
    public static final C25783Clu A04;
    public static final C25783Clu A05;
    public static final C25783Clu A06;
    public static final C25783Clu A07;
    public static final C25783Clu A08;
    public static final C25783Clu A09;
    public static final C25783Clu A0A;
    public static final C25783Clu A0B;
    public static final C25783Clu A0C;
    public static final List A0D;

    static {
        C25783Clu clu = new C25783Clu("JPEG", "jpeg");
        A06 = clu;
        C25783Clu clu2 = new C25783Clu("PNG", "png");
        A07 = clu2;
        C25783Clu clu3 = new C25783Clu("GIF", "gif");
        A03 = clu3;
        C25783Clu clu4 = new C25783Clu("BMP", "bmp");
        A01 = clu4;
        C25783Clu clu5 = new C25783Clu("ICO", "ico");
        A05 = clu5;
        C25783Clu clu6 = new C25783Clu("WEBP_SIMPLE", "webp");
        A0C = clu6;
        C25783Clu clu7 = new C25783Clu("WEBP_LOSSLESS", "webp");
        A0B = clu7;
        C25783Clu clu8 = new C25783Clu("WEBP_EXTENDED", "webp");
        A09 = clu8;
        C25783Clu clu9 = new C25783Clu("WEBP_EXTENDED_WITH_ALPHA", "webp");
        A0A = clu9;
        C25783Clu clu10 = new C25783Clu("WEBP_ANIMATED", "webp");
        A08 = clu10;
        C25783Clu clu11 = new C25783Clu("HEIF", "heif");
        A04 = clu11;
        C25783Clu clu12 = new C25783Clu("BINARY_XML", "xml");
        A00 = clu12;
        C25783Clu[] cluArr = new C25783Clu[12];
        C17900vP.A0O(clu, clu2, clu3, clu4, cluArr);
        C17900vP.A0P(clu5, clu6, clu7, clu8, cluArr);
        C17890vO.A0x(clu9, clu10, cluArr);
        cluArr[10] = clu11;
        A0D = C18070vi.A0O(clu12, cluArr, 11);
    }
}
