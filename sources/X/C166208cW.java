package X;

/* renamed from: X.8cW  reason: invalid class name and case insensitive filesystem */
public final class C166208cW extends C23577Bm6 implements C22356B4k {
    public static final int CAPTION_FIELD_NUMBER = 20;
    public static final int CONTACT_VCARD_FIELD_NUMBER = 12;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C166208cW DEFAULT_INSTANCE;
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
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public String caption_;
    public boolean contactVcard_;
    public C166278cd contextInfo_;
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
    public String url_ = "";

    static {
        C166208cW r1 = new C166208cW();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166208cW.class);
    }

    public C166208cW() {
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
                Object[] A1Z = C17890vO.A1Z(21);
                A1Z[1] = "url_";
                A1Z[2] = "mimetype_";
                A1Z[3] = "title_";
                A1Z[4] = "fileSha256_";
                A1Z[5] = "fileLength_";
                A1Z[6] = "pageCount_";
                A1Z[7] = "mediaKey_";
                A1Z[8] = "fileName_";
                A1Z[9] = "fileEncSha256_";
                A1Z[10] = "directPath_";
                A1Z[11] = "mediaKeyTimestamp_";
                A1Z[12] = "contactVcard_";
                A1Z[13] = "thumbnailDirectPath_";
                A1Z[14] = "thumbnailSha256_";
                A1Z[15] = "thumbnailEncSha256_";
                A1Z[16] = "jpegThumbnail_";
                A1Z[17] = "contextInfo_";
                A1Z[18] = "thumbnailHeight_";
                A1Z[19] = "thumbnailWidth_";
                A1Z[20] = "caption_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ည\u0006\bဈ\u0007\tည\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဈ\f\u000eည\r\u000fည\u000e\u0010ည\u000f\u0011ဉ\u0010\u0012ဋ\u0011\u0013ဋ\u0012\u0014ဈ\u0013", A1Z);
            case 3:
                return new C166208cW();
            case 4:
                return new C162748Si();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166208cW.class) {
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
