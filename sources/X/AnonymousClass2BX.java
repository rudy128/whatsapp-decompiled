package X;

/* renamed from: X.2BX  reason: invalid class name */
public final class AnonymousClass2BX extends C23577Bm6 implements C22356B4k {
    public static final int APP_VERSION_FIELD_NUMBER = 2;
    public static final AnonymousClass2BX DEFAULT_INSTANCE;
    public static final int DEVICE_BOARD_FIELD_NUMBER = 13;
    public static final int DEVICE_EXP_ID_FIELD_NUMBER = 14;
    public static final int DEVICE_FIELD_NUMBER = 7;
    public static final int DEVICE_MODEL_TYPE_FIELD_NUMBER = 16;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 15;
    public static final int LOCALE_COUNTRY_ISO_3166_1_ALPHA_2_FIELD_NUMBER = 12;
    public static final int LOCALE_LANGUAGE_ISO_639_1_FIELD_NUMBER = 11;
    public static final int MANUFACTURER_FIELD_NUMBER = 6;
    public static final int MCC_FIELD_NUMBER = 3;
    public static final int MNC_FIELD_NUMBER = 4;
    public static final int OS_BUILD_NUMBER_FIELD_NUMBER = 8;
    public static final int OS_VERSION_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int PHONE_ID_FIELD_NUMBER = 9;
    public static final int PLATFORM_FIELD_NUMBER = 1;
    public static final int RELEASE_CHANNEL_FIELD_NUMBER = 10;
    public AnonymousClass2B2 appVersion_;
    public int bitField0_;
    public String deviceBoard_ = "";
    public String deviceExpId_ = "";
    public String deviceModelType_ = "";
    public int deviceType_;
    public String device_ = "";
    public String localeCountryIso31661Alpha2_ = "";
    public String localeLanguageIso6391_ = "";
    public String manufacturer_ = "";
    public String mcc_ = "";
    public String mnc_ = "";
    public String osBuildNumber_ = "";
    public String osVersion_ = "";
    public String phoneId_ = "";
    public int platform_;
    public int releaseChannel_;

    static {
        AnonymousClass2BX r1 = new AnonymousClass2BX();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BX.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(20);
                A1Z[1] = "platform_";
                A1Z[2] = C65772x5.A00;
                A1Z[3] = "appVersion_";
                A1Z[4] = "mcc_";
                A1Z[5] = "mnc_";
                A1Z[6] = "osVersion_";
                A1Z[7] = "manufacturer_";
                A1Z[8] = "device_";
                A1Z[9] = "osBuildNumber_";
                A1Z[10] = "phoneId_";
                A1Z[11] = "releaseChannel_";
                A1Z[12] = C65782x6.A00;
                A1Z[13] = "localeLanguageIso6391_";
                A1Z[14] = "localeCountryIso31661Alpha2_";
                A1Z[15] = "deviceBoard_";
                A1Z[16] = "deviceExpId_";
                A1Z[17] = "deviceType_";
                A1Z[18] = C65762x4.A00;
                A1Z[19] = "deviceModelType_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဌ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဌ\u000e\u0010ဈ\u000f", A1Z);
            case 3:
                return new AnonymousClass2BX();
            case 4:
                return new C45642Aw();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BX.class) {
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
