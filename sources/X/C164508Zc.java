package X;

/* renamed from: X.8Zc  reason: invalid class name and case insensitive filesystem */
public final class C164508Zc extends C23577Bm6 implements C22356B4k {
    public static final C164508Zc DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int bitField0_;
    public String key_ = "";
    public C164498Zb value_;

    static {
        C164508Zc r1 = new C164508Zc();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164508Zc.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = AnonymousClass8BW.A1Y();
                A1Y[1] = "key_";
                A1Y[2] = "value_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", A1Y);
            case 3:
                return new C164508Zc();
            case 4:
                return new C163578Vn();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164508Zc.class) {
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
