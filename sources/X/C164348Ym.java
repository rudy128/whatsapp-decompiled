package X;

/* renamed from: X.8Ym  reason: invalid class name and case insensitive filesystem */
public final class C164348Ym extends C23577Bm6 implements C22356B4k {
    public static final C164348Ym DEFAULT_INSTANCE;
    public static final int MODEL_TYPE_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int PREMIUM_MODEL_STATUS_FIELD_NUMBER = 2;
    public int bitField0_;
    public int modelType_ = 1;
    public int premiumModelStatus_ = 1;

    static {
        C164348Ym r1 = new C164348Ym();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164348Ym.class);
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
                A1a[1] = "modelType_";
                A1a[2] = AJq.A00;
                A1a[3] = "premiumModelStatus_";
                A1a[4] = AJr.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", A1a);
            case 3:
                return new C164348Ym();
            case 4:
                return new C162598Rt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164348Ym.class) {
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
