package X;

/* renamed from: X.8bT  reason: invalid class name and case insensitive filesystem */
public final class C165608bT extends C23577Bm6 implements C22356B4k {
    public static final C165608bT DEFAULT_INSTANCE;
    public static final int GROUPING_KEY_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int UNREAD_FIELD_NUMBER = 5;
    public int bitField0_;
    public String groupingKey_ = "";
    public C166408cq key_;
    public long senderTimestampMs_;
    public String text_ = "";
    public boolean unread_;

    static {
        C165608bT r1 = new C165608bT();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165608bT.class);
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
                AnonymousClass8BY.A1R(A1b);
                A1b[5] = "unread_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", A1b);
            case 3:
                return new C165608bT();
            case 4:
                return new AnonymousClass8WI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165608bT.class) {
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
