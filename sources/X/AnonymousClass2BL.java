package X;

/* renamed from: X.2BL  reason: invalid class name */
public final class AnonymousClass2BL extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BL DEFAULT_INSTANCE;
    public static final int EDIT_TARGET_ID_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int TARGET_CHAT_JID_FIELD_NUMBER = 3;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int TARGET_SENDER_JID_FIELD_NUMBER = 4;
    public int bitField0_;
    public String editTargetId_ = "";
    public byte memoizedIsInitialized = 2;
    public String targetChatJid_ = "";
    public String targetId_ = "";
    public String targetSenderJid_ = "";

    static {
        AnonymousClass2BL r1 = new AnonymousClass2BL();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BL.class);
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
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "targetId_", "editTargetId_", "targetChatJid_", "targetSenderJid_"});
            case 3:
                return new AnonymousClass2BL();
            case 4:
                return new C45502Ai();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BL.class) {
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
