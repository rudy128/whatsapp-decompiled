package X;

/* renamed from: X.8bn  reason: invalid class name and case insensitive filesystem */
public final class C165808bn extends C23577Bm6 implements C22356B4k {
    public static final C165808bn DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 1;
    public static final int ENC_THUMB_HASH_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MEDIA_KEY_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int THUMB_HASH_FIELD_NUMBER = 2;
    public static final int THUMB_HEIGHT_FIELD_NUMBER = 7;
    public static final int THUMB_WIDTH_FIELD_NUMBER = 6;
    public int bitField0_;
    public String directPath_ = "";
    public String encThumbHash_ = "";
    public long mediaKeyTimestampMs_;
    public DSQ mediaKey_ = DSQ.A00;
    public String thumbHash_ = "";
    public int thumbHeight_;
    public int thumbWidth_;

    static {
        C165808bn r1 = new C165808bn();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165808bn.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(8);
                A1Z[1] = "directPath_";
                A1Z[2] = "thumbHash_";
                A1Z[3] = "encThumbHash_";
                A1Z[4] = "mediaKey_";
                A1Z[5] = "mediaKeyTimestampMs_";
                A1Z[6] = "thumbWidth_";
                A1Z[7] = "thumbHeight_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006", A1Z);
            case 3:
                return new C165808bn();
            case 4:
                return new AnonymousClass8TT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165808bn.class) {
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
