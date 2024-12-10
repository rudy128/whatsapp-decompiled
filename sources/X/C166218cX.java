package X;

/* renamed from: X.8cX  reason: invalid class name and case insensitive filesystem */
public final class C166218cX extends C23577Bm6 implements C22356B4k {
    public static final int ACCESSIBILITY_LABEL_FIELD_NUMBER = 22;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C166218cX DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 8;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 3;
    public static final int FILE_LENGTH_FIELD_NUMBER = 9;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int FIRST_FRAME_LENGTH_FIELD_NUMBER = 11;
    public static final int FIRST_FRAME_SIDECAR_FIELD_NUMBER = 12;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int IS_AI_STICKER_FIELD_NUMBER = 20;
    public static final int IS_ANIMATED_FIELD_NUMBER = 13;
    public static final int IS_AVATAR_FIELD_NUMBER = 19;
    public static final int IS_LOTTIE_FIELD_NUMBER = 21;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int PNG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int STICKER_SENT_TS_FIELD_NUMBER = 18;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public String accessibilityLabel_;
    public int bitField0_;
    public C166278cd contextInfo_;
    public String directPath_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public DSQ fileSha256_;
    public int firstFrameLength_;
    public DSQ firstFrameSidecar_;
    public int height_;
    public boolean isAiSticker_;
    public boolean isAnimated_;
    public boolean isAvatar_;
    public boolean isLottie_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public String mimetype_;
    public DSQ pngThumbnail_;
    public long stickerSentTs_;
    public String url_ = "";
    public int width_;

    static {
        C166218cX r1 = new C166218cX();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166218cX.class);
    }

    public C166218cX() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.fileEncSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.mimetype_ = "";
        this.directPath_ = "";
        this.firstFrameSidecar_ = dsq;
        this.pngThumbnail_ = dsq;
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
                Object[] A1Z = C17890vO.A1Z(21);
                AnonymousClass8BY.A1S(A1Z);
                A1Z[10] = "mediaKeyTimestamp_";
                A1Z[11] = "firstFrameLength_";
                A1Z[12] = "firstFrameSidecar_";
                A1Z[13] = "isAnimated_";
                A1Z[14] = "pngThumbnail_";
                A1Z[15] = "contextInfo_";
                A1Z[16] = "stickerSentTs_";
                A1Z[17] = "isAvatar_";
                A1Z[18] = "isAiSticker_";
                A1Z[19] = "isLottie_";
                A1Z[20] = "accessibilityLabel_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0016\u0014\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007\tဃ\b\nဂ\t\u000bဋ\n\fည\u000b\rဇ\f\u0010ည\r\u0011ဉ\u000e\u0012ဂ\u000f\u0013ဇ\u0010\u0014ဇ\u0011\u0015ဇ\u0012\u0016ဈ\u0013", A1Z);
            case 3:
                return new C166218cX();
            case 4:
                return new C163808Wk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166218cX.class) {
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
