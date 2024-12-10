package X;

/* renamed from: X.2BF  reason: invalid class name */
public final class AnonymousClass2BF extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BF DEFAULT_INSTANCE;
    public static final int FINGERPRINT_FIELD_NUMBER = 2;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    public int bitField0_;
    public C165148af fingerprint_;
    public DSQ keyData_ = DSQ.A00;
    public long timestamp_;

    static {
        AnonymousClass2BF r1 = new AnonymousClass2BF();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BF.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(4);
                A1Z[1] = "keyData_";
                A1Z[2] = "fingerprint_";
                A1Z[3] = "timestamp_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဂ\u0002", A1Z);
            case 3:
                return new AnonymousClass2BF();
            case 4:
                return new C45482Af();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BF.class) {
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
