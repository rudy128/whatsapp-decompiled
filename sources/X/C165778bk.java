package X;

/* renamed from: X.8bk  reason: invalid class name and case insensitive filesystem */
public final class C165778bk extends C23577Bm6 implements C22356B4k {
    public static final C165778bk DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 4;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 3;
    public static final int FILE_SHA256_FIELD_NUMBER = 1;
    public static final int MEDIA_KEY_FIELD_NUMBER = 2;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int MIMETYPE_FIELD_NUMBER = 6;
    public static final int ORIENTATION_TYPE_FIELD_NUMBER = 7;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String directPath_ = "";
    public String fileEncSha256_ = "";
    public String fileSha256_ = "";
    public long mediaKeyTimestamp_;
    public String mediaKey_ = "";
    public String mimetype_ = "";
    public int orientationType_ = 1;

    static {
        C165778bk r1 = new C165778bk();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165778bk.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(9);
                A1Z[1] = "fileSha256_";
                A1Z[2] = "mediaKey_";
                A1Z[3] = "fileEncSha256_";
                A1Z[4] = "directPath_";
                A1Z[5] = "mediaKeyTimestamp_";
                A1Z[6] = "mimetype_";
                A1Z[7] = "orientationType_";
                A1Z[8] = C20401AJo.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006", A1Z);
            case 3:
                return new C165778bk();
            case 4:
                return new AnonymousClass8Rn();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165778bk.class) {
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
