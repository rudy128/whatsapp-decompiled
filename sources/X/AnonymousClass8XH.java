package X;

/* renamed from: X.8XH  reason: invalid class name */
public final class AnonymousClass8XH extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8XH DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SELECTED_OPTIONS_FIELD_NUMBER = 1;
    public EE9 selectedOptions_ = C23579Bm9.A02;

    static {
        AnonymousClass8XH r1 = new AnonymousClass8XH();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8XH.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"selectedOptions_"});
            case 3:
                return new AnonymousClass8XH();
            case 4:
                return new AnonymousClass8X4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8XH.class) {
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
