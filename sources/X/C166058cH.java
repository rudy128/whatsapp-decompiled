package X;

/* renamed from: X.8cH  reason: invalid class name and case insensitive filesystem */
public final class C166058cH extends C23577Bm6 implements C22356B4k {
    public static final int BACKGROUND_ARGB_FIELD_NUMBER = 20;
    public static final C166058cH DEFAULT_INSTANCE;
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
    public static final int WAVEFORM_FIELD_NUMBER = 19;
    public int backgroundArgb_;
    public int bitField0_;
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
    public DSQ waveform_;

    static {
        C166058cH r1 = new C166058cH();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166058cH.class);
    }

    public C166058cH() {
        DSQ dsq = DSQ.A00;
        this.fileSha256_ = dsq;
        this.mediaKey_ = dsq;
        this.fileEncSha256_ = dsq;
        this.directPath_ = "";
        this.streamingSidecar_ = dsq;
        this.waveform_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(13);
                A1Z[1] = "mimetype_";
                A1Z[2] = "fileSha256_";
                A1Z[3] = "fileLength_";
                A1Z[4] = "seconds_";
                A1Z[5] = "ptt_";
                A1Z[6] = "mediaKey_";
                A1Z[7] = "fileEncSha256_";
                A1Z[8] = "directPath_";
                A1Z[9] = "mediaKeyTimestamp_";
                A1Z[10] = "streamingSidecar_";
                A1Z[11] = "waveform_";
                A1Z[12] = "backgroundArgb_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0002\u0014\f\u0000\u0000\u0000\u0002ဈ\u0000\u0003ည\u0001\u0004ဃ\u0002\u0005ဋ\u0003\u0006ဇ\u0004\u0007ည\u0005\bည\u0006\tဈ\u0007\nဂ\b\u0012ည\t\u0013ည\n\u0014ဆ\u000b", A1Z);
            case 3:
                return new C166058cH();
            case 4:
                return new AnonymousClass8U3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166058cH.class) {
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
