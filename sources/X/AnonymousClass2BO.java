package X;

/* renamed from: X.2BO  reason: invalid class name */
public final class AnonymousClass2BO extends C23577Bm6 implements C22356B4k {
    public static final int BUSINESS_NAME_FIELD_NUMBER = 3;
    public static final AnonymousClass2BO DEFAULT_INSTANCE;
    public static final int FIRST_NAME_FIELD_NUMBER = 1;
    public static final int LAST_NAME_FIELD_NUMBER = 2;
    public static final int PADDING_FIELD_NUMBER = 5;
    public static volatile C22357B4l PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 4;
    public int bitField0_;
    public String businessName_ = "";
    public String firstName_ = "";
    public String lastName_ = "";
    public DSQ padding_ = DSQ.A00;
    public int syncPolicy_;

    static {
        AnonymousClass2BO r1 = new AnonymousClass2BO();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BO.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(6);
                A1Z[1] = "firstName_";
                A1Z[2] = "lastName_";
                A1Z[3] = "businessName_";
                A1Z[4] = "syncPolicy_";
                A1Z[5] = "padding_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဌ\u0003\u0005ည\u0004", A1Z);
            case 3:
                return new AnonymousClass2BO();
            case 4:
                return new C45462Ac();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BO.class) {
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
