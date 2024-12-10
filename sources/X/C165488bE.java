package X;

/* renamed from: X.8bE  reason: invalid class name and case insensitive filesystem */
public final class C165488bE extends C23577Bm6 implements C22356B4k {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int BEHAVIOR_GRAPH_FIELD_NUMBER = 2;
    public static final C165488bE DEFAULT_INSTANCE;
    public static final int INTENSITY_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int SENTIMENT_FIELD_NUMBER = 1;
    public static final int WORD_COUNT_FIELD_NUMBER = 5;
    public int action_;
    public String behaviorGraph_ = "";
    public int bitField0_;
    public int intensity_;
    public int sentiment_;
    public int wordCount_;

    static {
        C165488bE r1 = new C165488bE();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165488bE.class);
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
                A1b[1] = "sentiment_";
                A1b[2] = "behaviorGraph_";
                A1b[3] = "action_";
                A1b[4] = "intensity_";
                A1b[5] = "wordCount_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", A1b);
            case 3:
                return new C165488bE();
            case 4:
                return new AnonymousClass8Rk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165488bE.class) {
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
