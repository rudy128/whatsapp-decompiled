package X;

/* renamed from: X.2BA  reason: invalid class name */
public final class AnonymousClass2BA extends C23577Bm6 implements C22356B4k {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 3;
    public static final AnonymousClass2BA DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static final int HMAC_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int accountType_;
    public int bitField0_;
    public DSQ details_;
    public DSQ hmac_;

    static {
        AnonymousClass2BA r1 = new AnonymousClass2BA();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BA.class);
    }

    public AnonymousClass2BA() {
        DSQ dsq = DSQ.A00;
        this.details_ = dsq;
        this.hmac_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(5);
                A1Z[1] = "details_";
                A1Z[2] = "hmac_";
                A1Z[3] = "accountType_";
                A1Z[4] = C65672wv.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဌ\u0002", A1Z);
            case 3:
                return new AnonymousClass2BA();
            case 4:
                return new AnonymousClass2AW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BA.class) {
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
