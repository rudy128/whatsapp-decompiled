package X;

/* renamed from: X.8ZM  reason: invalid class name */
public final class AnonymousClass8ZM extends C23577Bm6 implements C22356B4k {
    public static final int AXOLOTL_SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 2;
    public static final AnonymousClass8ZM DEFAULT_INSTANCE;
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public DSQ axolotlSenderKeyDistributionMessage_ = DSQ.A00;
    public int bitField0_;
    public String groupId_ = "";

    static {
        AnonymousClass8ZM r1 = new AnonymousClass8ZM();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8ZM.class);
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
                A1Y[1] = "groupId_";
                A1Y[2] = "axolotlSenderKeyDistributionMessage_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", A1Y);
            case 3:
                return new AnonymousClass8ZM();
            case 4:
                return new AnonymousClass8U8();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8ZM.class) {
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
