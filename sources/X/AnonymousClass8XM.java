package X;

/* renamed from: X.8XM  reason: invalid class name */
public final class AnonymousClass8XM extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8XM DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int SORTED_LABEL_IDS_FIELD_NUMBER = 1;
    public C28667EDj sortedLabelIds_ = Bm7.A02;

    static {
        AnonymousClass8XM r1 = new AnonymousClass8XM();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8XM.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"sortedLabelIds_"});
            case 3:
                return new AnonymousClass8XM();
            case 4:
                return new AnonymousClass8VD();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8XM.class) {
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
