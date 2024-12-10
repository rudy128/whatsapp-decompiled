package X;

/* renamed from: X.8Xq  reason: invalid class name and case insensitive filesystem */
public final class C164128Xq extends C23577Bm6 implements C22356B4k {
    public static final int CALL_LOG_ROW_ID_FIELD_NUMBER = 1;
    public static final C164128Xq DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public long callLogRowId_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Xq, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C164128Xq.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = AnonymousClass8BW.A1X();
                A1X[1] = "callLogRowId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", A1X);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8UT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164128Xq.class) {
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
