package X;

/* renamed from: X.8cR  reason: invalid class name and case insensitive filesystem */
public final class C166158cR extends C23577Bm6 implements C22356B4k {
    public static final int CAPTION_FIELD_NUMBER = 20;
    public static final int CONTACT_VCARD_FIELD_NUMBER = 12;
    public static final C166158cR DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 10;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 9;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_NAME_FIELD_NUMBER = 8;
    public static final int FILE_SHA256_FIELD_NUMBER = 4;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 7;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 11;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static final int PAGE_COUNT_FIELD_NUMBER = 6;
    public static volatile C22357B4l PARSER = null;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 13;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 15;
    public static final int THUMBNAIL_HEIGHT_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 14;
    public static final int THUMBNAIL_WIDTH_FIELD_NUMBER = 19;
    public static final int TITLE_FIELD_NUMBER = 3;
    public int bitField0_;
    public String caption_;
    public boolean contactVcard_;
    public String directPath_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public String fileName_;
    public DSQ fileSha256_;
    public DSQ jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public String mimetype_ = "";
    public int pageCount_;
    public String thumbnailDirectPath_;
    public DSQ thumbnailEncSha256_;
    public int thumbnailHeight_;
    public DSQ thumbnailSha256_;
    public int thumbnailWidth_;
    public String title_ = "";

    static {
        C166158cR r1 = new C166158cR();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166158cR.class);
    }

    public C166158cR() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.fileName_ = "";
        this.fileEncSha256_ = dsq;
        this.directPath_ = "";
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = dsq;
        this.thumbnailEncSha256_ = dsq;
        this.jpegThumbnail_ = dsq;
        this.caption_ = "";
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(19);
                A1Z[1] = "mimetype_";
                AnonymousClass8BX.A1Q(A1Z, "title_");
                A1Z[5] = "pageCount_";
                A1Z[6] = "mediaKey_";
                AnonymousClass8BY.A1U(A1Z, "fileName_");
                A1Z[11] = "contactVcard_";
                A1Z[12] = "thumbnailDirectPath_";
                A1Z[13] = "thumbnailSha256_";
                A1Z[14] = "thumbnailEncSha256_";
                A1Z[15] = "jpegThumbnail_";
                A1Z[16] = "thumbnailHeight_";
                A1Z[17] = "thumbnailWidth_";
                A1Z[18] = "caption_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0002\u0014\u0012\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ည\u0002\u0005ဃ\u0003\u0006ဋ\u0004\u0007ည\u0005\bဈ\u0006\tည\u0007\nဈ\b\u000bဂ\t\fဇ\n\rဈ\u000b\u000eည\f\u000fည\r\u0010ည\u000e\u0012ဋ\u000f\u0013ဋ\u0010\u0014ဈ\u0011", A1Z);
            case 3:
                return new C166158cR();
            case 4:
                return new AnonymousClass8U5();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166158cR.class) {
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
