package X;

/* renamed from: X.2B5  reason: invalid class name */
public final class AnonymousClass2B5 extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2B5 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 2;
    public static final int KEY_ID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public AnonymousClass2BF keyData_;
    public AnonymousClass8XX keyId_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2B5, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, AnonymousClass2B5.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(3);
                A1Z[1] = "keyId_";
                A1Z[2] = "keyData_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", A1Z);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C45472Ae();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2B5.class) {
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
