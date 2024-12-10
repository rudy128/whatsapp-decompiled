package X;

/* renamed from: X.8an  reason: invalid class name and case insensitive filesystem */
public final class C165228an extends C23577Bm6 implements C22356B4k {
    public static final int BUTTON_ID_FIELD_NUMBER = 1;
    public static final int BUTTON_TEXT_FIELD_NUMBER = 2;
    public static final C165228an DEFAULT_INSTANCE;
    public static final int NATIVE_FLOW_INFO_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public int bitField0_;
    public String buttonId_ = "";
    public AnonymousClass8XY buttonText_;
    public C164458Yx nativeFlowInfo_;
    public int type_;

    static {
        C165228an r1 = new C165228an();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165228an.class);
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
                A1b[1] = "buttonId_";
                A1b[2] = "buttonText_";
                A1b[3] = "type_";
                A1b[4] = AK5.A00;
                A1b[5] = "nativeFlowInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", A1b);
            case 3:
                return new C165228an();
            case 4:
                return new AnonymousClass8SU();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165228an.class) {
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
