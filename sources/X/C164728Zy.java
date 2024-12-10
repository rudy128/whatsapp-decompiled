package X;

/* renamed from: X.8Zy  reason: invalid class name and case insensitive filesystem */
public final class C164728Zy extends C23577Bm6 implements C22356B4k {
    public static final C164728Zy DEFAULT_INSTANCE;
    public static final int EXPRESS_PATH_URL_FIELD_NUMBER = 1;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 2;
    public static final int FILE_LENGTH_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String expressPathUrl_ = "";
    public DSQ fileEncSha256_ = DSQ.A00;
    public long fileLength_;

    static {
        C164728Zy r1 = new C164728Zy();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164728Zy.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = AnonymousClass8BW.A1Z();
                A1Z[1] = "expressPathUrl_";
                A1Z[2] = "fileEncSha256_";
                A1Z[3] = "fileLength_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဃ\u0002", A1Z);
            case 3:
                return new C164728Zy();
            case 4:
                return new AnonymousClass8SL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164728Zy.class) {
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
