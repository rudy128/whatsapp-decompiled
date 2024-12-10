package X;

/* renamed from: X.8Zu  reason: invalid class name and case insensitive filesystem */
public final class C164688Zu extends C23577Bm6 implements C22356B4k {
    public static final int CAMPAIGN_EXPIRATION_TIMESTAMP_FIELD_NUMBER = 45;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 44;
    public static final C164688Zu DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public long campaignExpirationTimestamp_;
    public long campaignId_;
    public byte memoizedIsInitialized = 2;

    static {
        C164688Zu r1 = new C164688Zu();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164688Zu.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] A1R = AnonymousClass8BS.A1R(3);
                A1R[1] = "campaignId_";
                A1R[2] = "campaignExpirationTimestamp_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001,-\u0002\u0000\u0000\u0001,ᔃ\u0000-ဃ\u0001", A1R);
            case 3:
                return new C164688Zu();
            case 4:
                return new AnonymousClass8WL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164688Zu.class) {
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
