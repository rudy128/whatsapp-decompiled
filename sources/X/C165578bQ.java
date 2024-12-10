package X;

/* renamed from: X.8bQ  reason: invalid class name and case insensitive filesystem */
public final class C165578bQ extends C23577Bm6 implements C22356B4k {
    public static final C165578bQ DEFAULT_INSTANCE;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int ISSUE_TIME_FIELD_NUMBER = 10;
    public static final int LOCALIZED_NAMES_FIELD_NUMBER = 8;
    public static volatile C22357B4l PARSER = null;
    public static final int SERIAL_FIELD_NUMBER = 1;
    public static final int VERIFIED_NAME_FIELD_NUMBER = 4;
    public int bitField0_;
    public long issueTime_;
    public String issuer_ = "";
    public EE9 localizedNames_ = C23579Bm9.A02;
    public long serial_;
    public String verifiedName_ = "";

    static {
        C165578bQ r1 = new C165578bQ();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165578bQ.class);
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
                A1Z[1] = "serial_";
                A1Z[2] = "issuer_";
                A1Z[3] = "verifiedName_";
                A1Z[4] = "localizedNames_";
                A1Z[5] = C165028aT.class;
                A1Z[6] = "issueTime_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\b\u001b\nဃ\u0003", A1Z);
            case 3:
                return new C165578bQ();
            case 4:
                return new C163648Vu();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165578bQ.class) {
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
