package X;

/* renamed from: X.8YM  reason: invalid class name */
public final class AnonymousClass8YM extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8YM DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int STARRED_FIELD_NUMBER = 1;
    public int bitField0_;
    public boolean starred_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8YM] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, AnonymousClass8YM.class);
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
                A1X[1] = "starred_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A1X);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C163448Va();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8YM.class) {
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
