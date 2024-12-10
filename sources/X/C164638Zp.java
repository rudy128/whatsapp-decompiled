package X;

/* renamed from: X.8Zp  reason: invalid class name and case insensitive filesystem */
public final class C164638Zp extends C23577Bm6 implements C22356B4k {
    public static final C164638Zp DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public int index_;
    public DSQ key_ = DSQ.A00;

    static {
        C164638Zp r1 = new C164638Zp();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164638Zp.class);
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
                A1Y[1] = "index_";
                A1Y[2] = "key_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", A1Y);
            case 3:
                return new C164638Zp();
            case 4:
                return new AnonymousClass8X5();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164638Zp.class) {
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
