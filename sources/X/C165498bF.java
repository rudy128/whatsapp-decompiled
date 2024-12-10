package X;

/* renamed from: X.8bF  reason: invalid class name and case insensitive filesystem */
public final class C165498bF extends C23577Bm6 implements C22356B4k {
    public static final int CONTENTS_FIELD_NUMBER = 5;
    public static final C165498bF DEFAULT_INSTANCE;
    public static final int FLOAT_DATA_FIELD_NUMBER = 4;
    public static final int INT_DATA_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int STRING_DATA_FIELD_NUMBER = 2;
    public int bitField0_;
    public C165498bF contents_;
    public float floatData_;
    public long intData_;
    public String key_ = "";
    public String stringData_ = "";

    static {
        C165498bF r1 = new C165498bF();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165498bF.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass8BW.A1b();
                A1b[1] = "key_";
                A1b[2] = "stringData_";
                A1b[3] = "intData_";
                A1b[4] = "floatData_";
                A1b[5] = "contents_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005ဉ\u0004", A1b);
            case 3:
                return new C165498bF();
            case 4:
                return new AnonymousClass8S6();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165498bF.class) {
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
