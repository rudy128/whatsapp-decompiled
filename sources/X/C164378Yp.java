package X;

/* renamed from: X.8Yp  reason: invalid class name and case insensitive filesystem */
public final class C164378Yp extends C23577Bm6 implements C22356B4k {
    public static final C164378Yp DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_SOURCE_FIELD_NUMBER = 2;
    public int bitField0_;
    public String sessionId_ = "";
    public int sessionSource_ = 1;

    static {
        C164378Yp r1 = new C164378Yp();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164378Yp.class);
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
                A1Z[1] = "sessionId_";
                A1Z[2] = "sessionSource_";
                A1Z[3] = C20418AKh.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A1Z);
            case 3:
                return new C164378Yp();
            case 4:
                return new AnonymousClass8S0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164378Yp.class) {
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
