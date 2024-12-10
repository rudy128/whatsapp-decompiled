package X;

/* renamed from: X.8cE  reason: invalid class name and case insensitive filesystem */
public final class C166028cE extends C23577Bm6 implements C22356B4k {
    public static final int ACCURACY_IN_METERS_FIELD_NUMBER = 7;
    public static final int ADDRESS_FIELD_NUMBER = 4;
    public static final int COMMENT_FIELD_NUMBER = 11;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C166028cE DEFAULT_INSTANCE;
    public static final int DEGREES_CLOCKWISE_FROM_MAGNETIC_NORTH_FIELD_NUMBER = 9;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int IS_LIVE_FIELD_NUMBER = 6;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int SPEED_IN_MPS_FIELD_NUMBER = 8;
    public static final int URL_FIELD_NUMBER = 5;
    public int accuracyInMeters_;
    public String address_ = "";
    public int bitField0_;
    public String comment_ = "";
    public C166278cd contextInfo_;
    public int degreesClockwiseFromMagneticNorth_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public boolean isLive_;
    public DSQ jpegThumbnail_ = DSQ.A00;
    public String name_ = "";
    public float speedInMps_;
    public String url_ = "";

    static {
        C166028cE r1 = new C166028cE();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166028cE.class);
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
                A1Z[1] = "degreesLatitude_";
                A1Z[2] = "degreesLongitude_";
                A1Z[3] = "name_";
                A1Z[4] = "address_";
                A1Z[5] = "url_";
                A1Z[6] = "isLive_";
                A1Z[7] = "accuracyInMeters_";
                A1Z[8] = "speedInMps_";
                A1Z[9] = "degreesClockwiseFromMagneticNorth_";
                A1Z[10] = "comment_";
                A1Z[11] = "jpegThumbnail_";
                A1Z[12] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဋ\u0006\bခ\u0007\tဋ\b\u000bဈ\t\u0010ည\n\u0011ဉ\u000b", A1Z);
            case 3:
                return new C166028cE();
            case 4:
                return new AnonymousClass8TF();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166028cE.class) {
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
