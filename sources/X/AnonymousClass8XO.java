package X;

/* renamed from: X.8XO  reason: invalid class name */
public final class AnonymousClass8XO extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8XO DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int WEIGHTS_FIELD_NUMBER = 1;
    public EE9 weights_ = C23579Bm9.A02;

    static {
        AnonymousClass8XO r1 = new AnonymousClass8XO();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8XO.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = "weights_";
                A1b[1] = AnonymousClass8ZU.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A1b);
            case 3:
                return new AnonymousClass8XO();
            case 4:
                return new AnonymousClass8VX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8XO.class) {
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
