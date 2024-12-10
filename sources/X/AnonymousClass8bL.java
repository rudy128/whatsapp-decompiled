package X;

/* renamed from: X.8bL  reason: invalid class name */
public final class AnonymousClass8bL extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8bL DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 5;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 1;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String directPath_ = "";
    public DSQ fileEncSha256_;
    public DSQ fileSha256_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;

    static {
        AnonymousClass8bL r1 = new AnonymousClass8bL();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8bL.class);
    }

    public AnonymousClass8bL() {
        DSQ dsq = DSQ.A00;
        this.mediaKey_ = dsq;
        this.fileSha256_ = dsq;
        this.fileEncSha256_ = dsq;
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
                A1b[1] = "mediaKey_";
                A1b[2] = "mediaKeyTimestamp_";
                A1b[3] = "fileSha256_";
                A1b[4] = "fileEncSha256_";
                A1b[5] = "directPath_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004", A1b);
            case 3:
                return new AnonymousClass8bL();
            case 4:
                return new C163138Tv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8bL.class) {
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
