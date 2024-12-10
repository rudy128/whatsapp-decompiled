package X;

/* renamed from: X.8as  reason: invalid class name and case insensitive filesystem */
public final class C165278as extends C23577Bm6 implements C22356B4k {
    public static final C165278as DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int X_DEPRECATED_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_DEPRECATED_FIELD_NUMBER = 2;
    public static final int Y_FIELD_NUMBER = 4;
    public int bitField0_;
    public int xDeprecated_;
    public double x_;
    public int yDeprecated_;
    public double y_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8as, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165278as.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "xDeprecated_";
                A1a[2] = "yDeprecated_";
                A1a[3] = "x_";
                A1a[4] = "y_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003က\u0002\u0004က\u0003", A1a);
            case 3:
                return new C23577Bm6();
            case 4:
                return new C163148Tw();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165278as.class) {
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
