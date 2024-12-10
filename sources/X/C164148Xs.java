package X;

/* renamed from: X.8Xs  reason: invalid class name and case insensitive filesystem */
public final class C164148Xs extends C23577Bm6 implements C22356B4k {
    public static final C164148Xs DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public DSQ id_ = DSQ.A00;

    static {
        C164148Xs r1 = new C164148Xs();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164148Xs.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = AnonymousClass8BW.A1X();
                A1X[1] = "id_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", A1X);
            case 3:
                return new C164148Xs();
            case 4:
                return new C163278Uj();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164148Xs.class) {
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
