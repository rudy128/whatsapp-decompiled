package X;

/* renamed from: X.2BP  reason: invalid class name */
public final class AnonymousClass2BP extends C23577Bm6 implements C22356B4k {
    public static final int CHAT_JID_FIELD_NUMBER = 1;
    public static final AnonymousClass2BP DEFAULT_INSTANCE;
    public static final int OLDEST_MSG_FROM_ME_FIELD_NUMBER = 3;
    public static final int OLDEST_MSG_ID_FIELD_NUMBER = 2;
    public static final int OLDEST_MSG_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int ON_DEMAND_MSG_COUNT_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String chatJid_ = "";
    public boolean oldestMsgFromMe_;
    public String oldestMsgId_ = "";
    public long oldestMsgTimestampMs_;
    public int onDemandMsgCount_;

    static {
        AnonymousClass2BP r1 = new AnonymousClass2BP();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BP.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(6);
                A1Z[1] = "chatJid_";
                A1Z[2] = "oldestMsgId_";
                A1Z[3] = "oldestMsgFromMe_";
                A1Z[4] = "onDemandMsgCount_";
                A1Z[5] = "oldestMsgTimestampMs_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဂ\u0004", A1Z);
            case 3:
                return new AnonymousClass2BP();
            case 4:
                return new AnonymousClass2Ah();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BP.class) {
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
