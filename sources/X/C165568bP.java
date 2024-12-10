package X;

/* renamed from: X.8bP  reason: invalid class name and case insensitive filesystem */
public final class C165568bP extends C23577Bm6 implements C22356B4k {
    public static final int COUNT_FIELD_NUMBER = 4;
    public static final C165568bP DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 5;
    public static final int KEYWORDS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int SHORTCUT_FIELD_NUMBER = 1;
    public int bitField0_;
    public int count_;
    public boolean deleted_;
    public EE9 keywords_ = C23579Bm9.A02;
    public String message_ = "";
    public String shortcut_ = "";

    static {
        C165568bP r1 = new C165568bP();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165568bP.class);
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
                A1b[1] = "shortcut_";
                A1b[2] = "message_";
                A1b[3] = "keywords_";
                A1b[4] = "count_";
                A1b[5] = "deleted_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004င\u0002\u0005ဇ\u0003", A1b);
            case 3:
                return new C165568bP();
            case 4:
                return new AnonymousClass8VW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165568bP.class) {
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
