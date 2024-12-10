package X;

/* renamed from: X.8a5  reason: invalid class name and case insensitive filesystem */
public final class C164798a5 extends C23577Bm6 implements C22356B4k {
    public static final int CURRENCY_FIELD_NUMBER = 2;
    public static final int DATE_TIME_FIELD_NUMBER = 3;
    public static final int DEFAULT_FIELD_NUMBER = 1;
    public static final C164798a5 DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public String default_ = "";
    public int paramOneofCase_ = 0;
    public Object paramOneof_;

    static {
        C164798a5 r1 = new C164798a5();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164798a5.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[6];
                objArr[0] = "paramOneof_";
                AnonymousClass8BU.A1P(objArr, "paramOneofCase_");
                objArr[3] = "default_";
                objArr[4] = AnonymousClass8Z0.class;
                objArr[5] = AnonymousClass8Z1.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000", objArr);
            case 3:
                return new C164798a5();
            case 4:
                return new C162828Sq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164798a5.class) {
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
