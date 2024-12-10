package X;

/* renamed from: X.2BV  reason: invalid class name */
public final class AnonymousClass2BV extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BV DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 8;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 3;
    public static final int FILE_LENGTH_FIELD_NUMBER = 9;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int IS_LOTTIE_FIELD_NUMBER = 12;
    public static final int LAST_STICKER_SENT_TS_FIELD_NUMBER = 11;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WEIGHT_FIELD_NUMBER = 10;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public int bitField0_;
    public String directPath_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public DSQ fileSha256_;
    public int height_;
    public boolean isLottie_;
    public long lastStickerSentTs_;
    public DSQ mediaKey_;
    public String mimetype_;
    public String url_ = "";
    public float weight_;
    public int width_;

    static {
        AnonymousClass2BV r1 = new AnonymousClass2BV();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BV.class);
    }

    public AnonymousClass2BV() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
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
                Object[] A1Z = C17890vO.A1Z(13);
                AnonymousClass8BY.A1S(A1Z);
                A1Z[10] = "weight_";
                A1Z[11] = "lastStickerSentTs_";
                A1Z[12] = "isLottie_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007\tဃ\b\nခ\t\u000bဂ\n\fဇ\u000b", A1Z);
            case 3:
                return new AnonymousClass2BV();
            case 4:
                return new C45532Al();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BV.class) {
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
