package X;

/* renamed from: X.8cU  reason: invalid class name and case insensitive filesystem */
public final class C166188cU extends C23577Bm6 implements C22356B4k {
    public static final int CAPTION_FIELD_NUMBER = 3;
    public static final C166188cU DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 11;
    public static final int EXPERIMENT_GROUP_ID_FIELD_NUMBER = 20;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 9;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_SHA256_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 8;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int MID_QUALITY_FILE_ENC_SHA256_FIELD_NUMBER = 24;
    public static final int MID_QUALITY_FILE_SHA256_FIELD_NUMBER = 23;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int SCANS_SIDECAR_FIELD_NUMBER = 21;
    public static final int SCAN_LENGTHS_FIELD_NUMBER = 22;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 26;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 28;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 27;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public int bitField0_;
    public String caption_ = "";
    public String directPath_;
    public int experimentGroupId_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public DSQ fileSha256_;
    public int height_;
    public DSQ jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public DSQ midQualityFileEncSha256_;
    public DSQ midQualityFileSha256_;
    public String mimetype_ = "";
    public C28667EDj scanLengths_;
    public DSQ scansSidecar_;
    public String thumbnailDirectPath_;
    public DSQ thumbnailEncSha256_;
    public DSQ thumbnailSha256_;
    public int width_;

    static {
        C166188cU r1 = new C166188cU();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166188cU.class);
    }

    public C166188cU() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.fileEncSha256_ = dsq;
        this.directPath_ = "";
        this.jpegThumbnail_ = dsq;
        this.scansSidecar_ = dsq;
        this.scanLengths_ = Bm7.A02;
        this.midQualityFileSha256_ = dsq;
        this.midQualityFileEncSha256_ = dsq;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = dsq;
        this.thumbnailEncSha256_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(20);
                A1Z[1] = "mimetype_";
                AnonymousClass8BX.A1Q(A1Z, "caption_");
                A1Z[5] = "height_";
                A1Z[6] = "width_";
                AnonymousClass8BY.A1U(A1Z, "mediaKey_");
                A1Z[11] = "jpegThumbnail_";
                A1Z[12] = "experimentGroupId_";
                A1Z[13] = "scansSidecar_";
                A1Z[14] = "scanLengths_";
                A1Z[15] = "midQualityFileSha256_";
                A1Z[16] = "midQualityFileEncSha256_";
                A1Z[17] = "thumbnailDirectPath_";
                A1Z[18] = "thumbnailSha256_";
                A1Z[19] = "thumbnailEncSha256_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0002\u001c\u0013\u0000\u0001\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ည\u0002\u0005ဃ\u0003\u0006ဋ\u0004\u0007ဋ\u0005\bည\u0006\tည\u0007\u000bဈ\b\fဂ\t\u0010ည\n\u0014ဋ\u000b\u0015ည\f\u0016\u001d\u0017ည\r\u0018ည\u000e\u001aဈ\u000f\u001bည\u0010\u001cည\u0011", A1Z);
            case 3:
                return new C166188cU();
            case 4:
                return new AnonymousClass8U6();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166188cU.class) {
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
