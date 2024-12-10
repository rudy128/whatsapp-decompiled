package X;

/* renamed from: X.8ag  reason: invalid class name and case insensitive filesystem */
public final class C165158ag extends C23577Bm6 implements C22356B4k {
    public static final int BODY_FIELD_NUMBER = 1;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 15;
    public static final C165158ag DEFAULT_INSTANCE;
    public static final int NATIVE_FLOW_RESPONSE_MESSAGE_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public AnonymousClass8Z4 body_;
    public C166278cd contextInfo_;
    public int interactiveResponseMessageCase_ = 0;
    public Object interactiveResponseMessage_;

    static {
        C165158ag r1 = new C165158ag();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165158ag.class);
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
                objArr[0] = "interactiveResponseMessage_";
                AnonymousClass8BU.A1P(objArr, "interactiveResponseMessageCase_");
                objArr[3] = "body_";
                objArr[4] = C164838a9.class;
                objArr[5] = "contextInfo_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u000fဉ\u0002", objArr);
            case 3:
                return new C165158ag();
            case 4:
                return new AnonymousClass8T3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165158ag.class) {
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
