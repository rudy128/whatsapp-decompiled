package X;

/* renamed from: X.8a8  reason: invalid class name and case insensitive filesystem */
public final class C164828a8 extends C23577Bm6 implements C22356B4k {
    public static final C164828a8 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int SURFACE_FIELD_NUMBER = 2;
    public int bitField0_;
    public String id_ = "";
    public int messageVersion_ = 1;
    public int surface_;

    static {
        C164828a8 r1 = new C164828a8();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164828a8.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "id_";
                A1a[2] = "surface_";
                A1a[3] = AKK.A00;
                A1a[4] = "messageVersion_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002", A1a);
            case 3:
                return new C164828a8();
            case 4:
                return new AnonymousClass8T1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164828a8.class) {
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
