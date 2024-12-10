package X;

/* renamed from: X.8cS  reason: invalid class name and case insensitive filesystem */
public final class C166168cS extends C23577Bm6 implements C22356B4k {
    public static final int CAPTION_FIELD_NUMBER = 7;
    public static final C166168cS DEFAULT_INSTANCE;
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
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STREAMING_SIDECAR_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 21;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 23;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 22;
    public static final int WIDTH_FIELD_NUMBER = 10;
    public int bitField0_;
    public String caption_;
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
    public int seconds_;
    public DSQ streamingSidecar_;
    public String thumbnailDirectPath_;
    public DSQ thumbnailEncSha256_;
    public DSQ thumbnailSha256_;
    public int width_;

    static {
        C166168cS r1 = new C166168cS();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166168cS.class);
    }

    public C166168cS() {
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
                A1Z[2] = "fileSha256_";
                A1Z[3] = "fileLength_";
                A1Z[4] = "seconds_";
                A1Z[5] = "mediaKey_";
                A1Z[6] = "caption_";
                A1Z[7] = "gifPlayback_";
                A1Z[8] = "height_";
                A1Z[9] = "width_";
                A1Z[10] = "fileEncSha256_";
                A1Z[11] = "directPath_";
                A1Z[12] = "mediaKeyTimestamp_";
                A1Z[13] = "jpegThumbnail_";
                A1Z[14] = "streamingSidecar_";
                A1Z[15] = "gifAttribution_";
                A1Z[16] = C20419AKi.A00;
                A1Z[17] = "thumbnailDirectPath_";
                A1Z[18] = "thumbnailSha256_";
                A1Z[19] = "thumbnailEncSha256_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0002\u0017\u0012\u0000\u0000\u0000\u0002ဈ\u0000\u0003ည\u0001\u0004ဃ\u0002\u0005ဋ\u0003\u0006ည\u0004\u0007ဈ\u0005\bဇ\u0006\tဋ\u0007\nဋ\b\u000bည\t\rဈ\n\u000eဂ\u000b\u0010ည\f\u0012ည\r\u0013ဌ\u000e\u0015ဈ\u000f\u0016ည\u0010\u0017ည\u0011", A1Z);
            case 3:
                return new C166168cS();
            case 4:
                return new AnonymousClass8U9();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166168cS.class) {
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
