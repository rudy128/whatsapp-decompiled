package X;

/* renamed from: X.8ca  reason: invalid class name and case insensitive filesystem */
public final class C166248ca extends C23577Bm6 implements C22356B4k {
    public static final int ACCESSIBILITY_LABEL_FIELD_NUMBER = 26;
    public static final int ANNOTATIONS_FIELD_NUMBER = 25;
    public static final int CAPTION_FIELD_NUMBER = 7;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C166248ca DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 13;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 11;
    public static final int FILE_LENGTH_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int GIF_ATTRIBUTION_FIELD_NUMBER = 19;
    public static final int GIF_PLAYBACK_FIELD_NUMBER = 8;
    public static final int HEIGHT_FIELD_NUMBER = 9;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 6;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int PROCESSED_VIDEOS_FIELD_NUMBER = 27;
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STATIC_URL_FIELD_NUMBER = 24;
    public static final int STREAMING_SIDECAR_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 21;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 23;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 22;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 20;
    public static final int WIDTH_FIELD_NUMBER = 10;
    public String accessibilityLabel_;
    public EE9 annotations_;
    public int bitField0_;
    public String caption_;
    public C166278cd contextInfo_;
    public String directPath_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public DSQ fileSha256_;
    public int gifAttribution_;
    public boolean gifPlayback_;
    public int height_;
    public DSQ jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public String mimetype_ = "";
    public EE9 processedVideos_;
    public int seconds_;
    public String staticUrl_;
    public DSQ streamingSidecar_;
    public String thumbnailDirectPath_;
    public DSQ thumbnailEncSha256_;
    public DSQ thumbnailSha256_;
    public String url_ = "";
    public boolean viewOnce_;
    public int width_;

    static {
        C166248ca r1 = new C166248ca();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166248ca.class);
    }

    public C166248ca() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.caption_ = "";
        this.fileEncSha256_ = dsq;
        this.directPath_ = "";
        this.jpegThumbnail_ = dsq;
        this.streamingSidecar_ = dsq;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = dsq;
        this.thumbnailEncSha256_ = dsq;
        this.staticUrl_ = "";
        C23579Bm9 bm9 = C23579Bm9.A02;
        this.annotations_ = bm9;
        this.accessibilityLabel_ = "";
        this.processedVideos_ = bm9;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(29);
                A1Z[1] = "url_";
                AnonymousClass8BX.A1Q(A1Z, "mimetype_");
                A1Z[5] = "seconds_";
                A1Z[6] = "mediaKey_";
                A1Z[7] = "caption_";
                A1Z[8] = "gifPlayback_";
                A1Z[9] = "height_";
                A1Z[10] = "width_";
                A1Z[11] = "fileEncSha256_";
                A1Z[12] = "directPath_";
                A1Z[13] = "mediaKeyTimestamp_";
                A1Z[14] = "jpegThumbnail_";
                A1Z[15] = "contextInfo_";
                A1Z[16] = "streamingSidecar_";
                A1Z[17] = "gifAttribution_";
                A1Z[18] = C20413AKc.A00;
                A1Z[19] = "viewOnce_";
                A1Z[20] = "thumbnailDirectPath_";
                A1Z[21] = "thumbnailSha256_";
                A1Z[22] = "thumbnailEncSha256_";
                A1Z[23] = "staticUrl_";
                A1Z[24] = "annotations_";
                A1Z[25] = C165618bU.class;
                A1Z[26] = "accessibilityLabel_";
                A1Z[27] = "processedVideos_";
                A1Z[28] = C165918by.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001\u001b\u0019\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ည\u0005\u0007ဈ\u0006\bဇ\u0007\tဋ\b\nဋ\t\u000bည\n\rဈ\u000b\u000eဂ\f\u0010ည\r\u0011ဉ\u000e\u0012ည\u000f\u0013ဌ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ည\u0013\u0017ည\u0014\u0018ဈ\u0015\u0019\u001b\u001aဈ\u0016\u001b\u001b", A1Z);
            case 3:
                return new C166248ca();
            case 4:
                return new C163928Ww();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166248ca.class) {
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
