package X;

/* renamed from: X.8bN  reason: invalid class name and case insensitive filesystem */
public final class C165548bN extends C23577Bm6 implements C22356B4k {
    public static final int COLOR_FIELD_NUMBER = 2;
    public static final C165548bN DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ORDER_INDEX_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int PREDEFINEDID_FIELD_NUMBER = 3;
    public int bitField0_;
    public int color_;
    public boolean deleted_;
    public String name_ = "";
    public int orderIndex_;
    public int predefinedId_;

    static {
        C165548bN r1 = new C165548bN();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165548bN.class);
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
                A1b[1] = "name_";
                A1b[2] = "color_";
                A1b[3] = "predefinedId_";
                A1b[4] = "deleted_";
                A1b[5] = "orderIndex_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004", A1b);
            case 3:
                return new C165548bN();
            case 4:
                return new AnonymousClass8VC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165548bN.class) {
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
