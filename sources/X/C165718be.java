package X;

/* renamed from: X.8be  reason: invalid class name and case insensitive filesystem */
public final class C165718be extends C23577Bm6 implements C22356B4k {
    public static final C165718be DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 2;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 6;
    public static final int FILE_SHA256_FIELD_NUMBER = 5;
    public static final int FILE_SIZE_BYTES_FIELD_NUMBER = 4;
    public static final int HANDLE_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String directPath_ = "";
    public DSQ fileEncSha256_;
    public DSQ fileSha256_;
    public long fileSizeBytes_;
    public String handle_ = "";
    public DSQ mediaKey_;

    static {
        C165718be r1 = new C165718be();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165718be.class);
    }

    public C165718be() {
        DSQ dsq = DSQ.A00;
        this.mediaKey_ = dsq;
        this.fileSha256_ = dsq;
        this.fileEncSha256_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(7);
                A1Z[1] = "mediaKey_";
                A1Z[2] = "directPath_";
                A1Z[3] = "handle_";
                A1Z[4] = "fileSizeBytes_";
                A1Z[5] = "fileSha256_";
                A1Z[6] = "fileEncSha256_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ည\u0004\u0006ည\u0005", A1Z);
            case 3:
                return new C165718be();
            case 4:
                return new C163268Ui();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165718be.class) {
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
