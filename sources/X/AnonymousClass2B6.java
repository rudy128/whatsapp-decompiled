package X;

/* renamed from: X.2B6  reason: invalid class name */
public final class AnonymousClass2B6 extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2B6 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int PUSHNAME_FIELD_NUMBER = 2;
    public int bitField0_;
    public String id_ = "";
    public String pushname_ = "";

    static {
        AnonymousClass2B6 r1 = new AnonymousClass2B6();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2B6.class);
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
                A1Z[1] = "id_";
                A1Z[2] = "pushname_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A1Z);
            case 3:
                return new AnonymousClass2B6();
            case 4:
                return new C45522Ak();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2B6.class) {
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
