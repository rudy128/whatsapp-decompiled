package X;

/* renamed from: X.8bm  reason: invalid class name and case insensitive filesystem */
public final class C165798bm extends C23577Bm6 implements C22356B4k {
    public static final C165798bm DEFAULT_INSTANCE;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 1;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 3;
    public static final int THUMBNAIL_HEIGHT_FIELD_NUMBER = 6;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 2;
    public static final int THUMBNAIL_WIDTH_FIELD_NUMBER = 7;
    public int bitField0_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public String thumbnailDirectPath_ = "";
    public DSQ thumbnailEncSha256_;
    public int thumbnailHeight_;
    public DSQ thumbnailSha256_;
    public int thumbnailWidth_;

    static {
        C165798bm r1 = new C165798bm();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165798bm.class);
    }

    public C165798bm() {
        DSQ dsq = DSQ.A00;
        this.thumbnailSha256_ = dsq;
        this.thumbnailEncSha256_ = dsq;
        this.mediaKey_ = dsq;
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
                A1Z[1] = "thumbnailDirectPath_";
                A1Z[2] = "thumbnailSha256_";
                A1Z[3] = "thumbnailEncSha256_";
                A1Z[4] = "mediaKey_";
                A1Z[5] = "mediaKeyTimestamp_";
                A1Z[6] = "thumbnailHeight_";
                A1Z[7] = "thumbnailWidth_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဂ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", A1Z);
            case 3:
                return new C165798bm();
            case 4:
                return new AnonymousClass8TG();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165798bm.class) {
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
