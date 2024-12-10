package X;

/* renamed from: X.8Zn  reason: invalid class name and case insensitive filesystem */
public final class C164618Zn extends C23577Bm6 implements C22356B4k {
    public static final C164618Zn DEFAULT_INSTANCE;
    public static final int ITERATION_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int SEED_FIELD_NUMBER = 2;
    public int bitField0_;
    public int iteration_;
    public DSQ seed_ = DSQ.A00;

    static {
        C164618Zn r1 = new C164618Zn();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164618Zn.class);
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
                A1Y[1] = "iteration_";
                A1Y[2] = "seed_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", A1Y);
            case 3:
                return new C164618Zn();
            case 4:
                return new AnonymousClass8WY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164618Zn.class) {
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
