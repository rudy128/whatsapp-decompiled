package X;

/* renamed from: X.8aS  reason: invalid class name and case insensitive filesystem */
public final class C165018aS extends C23577Bm6 implements C22356B4k {
    public static final C165018aS DEFAULT_INSTANCE;
    public static final int LAST_MESSAGE_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int LAST_SYSTEM_MESSAGE_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public long lastMessageTimestamp_;
    public long lastSystemMessageTimestamp_;
    public EE9 messages_ = C23579Bm9.A02;

    static {
        C165018aS r1 = new C165018aS();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165018aS.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "lastMessageTimestamp_";
                A1a[2] = "lastSystemMessageTimestamp_";
                A1a[3] = "messages_";
                A1a[4] = C164488Za.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", A1a);
            case 3:
                return new C165018aS();
            case 4:
                return new C163818Wl();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165018aS.class) {
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
