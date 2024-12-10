package X;

/* renamed from: X.8Zx  reason: invalid class name and case insensitive filesystem */
public final class C164718Zx extends C23577Bm6 implements C22356B4k {
    public static final C164718Zx DEFAULT_INSTANCE;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public String name_ = "";

    static {
        C164718Zx r1 = new C164718Zx();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164718Zx.class);
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
                A1Z[1] = "degreesLatitude_";
                A1Z[2] = "degreesLongitude_";
                A1Z[3] = "name_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002", A1Z);
            case 3:
                return new C164718Zx();
            case 4:
                return new AnonymousClass8SK();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164718Zx.class) {
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
