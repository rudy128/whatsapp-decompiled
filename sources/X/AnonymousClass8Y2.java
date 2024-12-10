package X;

/* renamed from: X.8Y2  reason: invalid class name */
public final class AnonymousClass8Y2 extends C23577Bm6 implements C22356B4k {
    public static final int CUSTOM_PAYMENT_METHODS_FIELD_NUMBER = 1;
    public static final AnonymousClass8Y2 DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public EE9 customPaymentMethods_ = C23579Bm9.A02;
    public byte memoizedIsInitialized = 2;

    static {
        AnonymousClass8Y2 r1 = new AnonymousClass8Y2();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8Y2.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = "customPaymentMethods_";
                A1b[1] = C165448bA.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", A1b);
            case 3:
                return new AnonymousClass8Y2();
            case 4:
                return new AnonymousClass8V3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8Y2.class) {
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
