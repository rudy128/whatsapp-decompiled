package X;

/* renamed from: X.8XN  reason: invalid class name */
public final class AnonymousClass8XN extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8XN DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public EE9 flags_ = C23579Bm9.A02;

    static {
        AnonymousClass8XN r1 = new AnonymousClass8XN();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8XN.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"flags_"});
            case 3:
                return new AnonymousClass8XN();
            case 4:
                return new AnonymousClass8VR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8XN.class) {
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
