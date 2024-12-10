package X;

/* renamed from: X.8aK  reason: invalid class name and case insensitive filesystem */
public final class C164948aK extends C23577Bm6 implements C22356B4k {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 3;
    public static final C164948aK DEFAULT_INSTANCE;
    public static final int OFFSET_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String currencyCode_ = "";
    public int offset_;
    public long value_;

    static {
        C164948aK r1 = new C164948aK();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164948aK.class);
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
                A1Z[1] = "value_";
                A1Z[2] = "offset_";
                A1Z[3] = "currencyCode_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဋ\u0001\u0003ဈ\u0002", A1Z);
            case 3:
                return new C164948aK();
            case 4:
                return new AnonymousClass8X0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164948aK.class) {
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
