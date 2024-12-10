package X;

/* renamed from: X.8bK  reason: invalid class name */
public final class AnonymousClass8bK extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 3;
    public static final AnonymousClass8bK DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SELECTED_CAROUSEL_CARD_INDEX_FIELD_NUMBER = 5;
    public static final int SELECTED_DISPLAY_TEXT_FIELD_NUMBER = 2;
    public static final int SELECTED_ID_FIELD_NUMBER = 1;
    public static final int SELECTED_INDEX_FIELD_NUMBER = 4;
    public int bitField0_;
    public C166278cd contextInfo_;
    public int selectedCarouselCardIndex_;
    public String selectedDisplayText_ = "";
    public String selectedId_ = "";
    public int selectedIndex_;

    static {
        AnonymousClass8bK r1 = new AnonymousClass8bK();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8bK.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass8BW.A1b();
                A1b[1] = "selectedId_";
                A1b[2] = "selectedDisplayText_";
                A1b[3] = "contextInfo_";
                A1b[4] = "selectedIndex_";
                A1b[5] = "selectedCarouselCardIndex_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A1b);
            case 3:
                return new AnonymousClass8bK();
            case 4:
                return new C163088Tq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8bK.class) {
                    b4l = PARSER;
                    if (b4l == null) {
                        C26105CsP csP = DNE.A01;
                        b4l = C17880vN.A0F(DEFAULT_INSTANCE);
                        PARSER = b4l;
                    }
                }
                return b4l;
            default:
                throw C17880vN.A0y();
        }
    }
}
