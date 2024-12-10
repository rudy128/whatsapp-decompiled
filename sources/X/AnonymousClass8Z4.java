package X;

/* renamed from: X.8Z4  reason: invalid class name */
public final class AnonymousClass8Z4 extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8Z4 DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public int bitField0_;
    public int format_;
    public String text_ = "";

    static {
        AnonymousClass8Z4 r1 = new AnonymousClass8Z4();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8Z4.class);
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
                A1Z[1] = "text_";
                A1Z[2] = "format_";
                A1Z[3] = AKL.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A1Z);
            case 3:
                return new AnonymousClass8Z4();
            case 4:
                return new AnonymousClass8T2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8Z4.class) {
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
