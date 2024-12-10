package X;

/* renamed from: X.8bf  reason: invalid class name and case insensitive filesystem */
public final class C165728bf extends C23577Bm6 implements C22356B4k {
    public static final int CLIENT_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final C165728bf DEFAULT_INSTANCE;
    public static final int DEVICE_JID_FIELD_NUMBER = 4;
    public static final int KEEP_TYPE_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int SERVER_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 6;
    public int bitField0_;
    public long clientTimestampMs_;
    public String deviceJid_ = "";
    public int keepType_;
    public C166408cq key_;
    public long serverTimestampMs_;
    public long serverTimestamp_;

    static {
        C165728bf r1 = new C165728bf();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165728bf.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(8);
                A1Z[1] = "keepType_";
                A1Z[2] = AK1.A00;
                A1Z[3] = "serverTimestamp_";
                A1Z[4] = "key_";
                A1Z[5] = "deviceJid_";
                A1Z[6] = "clientTimestampMs_";
                A1Z[7] = "serverTimestampMs_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", A1Z);
            case 3:
                return new C165728bf();
            case 4:
                return new AnonymousClass8W6();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165728bf.class) {
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
