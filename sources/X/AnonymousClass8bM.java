package X;

/* renamed from: X.8bM  reason: invalid class name */
public final class AnonymousClass8bM extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8bM DEFAULT_INSTANCE;
    public static final int IS_MESSAGE_FIELD_NUMBER = 4;
    public static final int MAX_VERSION_FIELD_NUMBER = 2;
    public static final int MIN_VERSION_FIELD_NUMBER = 1;
    public static final int NOT_REPORTABLE_MIN_VERSION_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int SUBFIELD_FIELD_NUMBER = 5;
    public int bitField0_;
    public boolean isMessage_;
    public int maxVersion_;
    public int minVersion_ = 1;
    public int notReportableMinVersion_;
    public C27328Dbz subfield_ = C27328Dbz.A00;

    static {
        AnonymousClass8bM r1 = new AnonymousClass8bM();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8bM.class);
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
                A1Z[1] = "minVersion_";
                A1Z[2] = "maxVersion_";
                A1Z[3] = "notReportableMinVersion_";
                A1Z[4] = "isMessage_";
                A1Z[5] = "subfield_";
                A1Z[6] = C182089Ta.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u00052", A1Z);
            case 3:
                return new AnonymousClass8bM();
            case 4:
                return new C163248Ug();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8bM.class) {
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
