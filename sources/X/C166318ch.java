package X;

/* renamed from: X.8ch  reason: invalid class name and case insensitive filesystem */
public final class C166318ch extends C23577Bm6 implements C22356B4k {
    public static final int CALL_BUTTON_FIELD_NUMBER = 3;
    public static final C166318ch DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int QUICK_REPLY_BUTTON_FIELD_NUMBER = 1;
    public static final int URL_BUTTON_FIELD_NUMBER = 2;
    public int bitField0_;
    public int hydratedButtonCase_ = 0;
    public Object hydratedButton_;
    public int index_;

    static {
        C166318ch r1 = new C166318ch();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166318ch.class);
    }

    public C165518bH A0R() {
        if (this.hydratedButtonCase_ == 2) {
            return (C165518bH) this.hydratedButton_;
        }
        return C165518bH.DEFAULT_INSTANCE;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                objArr[0] = "hydratedButton_";
                AnonymousClass8BU.A1P(objArr, "hydratedButtonCase_");
                objArr[3] = C164438Yv.class;
                objArr[4] = C165518bH.class;
                objArr[5] = C164428Yu.class;
                objArr[6] = "index_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဋ\u0003", objArr);
            case 3:
                return new C166318ch();
            case 4:
                return new AnonymousClass8SF();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166318ch.class) {
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
