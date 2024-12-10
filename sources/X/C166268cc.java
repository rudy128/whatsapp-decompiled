package X;

/* renamed from: X.8cc  reason: invalid class name and case insensitive filesystem */
public final class C166268cc extends C23577Bm6 implements C22356B4k {
    public static final int ACCESSIBILITY_LABEL_FIELD_NUMBER = 32;
    public static final int ANNOTATIONS_FIELD_NUMBER = 30;
    public static final int CAPTION_FIELD_NUMBER = 3;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C166268cc DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 11;
    public static final int EXPERIMENT_GROUP_ID_FIELD_NUMBER = 20;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 9;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_SHA256_FIELD_NUMBER = 4;
    public static final int FIRST_SCAN_LENGTH_FIELD_NUMBER = 19;
    public static final int FIRST_SCAN_SIDECAR_FIELD_NUMBER = 18;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int IMAGE_SOURCE_TYPE_FIELD_NUMBER = 31;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 8;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int MID_QUALITY_FILE_ENC_SHA256_FIELD_NUMBER = 24;
    public static final int MID_QUALITY_FILE_SHA256_FIELD_NUMBER = 23;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int SCANS_SIDECAR_FIELD_NUMBER = 21;
    public static final int SCAN_LENGTHS_FIELD_NUMBER = 22;
    public static final int STATIC_URL_FIELD_NUMBER = 29;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 26;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 28;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 27;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 25;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public String accessibilityLabel_;
    public EE9 annotations_;
    public int bitField0_;
    public String caption_ = "";
    public C166278cd contextInfo_;
    public String directPath_;
    public int experimentGroupId_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public DSQ fileSha256_;
    public int firstScanLength_;
    public DSQ firstScanSidecar_;
    public int height_;
    public int imageSourceType_;
    public DSQ jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public DSQ midQualityFileEncSha256_;
    public DSQ midQualityFileSha256_;
    public String mimetype_ = "";
    public C28667EDj scanLengths_;
    public DSQ scansSidecar_;
    public String staticUrl_;
    public String thumbnailDirectPath_;
    public DSQ thumbnailEncSha256_;
    public DSQ thumbnailSha256_;
    public String url_ = "";
    public boolean viewOnce_;
    public int width_;

    static {
        C166268cc r1 = new C166268cc();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166268cc.class);
    }

    public C166268cc() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.fileEncSha256_ = dsq;
        this.directPath_ = "";
        this.jpegThumbnail_ = dsq;
        this.firstScanSidecar_ = dsq;
        this.scansSidecar_ = dsq;
        this.scanLengths_ = Bm7.A02;
        this.midQualityFileSha256_ = dsq;
        this.midQualityFileEncSha256_ = dsq;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = dsq;
        this.thumbnailEncSha256_ = dsq;
        this.staticUrl_ = "";
        this.annotations_ = C23579Bm9.A02;
        this.accessibilityLabel_ = "";
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(31);
                A1Z[1] = "url_";
                A1Z[2] = "mimetype_";
                A1Z[3] = "caption_";
                A1Z[4] = "fileSha256_";
                A1Z[5] = "fileLength_";
                A1Z[6] = "height_";
                A1Z[7] = "width_";
                A1Z[8] = "mediaKey_";
                A1Z[9] = "fileEncSha256_";
                A1Z[10] = "directPath_";
                A1Z[11] = "mediaKeyTimestamp_";
                A1Z[12] = "jpegThumbnail_";
                A1Z[13] = "contextInfo_";
                A1Z[14] = "firstScanSidecar_";
                A1Z[15] = "firstScanLength_";
                A1Z[16] = "experimentGroupId_";
                A1Z[17] = "scansSidecar_";
                A1Z[18] = "scanLengths_";
                A1Z[19] = "midQualityFileSha256_";
                A1Z[20] = "midQualityFileEncSha256_";
                A1Z[21] = "viewOnce_";
                A1Z[22] = "thumbnailDirectPath_";
                A1Z[23] = "thumbnailSha256_";
                A1Z[24] = "thumbnailEncSha256_";
                A1Z[25] = "staticUrl_";
                A1Z[26] = "annotations_";
                A1Z[27] = C165618bU.class;
                A1Z[28] = "imageSourceType_";
                A1Z[29] = AKJ.A00;
                A1Z[30] = "accessibilityLabel_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u001c\u0000\u0001\u0001 \u001c\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bည\u0007\tည\b\u000bဈ\t\fဂ\n\u0010ည\u000b\u0011ဉ\f\u0012ည\r\u0013ဋ\u000e\u0014ဋ\u000f\u0015ည\u0010\u0016\u001d\u0017ည\u0011\u0018ည\u0012\u0019ဇ\u0013\u001aဈ\u0014\u001bည\u0015\u001cည\u0016\u001dဈ\u0017\u001e\u001b\u001fဌ\u0018 ဈ\u0019", A1Z);
            case 3:
                return new C166268cc();
            case 4:
                return new C163748We();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166268cc.class) {
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
