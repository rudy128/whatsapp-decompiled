package X;

/* renamed from: X.8bz  reason: invalid class name and case insensitive filesystem */
public final class C165928bz extends C23577Bm6 implements C22356B4k {
    public static final int AUDIO_MESSAGE_FIELD_NUMBER = 8;
    public static final int CONVERSATION_FIELD_NUMBER = 1;
    public static final C165928bz DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 7;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int PTV_MESSAGE_FIELD_NUMBER = 66;
    public static final int REACTION_MESSAGE_FIELD_NUMBER = 46;
    public static final int SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 2;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 9;
    public C166058cH audioMessage_;
    public int bitField0_;
    public String conversation_ = "";
    public C166158cR documentMessage_;
    public C166188cU imageMessage_;
    public C166168cS ptvMessage_;
    public C165288at reactionMessage_;
    public AnonymousClass8ZM senderKeyDistributionMessage_;
    public C166168cS videoMessage_;

    static {
        C165928bz r1 = new C165928bz();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165928bz.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(9);
                A1Z[1] = "conversation_";
                A1Z[2] = "senderKeyDistributionMessage_";
                A1Z[3] = "imageMessage_";
                A1Z[4] = "documentMessage_";
                A1Z[5] = "audioMessage_";
                A1Z[6] = "videoMessage_";
                A1Z[7] = "reactionMessage_";
                A1Z[8] = "ptvMessage_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001B\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005.ဉ\u0006Bဉ\u0007", A1Z);
            case 3:
                return new C165928bz();
            case 4:
                return new AnonymousClass8U4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165928bz.class) {
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
