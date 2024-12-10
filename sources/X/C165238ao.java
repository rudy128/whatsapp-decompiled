package X;

/* renamed from: X.8ao  reason: invalid class name and case insensitive filesystem */
public final class C165238ao extends C23577Bm6 implements C22356B4k {
    public static final int CONSUMER_LID_FIELD_NUMBER = 3;
    public static final int CONSUMER_PHONE_NUMBER_FIELD_NUMBER = 4;
    public static final C165238ao DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SENDER_NOTIFICATION_TIMESTAMP_MS_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public int bitField0_;
    public String consumerLid_ = "";
    public String consumerPhoneNumber_ = "";
    public long senderNotificationTimestampMs_;
    public int status_;

    static {
        C165238ao r1 = new C165238ao();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165238ao.class);
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
                A1b[1] = "status_";
                A1b[2] = AKA.A00;
                A1b[3] = "senderNotificationTimestampMs_";
                A1b[4] = "consumerLid_";
                A1b[5] = "consumerPhoneNumber_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", A1b);
            case 3:
                return new C165238ao();
            case 4:
                return new C162688Sc();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165238ao.class) {
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
