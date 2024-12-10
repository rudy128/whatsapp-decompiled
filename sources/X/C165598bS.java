package X;

/* renamed from: X.8bS  reason: invalid class name and case insensitive filesystem */
public final class C165598bS extends C23577Bm6 implements C22356B4k {
    public static final C165598bS DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int POLL_UPDATE_MESSAGE_KEY_FIELD_NUMBER = 1;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 3;
    public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int UNREAD_FIELD_NUMBER = 5;
    public static final int VOTE_FIELD_NUMBER = 2;
    public int bitField0_;
    public C166408cq pollUpdateMessageKey_;
    public long senderTimestampMs_;
    public long serverTimestampMs_;
    public boolean unread_;
    public AnonymousClass8XH vote_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8bS] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165598bS.class);
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
                A1b[1] = "pollUpdateMessageKey_";
                A1b[2] = "vote_";
                A1b[3] = "senderTimestampMs_";
                A1b[4] = "serverTimestampMs_";
                A1b[5] = "unread_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", A1b);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8WG();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165598bS.class) {
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
