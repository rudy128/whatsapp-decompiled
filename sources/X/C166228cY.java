package X;

/* renamed from: X.8cY  reason: invalid class name and case insensitive filesystem */
public final class C166228cY extends C23577Bm6 implements C22356B4k {
    public static final int CAPTION_FIELD_NUMBER = 10;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 11;
    public static final C166228cY DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 9;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 7;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_SHA256_FIELD_NUMBER = 6;
    public static final int IMAGE_DATA_HASH_FIELD_NUMBER = 20;
    public static final int MEDIA_KEY_FIELD_NUMBER = 8;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 13;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int PACK_DESCRIPTION_FIELD_NUMBER = 12;
    public static volatile C22357B4l PARSER = null;
    public static final int PUBLISHER_FIELD_NUMBER = 3;
    public static final int STICKERS_FIELD_NUMBER = 4;
    public static final int STICKER_PACK_ID_FIELD_NUMBER = 1;
    public static final int STICKER_PACK_ORIGIN_FIELD_NUMBER = 22;
    public static final int STICKER_PACK_SIZE_FIELD_NUMBER = 21;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 15;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 17;
    public static final int THUMBNAIL_HEIGHT_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 16;
    public static final int THUMBNAIL_WIDTH_FIELD_NUMBER = 19;
    public static final int TRAY_ICON_FILE_NAME_FIELD_NUMBER = 14;
    public int bitField0_;
    public String caption_;
    public C166278cd contextInfo_;
    public String directPath_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public DSQ fileSha256_;
    public String imageDataHash_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public String name_ = "";
    public String packDescription_;
    public String publisher_ = "";
    public String stickerPackId_ = "";
    public int stickerPackOrigin_;
    public long stickerPackSize_;
    public EE9 stickers_ = C23579Bm9.A02;
    public String thumbnailDirectPath_;
    public DSQ thumbnailEncSha256_;
    public int thumbnailHeight_;
    public DSQ thumbnailSha256_;
    public int thumbnailWidth_;
    public String trayIconFileName_;

    static {
        C166228cY r1 = new C166228cY();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166228cY.class);
    }

    public C166228cY() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.fileEncSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.directPath_ = "";
        this.caption_ = "";
        this.packDescription_ = "";
        this.trayIconFileName_ = "";
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = dsq;
        this.thumbnailEncSha256_ = dsq;
        this.imageDataHash_ = "";
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(25);
                A1Z[1] = "stickerPackId_";
                A1Z[2] = "name_";
                A1Z[3] = "publisher_";
                A1Z[4] = "stickers_";
                A1Z[5] = C165698bc.class;
                A1Z[6] = "fileLength_";
                A1Z[7] = "fileSha256_";
                A1Z[8] = "fileEncSha256_";
                A1Z[9] = "mediaKey_";
                A1Z[10] = "directPath_";
                A1Z[11] = "caption_";
                A1Z[12] = "contextInfo_";
                A1Z[13] = "packDescription_";
                A1Z[14] = "mediaKeyTimestamp_";
                A1Z[15] = "trayIconFileName_";
                A1Z[16] = "thumbnailDirectPath_";
                A1Z[17] = "thumbnailSha256_";
                A1Z[18] = "thumbnailEncSha256_";
                A1Z[19] = "thumbnailHeight_";
                A1Z[20] = "thumbnailWidth_";
                A1Z[21] = "imageDataHash_";
                A1Z[22] = "stickerPackSize_";
                A1Z[23] = "stickerPackOrigin_";
                A1Z[24] = C20412AKb.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဃ\u0003\u0006ည\u0004\u0007ည\u0005\bည\u0006\tဈ\u0007\nဈ\b\u000bဉ\t\fဈ\n\rဂ\u000b\u000eဈ\f\u000fဈ\r\u0010ည\u000e\u0011ည\u000f\u0012ဋ\u0010\u0013ဋ\u0011\u0014ဈ\u0012\u0015ဃ\u0013\u0016ဌ\u0014", A1Z);
            case 3:
                return new C166228cY();
            case 4:
                return new C163068To();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166228cY.class) {
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
