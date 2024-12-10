package X;

/* renamed from: X.8Z2  reason: invalid class name */
public final class AnonymousClass8Z2 extends C23577Bm6 implements C22356B4k {
    public static final int CARDS_FIELD_NUMBER = 1;
    public static final AnonymousClass8Z2 DEFAULT_INSTANCE;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public EE9 cards_ = C23579Bm9.A02;
    public int messageVersion_ = 1;

    static {
        AnonymousClass8Z2 r1 = new AnonymousClass8Z2();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8Z2.class);
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
                A1Z[1] = "cards_";
                A1Z[2] = C166398cp.class;
                A1Z[3] = "messageVersion_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", A1Z);
            case 3:
                return new AnonymousClass8Z2();
            case 4:
                return new C162908Sy();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8Z2.class) {
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
