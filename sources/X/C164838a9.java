package X;

/* renamed from: X.8a9  reason: invalid class name and case insensitive filesystem */
public final class C164838a9 extends C23577Bm6 implements C22356B4k {
    public static final C164838a9 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PARAMS_JSON_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    public int bitField0_;
    public String name_ = "";
    public String paramsJson_ = "";
    public int version_ = 1;

    static {
        C164838a9 r1 = new C164838a9();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164838a9.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = AnonymousClass8BW.A1Z();
                A1Z[1] = "name_";
                A1Z[2] = "paramsJson_";
                A1Z[3] = "version_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", A1Z);
            case 3:
                return new C164838a9();
            case 4:
                return new C163768Wg();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164838a9.class) {
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
