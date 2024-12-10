package X;

/* renamed from: X.8c8  reason: invalid class name and case insensitive filesystem */
public final class C165968c8 extends C23577Bm6 implements C22356B4k {
    public static final int ACCURACY_IN_METERS_FIELD_NUMBER = 3;
    public static final int CAPTION_FIELD_NUMBER = 6;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C165968c8 DEFAULT_INSTANCE;
    public static final int DEGREES_CLOCKWISE_FROM_MAGNETIC_NORTH_FIELD_NUMBER = 5;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static volatile C22357B4l PARSER = null;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 7;
    public static final int SPEED_IN_MPS_FIELD_NUMBER = 4;
    public static final int TIME_OFFSET_FIELD_NUMBER = 8;
    public int accuracyInMeters_;
    public int bitField0_;
    public String caption_ = "";
    public C166278cd contextInfo_;
    public int degreesClockwiseFromMagneticNorth_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public DSQ jpegThumbnail_ = DSQ.A00;
    public long sequenceNumber_;
    public float speedInMps_;
    public int timeOffset_;

    static {
        C165968c8 r1 = new C165968c8();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165968c8.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(11);
                A1Z[1] = "degreesLatitude_";
                A1Z[2] = "degreesLongitude_";
                A1Z[3] = "accuracyInMeters_";
                A1Z[4] = "speedInMps_";
                A1Z[5] = "degreesClockwiseFromMagneticNorth_";
                A1Z[6] = "caption_";
                A1Z[7] = "sequenceNumber_";
                A1Z[8] = "timeOffset_";
                A1Z[9] = "jpegThumbnail_";
                A1Z[10] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ဋ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဋ\u0007\u0010ည\b\u0011ဉ\t", A1Z);
            case 3:
                return new C165968c8();
            case 4:
                return new AnonymousClass8TE();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165968c8.class) {
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
