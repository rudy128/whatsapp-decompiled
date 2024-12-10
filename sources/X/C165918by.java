package X;

/* renamed from: X.8by  reason: invalid class name and case insensitive filesystem */
public final class C165918by extends C23577Bm6 implements C22356B4k {
    public static final int BITRATE_FIELD_NUMBER = 6;
    public static final int CAPABILITIES_FIELD_NUMBER = 8;
    public static final C165918by DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 1;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 7;
    public static final int WIDTH_FIELD_NUMBER = 4;
    public int bitField0_;
    public int bitrate_;
    public EE9 capabilities_ = C23579Bm9.A02;
    public String directPath_ = "";
    public long fileLength_;
    public DSQ fileSha256_ = DSQ.A00;
    public int height_;
    public int quality_;
    public int width_;

    static {
        C165918by r1 = new C165918by();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165918by.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(10);
                A1Z[1] = "directPath_";
                A1Z[2] = "fileSha256_";
                A1Z[3] = "height_";
                A1Z[4] = "width_";
                A1Z[5] = "fileLength_";
                A1Z[6] = "bitrate_";
                A1Z[7] = "quality_";
                A1Z[8] = C20417AKg.A00;
                A1Z[9] = "capabilities_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ဌ\u0006\b\u001a", A1Z);
            case 3:
                return new C165918by();
            case 4:
                return new C163158Tx();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165918by.class) {
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
