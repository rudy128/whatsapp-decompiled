package X;

/* renamed from: X.8Zh  reason: invalid class name and case insensitive filesystem */
public final class C164558Zh extends C23577Bm6 implements C22356B4k {
    public static final int COMMENT_PARENT_KEY_FIELD_NUMBER = 1;
    public static final C164558Zh DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int REPLY_COUNT_FIELD_NUMBER = 2;
    public int bitField0_;
    public C166408cq commentParentKey_;
    public int replyCount_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8Zh] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164558Zh.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = AnonymousClass8BW.A1Y();
                A1Y[1] = "commentParentKey_";
                A1Y[2] = "replyCount_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001", A1Y);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8W3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164558Zh.class) {
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
