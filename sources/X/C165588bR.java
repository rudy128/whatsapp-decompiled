package X;

/* renamed from: X.8bR  reason: invalid class name and case insensitive filesystem */
public final class C165588bR extends C23577Bm6 implements C22356B4k {
    public static final C165588bR DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    public static final int MESSAGE_ADD_ON_CONTEXT_INFO_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 3;
    public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public C166408cq key_;
    public C164578Zj messageAddOnContextInfo_;
    public long senderTimestampMs_;
    public long serverTimestampMs_;
    public int type_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8bR] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165588bR.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(7);
                A1Z[1] = "type_";
                A1Z[2] = ALD.A00;
                A1Z[3] = "key_";
                A1Z[4] = "senderTimestampMs_";
                A1Z[5] = "serverTimestampMs_";
                A1Z[6] = "messageAddOnContextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8WE();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165588bR.class) {
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
