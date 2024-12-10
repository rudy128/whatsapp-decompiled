package X;

/* renamed from: X.8cC  reason: invalid class name and case insensitive filesystem */
public final class C166008cC extends C23577Bm6 implements C22356B4k {
    public static final C166008cC DEFAULT_INSTANCE;
    public static final int DEVICE_ID_HINT_FIELD_NUMBER = 10;
    public static final int DIRECT_PATH_FIELD_NUMBER = 7;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 2;
    public static final int FILE_LENGTH_FIELD_NUMBER = 8;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int IS_FAVORITE_FIELD_NUMBER = 9;
    public static final int IS_LOTTIE_FIELD_NUMBER = 11;
    public static final int MEDIA_KEY_FIELD_NUMBER = 3;
    public static final int MIMETYPE_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 6;
    public int bitField0_;
    public int deviceIdHint_;
    public String directPath_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public int height_;
    public boolean isFavorite_;
    public boolean isLottie_;
    public DSQ mediaKey_;
    public String mimetype_;
    public String url_ = "";
    public int width_;

    static {
        C166008cC r1 = new C166008cC();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166008cC.class);
    }

    public C166008cC() {
        DSQ dsq = DSQ.A00;
        this.fileEncSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.mimetype_ = "";
        this.directPath_ = "";
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(12);
                A1Z[1] = "url_";
                A1Z[2] = "fileEncSha256_";
                A1Z[3] = "mediaKey_";
                A1Z[4] = "mimetype_";
                A1Z[5] = "height_";
                A1Z[6] = "width_";
                A1Z[7] = "directPath_";
                A1Z[8] = "fileLength_";
                A1Z[9] = "isFavorite_";
                A1Z[10] = "deviceIdHint_";
                A1Z[11] = "isLottie_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဈ\u0006\bဃ\u0007\tဇ\b\nဋ\t\u000bဇ\n", A1Z);
            case 3:
                return new C166008cC();
            case 4:
                return new C163468Vc();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166008cC.class) {
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
