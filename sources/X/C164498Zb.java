package X;

/* renamed from: X.8Zb  reason: invalid class name and case insensitive filesystem */
public final class C164498Zb extends C23577Bm6 implements C22356B4k {
    public static final int AS_BLOB_FIELD_NUMBER = 1;
    public static final int AS_UNSIGNED_INTEGER_FIELD_NUMBER = 2;
    public static final C164498Zb DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public int valueCase_ = 0;
    public Object value_;

    static {
        C164498Zb r1 = new C164498Zb();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164498Zb.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BR.A1a();
                A1a[0] = "value_";
                AnonymousClass8BU.A1P(A1a, "valueCase_");
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0002ှ\u0000", A1a);
            case 3:
                return new C164498Zb();
            case 4:
                return new C163588Vo();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164498Zb.class) {
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
