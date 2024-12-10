package X;

/* renamed from: X.8ZY  reason: invalid class name */
public final class AnonymousClass8ZY extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8ZY DEFAULT_INSTANCE;
    public static final int MESSAGE_RANGE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int READ_FIELD_NUMBER = 1;
    public int bitField0_;
    public C165018aS messageRange_;
    public boolean read_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8ZY] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, AnonymousClass8ZY.class);
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
                A1Y[1] = "read_";
                A1Y[2] = "messageRange_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", A1Y);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8VG();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8ZY.class) {
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
