package X;

/* renamed from: X.8Z1  reason: invalid class name */
public final class AnonymousClass8Z1 extends C23577Bm6 implements C22356B4k {
    public static final int COMPONENT_FIELD_NUMBER = 1;
    public static final AnonymousClass8Z1 DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int UNIX_EPOCH_FIELD_NUMBER = 2;
    public int bitField0_;
    public int datetimeOneofCase_ = 0;
    public Object datetimeOneof_;

    static {
        AnonymousClass8Z1 r1 = new AnonymousClass8Z1();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8Z1.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[5];
                objArr[0] = "datetimeOneof_";
                AnonymousClass8BU.A1P(objArr, "datetimeOneofCase_");
                objArr[3] = C165788bl.class;
                objArr[4] = C163998Xd.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", objArr);
            case 3:
                return new AnonymousClass8Z1();
            case 4:
                return new C162848Ss();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8Z1.class) {
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
