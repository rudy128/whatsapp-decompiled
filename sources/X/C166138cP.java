package X;

/* renamed from: X.8cP  reason: invalid class name and case insensitive filesystem */
public final class C166138cP extends C23577Bm6 implements C22356B4k {
    public static final int ACCESSIBILITY_LABEL_FIELD_NUMBER = 22;
    public static final int BACKGROUND_ARGB_FIELD_NUMBER = 20;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C166138cP DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 9;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 8;
    public static final int FILE_LENGTH_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 7;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int PTT_FIELD_NUMBER = 6;
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STREAMING_SIDECAR_FIELD_NUMBER = 18;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 21;
    public static final int WAVEFORM_FIELD_NUMBER = 19;
    public String accessibilityLabel_;
    public int backgroundArgb_;
    public int bitField0_;
    public C166278cd contextInfo_;
    public String directPath_;
    public DSQ fileEncSha256_;
    public long fileLength_;
    public DSQ fileSha256_;
    public long mediaKeyTimestamp_;
    public DSQ mediaKey_;
    public String mimetype_ = "";
    public boolean ptt_;
    public int seconds_;
    public DSQ streamingSidecar_;
    public String url_ = "";
    public boolean viewOnce_;
    public DSQ waveform_;

    static {
        C166138cP r1 = new C166138cP();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166138cP.class);
    }

    public C166138cP() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.fileEncSha256_ = dsq;
        this.directPath_ = "";
        this.streamingSidecar_ = dsq;
        this.waveform_ = dsq;
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
                Object[] A1Z = C17890vO.A1Z(17);
                A1Z[1] = "url_";
                AnonymousClass8BX.A1Q(A1Z, "mimetype_");
                A1Z[5] = "seconds_";
                A1Z[6] = "ptt_";
                AnonymousClass8BY.A1U(A1Z, "mediaKey_");
                A1Z[11] = "contextInfo_";
                A1Z[12] = "streamingSidecar_";
                A1Z[13] = "waveform_";
                A1Z[14] = "backgroundArgb_";
                A1Z[15] = "viewOnce_";
                A1Z[16] = "accessibilityLabel_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0016\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဇ\u0005\u0007ည\u0006\bည\u0007\tဈ\b\nဂ\t\u0011ဉ\n\u0012ည\u000b\u0013ည\f\u0014ဆ\r\u0015ဇ\u000e\u0016ဈ\u000f", A1Z);
            case 3:
                return new C166138cP();
            case 4:
                return new AnonymousClass8SR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166138cP.class) {
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
