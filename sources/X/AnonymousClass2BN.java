package X;

/* renamed from: X.2BN  reason: invalid class name */
public final class AnonymousClass2BN extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BN DEFAULT_INSTANCE;
    public static final int HISTORY_SYNC_CONFIG_FIELD_NUMBER = 5;
    public static final int OS_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int PLATFORM_TYPE_FIELD_NUMBER = 3;
    public static final int REQUIRE_FULL_SYNC_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass2BW historySyncConfig_;
    public String os_ = "";
    public int platformType_;
    public boolean requireFullSync_;
    public AnonymousClass2B1 version_;

    static {
        AnonymousClass2BN r1 = new AnonymousClass2BN();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BN.class);
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
                A1Z[1] = "os_";
                A1Z[2] = "version_";
                A1Z[3] = "platformType_";
                A1Z[4] = C65682ww.A00;
                A1Z[5] = "requireFullSync_";
                A1Z[6] = "historySyncConfig_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", A1Z);
            case 3:
                return new AnonymousClass2BN();
            case 4:
                return new AnonymousClass2AZ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BN.class) {
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
