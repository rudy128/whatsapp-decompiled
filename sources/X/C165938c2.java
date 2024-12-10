package X;

/* renamed from: X.8c2  reason: invalid class name and case insensitive filesystem */
public final class C165938c2 extends C23577Bm6 implements C22356B4k {
    public static final int ADD_ON_CONTEXT_INFO_FIELD_NUMBER = 6;
    public static final C165938c2 DEFAULT_INSTANCE;
    public static final int LEGACY_MESSAGE_FIELD_NUMBER = 8;
    public static final int MESSAGE_ADD_ON_FIELD_NUMBER = 2;
    public static final int MESSAGE_ADD_ON_KEY_FIELD_NUMBER = 7;
    public static final int MESSAGE_ADD_ON_TYPE_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 3;
    public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 5;
    public C164578Zj addOnContextInfo_;
    public int bitField0_;
    public C164568Zi legacyMessage_;
    public C166408cq messageAddOnKey_;
    public int messageAddOnType_;
    public C166418cr messageAddOn_;
    public long senderTimestampMs_;
    public long serverTimestampMs_;
    public int status_ = 1;

    static {
        C165938c2 r1 = new C165938c2();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165938c2.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(11);
                A1Z[1] = "messageAddOnType_";
                A1Z[2] = AL9.A00;
                A1Z[3] = "messageAddOn_";
                A1Z[4] = "senderTimestampMs_";
                A1Z[5] = "serverTimestampMs_";
                A1Z[6] = "status_";
                A1Z[7] = ALF.A00;
                A1Z[8] = "addOnContextInfo_";
                A1Z[9] = "messageAddOnKey_";
                A1Z[10] = "legacyMessage_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", A1Z);
            case 3:
                return new C165938c2();
            case 4:
                return new AnonymousClass8W9();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165938c2.class) {
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
