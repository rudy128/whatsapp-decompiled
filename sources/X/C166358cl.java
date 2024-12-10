package X;

/* renamed from: X.8cl  reason: invalid class name and case insensitive filesystem */
public final class C166358cl extends C23577Bm6 implements C22356B4k {
    public static final int BUTTON_TEXT_FIELD_NUMBER = 3;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 8;
    public static final C166358cl DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int FOOTER_TEXT_FIELD_NUMBER = 7;
    public static final int LIST_TYPE_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int PRODUCT_LIST_INFO_FIELD_NUMBER = 6;
    public static final int SECTIONS_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String buttonText_ = "";
    public C166278cd contextInfo_;
    public String description_ = "";
    public String footerText_ = "";
    public int listType_;
    public C164858aB productListInfo_;
    public EE9 sections_ = C23579Bm9.A02;
    public String title_ = "";

    static {
        C166358cl r1 = new C166358cl();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166358cl.class);
    }

    public C179759Ju A0R() {
        int i = this.listType_;
        if (i != 0) {
            if (i == 1) {
                return C179759Ju.SINGLE_SELECT;
            }
            if (i == 2) {
                return C179759Ju.PRODUCT_LIST;
            }
        }
        return C179759Ju.UNKNOWN;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(11);
                A1Z[1] = "title_";
                A1Z[2] = "description_";
                A1Z[3] = "buttonText_";
                A1Z[4] = "listType_";
                A1Z[5] = AKM.A00;
                A1Z[6] = "sections_";
                A1Z[7] = AnonymousClass8Z7.class;
                A1Z[8] = "productListInfo_";
                A1Z[9] = "footerText_";
                A1Z[10] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005\u001b\u0006ဉ\u0004\u0007ဈ\u0005\bဉ\u0006", A1Z);
            case 3:
                return new C166358cl();
            case 4:
                return new AnonymousClass8T5();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166358cl.class) {
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
